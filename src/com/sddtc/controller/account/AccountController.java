package com.sddtc.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sddtc.model.User;
import com.sddtc.service.user.UserService;

/**
 * @author sddtc
 *
 */
@Controller
@RequestMapping("account")
public class AccountController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="signup", method=RequestMethod.GET)
	public String gotoSignup() {
		return "account/signup";
	}
	
	@RequestMapping(value="signup", method=RequestMethod.POST)
	public String signup(@ModelAttribute User user) {
		userService.addUser(user);
		return "index";
	}
	
	
	@RequestMapping(value="login", method=RequestMethod.GET)
	public String goLogin() {
		return "account/login";
	}
	
}
