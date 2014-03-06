package com.sddtc.controller.account;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sddtc.model.User;
import com.sddtc.service.user.UserService;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 *
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    private static Logger logger = LoggerFactory
            .getLogger(AccountController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String register() {
        return "/account/login";
    }

    /**
     * 登陆
     * 发送登陆验证邮件
     * @param user
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String doRegister(@ModelAttribute("user") User user) {
        String email = user.getLoginId();
        logger.info("待登陆邮箱账号:{}", email);
        
        String nickName = email.split("@")[0];
        user.setName(nickName);
        long timeCode = System.currentTimeMillis();
        String pwd = nickName + '@' + timeCode;
        user.setPassword(pwd);

        userService.addUser(user);
        EmailSender.sender(email, pwd);

        return "redirect:/user/" + user.getId();
    }
    
    /**
     * 从邮箱过来的登陆验证
     * @param request
     * @return
     */
    @RequestMapping(value="authLogin", method=RequestMethod.GET)
    public String authLogin(HttpServletRequest request) {
        String auth = (String) request.getParameter("auth");
        
        try {
            auth = URLDecoder.decode(auth, "utf-8");
            logger.info("通过登陆邮件确认auth:{}", auth);
            String nickName = auth.split("@")[0];
            
            UserParam param = new UserParam();
            param.setName(nickName);
            param.setPassword(auth);
            User user = userService.getUser(param);
            if(null != user) {
                logger.info("欢迎{}回来:{}", user.getName(), new Date());
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
}
