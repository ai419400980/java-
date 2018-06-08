package com.liangzi.mgr.blog.model.base;

import java.util.Date;

public class MgrCountEveryday {
    /**
     * 后台每日统计-id
     * 表字段 : mgr_count_everyday.mce_id
     */
    private Long mceId;

    /**
     * 后台每日统计-ip总数
     * 表字段 : mgr_count_everyday.mce_ip_count
     */
    private Long mceIpCount;

    /**
     * 后台每日统计-手机端ip数
     * 表字段 : mgr_count_everyday.mce_ip_for_phone
     */
    private Long mceIpForPhone;

    /**
     * 后台每日统计-电脑端ip数
     * 表字段 : mgr_count_everyday.mce_ip_for_pc
     */
    private Long mceIpForPc;

    /**
     * 后台每日统计-操作总数
     * 表字段 : mgr_count_everyday.mce_operation_count
     */
    private Long mceOperationCount;

    /**
     * 后台每日统计-搜索总数
     * 表字段 : mgr_count_everyday.mce_search_count
     */
    private Long mceSearchCount;

    /**
     * 后台每日统计-留言总数
     * 表字段 : mgr_count_everyday.mce_message_count
     */
    private Long mceMessageCount;

    /**
     * 后台每日统计-点赞总数
     * 表字段 : mgr_count_everyday.mce_praise_count
     */
    private Long mcePraiseCount;

    /**
     * 后台每日统计-文章留言总数
     * 表字段 : mgr_count_everyday.mce_article_message_count
     */
    private Long mceArticleMessageCount;

    /**
     * 后台每日统计-变化类型后的时间
     * 表字段 : mgr_count_everyday.mce_creat_time_change
     */
    private String mceCreatTimeChange;

    /**
     * 后台每日统计-创建时间
     * 表字段 : mgr_count_everyday.mce_creat_time
     */
    private Date mceCreatTime;

    /**
     * 后台每日统计-备注
     * 表字段 : mgr_count_everyday.mce_memo
     */
    private String mceMemo;

    public Long getMceId() {
        return mceId;
    }

    public void setMceId(Long mceId) {
        this.mceId = mceId;
    }

    public Long getMceIpCount() {
        return mceIpCount;
    }

    public void setMceIpCount(Long mceIpCount) {
        this.mceIpCount = mceIpCount;
    }

    public Long getMceIpForPhone() {
        return mceIpForPhone;
    }

    public void setMceIpForPhone(Long mceIpForPhone) {
        this.mceIpForPhone = mceIpForPhone;
    }

    public Long getMceIpForPc() {
        return mceIpForPc;
    }

    public void setMceIpForPc(Long mceIpForPc) {
        this.mceIpForPc = mceIpForPc;
    }

    public Long getMceOperationCount() {
        return mceOperationCount;
    }

    public void setMceOperationCount(Long mceOperationCount) {
        this.mceOperationCount = mceOperationCount;
    }

    public Long getMceSearchCount() {
        return mceSearchCount;
    }

    public void setMceSearchCount(Long mceSearchCount) {
        this.mceSearchCount = mceSearchCount;
    }

    public Long getMceMessageCount() {
        return mceMessageCount;
    }

    public void setMceMessageCount(Long mceMessageCount) {
        this.mceMessageCount = mceMessageCount;
    }

    public Long getMcePraiseCount() {
        return mcePraiseCount;
    }

    public void setMcePraiseCount(Long mcePraiseCount) {
        this.mcePraiseCount = mcePraiseCount;
    }

    public Long getMceArticleMessageCount() {
        return mceArticleMessageCount;
    }

    public void setMceArticleMessageCount(Long mceArticleMessageCount) {
        this.mceArticleMessageCount = mceArticleMessageCount;
    }

    public String getMceCreatTimeChange() {
        return mceCreatTimeChange;
    }

    public void setMceCreatTimeChange(String mceCreatTimeChange) {
        this.mceCreatTimeChange = mceCreatTimeChange == null ? null : mceCreatTimeChange.trim();
    }

    public Date getMceCreatTime() {
        return mceCreatTime;
    }

    public void setMceCreatTime(Date mceCreatTime) {
        this.mceCreatTime = mceCreatTime;
    }

    public String getMceMemo() {
        return mceMemo;
    }

    public void setMceMemo(String mceMemo) {
        this.mceMemo = mceMemo == null ? null : mceMemo.trim();
    }
}