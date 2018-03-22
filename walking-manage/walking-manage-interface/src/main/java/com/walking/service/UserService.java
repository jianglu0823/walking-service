package com.walking.service;

import com.walking.model.User;

public interface UserService {

	User getUserById(Integer id);
	
	User getUserByUserName(String name);
	
	void insertUser(User user);
}
