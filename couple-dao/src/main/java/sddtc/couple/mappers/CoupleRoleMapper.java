package sddtc.couple.mappers;

import sddtc.couple.dao.domain.CoupleRole;
import sddtc.couple.request.CoupleRoleRequest;

/**
 * Created by sddtc on 16/5/2.
 */
public interface CoupleRoleMapper {

    CoupleRole get(CoupleRoleRequest request);

    void insert(CoupleRole role);
}
