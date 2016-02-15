package test.dao;

import java.sql.Timestamp;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ldl.ibatis.dbcp.dao.UserDao;
import com.ldl.ibatis.dbcp.dao.VMovieInfoDao;
import com.ldl.ibatis.dbcp.pojo.VMovieInfo;

public class VMovieInfoTest {
	
	private static VMovieInfoDao movieDao;
	
	private static ApplicationContext factory;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		factory = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/spring-configuration/applicationJunit.xml");
		movieDao = (VMovieInfoDao)factory.getBean("movieDao");
	}
	
	@Test
	public void save(){
		VMovieInfo info = new VMovieInfo();
		info.setCreateDate(new Timestamp(System.currentTimeMillis()));
		info.setDescMsg("test desc");
		info.setMovieUrl("http://www.youku.com/");
		info.setTitle("Test Title");
		info.setUserSeq(1);
		movieDao.save(info);
	}
	
	@Test
	public void getBySeq(){
		int seq = 1;
		VMovieInfo info = movieDao.getMovieBySeq(seq);
		System.out.println(info.getTitle()+"::"+info.getDescMsg());
		
	}

}
