package com.sddtc.service.user.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sddtc.mapper.UserMapper;
import com.sddtc.model.User;
import com.sddtc.service.user.UserService;

/**
 * @author sddtc
 *
 */
@Service
public class UserServiceImpl implements UserService{
	
	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Resource
    private UserMapper userMapper;

	@Override
	public void addUser(User user) {
        userMapper.add(user);
        logger.info("添加用户成功{}", user.toString());
	}

	@Override
	public User getUser(int id) {
		return null;
	}
}
