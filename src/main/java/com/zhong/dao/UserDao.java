package com.zhong.dao;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.QueryHints;
import org.springframework.stereotype.Repository;

import com.zhong.entity.User;

@Repository
public interface UserDao extends BaseDao<User, Long> {
	 @QueryHints({@QueryHint(name = org.hibernate.jpa.QueryHints.HINT_CACHEABLE, value = "true")})
	 public List<User> findAllByEmail(String email);
}
