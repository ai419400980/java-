package com.liangzi.blog.model.base;

import java.util.Date;

public class Comment {
    /**
     * 评论-id
     * 表字段 : comment.co_id
     */
    private Long coId;

    /**
     * 评论-评论状态 1.正常 0.删除(默认1)
     * 表字段 : comment.co_status
     */
    private Integer coStatus;

    /**
     * 评论-变化类型后的时间
     * 表字段 : comment.co_creat_time_change
     */
    private String coCreatTimeChange;

    /**
     * 说说-备注
     * 表字段 : comment.co_memo
     */
    private String coMemo;

    /**
     * 说说-创建时间
     * 表字段 : comment.co_creat_time
     */
    private Date coCreatTime;

    /**
     * 说说-修改时间
     * 表字段 : comment.co_modify_time
     */
    private Date coModifyTime;

    /**
     * 评论-说说内容
     * 表字段 : comment.co_content
     */
    private String coContent;

    public Long getCoId() {
        return coId;
    }

    public void setCoId(Long coId) {
        this.coId = coId;
    }

    public Integer getCoStatus() {
        return coStatus;
    }

    public void setCoStatus(Integer coStatus) {
        this.coStatus = coStatus;
    }

    public String getCoCreatTimeChange() {
        return coCreatTimeChange;
    }

    public void setCoCreatTimeChange(String coCreatTimeChange) {
        this.coCreatTimeChange = coCreatTimeChange == null ? null : coCreatTimeChange.trim();
    }

    public String getCoMemo() {
        return coMemo;
    }

    public void setCoMemo(String coMemo) {
        this.coMemo = coMemo == null ? null : coMemo.trim();
    }

    public Date getCoCreatTime() {
        return coCreatTime;
    }

    public void setCoCreatTime(Date coCreatTime) {
        this.coCreatTime = coCreatTime;
    }

    public Date getCoModifyTime() {
        return coModifyTime;
    }

    public void setCoModifyTime(Date coModifyTime) {
        this.coModifyTime = coModifyTime;
    }

    public String getCoContent() {
        return coContent;
    }

    public void setCoContent(String coContent) {
        this.coContent = coContent == null ? null : coContent.trim();
    }
}