package com.sddtc.model;

import java.util.Date;

import com.google.common.base.Objects;

/**
 * @author sddtc 用户
 */
public class User {
	/** 主键 */
	private int id;
	/** 登陆id-邮箱 */
	private String login_id;
	/** 密码 */
	private String password;
	/** 名号 */
	private String nick_name;
	/** 验证code */
	private String auth_code;
	/** 创建时间 */
	private Date create_time;
	/** 更新时间 */
	private Date update_time;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the login_id
	 */
	public String getLogin_id() {
		return login_id;
	}

	/**
	 * @param login_id
	 *            the login_id to set
	 */
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the nick_name
	 */
	public String getNick_name() {
		return nick_name;
	}

	/**
	 * @param nick_name
	 *            the nick_name to set
	 */
	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	/**
	 * @return the auth_code
	 */
	public String getAuth_code() {
		return auth_code;
	}

	/**
	 * @param auth_code
	 *            the auth_code to set
	 */
	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
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

	/**
	 * @return the update_time
	 */
	public Date getUpdate_time() {
		return update_time;
	}

	/**
	 * @param update_time
	 *            the update_time to set
	 */
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper("用户").add("邮箱", this.login_id)
				.add("名号", this.nick_name).add("创建时间", this.create_time)
				.add("更新时间", this.update_time).toString();
	}

}