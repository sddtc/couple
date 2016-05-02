package sddtc.couple.mappers;

import sddtc.couple.dao.domain.CouplePhoto;
import sddtc.couple.request.CouplePhotoRequest;

/**
 * Created by sddtc on 16/5/2.
 */
public interface CouplePhotoMapper {

    CouplePhoto get(CouplePhotoRequest request);

    void insert(CouplePhoto photo);
}
