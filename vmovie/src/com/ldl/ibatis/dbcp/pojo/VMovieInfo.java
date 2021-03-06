package com.ldl.ibatis.dbcp.pojo;

import java.sql.Timestamp;

/**
 * 视频信息pojo类.
 * @author lidongliang
 *
 */
public class VMovieInfo {
	
	private Integer movieSeq;
	private String movieUrl;
	private String title;
	private Integer userSeq;
	private Timestamp createDate;
	private String descMsg;
	public Integer getMovieSeq() {
		return movieSeq;
	}
	public void setMovieSeq(Integer movieSeq) {
		this.movieSeq = movieSeq;
	}
	public String getMovieUrl() {
		return movieUrl;
	}
	public void setMovieUrl(String movieUrl) {
		this.movieUrl = movieUrl;
	}
	public Integer getUserSeq() {
		return userSeq;
	}
	public void setUserSeq(Integer userSeq) {
		this.userSeq = userSeq;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getDescMsg() {
		return descMsg;
	}
	public void setDescMsg(String descMsg) {
		this.descMsg = descMsg;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
