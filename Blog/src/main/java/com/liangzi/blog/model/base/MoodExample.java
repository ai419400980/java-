package com.liangzi.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MoodExample() {
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

        public Criteria andMoIdIsNull() {
            addCriterion("mo_id is null");
            return (Criteria) this;
        }

        public Criteria andMoIdIsNotNull() {
            addCriterion("mo_id is not null");
            return (Criteria) this;
        }

        public Criteria andMoIdEqualTo(Long value) {
            addCriterion("mo_id =", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotEqualTo(Long value) {
            addCriterion("mo_id <>", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThan(Long value) {
            addCriterion("mo_id >", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mo_id >=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThan(Long value) {
            addCriterion("mo_id <", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdLessThanOrEqualTo(Long value) {
            addCriterion("mo_id <=", value, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdIn(List<Long> values) {
            addCriterion("mo_id in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotIn(List<Long> values) {
            addCriterion("mo_id not in", values, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdBetween(Long value1, Long value2) {
            addCriterion("mo_id between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andMoIdNotBetween(Long value1, Long value2) {
            addCriterion("mo_id not between", value1, value2, "moId");
            return (Criteria) this;
        }

        public Criteria andMoStatusIsNull() {
            addCriterion("mo_status is null");
            return (Criteria) this;
        }

        public Criteria andMoStatusIsNotNull() {
            addCriterion("mo_status is not null");
            return (Criteria) this;
        }

        public Criteria andMoStatusEqualTo(Integer value) {
            addCriterion("mo_status =", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusNotEqualTo(Integer value) {
            addCriterion("mo_status <>", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusGreaterThan(Integer value) {
            addCriterion("mo_status >", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("mo_status >=", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusLessThan(Integer value) {
            addCriterion("mo_status <", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("mo_status <=", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusIn(List<Integer> values) {
            addCriterion("mo_status in", values, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusNotIn(List<Integer> values) {
            addCriterion("mo_status not in", values, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusBetween(Integer value1, Integer value2) {
            addCriterion("mo_status between", value1, value2, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("mo_status not between", value1, value2, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeIsNull() {
            addCriterion("mo_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeIsNotNull() {
            addCriterion("mo_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeEqualTo(String value) {
            addCriterion("mo_creat_time_change =", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeNotEqualTo(String value) {
            addCriterion("mo_creat_time_change <>", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeGreaterThan(String value) {
            addCriterion("mo_creat_time_change >", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("mo_creat_time_change >=", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeLessThan(String value) {
            addCriterion("mo_creat_time_change <", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("mo_creat_time_change <=", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeLike(String value) {
            addCriterion("mo_creat_time_change like", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeNotLike(String value) {
            addCriterion("mo_creat_time_change not like", value, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeIn(List<String> values) {
            addCriterion("mo_creat_time_change in", values, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeNotIn(List<String> values) {
            addCriterion("mo_creat_time_change not in", values, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("mo_creat_time_change between", value1, value2, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("mo_creat_time_change not between", value1, value2, "moCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMoMemoIsNull() {
            addCriterion("mo_memo is null");
            return (Criteria) this;
        }

        public Criteria andMoMemoIsNotNull() {
            addCriterion("mo_memo is not null");
            return (Criteria) this;
        }

        public Criteria andMoMemoEqualTo(String value) {
            addCriterion("mo_memo =", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoNotEqualTo(String value) {
            addCriterion("mo_memo <>", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoGreaterThan(String value) {
            addCriterion("mo_memo >", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoGreaterThanOrEqualTo(String value) {
            addCriterion("mo_memo >=", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoLessThan(String value) {
            addCriterion("mo_memo <", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoLessThanOrEqualTo(String value) {
            addCriterion("mo_memo <=", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoLike(String value) {
            addCriterion("mo_memo like", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoNotLike(String value) {
            addCriterion("mo_memo not like", value, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoIn(List<String> values) {
            addCriterion("mo_memo in", values, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoNotIn(List<String> values) {
            addCriterion("mo_memo not in", values, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoBetween(String value1, String value2) {
            addCriterion("mo_memo between", value1, value2, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoMemoNotBetween(String value1, String value2) {
            addCriterion("mo_memo not between", value1, value2, "moMemo");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeIsNull() {
            addCriterion("mo_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeIsNotNull() {
            addCriterion("mo_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeEqualTo(Date value) {
            addCriterion("mo_creat_time =", value, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeNotEqualTo(Date value) {
            addCriterion("mo_creat_time <>", value, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeGreaterThan(Date value) {
            addCriterion("mo_creat_time >", value, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_creat_time >=", value, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeLessThan(Date value) {
            addCriterion("mo_creat_time <", value, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("mo_creat_time <=", value, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeIn(List<Date> values) {
            addCriterion("mo_creat_time in", values, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeNotIn(List<Date> values) {
            addCriterion("mo_creat_time not in", values, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeBetween(Date value1, Date value2) {
            addCriterion("mo_creat_time between", value1, value2, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("mo_creat_time not between", value1, value2, "moCreatTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeIsNull() {
            addCriterion("mo_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeIsNotNull() {
            addCriterion("mo_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeEqualTo(Date value) {
            addCriterion("mo_modify_time =", value, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeNotEqualTo(Date value) {
            addCriterion("mo_modify_time <>", value, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeGreaterThan(Date value) {
            addCriterion("mo_modify_time >", value, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_modify_time >=", value, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeLessThan(Date value) {
            addCriterion("mo_modify_time <", value, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("mo_modify_time <=", value, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeIn(List<Date> values) {
            addCriterion("mo_modify_time in", values, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeNotIn(List<Date> values) {
            addCriterion("mo_modify_time not in", values, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeBetween(Date value1, Date value2) {
            addCriterion("mo_modify_time between", value1, value2, "moModifyTime");
            return (Criteria) this;
        }

        public Criteria andMoModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("mo_modify_time not between", value1, value2, "moModifyTime");
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