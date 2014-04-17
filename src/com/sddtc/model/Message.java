package com.sddtc.model;

import java.util.Date;

import com.google.common.base.Objects;

/**
 * @author sddtc 留言版
 */
public class Message {
	/** 主键 */
	private String id;
	/** 主用户id */
	private int user_id;
	/** 留言者id */
	private int visitor_id;
	/** 内容 */
	private String text;
	/** 创建时间 */
	private Date create_time;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	 * @return the visitor_id
	 */
	public int getVisitor_id() {
		return visitor_id;
	}

	/**
	 * @param visitor_id
	 *            the visitor_id to set
	 */
	public void setVisitor_id(int visitor_id) {
		this.visitor_id = visitor_id;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text
	 *            the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	/**
	 * @return the create_time
	 */
	public Date getCreate_time() {
		return create_time;
	}

	/**
	 * @param create_time
	 *            the create_time to set
	 */
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return Objects.toStringHelper("留言版")
				.add("留言者", this.visitor_id)
				.add("主用户", this.user_id)
				.add("创建时间", this.create_time)
				.toString();
	}
}
