package com.zhong.service;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * @author admin
 *
 * @param <T>
 * @param <ID>
 */
public interface BaseService<T, ID extends Serializable> {
    List<T> findAll();
    T findById(Serializable ID);
    void save(T  entity);
    void update(T entity);
    void delete(ID id);
}