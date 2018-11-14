package com.sxx.service;

import org.apache.ibatis.annotations.Param;

import com.sxx.domain.User;

public interface IUserService extends BaseService<User>{

	User findByUsername(String userName);
	User login(@Param("name")String name,@Param("password")String password);
}
