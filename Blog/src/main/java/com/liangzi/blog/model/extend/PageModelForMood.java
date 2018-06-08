package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForMood implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 心情状态
	private Integer moStatus;
	
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
	public Integer getMoStatus() {
		return moStatus;
	}
	public void setMoStatus(Integer moStatus) {
		this.moStatus = moStatus;
	}
	
}
