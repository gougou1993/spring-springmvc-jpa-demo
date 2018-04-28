package com.zhong.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhong.entity.Department;
import com.zhong.entity.User;
import com.zhong.service.DepartmentService;
import com.zhong.service.UserService;

@Controller
public class UserController {
	
	private static Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private UserService userService;
	public static long dId = 1L;
	@Resource
	private DepartmentService departmentService;
	
	@RequestMapping("/user/find/{id}")
	@ResponseBody
	public User findOne(@PathVariable("id") Long id){
		User user = userService.findById(id);
		logger.debug(user.toString());
		return user;
	}
	@RequestMapping("/user/save")
	@ResponseBody
	public User save(){
		User user  = new User();
		user.setName("test");
		this.userService.save(user);
		
		Department department = new Department();
		
		department.setCode(dId+"");
		
		department.setName("编码1"+dId);
		dId++;
		department.setpId(0L);
		this.departmentService.save(department);
		
		
		return user;
	}
	
	@RequestMapping("/user/list")
	@ResponseBody
	public List<User> findAll(){
		List<User> users = this.userService.findAll();
		return users;
	}
	
}
