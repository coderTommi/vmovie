package com.ldl.ibatis.dbcp.dao.mapper;

import com.ldl.ibatis.dbcp.pojo.User;

public interface UserMapper {
	
	User getUserById(String userName);
	
	void save(User user);
	
}
