package sddtc.couple.service.photo;

import org.springframework.stereotype.Service;
import sddtc.couple.dao.domain.CouplePhoto;
import sddtc.couple.mappers.CouplePhotoMapper;
import sddtc.couple.request.CouplePhotoRequest;

import javax.annotation.Resource;

/**
 * Created by sddtc on 16/5/2.
 */
@Service
public class CouplePhotoServiceImpl {

    @Resource
    private CouplePhotoMapper couplePhotoMapper;

    public CouplePhoto get(CouplePhotoRequest request) {
        return couplePhotoMapper.get(request);
    }

    public void insert(CouplePhoto photo) {
        couplePhotoMapper.insert(photo);
    }
}
