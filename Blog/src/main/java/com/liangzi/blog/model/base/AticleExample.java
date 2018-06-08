package com.liangzi.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AticleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andAtIdIsNull() {
            addCriterion("at_id is null");
            return (Criteria) this;
        }

        public Criteria andAtIdIsNotNull() {
            addCriterion("at_id is not null");
            return (Criteria) this;
        }

        public Criteria andAtIdEqualTo(Long value) {
            addCriterion("at_id =", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotEqualTo(Long value) {
            addCriterion("at_id <>", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdGreaterThan(Long value) {
            addCriterion("at_id >", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdGreaterThanOrEqualTo(Long value) {
            addCriterion("at_id >=", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdLessThan(Long value) {
            addCriterion("at_id <", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdLessThanOrEqualTo(Long value) {
            addCriterion("at_id <=", value, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdIn(List<Long> values) {
            addCriterion("at_id in", values, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotIn(List<Long> values) {
            addCriterion("at_id not in", values, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdBetween(Long value1, Long value2) {
            addCriterion("at_id between", value1, value2, "atId");
            return (Criteria) this;
        }

        public Criteria andAtIdNotBetween(Long value1, Long value2) {
            addCriterion("at_id not between", value1, value2, "atId");
            return (Criteria) this;
        }

        public Criteria andAtTitleIsNull() {
            addCriterion("at_title is null");
            return (Criteria) this;
        }

        public Criteria andAtTitleIsNotNull() {
            addCriterion("at_title is not null");
            return (Criteria) this;
        }

        public Criteria andAtTitleEqualTo(String value) {
            addCriterion("at_title =", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleNotEqualTo(String value) {
            addCriterion("at_title <>", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleGreaterThan(String value) {
            addCriterion("at_title >", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleGreaterThanOrEqualTo(String value) {
            addCriterion("at_title >=", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleLessThan(String value) {
            addCriterion("at_title <", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleLessThanOrEqualTo(String value) {
            addCriterion("at_title <=", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleLike(String value) {
            addCriterion("at_title like", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleNotLike(String value) {
            addCriterion("at_title not like", value, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleIn(List<String> values) {
            addCriterion("at_title in", values, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleNotIn(List<String> values) {
            addCriterion("at_title not in", values, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleBetween(String value1, String value2) {
            addCriterion("at_title between", value1, value2, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtTitleNotBetween(String value1, String value2) {
            addCriterion("at_title not between", value1, value2, "atTitle");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlIsNull() {
            addCriterion("at_image_url is null");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlIsNotNull() {
            addCriterion("at_image_url is not null");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlEqualTo(String value) {
            addCriterion("at_image_url =", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlNotEqualTo(String value) {
            addCriterion("at_image_url <>", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlGreaterThan(String value) {
            addCriterion("at_image_url >", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("at_image_url >=", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlLessThan(String value) {
            addCriterion("at_image_url <", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlLessThanOrEqualTo(String value) {
            addCriterion("at_image_url <=", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlLike(String value) {
            addCriterion("at_image_url like", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlNotLike(String value) {
            addCriterion("at_image_url not like", value, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlIn(List<String> values) {
            addCriterion("at_image_url in", values, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlNotIn(List<String> values) {
            addCriterion("at_image_url not in", values, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlBetween(String value1, String value2) {
            addCriterion("at_image_url between", value1, value2, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAtImageUrlNotBetween(String value1, String value2) {
            addCriterion("at_image_url not between", value1, value2, "atImageUrl");
            return (Criteria) this;
        }

        public Criteria andAcAuthorIsNull() {
            addCriterion("ac_author is null");
            return (Criteria) this;
        }

        public Criteria andAcAuthorIsNotNull() {
            addCriterion("ac_author is not null");
            return (Criteria) this;
        }

        public Criteria andAcAuthorEqualTo(String value) {
            addCriterion("ac_author =", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorNotEqualTo(String value) {
            addCriterion("ac_author <>", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorGreaterThan(String value) {
            addCriterion("ac_author >", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("ac_author >=", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorLessThan(String value) {
            addCriterion("ac_author <", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorLessThanOrEqualTo(String value) {
            addCriterion("ac_author <=", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorLike(String value) {
            addCriterion("ac_author like", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorNotLike(String value) {
            addCriterion("ac_author not like", value, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorIn(List<String> values) {
            addCriterion("ac_author in", values, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorNotIn(List<String> values) {
            addCriterion("ac_author not in", values, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorBetween(String value1, String value2) {
            addCriterion("ac_author between", value1, value2, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAcAuthorNotBetween(String value1, String value2) {
            addCriterion("ac_author not between", value1, value2, "acAuthor");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionIsNull() {
            addCriterion("at_introduction is null");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionIsNotNull() {
            addCriterion("at_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionEqualTo(String value) {
            addCriterion("at_introduction =", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionNotEqualTo(String value) {
            addCriterion("at_introduction <>", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionGreaterThan(String value) {
            addCriterion("at_introduction >", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("at_introduction >=", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionLessThan(String value) {
            addCriterion("at_introduction <", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionLessThanOrEqualTo(String value) {
            addCriterion("at_introduction <=", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionLike(String value) {
            addCriterion("at_introduction like", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionNotLike(String value) {
            addCriterion("at_introduction not like", value, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionIn(List<String> values) {
            addCriterion("at_introduction in", values, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionNotIn(List<String> values) {
            addCriterion("at_introduction not in", values, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionBetween(String value1, String value2) {
            addCriterion("at_introduction between", value1, value2, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtIntroductionNotBetween(String value1, String value2) {
            addCriterion("at_introduction not between", value1, value2, "atIntroduction");
            return (Criteria) this;
        }

        public Criteria andAtContentIsNull() {
            addCriterion("at_content is null");
            return (Criteria) this;
        }

        public Criteria andAtContentIsNotNull() {
            addCriterion("at_content is not null");
            return (Criteria) this;
        }

        public Criteria andAtContentEqualTo(String value) {
            addCriterion("at_content =", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentNotEqualTo(String value) {
            addCriterion("at_content <>", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentGreaterThan(String value) {
            addCriterion("at_content >", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentGreaterThanOrEqualTo(String value) {
            addCriterion("at_content >=", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentLessThan(String value) {
            addCriterion("at_content <", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentLessThanOrEqualTo(String value) {
            addCriterion("at_content <=", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentLike(String value) {
            addCriterion("at_content like", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentNotLike(String value) {
            addCriterion("at_content not like", value, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentIn(List<String> values) {
            addCriterion("at_content in", values, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentNotIn(List<String> values) {
            addCriterion("at_content not in", values, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentBetween(String value1, String value2) {
            addCriterion("at_content between", value1, value2, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtContentNotBetween(String value1, String value2) {
            addCriterion("at_content not between", value1, value2, "atContent");
            return (Criteria) this;
        }

        public Criteria andAtReadCountIsNull() {
            addCriterion("at_read_count is null");
            return (Criteria) this;
        }

        public Criteria andAtReadCountIsNotNull() {
            addCriterion("at_read_count is not null");
            return (Criteria) this;
        }

        public Criteria andAtReadCountEqualTo(Long value) {
            addCriterion("at_read_count =", value, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountNotEqualTo(Long value) {
            addCriterion("at_read_count <>", value, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountGreaterThan(Long value) {
            addCriterion("at_read_count >", value, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountGreaterThanOrEqualTo(Long value) {
            addCriterion("at_read_count >=", value, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountLessThan(Long value) {
            addCriterion("at_read_count <", value, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountLessThanOrEqualTo(Long value) {
            addCriterion("at_read_count <=", value, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountIn(List<Long> values) {
            addCriterion("at_read_count in", values, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountNotIn(List<Long> values) {
            addCriterion("at_read_count not in", values, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountBetween(Long value1, Long value2) {
            addCriterion("at_read_count between", value1, value2, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtReadCountNotBetween(Long value1, Long value2) {
            addCriterion("at_read_count not between", value1, value2, "atReadCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountIsNull() {
            addCriterion("at_praise_count is null");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountIsNotNull() {
            addCriterion("at_praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountEqualTo(Long value) {
            addCriterion("at_praise_count =", value, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountNotEqualTo(Long value) {
            addCriterion("at_praise_count <>", value, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountGreaterThan(Long value) {
            addCriterion("at_praise_count >", value, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountGreaterThanOrEqualTo(Long value) {
            addCriterion("at_praise_count >=", value, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountLessThan(Long value) {
            addCriterion("at_praise_count <", value, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountLessThanOrEqualTo(Long value) {
            addCriterion("at_praise_count <=", value, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountIn(List<Long> values) {
            addCriterion("at_praise_count in", values, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountNotIn(List<Long> values) {
            addCriterion("at_praise_count not in", values, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountBetween(Long value1, Long value2) {
            addCriterion("at_praise_count between", value1, value2, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtPraiseCountNotBetween(Long value1, Long value2) {
            addCriterion("at_praise_count not between", value1, value2, "atPraiseCount");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexIsNull() {
            addCriterion("at_up_index is null");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexIsNotNull() {
            addCriterion("at_up_index is not null");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexEqualTo(Integer value) {
            addCriterion("at_up_index =", value, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexNotEqualTo(Integer value) {
            addCriterion("at_up_index <>", value, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexGreaterThan(Integer value) {
            addCriterion("at_up_index >", value, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("at_up_index >=", value, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexLessThan(Integer value) {
            addCriterion("at_up_index <", value, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexLessThanOrEqualTo(Integer value) {
            addCriterion("at_up_index <=", value, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexIn(List<Integer> values) {
            addCriterion("at_up_index in", values, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexNotIn(List<Integer> values) {
            addCriterion("at_up_index not in", values, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexBetween(Integer value1, Integer value2) {
            addCriterion("at_up_index between", value1, value2, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtUpIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("at_up_index not between", value1, value2, "atUpIndex");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdIsNull() {
            addCriterion("at_type_id is null");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdIsNotNull() {
            addCriterion("at_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdEqualTo(String value) {
            addCriterion("at_type_id =", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdNotEqualTo(String value) {
            addCriterion("at_type_id <>", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdGreaterThan(String value) {
            addCriterion("at_type_id >", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("at_type_id >=", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdLessThan(String value) {
            addCriterion("at_type_id <", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdLessThanOrEqualTo(String value) {
            addCriterion("at_type_id <=", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdLike(String value) {
            addCriterion("at_type_id like", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdNotLike(String value) {
            addCriterion("at_type_id not like", value, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdIn(List<String> values) {
            addCriterion("at_type_id in", values, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdNotIn(List<String> values) {
            addCriterion("at_type_id not in", values, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdBetween(String value1, String value2) {
            addCriterion("at_type_id between", value1, value2, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtTypeIdNotBetween(String value1, String value2) {
            addCriterion("at_type_id not between", value1, value2, "atTypeId");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeIsNull() {
            addCriterion("at_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeIsNotNull() {
            addCriterion("at_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeEqualTo(String value) {
            addCriterion("at_creat_time_change =", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeNotEqualTo(String value) {
            addCriterion("at_creat_time_change <>", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeGreaterThan(String value) {
            addCriterion("at_creat_time_change >", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("at_creat_time_change >=", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeLessThan(String value) {
            addCriterion("at_creat_time_change <", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("at_creat_time_change <=", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeLike(String value) {
            addCriterion("at_creat_time_change like", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeNotLike(String value) {
            addCriterion("at_creat_time_change not like", value, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeIn(List<String> values) {
            addCriterion("at_creat_time_change in", values, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeNotIn(List<String> values) {
            addCriterion("at_creat_time_change not in", values, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("at_creat_time_change between", value1, value2, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("at_creat_time_change not between", value1, value2, "atCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAtMemoIsNull() {
            addCriterion("at_memo is null");
            return (Criteria) this;
        }

        public Criteria andAtMemoIsNotNull() {
            addCriterion("at_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAtMemoEqualTo(String value) {
            addCriterion("at_memo =", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoNotEqualTo(String value) {
            addCriterion("at_memo <>", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoGreaterThan(String value) {
            addCriterion("at_memo >", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoGreaterThanOrEqualTo(String value) {
            addCriterion("at_memo >=", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoLessThan(String value) {
            addCriterion("at_memo <", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoLessThanOrEqualTo(String value) {
            addCriterion("at_memo <=", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoLike(String value) {
            addCriterion("at_memo like", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoNotLike(String value) {
            addCriterion("at_memo not like", value, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoIn(List<String> values) {
            addCriterion("at_memo in", values, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoNotIn(List<String> values) {
            addCriterion("at_memo not in", values, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoBetween(String value1, String value2) {
            addCriterion("at_memo between", value1, value2, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtMemoNotBetween(String value1, String value2) {
            addCriterion("at_memo not between", value1, value2, "atMemo");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeIsNull() {
            addCriterion("at_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeIsNotNull() {
            addCriterion("at_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeEqualTo(Date value) {
            addCriterion("at_creat_time =", value, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeNotEqualTo(Date value) {
            addCriterion("at_creat_time <>", value, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeGreaterThan(Date value) {
            addCriterion("at_creat_time >", value, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("at_creat_time >=", value, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeLessThan(Date value) {
            addCriterion("at_creat_time <", value, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("at_creat_time <=", value, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeIn(List<Date> values) {
            addCriterion("at_creat_time in", values, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeNotIn(List<Date> values) {
            addCriterion("at_creat_time not in", values, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeBetween(Date value1, Date value2) {
            addCriterion("at_creat_time between", value1, value2, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("at_creat_time not between", value1, value2, "atCreatTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeIsNull() {
            addCriterion("at_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeIsNotNull() {
            addCriterion("at_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeEqualTo(Date value) {
            addCriterion("at_modify_time =", value, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeNotEqualTo(Date value) {
            addCriterion("at_modify_time <>", value, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeGreaterThan(Date value) {
            addCriterion("at_modify_time >", value, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("at_modify_time >=", value, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeLessThan(Date value) {
            addCriterion("at_modify_time <", value, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("at_modify_time <=", value, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeIn(List<Date> values) {
            addCriterion("at_modify_time in", values, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeNotIn(List<Date> values) {
            addCriterion("at_modify_time not in", values, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeBetween(Date value1, Date value2) {
            addCriterion("at_modify_time between", value1, value2, "atModifyTime");
            return (Criteria) this;
        }

        public Criteria andAtModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("at_modify_time not between", value1, value2, "atModifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}