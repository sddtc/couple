package com.sddtc.controller.faceword;

import com.sddtc.model.Faceword;
import com.sddtc.service.faceword.FacewordService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import java.util.List;

/**
 * @author sddtc
 */
@Controller
@RequestMapping("/faceword")
public class FacewordController {
    private Logger logger = LoggerFactory.getLogger(FacewordController.class);
    final int FACEWORD_PER_PAGE_SIZE = 8;

    @Autowired
    private FacewordService facewordService;

    @RequestMapping(value = "json")
    public MappingJacksonJsonView drawFaceword() {
        List<Faceword> result = facewordService.query();
        MappingJacksonJsonView view = new MappingJacksonJsonView();

        view.addStaticAttribute("count", result.size());
        for (Faceword face : result) {
            view.addStaticAttribute(face.getId(), face.getText());
        }

        return view;
    }

    @RequestMapping(value = "")
    public ModelAndView show() {
        ModelAndView mv = new ModelAndView("faceword/index");
        List<Faceword> facewords = facewordService.query();

        int size = facewords.size();
        int page = 1;
        if (size % FACEWORD_PER_PAGE_SIZE == 0) {
            page = size / FACEWORD_PER_PAGE_SIZE;
        } else {
            page = size / FACEWORD_PER_PAGE_SIZE + 1;
        }


        mv.addObject("facewords", facewords);
        mv.addObject("page", page);
        return mv;
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute Faceword faceword) {
//NO.67
        logger.info("添加成功！");
        return "redirect:/faceword";
    }
}
