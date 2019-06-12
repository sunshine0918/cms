package com.bawei.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bawei.dao.UserDao;
import com.bawei.entity.User;
import com.bawei.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	@Override
	public User login(User user) {
		return userDao.login(user);
	}

}
