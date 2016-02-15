package com.ldl.ibatis.dbcp.dao;

import com.ldl.ibatis.dbcp.pojo.User;

public interface UserDao {
	
	 public User getUserById(String userName);  
	 
	 public void saveUser(User user);
	 
}
