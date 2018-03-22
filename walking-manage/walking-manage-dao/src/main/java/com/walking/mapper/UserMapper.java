package com.walking.mapper;

import com.walking.model.User;

public interface UserMapper {

	User getUserById(Integer id);

	User getUserByUserName(String name);

	void insertUser(User user);
	
}
