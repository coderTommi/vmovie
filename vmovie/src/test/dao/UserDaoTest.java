package test.dao;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ldl.ibatis.dbcp.dao.UserDao;
import com.ldl.ibatis.dbcp.pojo.User;

public class UserDaoTest {
	
	private static UserDao userDao;
	
	private static ApplicationContext factory;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		factory = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/spring-configuration/applicationJunit.xml");
		userDao = (UserDao)factory.getBean("userDao");
	}
	
	@Test
	public void saveUser() throws Exception{
		User user = new User();
		user.setAliasName("李栋梁");
		user.setUserId("lidongliang");
		user.setEmail("lidongliang@inspur.com");
		user.setGender("1");
		user.setUserPwd("lidongliang");
		userDao.saveUser(user);
	}
	
	@Test
	public void getUser() throws Exception{
		User user = userDao.getUserById("lidongliang");
		System.out.println(user.getUserId()+":"+user.getAliasName()+":"+user.getUserPwd());
	}
	
	
}
