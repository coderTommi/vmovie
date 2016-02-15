package com.ldl.service.impl;

import javax.annotation.Resource;

import com.ldl.ibatis.dbcp.dao.UserDao;
import com.ldl.ibatis.dbcp.pojo.User;
import com.ldl.service.RegisterService;
import com.ldl.util.LDLUtil;
/**
 * 注册服务类
 * @author lidongliang
 *
 */
public class RegisterServiceImpl implements RegisterService {
	
	@Resource
	private UserDao userDao;
	
	@Override
	public void register(String userId, String aliasName, String userPwd,
			String email, String gender) {
		User user = new User();
		user.setAliasName(aliasName);
		user.setUserId(userId);
		user.setEmail(email);
		user.setGender(gender);
		user.setUserPwd(LDLUtil.digest(userPwd));
		userDao.saveUser(user);
	}

}
