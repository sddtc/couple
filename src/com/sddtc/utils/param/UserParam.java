package com.sddtc.utils.param;

/**
 * @author sddtc
 *
 */
public class UserParam {
    
    /**主键*/
    private Long id;
    /**登陆id*/
    private String loginId;
    /**用户名*/
    private String name;
    /**密码*/
    private String password;
    
    
    public UserParam() {
        
    }
    
    public UserParam(String loginId) {
        this.loginId = loginId;
    }

    /**
     * 
     * @return {@link #id id} 
     **/
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id {@link #id id} 
     **/
    public void setId(Long id) {
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
    
    /**
     * 
     * @return {@link #name name} 
     **/
    public String getName() {
        return name;
    }

    /**
     * 
     * @param nickName {@link #name name} 
     **/
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return {@link #password password} 
     **/
    public String getPassword() {
        return password;
    }

    /**
     * 
     * @param password {@link #password password} 
     **/
    public void setPassword(String password) {
        this.password = password;
    }
}

