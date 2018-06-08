package com.liangzi.mgr.blog.model.base;

import java.util.Date;

public class MgrLogs {
    /**
     * 管理员操作日志-id
     * 表字段 : mgr_logs.ml_id
     */
    private Long mlId;

    /**
     * 管理员操作日志-ip
     * 表字段 : mgr_logs.mgr_ip
     */
    private String mgrIp;

    /**
     * 管理员操作日志-操作者名称
     * 表字段 : mgr_logs.ml_name
     */
    private String mlName;

    /**
     * 访问者操作记录-访问目标
     * 表字段 : mgr_logs.ml_target
     */
    private String mlTarget;

    /**
     * 访问者操作记录-操作内容
     * 表字段 : mgr_logs.ml_operation_content
     */
    private String mlOperationContent;

    /**
     * 管理员操作日志--变化类型后的时间
     * 表字段 : mgr_logs.ml_creat_time_change
     */
    private String mlCreatTimeChange;

    /**
     * 管理员操作日志--备注
     * 表字段 : mgr_logs.ml_memo
     */
    private String mlMemo;

    /**
     * 管理员操作日志-创建时间
     * 表字段 : mgr_logs.ml_creat_time
     */
    private Date mlCreatTime;

    public Long getMlId() {
        return mlId;
    }

    public void setMlId(Long mlId) {
        this.mlId = mlId;
    }

    public String getMgrIp() {
        return mgrIp;
    }

    public void setMgrIp(String mgrIp) {
        this.mgrIp = mgrIp == null ? null : mgrIp.trim();
    }

    public String getMlName() {
        return mlName;
    }

    public void setMlName(String mlName) {
        this.mlName = mlName == null ? null : mlName.trim();
    }

    public String getMlTarget() {
        return mlTarget;
    }

    public void setMlTarget(String mlTarget) {
        this.mlTarget = mlTarget == null ? null : mlTarget.trim();
    }

    public String getMlOperationContent() {
        return mlOperationContent;
    }

    public void setMlOperationContent(String mlOperationContent) {
        this.mlOperationContent = mlOperationContent == null ? null : mlOperationContent.trim();
    }

    public String getMlCreatTimeChange() {
        return mlCreatTimeChange;
    }

    public void setMlCreatTimeChange(String mlCreatTimeChange) {
        this.mlCreatTimeChange = mlCreatTimeChange == null ? null : mlCreatTimeChange.trim();
    }

    public String getMlMemo() {
        return mlMemo;
    }

    public void setMlMemo(String mlMemo) {
        this.mlMemo = mlMemo == null ? null : mlMemo.trim();
    }

    public Date getMlCreatTime() {
        return mlCreatTime;
    }

    public void setMlCreatTime(Date mlCreatTime) {
        this.mlCreatTime = mlCreatTime;
    }
}