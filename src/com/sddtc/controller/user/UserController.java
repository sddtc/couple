package com.sddtc.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sddtc.model.User;
import com.sddtc.service.user.UserService;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 *
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="/user/{id}")
    public ModelAndView home(@PathVariable Long id,HttpServletRequest req) {
        ModelAndView mv = new ModelAndView("redirect:/");
        UserParam param = new UserParam();
        param.setId(id);
        User user = userService.getUser(param);
        
        if(null != user) {
            mv.addObject("name", user.getName());
        }

        return mv;
    }
}
