package com.zhong.dao;

import org.springframework.stereotype.Repository;

import com.zhong.entity.Department;
@Repository
public interface DepartmentDao extends BaseDao<Department, Long> {
	
}
