package com.sddtc.service.user.impl;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sddtc.mapper.UserMapper;
import com.sddtc.mapper.UsermetaMapper;
import com.sddtc.model.User;
import com.sddtc.model.Usermeta;
import com.sddtc.service.user.UserService;
import com.sddtc.utils.param.UserParam;

/**
 * @author sddtc
 * 
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

	@Resource
	private UserMapper userMapper;

	@Resource
	private UsermetaMapper usermetaMapper;

	public void add(User user) {
		UserParam param = new UserParam(user.getLogin_id());
		User exist = get(param);

		if (null != exist) {
			exist.setPassword(user.getPassword());
			update(exist);
		} else {
			user.setCreate_time(new Date());
			userMapper.add(user);
			logger.debug("用户添加成功{}", user.toString());
		}
	}

	public User get(UserParam param) {
		User exist = userMapper.get(param);
		return exist;
	}

	public void update(User user) {
		user.setUpdate_time(new Date());
		userMapper.update(user);
		logger.debug("更新用户成功:{}", user.toString());
	}

	@Override
	public void addMeta(Usermeta meta) {
		Usermeta exist = getMeta(meta.getUser_id());
		if (null != exist) {
			updateMeta(meta);
		} else {
			usermetaMapper.add(meta);
			logger.debug("用户meta信息添加成功{}", meta.toString());

		}

	}

	@Override
	public Usermeta getMeta(int user_id) {
		return usermetaMapper.get(user_id);
	}

	@Override
	public void updateMeta(Usermeta meta) {
		usermetaMapper.update(meta);
		logger.debug("更新用户meta信息成功:{}", meta.toString());
	}
}