package com.liangzi.blog.model.base;

import java.util.Date;

public class VisitorsLogs {
    /**
     * 访问者操作记录-id
     * 表字段 : visitors_logs.vl_id
     */
    private Long vlId;

    /**
     * 访问者操作记录-地区
     * 表字段 : visitors_logs.vl_area
     */
    private String vlArea;

    /**
     * 访问者操作记录-ip
     * 表字段 : visitors_logs.vl_ip
     */
    private String vlIp;

    /**
     * 访问者操作记录-访问目标
     * 表字段 : visitors_logs.vl_target
     */
    private String vlTarget;

    /**
     * 访问者操作记录-操作内容
     * 表字段 : visitors_logs.vl_operation_content
     */
    private String vlOperationContent;

    /**
     * 访问者操作记录-备注
     * 表字段 : visitors_logs.vl_memo
     */
    private String vlMemo;

    /**
     * 访问者操作记录-访问的时间
     * 表字段 : visitors_logs.vl_visit_time
     */
    private String vlVisitTime;

    /**
     * 访问者记录-变化类型后的时间
     * 表字段 : visitors_logs.vl_creat_time_change
     */
    private String vlCreatTimeChange;

    /**
     * 访问者操作记录-创建时间
     * 表字段 : visitors_logs.vl_creat_time
     */
    private Date vlCreatTime;

    public Long getVlId() {
        return vlId;
    }

    public void setVlId(Long vlId) {
        this.vlId = vlId;
    }

    public String getVlArea() {
        return vlArea;
    }

    public void setVlArea(String vlArea) {
        this.vlArea = vlArea == null ? null : vlArea.trim();
    }

    public String getVlIp() {
        return vlIp;
    }

    public void setVlIp(String vlIp) {
        this.vlIp = vlIp == null ? null : vlIp.trim();
    }

    public String getVlTarget() {
        return vlTarget;
    }

    public void setVlTarget(String vlTarget) {
        this.vlTarget = vlTarget == null ? null : vlTarget.trim();
    }

    public String getVlOperationContent() {
        return vlOperationContent;
    }

    public void setVlOperationContent(String vlOperationContent) {
        this.vlOperationContent = vlOperationContent == null ? null : vlOperationContent.trim();
    }

    public String getVlMemo() {
        return vlMemo;
    }

    public void setVlMemo(String vlMemo) {
        this.vlMemo = vlMemo == null ? null : vlMemo.trim();
    }

    public String getVlVisitTime() {
        return vlVisitTime;
    }

    public void setVlVisitTime(String vlVisitTime) {
        this.vlVisitTime = vlVisitTime == null ? null : vlVisitTime.trim();
    }

    public String getVlCreatTimeChange() {
        return vlCreatTimeChange;
    }

    public void setVlCreatTimeChange(String vlCreatTimeChange) {
        this.vlCreatTimeChange = vlCreatTimeChange == null ? null : vlCreatTimeChange.trim();
    }

    public Date getVlCreatTime() {
        return vlCreatTime;
    }

    public void setVlCreatTime(Date vlCreatTime) {
        this.vlCreatTime = vlCreatTime;
    }
}