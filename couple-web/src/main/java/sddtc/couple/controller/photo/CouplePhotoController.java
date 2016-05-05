package sddtc.couple.controller.photo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sddtc.couple.controller.BaseController;
import sddtc.couple.dao.domain.CouplePhoto;
import sddtc.couple.response.CouplePhotoResponse;
import sddtc.couple.service.photo.CouplePhotoServiceImpl;
import sddtc.couple.request.CouplePhotoRequest;

/**
 * Created by sddtc on 16/5/2.
 */
@Controller
@RequestMapping(value = "/photo")
public class CouplePhotoController extends BaseController {
    @Autowired
    private CouplePhotoServiceImpl couplePhotoService;

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public String get(CouplePhotoRequest request) {
        CouplePhotoResponse response = new CouplePhotoResponse();

        CouplePhoto photo = couplePhotoService.get(request);
        response.setCouplePhoto(photo);

        return gson.toJson(response);
    }

    @RequestMapping(value="/insert")
    @ResponseBody
    public String insert(CouplePhoto photo) {
        CouplePhotoResponse response = new CouplePhotoResponse();

        couplePhotoService.insert(photo);

        return gson.toJson(response);
    }
}
