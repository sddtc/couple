package sddtc.couple.response;

import sddtc.couple.BaseResult;
import sddtc.couple.dao.domain.CouplePhoto;

/**
 * Created by sddtc on 16/5/2.
 */
public class CouplePhotoResponse extends BaseResult {
    private CouplePhoto couplePhoto;

    public CouplePhoto getCouplePhoto() {
        return couplePhoto;
    }

    public void setCouplePhoto(CouplePhoto couplePhoto) {
        this.couplePhoto = couplePhoto;
    }

    @Override
    public String toString() {
        return "CouplePhotoResponse{" +
                "couplePhoto=" + couplePhoto +
                '}';
    }
}
