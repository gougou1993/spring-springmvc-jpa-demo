package com.zhong.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RestController;

import com.zhong.entity.Department;
import com.zhong.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Resource
	private DepartmentService departmentService;
	public Department save(){
		
		Department d = new Department();
		departmentService.save(d);
		
		return d;
		
	}
}
