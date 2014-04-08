package com.sddtc.model;

/**
 * @author sddtc
 * 
 */
public class Usermeta {

	/**
	 * 用户id
	 */
	private int user_id;

	/**
	 * 小头像地址
	 */
	private String user_icon_small;

	/**
	 * 大头像地址
	 */
	private String user_icon_big;

	/**
	 * 个人说明
	 */
	private String short_description;

	/**
	 * 这...QAQ
	 * 忘记干嘛用的了
	 */
	private String description;

	/**
	 * 标签
	 */
	private String tag;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_icon_small() {
		return user_icon_small;
	}

	public void setUser_icon_small(String user_icon_small) {
		this.user_icon_small = user_icon_small;
	}

	public String getUser_icon_big() {
		return user_icon_big;
	}

	public void setUser_icon_big(String user_icon_big) {
		this.user_icon_big = user_icon_big;
	}

	public String getShort_description() {
		return short_description;
	}

	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	@Override
	public String toString() {
		return "Usermeta: " + user_id;
	}
}
