package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForAticle implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 文章内容
	private String atTitle;
	// 是否首页置顶
	private Integer atUpIndex;
	// 文章类型
	private String atTypeId;
	
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
	public String getAtTitle() {
		return atTitle;
	}
	public void setAtTitle(String atTitle) {
		this.atTitle = atTitle;
	}
	public Integer getAtUpIndex() {
		return atUpIndex;
	}
	public void setAtUpIndex(Integer atUpIndex) {
		this.atUpIndex = atUpIndex;
	}
	public String getAtTypeId() {
		return atTypeId;
	}
	public void setAtTypeId(String atTypeId) {
		this.atTypeId = atTypeId;
	}
	
}
