package sddtc.couple.response;

import sddtc.couple.BaseResult;
import sddtc.couple.dao.domain.CoupleUser;

/**
 * Created by sddtc on 16/5/2.
 */
public class CoupleUserResponse extends BaseResult {
    private CoupleUser coupleUser;

    public CoupleUser getCoupleUser() {
        return coupleUser;
    }

    public void setCoupleUser(CoupleUser coupleUser) {
        this.coupleUser = coupleUser;
    }

    @Override
    public String toString() {
        return "CoupleUserResponse{" +
                "coupleUser=" + coupleUser +
                '}';
    }
}
