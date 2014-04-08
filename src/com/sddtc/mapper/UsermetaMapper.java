package com.sddtc.mapper;

import com.sddtc.model.Usermeta;

/**
 * @author sddtc 用户meta信息
 */
public interface UsermetaMapper {

	/**
	 * 添加用户资料
	 * 
	 * @param usermeta
	 */
	public void insert(Usermeta usermeta);

	/**
	 * 更新用户资料
	 * 
	 * @param usermeta
	 */
	public void update(Usermeta usermeta);

	/**
	 * 根据用户id获取资料
	 * 
	 * @param id
	 * @return
	 */
	public Usermeta get(int id);

}
