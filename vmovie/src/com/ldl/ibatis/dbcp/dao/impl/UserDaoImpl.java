package com.ldl.ibatis.dbcp.dao.impl;

import com.ldl.ibatis.dbcp.dao.UserDao;
import com.ldl.ibatis.dbcp.dao.mapper.UserMapper;
import com.ldl.ibatis.dbcp.pojo.User;

public class UserDaoImpl implements UserDao {
	
	private UserMapper userMapper;
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
	@Override
	public User getUserById(String userName) {
		return userMapper.getUserById(userName);
	}
	
	@Override
	public void saveUser(User user) {
		userMapper.save(user);
	}

}
