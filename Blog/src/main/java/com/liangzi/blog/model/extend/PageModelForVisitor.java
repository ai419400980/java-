package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForVisitor implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 单日时间
	private String viArea;
	// 单日时间
	private String viIp;
	// 单日时间
	private String viMemo;
	
	
	
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
	public String getViArea() {
		return viArea;
	}
	public void setViArea(String viArea) {
		this.viArea = viArea;
	}
	public String getViIp() {
		return viIp;
	}
	public void setViIp(String viIp) {
		this.viIp = viIp;
	}
	public String getViMemo() {
		return viMemo;
	}
	public void setViMemo(String viMemo) {
		this.viMemo = viMemo;
	}
}
