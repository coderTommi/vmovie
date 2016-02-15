package test.dao;

import java.sql.Timestamp;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.ldl.ibatis.dbcp.dao.EvaluateInfoDao;
import com.ldl.ibatis.dbcp.pojo.EvaluateInfo;

public class EvaluateInfoDaoTest {

	private static EvaluateInfoDao evaluateInfoDao;
	
	private static ApplicationContext factory;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		factory = new FileSystemXmlApplicationContext(
				"WebContent/WEB-INF/spring-configuration/applicationJunit.xml");
		evaluateInfoDao = (EvaluateInfoDao)factory.getBean("evaluateInfoDao");
	}
	
	@Test
	public void save() throws Exception{
		EvaluateInfo info = new EvaluateInfo();
		info.setCreateTime(new Timestamp(System.currentTimeMillis()));
		info.setEvaMsg("哈哈");
		info.setMovieSeq(1);
		info.setUserseq(1);
		evaluateInfoDao.save(info);
	}
	
	@Test
	public void testquery() throws Exception{
		List<EvaluateInfo> list = evaluateInfoDao.getEvaInfoByMovieId(1);
		for(EvaluateInfo info : list)
		{
			System.out.println(info.getEvaSeq()+":"+info.getEvaMsg()+":"+info.getParentEva());
		}
	}
}
