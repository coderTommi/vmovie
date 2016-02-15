package com.ldl.ibatis.dbcp.dao.mapper;

import java.util.List;

import com.ldl.ibatis.dbcp.pojo.EvaluateInfo;

public interface EvaluateInfoMapper {
	
	void save(EvaluateInfo info);
	
	List<EvaluateInfo> getEvaInfoByMovieId(int movieseq);

}
