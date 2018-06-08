package com.liangzi.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentExample() {
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

        public Criteria andCoIdIsNull() {
            addCriterion("co_id is null");
            return (Criteria) this;
        }

        public Criteria andCoIdIsNotNull() {
            addCriterion("co_id is not null");
            return (Criteria) this;
        }

        public Criteria andCoIdEqualTo(Long value) {
            addCriterion("co_id =", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotEqualTo(Long value) {
            addCriterion("co_id <>", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThan(Long value) {
            addCriterion("co_id >", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdGreaterThanOrEqualTo(Long value) {
            addCriterion("co_id >=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThan(Long value) {
            addCriterion("co_id <", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdLessThanOrEqualTo(Long value) {
            addCriterion("co_id <=", value, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdIn(List<Long> values) {
            addCriterion("co_id in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotIn(List<Long> values) {
            addCriterion("co_id not in", values, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdBetween(Long value1, Long value2) {
            addCriterion("co_id between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoIdNotBetween(Long value1, Long value2) {
            addCriterion("co_id not between", value1, value2, "coId");
            return (Criteria) this;
        }

        public Criteria andCoStatusIsNull() {
            addCriterion("co_status is null");
            return (Criteria) this;
        }

        public Criteria andCoStatusIsNotNull() {
            addCriterion("co_status is not null");
            return (Criteria) this;
        }

        public Criteria andCoStatusEqualTo(Integer value) {
            addCriterion("co_status =", value, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusNotEqualTo(Integer value) {
            addCriterion("co_status <>", value, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusGreaterThan(Integer value) {
            addCriterion("co_status >", value, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("co_status >=", value, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusLessThan(Integer value) {
            addCriterion("co_status <", value, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("co_status <=", value, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusIn(List<Integer> values) {
            addCriterion("co_status in", values, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusNotIn(List<Integer> values) {
            addCriterion("co_status not in", values, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusBetween(Integer value1, Integer value2) {
            addCriterion("co_status between", value1, value2, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("co_status not between", value1, value2, "coStatus");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeIsNull() {
            addCriterion("co_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeIsNotNull() {
            addCriterion("co_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeEqualTo(String value) {
            addCriterion("co_creat_time_change =", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeNotEqualTo(String value) {
            addCriterion("co_creat_time_change <>", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeGreaterThan(String value) {
            addCriterion("co_creat_time_change >", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("co_creat_time_change >=", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeLessThan(String value) {
            addCriterion("co_creat_time_change <", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("co_creat_time_change <=", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeLike(String value) {
            addCriterion("co_creat_time_change like", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeNotLike(String value) {
            addCriterion("co_creat_time_change not like", value, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeIn(List<String> values) {
            addCriterion("co_creat_time_change in", values, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeNotIn(List<String> values) {
            addCriterion("co_creat_time_change not in", values, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("co_creat_time_change between", value1, value2, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("co_creat_time_change not between", value1, value2, "coCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andCoMemoIsNull() {
            addCriterion("co_memo is null");
            return (Criteria) this;
        }

        public Criteria andCoMemoIsNotNull() {
            addCriterion("co_memo is not null");
            return (Criteria) this;
        }

        public Criteria andCoMemoEqualTo(String value) {
            addCriterion("co_memo =", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoNotEqualTo(String value) {
            addCriterion("co_memo <>", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoGreaterThan(String value) {
            addCriterion("co_memo >", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoGreaterThanOrEqualTo(String value) {
            addCriterion("co_memo >=", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoLessThan(String value) {
            addCriterion("co_memo <", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoLessThanOrEqualTo(String value) {
            addCriterion("co_memo <=", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoLike(String value) {
            addCriterion("co_memo like", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoNotLike(String value) {
            addCriterion("co_memo not like", value, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoIn(List<String> values) {
            addCriterion("co_memo in", values, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoNotIn(List<String> values) {
            addCriterion("co_memo not in", values, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoBetween(String value1, String value2) {
            addCriterion("co_memo between", value1, value2, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoMemoNotBetween(String value1, String value2) {
            addCriterion("co_memo not between", value1, value2, "coMemo");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeIsNull() {
            addCriterion("co_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeIsNotNull() {
            addCriterion("co_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeEqualTo(Date value) {
            addCriterion("co_creat_time =", value, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeNotEqualTo(Date value) {
            addCriterion("co_creat_time <>", value, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeGreaterThan(Date value) {
            addCriterion("co_creat_time >", value, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("co_creat_time >=", value, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeLessThan(Date value) {
            addCriterion("co_creat_time <", value, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("co_creat_time <=", value, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeIn(List<Date> values) {
            addCriterion("co_creat_time in", values, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeNotIn(List<Date> values) {
            addCriterion("co_creat_time not in", values, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeBetween(Date value1, Date value2) {
            addCriterion("co_creat_time between", value1, value2, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("co_creat_time not between", value1, value2, "coCreatTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeIsNull() {
            addCriterion("co_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeIsNotNull() {
            addCriterion("co_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeEqualTo(Date value) {
            addCriterion("co_modify_time =", value, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeNotEqualTo(Date value) {
            addCriterion("co_modify_time <>", value, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeGreaterThan(Date value) {
            addCriterion("co_modify_time >", value, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("co_modify_time >=", value, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeLessThan(Date value) {
            addCriterion("co_modify_time <", value, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("co_modify_time <=", value, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeIn(List<Date> values) {
            addCriterion("co_modify_time in", values, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeNotIn(List<Date> values) {
            addCriterion("co_modify_time not in", values, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeBetween(Date value1, Date value2) {
            addCriterion("co_modify_time between", value1, value2, "coModifyTime");
            return (Criteria) this;
        }

        public Criteria andCoModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("co_modify_time not between", value1, value2, "coModifyTime");
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