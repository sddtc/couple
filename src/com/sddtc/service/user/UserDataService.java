package com.sddtc.service.user;

import java.util.List;

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
	public void addMessage(int userId, String text);

	/**
	 * 留言-列举
	 * 
	 * @param userId
	 * @return
	 */
	public List<MessageInfo> queryMessages(int userId);

	/**
	 * 留言-删除
	 * 
	 * @param id
	 */
	public void deleteMessage(String id);

	/**
	 * 标签-添加
	 * 
	 * @param userId
	 * @param text
	 */
	public void addTag(int userId, String text);

	/**
	 * 标签-列举
	 * 
	 * @param userId
	 * @return
	 */
	public List<TagInfo> queryTags(int userId);

	/**
	 * 标签-删除
	 * 
	 * @param id
	 */
	public void deleteTag(String id);

	/**
	 * 个人说明-添加
	 * 
	 * @param userId
	 * @param text
	 */
	public void addPersonalDescription(int userId, String text);

	/**
	 * 个人说明-更新
	 * 
	 * @param userId
	 * @param text
	 */
	public void updatePersonalDescription(int userId, String text);
}
