package com.ldl.ibatis.dbcp.pojo;

/**
 * 用户表.
 * @author lidongliang
 *
 */
public class User {
	private Integer userseq;
	private String userId;
	private String aliasName;
	private String userPwd;
	private String email;
	private String gender;
	public Integer getUserseq() {
		return userseq;
	}
	public void setUserseq(Integer userseq) {
		this.userseq = userseq;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
}
