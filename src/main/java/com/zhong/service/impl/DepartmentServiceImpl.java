package com.zhong.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhong.dao.DepartmentDao;
import com.zhong.entity.Department;
import com.zhong.service.DepartmentService;

@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department, Long> implements DepartmentService {

	@Resource
	private DepartmentDao departmentDao;
	
}
