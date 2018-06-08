package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModel implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 文章类型
	private int type;
	// 内容状态
	private int status;
	// 每一页文章的个数
	private int pageSize;
	// 搜索关键词
	private String tittle;
	// 单日时间
	private String date;
	
	public int getMaxCount() {
		return maxCount;
	}
	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}
