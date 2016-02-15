package com.ldl.ibatis.dbcp.dao;

import com.ldl.ibatis.dbcp.pojo.VMovieInfo;

public interface VMovieInfoDao {
	
	void save(VMovieInfo info);
	
	VMovieInfo getMovieBySeq(int seq);

}
