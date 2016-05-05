package sddtc.couple.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sddtc.couple.controller.BaseController;
import sddtc.couple.dao.domain.CoupleUser;
import sddtc.couple.request.CoupleUserRequest;
import sddtc.couple.response.CoupleUserResponse;
import sddtc.couple.service.user.CoupleUserServiceImpl;

/**
 * Created by sddtc on 16/5/2.
 */
@Controller
@RequestMapping(value = "/user")
public class CoupleUserController extends BaseController {
    @Autowired
    private CoupleUserServiceImpl coupleUserService;

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public String get(CoupleUserRequest request) {
        CoupleUserResponse response = new CoupleUserResponse();

        CoupleUser user = coupleUserService.get(request);
        response.setCoupleUser(user);

        return gson.toJson(response);
    }

    @RequestMapping(value = "/insert")
    @ResponseBody
    public String insert(CoupleUser user) {
        CoupleUserResponse response = new CoupleUserResponse();

        coupleUserService.insert(user);

        return gson.toJson(response);
    }
}
