package sddtc.couple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author tuijiang
 * Date 16/8/15
 */
@Controller
@RequestMapping(value="/mock")
public class MockController extends BaseController{

    @RequestMapping(value="index")
    public String mockCouple() {

        return "index";
    }
}
