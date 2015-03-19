package com.sddtc.service.user;

import java.util.List;

import com.sddtc.model.Message;

/**
 * @author sddtc 业务数据相关
 */
public interface UserDataService {
	/**
	 * 留言-新增
	 * 
	 * @param userId
	 * @param text
	 */
	public void addMessage(Message message);

	/**
	 * 留言-列举
	 * 
	 * @param userId
	 * @return
	 */
	public List<Message> queryMessages(int userId);

	/**
	 * 留言-删除
	 * 
	 * @param id
	 */
	public void deleteMessage(String id);

}