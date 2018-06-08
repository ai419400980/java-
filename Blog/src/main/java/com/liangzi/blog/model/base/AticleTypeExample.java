package com.liangzi.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AticleTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AticleTypeExample() {
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

        public Criteria andAtTypeIsNull() {
            addCriterion("at_type is null");
            return (Criteria) this;
        }

        public Criteria andAtTypeIsNotNull() {
            addCriterion("at_type is not null");
            return (Criteria) this;
        }

        public Criteria andAtTypeEqualTo(String value) {
            addCriterion("at_type =", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeNotEqualTo(String value) {
            addCriterion("at_type <>", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeGreaterThan(String value) {
            addCriterion("at_type >", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("at_type >=", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeLessThan(String value) {
            addCriterion("at_type <", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeLessThanOrEqualTo(String value) {
            addCriterion("at_type <=", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeLike(String value) {
            addCriterion("at_type like", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeNotLike(String value) {
            addCriterion("at_type not like", value, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeIn(List<String> values) {
            addCriterion("at_type in", values, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeNotIn(List<String> values) {
            addCriterion("at_type not in", values, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeBetween(String value1, String value2) {
            addCriterion("at_type between", value1, value2, "atType");
            return (Criteria) this;
        }

        public Criteria andAtTypeNotBetween(String value1, String value2) {
            addCriterion("at_type not between", value1, value2, "atType");
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