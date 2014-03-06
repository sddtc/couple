package com.sddtc.service.user;

import org.springframework.transaction.annotation.Transactional;

import com.sddtc.model.User;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 *
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     */
    @Transactional
    public void addUser(User user);
    
    /**
     * 根据查询条件获取用户
     * @param param 查询条件
     * @return
     */
    public User getUser(UserParam param);
}
