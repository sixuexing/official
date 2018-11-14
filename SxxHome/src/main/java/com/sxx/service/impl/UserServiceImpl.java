package com.sxx.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sxx.domain.User;
import com.sxx.mapper.UserMapper;
import com.sxx.service.IUserService;
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService{
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User findByUsername(String userName) {
		// TODO Auto-generated method stub
		return userMapper.findByUsername(userName);
	}

	@Override
	public User login(String name, String password) {
		// TODO Auto-generated method stub
		return userMapper.loginFindNameAndPwd(name, password);
	}
	


}
