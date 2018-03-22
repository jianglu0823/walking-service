package com.walking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walking.mapper.UserMapper;
import com.walking.model.User;
import com.walking.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUserById(Integer id) {
		System.out.println("调用service");
		User u = userMapper.getUserById(id);
		return  u;
	}

	@Override
	public User getUserByUserName(String name) {
		return userMapper.getUserByUserName(name);
	}

	@Override
	public void insertUser(User user) {
		userMapper.insertUser(user);
	}

}