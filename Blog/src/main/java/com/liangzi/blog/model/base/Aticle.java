package com.liangzi.blog.model.base;

import java.util.Date;

public class Aticle {
    /**
     * 文章-id
     * 表字段 : aticle.at_id
     */
    private Long atId;

    /**
     * 文章-标题
     * 表字段 : aticle.at_title
     */
    private String atTitle;

    /**
     * 文章-图片url
     * 表字段 : aticle.at_image_url
     */
    private String atImageUrl;

    /**
     * 文章-作者
     * 表字段 : aticle.ac_author
     */
    private String acAuthor;

    /**
     * 文章-简介
     * 表字段 : aticle.at_introduction
     */
    private String atIntroduction;

    /**
     * 文章-内容
     * 表字段 : aticle.at_content
     */
    private String atContent;

    /**
     * 文章-阅读量
     * 表字段 : aticle.at_read_count
     */
    private Long atReadCount;

    /**
     * 文章-点赞量
     * 表字段 : aticle.at_praise_count
     */
    private Long atPraiseCount;

    /**
     * 文章_首页文章
     * 表字段 : aticle.at_up_index
     */
    private Integer atUpIndex;

    /**
     * 文章类型表-id
     * 表字段 : aticle.at_type_id
     */
    private String atTypeId;

    /**
     * 文章-变化类型后的时间
     * 表字段 : aticle.at_creat_time_change
     */
    private String atCreatTimeChange;

    /**
     * 文章-备注
     * 表字段 : aticle.at_memo
     */
    private String atMemo;

    /**
     * 文章-创建时间
     * 表字段 : aticle.at_creat_time
     */
    private Date atCreatTime;

    /**
     * 文章-修改时间
     * 表字段 : aticle.at_modify_time
     */
    private Date atModifyTime;

    public Long getAtId() {
        return atId;
    }

    public void setAtId(Long atId) {
        this.atId = atId;
    }

    public String getAtTitle() {
        return atTitle;
    }

    public void setAtTitle(String atTitle) {
        this.atTitle = atTitle == null ? null : atTitle.trim();
    }

    public String getAtImageUrl() {
        return atImageUrl;
    }

    public void setAtImageUrl(String atImageUrl) {
        this.atImageUrl = atImageUrl == null ? null : atImageUrl.trim();
    }

    public String getAcAuthor() {
        return acAuthor;
    }

    public void setAcAuthor(String acAuthor) {
        this.acAuthor = acAuthor == null ? null : acAuthor.trim();
    }

    public String getAtIntroduction() {
        return atIntroduction;
    }

    public void setAtIntroduction(String atIntroduction) {
        this.atIntroduction = atIntroduction == null ? null : atIntroduction.trim();
    }

    public String getAtContent() {
        return atContent;
    }

    public void setAtContent(String atContent) {
        this.atContent = atContent == null ? null : atContent.trim();
    }

    public Long getAtReadCount() {
        return atReadCount;
    }

    public void setAtReadCount(Long atReadCount) {
        this.atReadCount = atReadCount;
    }

    public Long getAtPraiseCount() {
        return atPraiseCount;
    }

    public void setAtPraiseCount(Long atPraiseCount) {
        this.atPraiseCount = atPraiseCount;
    }

    public Integer getAtUpIndex() {
        return atUpIndex;
    }

    public void setAtUpIndex(Integer atUpIndex) {
        this.atUpIndex = atUpIndex;
    }

    public String getAtTypeId() {
        return atTypeId;
    }

    public void setAtTypeId(String atTypeId) {
        this.atTypeId = atTypeId == null ? null : atTypeId.trim();
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

    public Date getAtModifyTime() {
        return atModifyTime;
    }

    public void setAtModifyTime(Date atModifyTime) {
        this.atModifyTime = atModifyTime;
    }
}