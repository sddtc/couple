package com.sddtc.model;

import java.util.Date;

/**
 * @author sddtc
 *
 */
public class User {
    
    private int id;
    
    private String loginId;
    
    private String password;
    
    private String name;
    
    private Date create_date;

    /**
     * 
     * @return {@link #id id} 
     **/
    public int getId() {
        return id;
    }

    /**
     * 
     * @param id {@link #id id} 
     **/
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 
     * @return {@link #loginId loginId} 
     **/
    public String getLoginId() {
        return loginId;
    }

    /**
     * 
     * @param loginId {@link #loginId loginId} 
     **/
    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	@Override
	public String toString() {
		return "User [loginId=" + loginId + ", name=" + name + "]";
	}
 }