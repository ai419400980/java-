package com.liangzi.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AticleCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AticleCommentExample() {
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

        public Criteria andAcIdIsNull() {
            addCriterion("ac_id is null");
            return (Criteria) this;
        }

        public Criteria andAcIdIsNotNull() {
            addCriterion("ac_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcIdEqualTo(Long value) {
            addCriterion("ac_id =", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotEqualTo(Long value) {
            addCriterion("ac_id <>", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThan(Long value) {
            addCriterion("ac_id >", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ac_id >=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThan(Long value) {
            addCriterion("ac_id <", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdLessThanOrEqualTo(Long value) {
            addCriterion("ac_id <=", value, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdIn(List<Long> values) {
            addCriterion("ac_id in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotIn(List<Long> values) {
            addCriterion("ac_id not in", values, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdBetween(Long value1, Long value2) {
            addCriterion("ac_id between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcIdNotBetween(Long value1, Long value2) {
            addCriterion("ac_id not between", value1, value2, "acId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdIsNull() {
            addCriterion("ac_aticle_id is null");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdIsNotNull() {
            addCriterion("ac_aticle_id is not null");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdEqualTo(Long value) {
            addCriterion("ac_aticle_id =", value, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdNotEqualTo(Long value) {
            addCriterion("ac_aticle_id <>", value, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdGreaterThan(Long value) {
            addCriterion("ac_aticle_id >", value, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ac_aticle_id >=", value, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdLessThan(Long value) {
            addCriterion("ac_aticle_id <", value, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdLessThanOrEqualTo(Long value) {
            addCriterion("ac_aticle_id <=", value, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdIn(List<Long> values) {
            addCriterion("ac_aticle_id in", values, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdNotIn(List<Long> values) {
            addCriterion("ac_aticle_id not in", values, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdBetween(Long value1, Long value2) {
            addCriterion("ac_aticle_id between", value1, value2, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcAticleIdNotBetween(Long value1, Long value2) {
            addCriterion("ac_aticle_id not between", value1, value2, "acAticleId");
            return (Criteria) this;
        }

        public Criteria andAcContentIsNull() {
            addCriterion("ac_content is null");
            return (Criteria) this;
        }

        public Criteria andAcContentIsNotNull() {
            addCriterion("ac_content is not null");
            return (Criteria) this;
        }

        public Criteria andAcContentEqualTo(String value) {
            addCriterion("ac_content =", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotEqualTo(String value) {
            addCriterion("ac_content <>", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentGreaterThan(String value) {
            addCriterion("ac_content >", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentGreaterThanOrEqualTo(String value) {
            addCriterion("ac_content >=", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentLessThan(String value) {
            addCriterion("ac_content <", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentLessThanOrEqualTo(String value) {
            addCriterion("ac_content <=", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentLike(String value) {
            addCriterion("ac_content like", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotLike(String value) {
            addCriterion("ac_content not like", value, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentIn(List<String> values) {
            addCriterion("ac_content in", values, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotIn(List<String> values) {
            addCriterion("ac_content not in", values, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentBetween(String value1, String value2) {
            addCriterion("ac_content between", value1, value2, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcContentNotBetween(String value1, String value2) {
            addCriterion("ac_content not between", value1, value2, "acContent");
            return (Criteria) this;
        }

        public Criteria andAcStatusIsNull() {
            addCriterion("ac_status is null");
            return (Criteria) this;
        }

        public Criteria andAcStatusIsNotNull() {
            addCriterion("ac_status is not null");
            return (Criteria) this;
        }

        public Criteria andAcStatusEqualTo(Integer value) {
            addCriterion("ac_status =", value, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusNotEqualTo(Integer value) {
            addCriterion("ac_status <>", value, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusGreaterThan(Integer value) {
            addCriterion("ac_status >", value, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("ac_status >=", value, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusLessThan(Integer value) {
            addCriterion("ac_status <", value, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusLessThanOrEqualTo(Integer value) {
            addCriterion("ac_status <=", value, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusIn(List<Integer> values) {
            addCriterion("ac_status in", values, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusNotIn(List<Integer> values) {
            addCriterion("ac_status not in", values, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusBetween(Integer value1, Integer value2) {
            addCriterion("ac_status between", value1, value2, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("ac_status not between", value1, value2, "acStatus");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeIsNull() {
            addCriterion("ac_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeIsNotNull() {
            addCriterion("ac_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeEqualTo(String value) {
            addCriterion("ac_creat_time_change =", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeNotEqualTo(String value) {
            addCriterion("ac_creat_time_change <>", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeGreaterThan(String value) {
            addCriterion("ac_creat_time_change >", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("ac_creat_time_change >=", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeLessThan(String value) {
            addCriterion("ac_creat_time_change <", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("ac_creat_time_change <=", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeLike(String value) {
            addCriterion("ac_creat_time_change like", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeNotLike(String value) {
            addCriterion("ac_creat_time_change not like", value, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeIn(List<String> values) {
            addCriterion("ac_creat_time_change in", values, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeNotIn(List<String> values) {
            addCriterion("ac_creat_time_change not in", values, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("ac_creat_time_change between", value1, value2, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("ac_creat_time_change not between", value1, value2, "acCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andAcMemoIsNull() {
            addCriterion("ac_memo is null");
            return (Criteria) this;
        }

        public Criteria andAcMemoIsNotNull() {
            addCriterion("ac_memo is not null");
            return (Criteria) this;
        }

        public Criteria andAcMemoEqualTo(String value) {
            addCriterion("ac_memo =", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoNotEqualTo(String value) {
            addCriterion("ac_memo <>", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoGreaterThan(String value) {
            addCriterion("ac_memo >", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ac_memo >=", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoLessThan(String value) {
            addCriterion("ac_memo <", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoLessThanOrEqualTo(String value) {
            addCriterion("ac_memo <=", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoLike(String value) {
            addCriterion("ac_memo like", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoNotLike(String value) {
            addCriterion("ac_memo not like", value, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoIn(List<String> values) {
            addCriterion("ac_memo in", values, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoNotIn(List<String> values) {
            addCriterion("ac_memo not in", values, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoBetween(String value1, String value2) {
            addCriterion("ac_memo between", value1, value2, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcMemoNotBetween(String value1, String value2) {
            addCriterion("ac_memo not between", value1, value2, "acMemo");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeIsNull() {
            addCriterion("ac_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeIsNotNull() {
            addCriterion("ac_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeEqualTo(Date value) {
            addCriterion("ac_creat_time =", value, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeNotEqualTo(Date value) {
            addCriterion("ac_creat_time <>", value, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeGreaterThan(Date value) {
            addCriterion("ac_creat_time >", value, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ac_creat_time >=", value, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeLessThan(Date value) {
            addCriterion("ac_creat_time <", value, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("ac_creat_time <=", value, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeIn(List<Date> values) {
            addCriterion("ac_creat_time in", values, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeNotIn(List<Date> values) {
            addCriterion("ac_creat_time not in", values, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeBetween(Date value1, Date value2) {
            addCriterion("ac_creat_time between", value1, value2, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("ac_creat_time not between", value1, value2, "acCreatTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeIsNull() {
            addCriterion("ac_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeIsNotNull() {
            addCriterion("ac_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeEqualTo(Date value) {
            addCriterion("ac_modify_time =", value, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeNotEqualTo(Date value) {
            addCriterion("ac_modify_time <>", value, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeGreaterThan(Date value) {
            addCriterion("ac_modify_time >", value, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ac_modify_time >=", value, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeLessThan(Date value) {
            addCriterion("ac_modify_time <", value, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("ac_modify_time <=", value, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeIn(List<Date> values) {
            addCriterion("ac_modify_time in", values, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeNotIn(List<Date> values) {
            addCriterion("ac_modify_time not in", values, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeBetween(Date value1, Date value2) {
            addCriterion("ac_modify_time between", value1, value2, "acModifyTime");
            return (Criteria) this;
        }

        public Criteria andAcModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("ac_modify_time not between", value1, value2, "acModifyTime");
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