package com.sddtc.service.faceword;

import com.sddtc.model.Faceword;

import java.util.List;

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
