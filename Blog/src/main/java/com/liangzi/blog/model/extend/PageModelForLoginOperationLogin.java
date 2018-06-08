package com.liangzi.blog.model.extend;

import java.io.Serializable;

public class PageModelForLoginOperationLogin implements Serializable {
	
	// 序列化
	private static final long serialVersionUID = 1L;
	
	// 过滤的总条数
	private int maxCount;
	// 每一页文章的个数
	private int pageSize;
	// 用户IP
	private String mgrIp;
	// 用户账号
	private String mlName;
	// 用户操作目标
	private String mlTarget;
	// 用户操作内容
	private String mlOperationContent;
	// 用户客户端
	private String mlMemo;
	
	
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
	public String getMgrIp() {
		return mgrIp;
	}
	public void setMgrIp(String mgrIp) {
		this.mgrIp = mgrIp;
	}
	public String getMlName() {
		return mlName;
	}
	public void setMlName(String mlName) {
		this.mlName = mlName;
	}
	public String getMlTarget() {
		return mlTarget;
	}
	public void setMlTarget(String mlTarget) {
		this.mlTarget = mlTarget;
	}
	public String getMlOperationContent() {
		return mlOperationContent;
	}
	public void setMlOperationContent(String mlOperationContent) {
		this.mlOperationContent = mlOperationContent;
	}
	public String getMlMemo() {
		return mlMemo;
	}
	public void setMlMemo(String mlMemo) {
		this.mlMemo = mlMemo;
	}
		
}
