package sddtc.couple.mappers;

import sddtc.couple.dao.domain.CoupleUser;
import sddtc.couple.request.CoupleUserRequest;

/**
 * Created by sddtc on 16/5/2.
 */
public interface CoupleUserMapper {

    CoupleUser get(CoupleUserRequest request);

    void insert(CoupleUser user);
}
