package com.sddtc.mapper;

import java.util.List;

import com.sddtc.model.Message;

/**
 * @author sddtc 留言版
 * 
 */
public interface MessageMapper {
	/**
	 * 留言-新增
	 * @param message
	 */
	public void add(Message message);

	/**
	 * 留言-删除
	 * @param id
	 */
	public void delete(String id);

	/**
	 * 留言-列举
	 * @param userId
	 * @return
	 */
	public List<Message> query(int userId);
}
