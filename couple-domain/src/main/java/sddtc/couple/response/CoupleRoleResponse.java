package sddtc.couple.response;

import sddtc.couple.BaseResult;
import sddtc.couple.dao.domain.CoupleRole;

/**
 * Created by sddtc on 16/5/2.
 */
public class CoupleRoleResponse extends BaseResult {
    private CoupleRole coupleRole;

    public CoupleRole getCoupleRole() {
        return coupleRole;
    }

    public void setCoupleRole(CoupleRole coupleRole) {
        this.coupleRole = coupleRole;
    }

    @Override
    public String toString() {
        return "CoupleRoleResponse{" +
                "coupleRole=" + coupleRole +
                '}';
    }
}
