package com.sddtc.controller.account;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.common.base.Strings;
import com.sddtc.model.Server;
import com.sddtc.model.User;
import com.sddtc.model.Usermeta;
import com.sddtc.service.server.ServerService;
import com.sddtc.service.user.UserService;
import com.sddtc.utils.accounts.factory.Provider;
import com.sddtc.utils.accounts.factory.SendEmailFactory;
import com.sddtc.utils.accounts.factory.Sender;
import com.sddtc.utils.constant.Constants;
import com.sddtc.utils.constant.ServerConstants;
import com.sddtc.utils.param.UserParam;

/**
 * 
 * 1.登陆 2.登出 3.帐号相关修改 a.上传头像
 * 
 * @author sddtc
 * 
 */
@Controller
@RequestMapping("/account")
public class AccountController {
	private static Logger logger = LoggerFactory
			.getLogger(AccountController.class);

	@Value("${file.image.icon.path}")
	private String userIconFilePath;

	@Autowired
	private UserService userService;

	@Autowired
	private ServerService serverService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String register() {
		return "account/login";
	}

	/**
	 * 登陆 发送登陆验证邮件
	 * 
	 * @param user
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String doRegister(@ModelAttribute("user") User user) {
		String email = user.getLogin_id();

		String nickName = email.split("@")[0];
		user.setNick_name(nickName);
		long timeCode = System.currentTimeMillis();
		String pwd = nickName + '@' + timeCode;
		user.setPassword(pwd);

		userService.add(user);

		Provider provider = new SendEmailFactory();
		Sender sender = provider.produce();
		sender.send(email, pwd);

		return "redirect:/user/" + user.getId();
	}

	/**
	 * 从邮箱过来的登陆验证
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "authLogin", method = RequestMethod.GET)
	public String authLogin(HttpServletRequest request) {
		String auth = (String) request.getParameter("auth");

		try {
			auth = URLDecoder.decode(auth, "utf-8");
			String nickName = auth.split("@")[0];

			UserParam param = new UserParam();
			param.setPassword(auth);
			User user = userService.get(param);

			if (null != user) {
				request.getSession(false).setAttribute("currUser", user);

				return "redirect:/user/" + user.getId();
			} else {
				logger.info("验证失败,登陆失败:{}", nickName);
				return "redirect:/account/login";
			}
		} catch (UnsupportedEncodingException e) {
			logger.error("auth解码出错", e);
		}
		return "redirect:/account/error";
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (null != session) {
			session.removeAttribute("currUser");
		}

		return "redirect:/";
	}

	/* 个人资料编辑-begin */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView accounts(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("account/accounts");
		User currUser = getCurrUserInSession(request);
		if (null != currUser) {
			String imagePath = getImageServerPath(currUser);
			mv.addObject("icon_big", imagePath);
		}
		return mv;
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView update(@ModelAttribute("user") User user,
			HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("account/accounts");
		userService.update(user);
		mv.addObject("result", "更新成功");

		// update session
		HttpSession session = request.getSession(false);
		session.setAttribute("currUser", user);

		return mv;
	}

	@RequestMapping(value = "user_icon", method = RequestMethod.GET)
	public ModelAndView updateUserIcon(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView("account/userIcon");
		User currUser = getCurrUserInSession(request);
		if (null != currUser) {
			String imagePath = getImageServerPath(currUser);
			mv.addObject("icon_big", imagePath);
		}
		return mv;
	}

	@RequestMapping(value = "uploadIcon", method = RequestMethod.POST)
	public String uploadIcon(@RequestParam("file") MultipartFile file,
			HttpServletRequest request) {
		User currUser = getCurrUserInSession(request);
		int id = -1;
		if (null != currUser) {
			id = currUser.getId();
		}

		if (!file.isEmpty()) {
			try {
				userIconFilePath += id + File.separator;
				File dest = new File(userIconFilePath);
				if (!dest.exists()) {
					dest.mkdirs();
				}

				String icon_big = userIconFilePath + file.getOriginalFilename();
				file.transferTo(new File(icon_big));
				addUserMeta(id, icon_big);

			} catch (IOException e) {
				logger.error("上传头像IO异常:用户{}", id);
			}
		}

		return "redirect:/account/user_icon";
	}

	/**
	 * 获取session中的用户对象
	 * 
	 * @param request
	 * @return
	 */
	private User getCurrUserInSession(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if (null != session) {
			User user = (User) session.getAttribute("currUser");
			return user;
		}

		return null;
	}

	/**
	 * @param user_id
	 * @param icon_big
	 */
	private void addUserMeta(int user_id, String icon_big) {
		Usermeta meta = new Usermeta();
		meta.setUser_id(user_id);
		meta.setUser_icon_big(icon_big);

		userService.addMeta(meta);
	}

	/**
	 * 获取用户的大头像服务器地址
	 * @param currUser 当前用户
	 * @return
	 */
	private String getImageServerPath(User currUser) {
		if(null == currUser) {
			throw new NullPointerException("当前用户不存在为null");
		}
		
		int id = currUser.getId();
		Usermeta meta = userService.getMeta(id);
		String imagePath = null;
		if (null != meta) {
			String imageAbsoulutePath = meta.getUser_icon_big();

			if (!Strings.isNullOrEmpty(imageAbsoulutePath)) {
				imagePath = imageAbsoulutePath.substring(
						imageAbsoulutePath.lastIndexOf(File.separator),
						imageAbsoulutePath.length());
			}
			Server server = serverService.get(ServerConstants.TYPE_IMAGE,
					Constants.VALID);
			if (null != server) {
				imagePath = server.getUri() + File.separator + id
						+ imagePath;

				return imagePath;
			}
		}
		return null;
	}
}
