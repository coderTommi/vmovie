package com.ldl.ibatis.dbcp.dao;

import java.util.List;

import com.ldl.ibatis.dbcp.pojo.EvaluateInfo;

public interface EvaluateInfoDao {
	
	void save(EvaluateInfo info);
	
	List<EvaluateInfo> getEvaInfoByMovieId(int movieseq);

}
