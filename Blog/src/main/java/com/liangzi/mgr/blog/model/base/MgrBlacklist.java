package com.liangzi.mgr.blog.model.base;

import java.util.Date;

public class MgrBlacklist {
    /**
     * 黑名单-id
     * 表字段 : mgr_blacklist.mb_id
     */
    private Long mbId;

    /**
     * 黑名单-ip
     * 表字段 : mgr_blacklist.mb_ip
     */
    private String mbIp;

    /**
     * 黑名单-等级
     * 表字段 : mgr_blacklist.mb_grade
     */
    private Integer mbGrade;

    /**
     * 黑名单-原因
     * 表字段 : mgr_blacklist.mb_reason
     */
    private String mbReason;

    /**
     * 
     * 表字段 : mgr_blacklist.mb_memo
     */
    private String mbMemo;

    /**
     * 黑名单-备注
     * 表字段 : mgr_blacklist.mb_creat_time_change
     */
    private String mbCreatTimeChange;

    /**
     * 黑名单-创建时间
     * 表字段 : mgr_blacklist.mb_creat_time
     */
    private Date mbCreatTime;

    public Long getMbId() {
        return mbId;
    }

    public void setMbId(Long mbId) {
        this.mbId = mbId;
    }

    public String getMbIp() {
        return mbIp;
    }

    public void setMbIp(String mbIp) {
        this.mbIp = mbIp == null ? null : mbIp.trim();
    }

    public Integer getMbGrade() {
        return mbGrade;
    }

    public void setMbGrade(Integer mbGrade) {
        this.mbGrade = mbGrade;
    }

    public String getMbReason() {
        return mbReason;
    }

    public void setMbReason(String mbReason) {
        this.mbReason = mbReason == null ? null : mbReason.trim();
    }

    public String getMbMemo() {
        return mbMemo;
    }

    public void setMbMemo(String mbMemo) {
        this.mbMemo = mbMemo == null ? null : mbMemo.trim();
    }

    public String getMbCreatTimeChange() {
        return mbCreatTimeChange;
    }

    public void setMbCreatTimeChange(String mbCreatTimeChange) {
        this.mbCreatTimeChange = mbCreatTimeChange == null ? null : mbCreatTimeChange.trim();
    }

    public Date getMbCreatTime() {
        return mbCreatTime;
    }

    public void setMbCreatTime(Date mbCreatTime) {
        this.mbCreatTime = mbCreatTime;
    }
}