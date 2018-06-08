package com.liangzi.mgr.blog.model.base;

import java.util.Date;

public class MgrLoginLogs {
    /**
     * 登入日志-id
     * 表字段 : mgr_login_logs.mll_id
     */
    private Long mllId;

    /**
     * 登入日志-ip
     * 表字段 : mgr_login_logs.mll_ip
     */
    private String mllIp;

    /**
     * 登入日志-账号
     * 表字段 : mgr_login_logs.mll_account
     */
    private String mllAccount;

    /**
     * 登入日志登录状态
     * 表字段 : mgr_login_logs.mll_login_status
     */
    private String mllLoginStatus;

    /**
     * 登入日志-备注
     * 表字段 : mgr_login_logs.mll_memo
     */
    private String mllMemo;

    /**
     * 登入日志-变化类型后的时间
     * 表字段 : mgr_login_logs.mll_creat_time_change
     */
    private String mllCreatTimeChange;

    /**
     * 登入日志-创建时间
     * 表字段 : mgr_login_logs.mll_creat_time
     */
    private Date mllCreatTime;

    public Long getMllId() {
        return mllId;
    }

    public void setMllId(Long mllId) {
        this.mllId = mllId;
    }

    public String getMllIp() {
        return mllIp;
    }

    public void setMllIp(String mllIp) {
        this.mllIp = mllIp == null ? null : mllIp.trim();
    }

    public String getMllAccount() {
        return mllAccount;
    }

    public void setMllAccount(String mllAccount) {
        this.mllAccount = mllAccount == null ? null : mllAccount.trim();
    }

    public String getMllLoginStatus() {
        return mllLoginStatus;
    }

    public void setMllLoginStatus(String mllLoginStatus) {
        this.mllLoginStatus = mllLoginStatus == null ? null : mllLoginStatus.trim();
    }

    public String getMllMemo() {
        return mllMemo;
    }

    public void setMllMemo(String mllMemo) {
        this.mllMemo = mllMemo == null ? null : mllMemo.trim();
    }

    public String getMllCreatTimeChange() {
        return mllCreatTimeChange;
    }

    public void setMllCreatTimeChange(String mllCreatTimeChange) {
        this.mllCreatTimeChange = mllCreatTimeChange == null ? null : mllCreatTimeChange.trim();
    }

    public Date getMllCreatTime() {
        return mllCreatTime;
    }

    public void setMllCreatTime(Date mllCreatTime) {
        this.mllCreatTime = mllCreatTime;
    }
}