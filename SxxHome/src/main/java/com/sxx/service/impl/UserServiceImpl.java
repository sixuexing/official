package com.sxx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxx.domain.User;
import com.sxx.mapper.UserMapper;
import com.sxx.query.UserQuery;
import com.sxx.service.IUserService;
@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private  UserMapper userMapper;

	@Override
	public User get(Long id) {
		
		return userMapper.get(id);
	}

	@Override
	public User findByUsername(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByLoginUsername(UserQuery userQuery) {
		// TODO Auto-generated method stub
		return null;
	}

}
