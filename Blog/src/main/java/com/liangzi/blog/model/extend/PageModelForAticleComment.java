package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForAticleComment implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 文章评论id
	private Long acAticleId;
	// 文章评论消息状态
	private Integer acStatus;
	
	
	
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
	public Integer getAcStatus() {
		return acStatus;
	}
	public void setAcStatus(Integer acStatus) {
		this.acStatus = acStatus;
	}
	public Long getAcAticleId() {
		return acAticleId;
	}
	public void setAcAticleId(Long acAticleId) {
		this.acAticleId = acAticleId;
	}
	
}
