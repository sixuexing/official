package com.sxx.utils;

public class LoginResult {
	private Boolean success=true;
	private String messager="操作成功";
	private Long userid;
	private String Authorization;
	
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessager() {
		return messager;
	}
	public void setMessager(String messager) {
		this.messager = messager;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getAuthorization() {
		return Authorization;
	}
	public void setAuthorization(String authorization) {
		Authorization = authorization;
	}
	public LoginResult(Boolean success ,Long userid,String message,String Authorization) {
		this.success = success;
		this.userid = userid;
		this.messager = message;
		this.Authorization = Authorization;
	}
	
	public LoginResult(String messager) {
		this.success = false;
		this.messager = messager;
	}
	public LoginResult() {
		super();
	}
	
	@Override
	public String toString() {
		return "LoginResult [success=" + success + ", messager=" + messager + "]";
	}
}

