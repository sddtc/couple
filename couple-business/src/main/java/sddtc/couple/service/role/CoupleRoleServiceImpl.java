package sddtc.couple.service.role;

import org.springframework.stereotype.Service;
import sddtc.couple.dao.domain.CoupleRole;
import sddtc.couple.mappers.CoupleRoleMapper;
import sddtc.couple.request.CoupleRoleRequest;

import javax.annotation.Resource;

/**
 * Created by sddtc on 16/5/2.
 */
@Service
public class CoupleRoleServiceImpl {

    @Resource
    private CoupleRoleMapper coupleRoleMapper;

    public CoupleRole get(CoupleRoleRequest request) {
        return coupleRoleMapper.get(request);
    }

    public void insert(CoupleRole role) {
        coupleRoleMapper.insert(role);
    }
}
