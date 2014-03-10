package com.sddtc.service.user.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sddtc.mapper.UserMapper;
import com.sddtc.model.User;
import com.sddtc.service.user.UserService;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 *
 */
@Service
@Transactional
public class UserServiceImpl implements UserService{
    
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    
    @Resource
    private UserMapper userMapper;
    
    public void addUser(User user) {
        UserParam param = new UserParam(user.getLogin_id());
        User exist = getUser(param);

        if(null != exist) {
           exist.setPassword(user.getPassword());
           userMapper.update(exist);
           logger.info("更新用户成功", user.toString());
        } else {
            user.setCreate_time(new Date());
            userMapper.add(user);
            logger.debug("用户添加成功",user.toString());
        }
    }

    public User getUser(UserParam param) {
        User exist = userMapper.get(param);
        return exist;
    }
}