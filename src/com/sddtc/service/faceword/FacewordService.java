package com.sddtc.service.faceword;

import java.util.List;

import com.sddtc.model.Faceword;

/**
 * @author sddtc
 *
 */
public interface FacewordService {
	
	/**
	 * 列表展示
	 * @return List<Faceword>
	 */
	public List<Faceword> query();
	
	public void add(Faceword faceword);
}
