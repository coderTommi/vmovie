package com.ldl.ibatis.dbcp.dao.impl;

import java.util.List;

import com.ldl.ibatis.dbcp.dao.EvaluateInfoDao;
import com.ldl.ibatis.dbcp.dao.mapper.EvaluateInfoMapper;
import com.ldl.ibatis.dbcp.pojo.EvaluateInfo;

/**
 * 评价类DAO.
 * @author lidongliang
 *
 */
public class EvaluateInfoDaoImpl implements EvaluateInfoDao {
	
	private EvaluateInfoMapper evaluateInfoMapper;
	public void setEvaluateInfoMapper(EvaluateInfoMapper evaluateInfoMapper) {
		this.evaluateInfoMapper = evaluateInfoMapper;
	}
	@Override
	public void save(EvaluateInfo info) {
		evaluateInfoMapper.save(info);
	}
	@Override
	public List<EvaluateInfo> getEvaInfoByMovieId(int movieseq) {
		return evaluateInfoMapper.getEvaInfoByMovieId(movieseq);
	}

}
