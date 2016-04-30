package com.sddtc.utils.param;

/**
 * @author sddtc
 *
 */
public class UserParam {
    
    /**主键*/
    private Long id;
    /**登陆id*/
    private String login_id;
    /**用户名*/
    private String nick_name;
    /**密码*/
    private String password;
    
    
    public UserParam() {
        
    }

	public UserParam(String login_id) {
		this.login_id = login_id;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLogin_id() {
		return login_id;
	}


	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}


	public String getNick_name() {
		return nick_name;
	}


	public void setNick_name(String nick_name) {
		this.nick_name = nick_name;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
}

