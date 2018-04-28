package com.zhong.service;

import java.util.List;

import com.zhong.entity.User;

public interface UserService extends BaseService<User,Long>{
	List<User> findAllByEmail(String email);
}
