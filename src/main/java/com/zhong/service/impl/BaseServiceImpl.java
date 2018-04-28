package com.zhong.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.zhong.dao.BaseDao;
import com.zhong.service.BaseService;

public class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T, ID> {

	@Autowired
	private BaseDao<T, ID> baseDao;
	
	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public List<T> findAll() {
		return baseDao.findAll();
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.NOT_SUPPORTED)
	public T findById(Serializable ID) {
		// this.baseDao.findOne(ID);
		Optional optional = baseDao.findById((ID) ID);
		return  (T) optional.get();
	}
	
	@Override
	public void save(T entity) {
		this.baseDao.save(entity);
	}

	@Override
	public void update(T entity) {
		this.baseDao.saveAndFlush(entity);
	}
	
	@Override
	public void delete(ID id) {
		this.baseDao.deleteById(id);
	}

}
