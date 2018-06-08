package com.liangzi.blog.model.base;

import java.util.Date;

public class Mood {
    /**
     * 说说-id
     * 表字段 : mood.mo_id
     */
    private Long moId;

    /**
     * 说说-说说状态 1.正常 0.删除(默认1)
     * 表字段 : mood.mo_status
     */
    private Integer moStatus;

    /**
     * 说说-变化类型后的时间
     * 表字段 : mood.mo_creat_time_change
     */
    private String moCreatTimeChange;

    /**
     * 说说-备注
     * 表字段 : mood.mo_memo
     */
    private String moMemo;

    /**
     * 说说-创建时间
     * 表字段 : mood.mo_creat_time
     */
    private Date moCreatTime;

    /**
     * 说说-修改时间
     * 表字段 : mood.mo_modify_time
     */
    private Date moModifyTime;

    /**
     * 说说-内容
     * 表字段 : mood.mo_content
     */
    private String moContent;

    public Long getMoId() {
        return moId;
    }

    public void setMoId(Long moId) {
        this.moId = moId;
    }

    public Integer getMoStatus() {
        return moStatus;
    }

    public void setMoStatus(Integer moStatus) {
        this.moStatus = moStatus;
    }

    public String getMoCreatTimeChange() {
        return moCreatTimeChange;
    }

    public void setMoCreatTimeChange(String moCreatTimeChange) {
        this.moCreatTimeChange = moCreatTimeChange == null ? null : moCreatTimeChange.trim();
    }

    public String getMoMemo() {
        return moMemo;
    }

    public void setMoMemo(String moMemo) {
        this.moMemo = moMemo == null ? null : moMemo.trim();
    }

    public Date getMoCreatTime() {
        return moCreatTime;
    }

    public void setMoCreatTime(Date moCreatTime) {
        this.moCreatTime = moCreatTime;
    }

    public Date getMoModifyTime() {
        return moModifyTime;
    }

    public void setMoModifyTime(Date moModifyTime) {
        this.moModifyTime = moModifyTime;
    }

    public String getMoContent() {
        return moContent;
    }

    public void setMoContent(String moContent) {
        this.moContent = moContent == null ? null : moContent.trim();
    }
}