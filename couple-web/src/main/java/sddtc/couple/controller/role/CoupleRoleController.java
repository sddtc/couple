package sddtc.couple.controller.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sddtc.couple.controller.BaseController;
import sddtc.couple.dao.domain.CoupleRole;
import sddtc.couple.request.CoupleRoleRequest;
import sddtc.couple.service.role.CoupleRoleServiceImpl;

/**
 * Created by sddtc on 16/5/2.
 */
@Controller
@RequestMapping(value = "/role")
public class CoupleRoleController extends BaseController {
    @Autowired
    private CoupleRoleServiceImpl coupleRoleService;

    @RequestMapping(value = "/{id}")
    @ResponseBody
    public String get(CoupleRoleRequest request) {
        CoupleRole role = coupleRoleService.get(request);

        return gson.toJson(role);
    }
}
