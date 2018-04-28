package com.zhong.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhong.dao.UserDao;
import com.zhong.entity.User;
import com.zhong.service.UserService;

@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long> implements UserService {
	
	@Resource
	private UserDao userDao;
	
	@Override
	public List<User> findAllByEmail(String email) {
		return this.userDao.findAllByEmail(email);
	}

}
