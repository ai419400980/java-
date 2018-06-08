package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForVisitorLogs implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 用户地区
	private String vlArea;
	// 用户ip
	private String vlIp;
	// 用户操作目标
	private String vlTarget;
	// 用户操作内容
	private String vlOperationContent;
	// 用户客户端
	private String vlMemo;
	
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
	public String getVlArea() {
		return vlArea;
	}
	public void setVlArea(String vlArea) {
		this.vlArea = vlArea;
	}
	public String getVlIp() {
		return vlIp;
	}
	public void setVlIp(String vlIp) {
		this.vlIp = vlIp;
	}
	public String getVlTarget() {
		return vlTarget;
	}
	public void setVlTarget(String vlTarget) {
		this.vlTarget = vlTarget;
	}
	public String getVlOperationContent() {
		return vlOperationContent;
	}
	public void setVlOperationContent(String vlOperationContent) {
		this.vlOperationContent = vlOperationContent;
	}
	public String getVlMemo() {
		return vlMemo;
	}
	public void setVlMemo(String vlMemo) {
		this.vlMemo = vlMemo;
	}
	
	
}
