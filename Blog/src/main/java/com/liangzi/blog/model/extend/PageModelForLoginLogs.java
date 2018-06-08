package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForLoginLogs implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 用户地区
	private String mllIp;
	// 用户输入内容
	private String mllAccount;
	// 用户登录状态
	private String mllLoginStatus;
	// 用户客户端
	private String mllMemo;
	
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getMllIp() {
		return mllIp;
	}
	public void setMllIp(String mllIp) {
		this.mllIp = mllIp;
	}
	public String getMllAccount() {
		return mllAccount;
	}
	public void setMllAccount(String mllAccount) {
		this.mllAccount = mllAccount;
	}
	public String getMllLoginStatus() {
		return mllLoginStatus;
	}
	public void setMllLoginStatus(String mllLoginStatus) {
		this.mllLoginStatus = mllLoginStatus;
	}
	public String getMllMemo() {
		return mllMemo;
	}
	public void setMllMemo(String mllMemo) {
		this.mllMemo = mllMemo;
	}
	
}
