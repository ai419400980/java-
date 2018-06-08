package com.liangzi.blog.model.base;

import java.util.Date;

public class AticleComment {
    /**
     * 文章评论-id
     * 表字段 : aticle_comment.ac_id
     */
    private Long acId;

    /**
     * 文章-id
     * 表字段 : aticle_comment.ac_aticle_id
     */
    private Long acAticleId;

    /**
     * 文章评论-评论内容
     * 表字段 : aticle_comment.ac_content
     */
    private String acContent;

    /**
     * 文章评论-说说状态 1.正常 0.删除(默认1)
     * 表字段 : aticle_comment.ac_status
     */
    private Integer acStatus;

    /**
     * 文章评论-变化类型后的时间
     * 表字段 : aticle_comment.ac_creat_time_change
     */
    private String acCreatTimeChange;

    /**
     * 文章评论-备注
     * 表字段 : aticle_comment.ac_memo
     */
    private String acMemo;

    /**
     * 文章评论-创建时间
     * 表字段 : aticle_comment.ac_creat_time
     */
    private Date acCreatTime;

    /**
     * 文章评论-修改时间
     * 表字段 : aticle_comment.ac_modify_time
     */
    private Date acModifyTime;

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public Long getAcAticleId() {
        return acAticleId;
    }

    public void setAcAticleId(Long acAticleId) {
        this.acAticleId = acAticleId;
    }

    public String getAcContent() {
        return acContent;
    }

    public void setAcContent(String acContent) {
        this.acContent = acContent == null ? null : acContent.trim();
    }

    public Integer getAcStatus() {
        return acStatus;
    }

    public void setAcStatus(Integer acStatus) {
        this.acStatus = acStatus;
    }

    public String getAcCreatTimeChange() {
        return acCreatTimeChange;
    }

    public void setAcCreatTimeChange(String acCreatTimeChange) {
        this.acCreatTimeChange = acCreatTimeChange == null ? null : acCreatTimeChange.trim();
    }

    public String getAcMemo() {
        return acMemo;
    }

    public void setAcMemo(String acMemo) {
        this.acMemo = acMemo == null ? null : acMemo.trim();
    }

    public Date getAcCreatTime() {
        return acCreatTime;
    }

    public void setAcCreatTime(Date acCreatTime) {
        this.acCreatTime = acCreatTime;
    }

    public Date getAcModifyTime() {
        return acModifyTime;
    }

    public void setAcModifyTime(Date acModifyTime) {
        this.acModifyTime = acModifyTime;
    }
}