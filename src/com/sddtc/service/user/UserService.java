package com.sddtc.service.user;

import com.sddtc.model.User;

/**
 * @author sddtc
 *
 */
public interface UserService {
	
	public void addUser(User user);
	
	public User getUser(int id);
}
