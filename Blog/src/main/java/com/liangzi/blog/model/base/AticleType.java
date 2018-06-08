package com.liangzi.blog.model.base;

import java.util.Date;

public class AticleType {
    /**
     * 文章类型-id
     * 表字段 : aticle_type.at_id
     */
    private Long atId;

    /**
     * 文章类型-类型  1.慢生活 2.学无止境 3.一骑绝尘
     * 表字段 : aticle_type.at_type
     */
    private String atType;

    /**
     * 文章类型-变化类型后的时间
     * 表字段 : aticle_type.at_creat_time_change
     */
    private String atCreatTimeChange;

    /**
     * 文章类型-备注
     * 表字段 : aticle_type.at_memo
     */
    private String atMemo;

    /**
     * 文章类型-创建时间
     * 表字段 : aticle_type.at_creat_time
     */
    private Date atCreatTime;

    public Long getAtId() {
        return atId;
    }

    public void setAtId(Long atId) {
        this.atId = atId;
    }

    public String getAtType() {
        return atType;
    }

    public void setAtType(String atType) {
        this.atType = atType == null ? null : atType.trim();
    }

    public String getAtCreatTimeChange() {
        return atCreatTimeChange;
    }

    public void setAtCreatTimeChange(String atCreatTimeChange) {
        this.atCreatTimeChange = atCreatTimeChange == null ? null : atCreatTimeChange.trim();
    }

    public String getAtMemo() {
        return atMemo;
    }

    public void setAtMemo(String atMemo) {
        this.atMemo = atMemo == null ? null : atMemo.trim();
    }

    public Date getAtCreatTime() {
        return atCreatTime;
    }

    public void setAtCreatTime(Date atCreatTime) {
        this.atCreatTime = atCreatTime;
    }
}