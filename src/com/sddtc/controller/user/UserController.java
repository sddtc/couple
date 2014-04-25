package com.sddtc.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sddtc.model.User;
import com.sddtc.service.user.UserService;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 * 
 * 个人主页相关
 *
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    
    @RequestMapping(value="/user")
    public ModelAndView home() {
    	ModelAndView mv = new ModelAndView("user/home");
    	mv.addObject("content", "这是一个模版页面");
    	mv.addObject("STATIC_HTML", false);
    	
    	return mv;
    }
    
    @RequestMapping(value="/html/user")
    public ModelAndView htmlHome() {
    	ModelAndView mv = new ModelAndView("user/home");
    	mv.addObject("content", "这是一个html页面");
    	
    	return mv;
    }
    
    @RequestMapping(value="/jsp/user")
    public ModelAndView jspHome() {
    	ModelAndView mv = new ModelAndView("user/home1");
    	mv.addObject("content", "这是一个jsp页面");
    	
    	return mv;
    }
    
    

//    @RequestMapping(value="/user/{id}")
//    public ModelAndView home(@PathVariable long id,HttpServletRequest req) {
//    	ModelAndView mv = new ModelAndView("user/home1");
//        UserParam param = new UserParam();
//        param.setId(id);
//        User user = userService.get(param);
//        if(null != user) {
//            mv.addObject("name", user.getNick_name());
//        }
//        
//        mv.addObject("content", "这个是模版页面");
//        
//        mv.addObject("STATIC_HTML", false);
//
//        return mv;
//    }
//    
//    @RequestMapping(value="html/user/{id}")
//    public ModelAndView htmlHome(@PathVariable long id,HttpServletRequest req) {
//    	ModelAndView mv = new ModelAndView("user/home1");
//    	//默认是生成静态页面的  
//        mv.addObject("content1", "网站标题");
//        return mv;
//    }
//    
//    @RequestMapping(value="jsp/user/{id}")
//    public ModelAndView jspHome(@PathVariable long id,HttpServletRequest req) {
//    	ModelAndView mv = new ModelAndView("user/home");
//        UserParam param = new UserParam();
//        param.setId(id);
//        User user = userService.get(param);
//        if(null != user) {
//            mv.addObject("name", user.getNick_name());
//        }
//        
//        return mv;
//    }
    
    
    @RequestMapping(value="/user/comment/add", method=RequestMethod.POST)
    public String addComment() {
    	return "ok";
    }
}
