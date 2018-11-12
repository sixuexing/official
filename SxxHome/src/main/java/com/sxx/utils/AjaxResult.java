package com.sxx.utils;

public class AjaxResult {
	private Boolean success=true;
	private String messager="操作成功";
	
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
	/**
	 * 成功的操作
	 */
	public AjaxResult() {}
	
	/**
	 * 当操作失败的时候，调用这个构造函数
	 * @param messager
	 */
	public AjaxResult(String messager) {
		this.success = false;
		this.messager = messager;
	}
	
	public AjaxResult(Boolean success,String messager){
		this.success = success;
		this.messager = messager;
	}
	
	@Override
	public String toString() {
		return "AjaxResult [success=" + success + ", messager=" + messager + "]";
	}
}
