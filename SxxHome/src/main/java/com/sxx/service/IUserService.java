package com.sxx.service;

import com.sxx.domain.User;
import com.sxx.query.UserQuery;

public interface IUserService {
	User get(Long id);

	User findByUsername(String userName);

	User findByLoginUsername(UserQuery userQuery);

}
