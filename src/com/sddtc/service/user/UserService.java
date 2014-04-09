package com.sddtc.service.user;

import org.springframework.transaction.annotation.Transactional;

import com.sddtc.model.User;
import com.sddtc.model.Usermeta;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 * 
 */
public interface UserService {
	/**
	 * 添加用户
	 * 
	 * @param user
	 */
	@Transactional
	public void add(User user);

	/**
	 * 根据查询条件获取用户
	 * 
	 * @param param
	 *            查询条件
	 * @return
	 */
	public User get(UserParam param);

	/**
	 * 更新
	 * 
	 * @param user
	 */
	public void update(User user);

	/**
	 * 添加用户meta信息
	 * 
	 * @param meta
	 */
	public void addMeta(Usermeta meta);

	/**
	 * 获取用户meta信息
	 * 
	 * @param user_id
	 *            用户id
	 * @return
	 */
	public Usermeta getMeta(int user_id);

	/**
	 * 更新用户meta信息
	 * 
	 * @param meta
	 */
	public void updateMeta(Usermeta meta);
}
