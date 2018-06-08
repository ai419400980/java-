package com.liangzi.blog.model.base;

import java.util.Date;

public class Visitors {
    /**
     * 访问者记录-id
     * 表字段 : visitors.vi_id
     */
    private Long viId;

    /**
     * 访问者记录-地区
     * 表字段 : visitors.vi_area
     */
    private String viArea;

    /**
     * 访问者记录-ip
     * 表字段 : visitors.vi_ip
     */
    private String viIp;

    /**
     * 
     * 表字段 : visitors.vi_memo
     */
    private String viMemo;

    /**
     * 访问者记录-访问的时间
     * 表字段 : visitors.vi_visit_time
     */
    private String viVisitTime;

    /**
     * 访问者记录-备注
     * 表字段 : visitors.vi_creat_time_change
     */
    private String viCreatTimeChange;

    /**
     * 访问者记录-变化类型后的时间
     * 表字段 : visitors.vi_creat_time
     */
    private Date viCreatTime;

    public Long getViId() {
        return viId;
    }

    public void setViId(Long viId) {
        this.viId = viId;
    }

    public String getViArea() {
        return viArea;
    }

    public void setViArea(String viArea) {
        this.viArea = viArea == null ? null : viArea.trim();
    }

    public String getViIp() {
        return viIp;
    }

    public void setViIp(String viIp) {
        this.viIp = viIp == null ? null : viIp.trim();
    }

    public String getViMemo() {
        return viMemo;
    }

    public void setViMemo(String viMemo) {
        this.viMemo = viMemo == null ? null : viMemo.trim();
    }

    public String getViVisitTime() {
        return viVisitTime;
    }

    public void setViVisitTime(String viVisitTime) {
        this.viVisitTime = viVisitTime == null ? null : viVisitTime.trim();
    }

    public String getViCreatTimeChange() {
        return viCreatTimeChange;
    }

    public void setViCreatTimeChange(String viCreatTimeChange) {
        this.viCreatTimeChange = viCreatTimeChange == null ? null : viCreatTimeChange.trim();
    }

    public Date getViCreatTime() {
        return viCreatTime;
    }

    public void setViCreatTime(Date viCreatTime) {
        this.viCreatTime = viCreatTime;
    }
}