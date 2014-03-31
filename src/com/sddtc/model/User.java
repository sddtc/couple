package com.sddtc.model;

import java.util.Date;

/**
 * @author sddtc
 * 用户
 */
public class User {
    /**主键*/
    private int id;
    /**登陆id-邮箱*/
    private String login_id;
    /**密码*/
    private String password;
    /**名号*/
    private String nick_name;
    /**验证code*/
    private String auth_code;
    /**创建时间*/
    private Date create_time;
    /**更新时间*/
    private Date update_time;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogin_id() {
		return login_id;
	}

	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick_name() {
		return nick_name;
	}

	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}

	public String getAuth_code() {
		return auth_code;
	}

	public void setAuth_code(String auth_code) {
		this.auth_code = auth_code;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	
	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", 用户名=" + nick_name + ",更新时间为: " + update_time  + "]";
	}

}