package com.sddtc.mapper;

import com.sddtc.model.User;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 *
 */
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     */
    public void add(User user);
    
    /**
     * 更新用户
     * @param user
     */
    public void update(User user);
    
    /**
     * 根据查询条件获取用户
     * @param param 查询条件
     * @return
     */
    public User get(UserParam param);
}
