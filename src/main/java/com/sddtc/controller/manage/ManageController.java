package com.sddtc.controller.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理相关
 *
 * @author sddtc
 */
@Controller
@RequestMapping(value = "/sddtcManage")
public class ManageController {
    private Logger logger = LoggerFactory.getLogger(ManageController.class);

    @RequestMapping(value = "faceword")
    public String gotoFacewordManage() {
        logger.info("进入颜文字后台");

        return "manage/faceword/index";
    }
}
