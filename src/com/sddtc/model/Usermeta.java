package com.sddtc.model;

import com.google.common.base.Objects;

/**
 * @author sddtc 用户元素 这些都是有趣的信息呐>w<
 */
public class Usermeta {
	/** 用户id */
	private int user_id;
	/** 小头像地址 */
	private String user_icon_small;
	/** 大头像地址 */
	private String user_icon_big;
	/** 个人说明 */
	private String short_description;
	/**
	 * 这...QAQ 忘记干嘛用的了
	 */
	private String description;
	/** 标签(多个用分号分隔) */
	private String tag;

	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id
	 *            the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the user_icon_small
	 */
	public String getUser_icon_small() {
		return user_icon_small;
	}

	/**
	 * @param user_icon_small
	 *            the user_icon_small to set
	 */
	public void setUser_icon_small(String user_icon_small) {
		this.user_icon_small = user_icon_small;
	}

	/**
	 * @return the user_icon_big
	 */
	public String getUser_icon_big() {
		return user_icon_big;
	}

	/**
	 * @param user_icon_big
	 *            the user_icon_big to set
	 */
	public void setUser_icon_big(String user_icon_big) {
		this.user_icon_big = user_icon_big;
	}

	/**
	 * @return the short_description
	 */
	public String getShort_description() {
		return short_description;
	}

	/**
	 * @param short_description
	 *            the short_description to set
	 */
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the tag
	 */
	public String getTag() {
		return tag;
	}

	/**
	 * @param tag
	 *            the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper("用户元素").add("用户id", this.user_id)
				.add("小头像地址", this.user_icon_small)
				.add("大头像地址", this.user_icon_big)
				.add("个人说明", this.short_description).add("标签", this.tag)
				.toString();
	}
}
