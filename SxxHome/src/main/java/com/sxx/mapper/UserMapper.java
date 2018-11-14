package com.sxx.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.sxx.domain.User;
@Mapper
public interface UserMapper extends BaseMapper<User> {
	//登录使用
	User findByUsername(String username);
	
	User loginFindNameAndPwd(String name,String password);
}
