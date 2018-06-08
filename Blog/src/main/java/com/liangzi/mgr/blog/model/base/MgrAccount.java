package com.liangzi.mgr.blog.model.base;

import java.util.Date;

public class MgrAccount {
    /**
     * 用户-id
     * 表字段 : mgr_account.mac_id
     */
    private Long macId;

    /**
     * 用户-账号
     * 表字段 : mgr_account.mac_tittle
     */
    private String macTittle;

    /**
     * 用户-密码
     * 表字段 : mgr_account.mac_password
     */
    private String macPassword;

    /**
     * 用户-昵称
     * 表字段 : mgr_account.mac_nick
     */
    private String macNick;

    /**
     * 用户-备注
     * 表字段 : mgr_account.mac_memo
     */
    private String macMemo;

    /**
     * 用户-变化类型后的时间
     * 表字段 : mgr_account.mac_creat_time_change
     */
    private String macCreatTimeChange;

    /**
     * 用户-修改时间
     * 表字段 : mgr_account.mac_modify_time
     */
    private Date macModifyTime;

    /**
     * 用户-创建时间
     * 表字段 : mgr_account.mac_creat_time
     */
    private Date macCreatTime;

    public Long getMacId() {
        return macId;
    }

    public void setMacId(Long macId) {
        this.macId = macId;
    }

    public String getMacTittle() {
        return macTittle;
    }

    public void setMacTittle(String macTittle) {
        this.macTittle = macTittle == null ? null : macTittle.trim();
    }

    public String getMacPassword() {
        return macPassword;
    }

    public void setMacPassword(String macPassword) {
        this.macPassword = macPassword == null ? null : macPassword.trim();
    }

    public String getMacNick() {
        return macNick;
    }

    public void setMacNick(String macNick) {
        this.macNick = macNick == null ? null : macNick.trim();
    }

    public String getMacMemo() {
        return macMemo;
    }

    public void setMacMemo(String macMemo) {
        this.macMemo = macMemo == null ? null : macMemo.trim();
    }

    public String getMacCreatTimeChange() {
        return macCreatTimeChange;
    }

    public void setMacCreatTimeChange(String macCreatTimeChange) {
        this.macCreatTimeChange = macCreatTimeChange == null ? null : macCreatTimeChange.trim();
    }

    public Date getMacModifyTime() {
        return macModifyTime;
    }

    public void setMacModifyTime(Date macModifyTime) {
        this.macModifyTime = macModifyTime;
    }

    public Date getMacCreatTime() {
        return macCreatTime;
    }

    public void setMacCreatTime(Date macCreatTime) {
        this.macCreatTime = macCreatTime;
    }
}