package sddtc.couple.service.user;

import org.springframework.stereotype.Service;
import sddtc.couple.dao.domain.CoupleUser;
import sddtc.couple.mappers.CoupleUserMapper;
import sddtc.couple.request.CoupleUserRequest;

import javax.annotation.Resource;

/**
 * Created by sddtc on 16/5/2.
 */
@Service
public class CoupleUserServiceImpl {

    @Resource
    private CoupleUserMapper coupleUserMapper;

    public CoupleUser get(CoupleUserRequest request) {
        return coupleUserMapper.get(request);
    }

    public void insert(CoupleUser user) {
        coupleUserMapper.insert(user);
    }
}
