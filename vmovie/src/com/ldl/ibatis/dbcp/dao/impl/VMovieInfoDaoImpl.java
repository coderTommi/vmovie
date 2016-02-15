package com.ldl.ibatis.dbcp.dao.impl;

import com.ldl.ibatis.dbcp.dao.VMovieInfoDao;
import com.ldl.ibatis.dbcp.dao.mapper.VmovieInfoMapper;
import com.ldl.ibatis.dbcp.pojo.VMovieInfo;

public class VMovieInfoDaoImpl implements VMovieInfoDao {
	
	private VmovieInfoMapper vmovieInfoMapper;
	public void setVmovieInfoMapper(VmovieInfoMapper vmovieInfoMapper) {
		this.vmovieInfoMapper = vmovieInfoMapper;
	}
	@Override
	public void save(VMovieInfo info) {
		vmovieInfoMapper.save(info);
	}
	
	public VMovieInfo getMovieBySeq(int seq) {
		return vmovieInfoMapper.getBySeq(seq);
	};
}
