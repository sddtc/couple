package com.sddtc.mapper;

import java.util.List;

import com.sddtc.model.Faceword;

/**
 * @author sddtc
 *
 */
public interface FacewordMapper {
    /**
     * 颜文字列表
     * @return
     */
    public List<Faceword> query();
    
    /**
     * 添加表情
     * @param faceword 颜文字表情
     */
    public void add(Faceword faceword);
}
