package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForBlacklist implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 用户ip
	private String mbIp;
	
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
	public String getMbIp() {
		return mbIp;
	}
	public void setMbIp(String mbIp) {
		this.mbIp = mbIp;
	}
	
}
