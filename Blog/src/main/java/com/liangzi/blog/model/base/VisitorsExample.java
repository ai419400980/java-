package com.liangzi.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitorsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorsExample() {
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

        public Criteria andViIdIsNull() {
            addCriterion("vi_id is null");
            return (Criteria) this;
        }

        public Criteria andViIdIsNotNull() {
            addCriterion("vi_id is not null");
            return (Criteria) this;
        }

        public Criteria andViIdEqualTo(Long value) {
            addCriterion("vi_id =", value, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdNotEqualTo(Long value) {
            addCriterion("vi_id <>", value, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdGreaterThan(Long value) {
            addCriterion("vi_id >", value, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vi_id >=", value, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdLessThan(Long value) {
            addCriterion("vi_id <", value, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdLessThanOrEqualTo(Long value) {
            addCriterion("vi_id <=", value, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdIn(List<Long> values) {
            addCriterion("vi_id in", values, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdNotIn(List<Long> values) {
            addCriterion("vi_id not in", values, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdBetween(Long value1, Long value2) {
            addCriterion("vi_id between", value1, value2, "viId");
            return (Criteria) this;
        }

        public Criteria andViIdNotBetween(Long value1, Long value2) {
            addCriterion("vi_id not between", value1, value2, "viId");
            return (Criteria) this;
        }

        public Criteria andViAreaIsNull() {
            addCriterion("vi_area is null");
            return (Criteria) this;
        }

        public Criteria andViAreaIsNotNull() {
            addCriterion("vi_area is not null");
            return (Criteria) this;
        }

        public Criteria andViAreaEqualTo(String value) {
            addCriterion("vi_area =", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaNotEqualTo(String value) {
            addCriterion("vi_area <>", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaGreaterThan(String value) {
            addCriterion("vi_area >", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaGreaterThanOrEqualTo(String value) {
            addCriterion("vi_area >=", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaLessThan(String value) {
            addCriterion("vi_area <", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaLessThanOrEqualTo(String value) {
            addCriterion("vi_area <=", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaLike(String value) {
            addCriterion("vi_area like", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaNotLike(String value) {
            addCriterion("vi_area not like", value, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaIn(List<String> values) {
            addCriterion("vi_area in", values, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaNotIn(List<String> values) {
            addCriterion("vi_area not in", values, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaBetween(String value1, String value2) {
            addCriterion("vi_area between", value1, value2, "viArea");
            return (Criteria) this;
        }

        public Criteria andViAreaNotBetween(String value1, String value2) {
            addCriterion("vi_area not between", value1, value2, "viArea");
            return (Criteria) this;
        }

        public Criteria andViIpIsNull() {
            addCriterion("vi_ip is null");
            return (Criteria) this;
        }

        public Criteria andViIpIsNotNull() {
            addCriterion("vi_ip is not null");
            return (Criteria) this;
        }

        public Criteria andViIpEqualTo(String value) {
            addCriterion("vi_ip =", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpNotEqualTo(String value) {
            addCriterion("vi_ip <>", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpGreaterThan(String value) {
            addCriterion("vi_ip >", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpGreaterThanOrEqualTo(String value) {
            addCriterion("vi_ip >=", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpLessThan(String value) {
            addCriterion("vi_ip <", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpLessThanOrEqualTo(String value) {
            addCriterion("vi_ip <=", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpLike(String value) {
            addCriterion("vi_ip like", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpNotLike(String value) {
            addCriterion("vi_ip not like", value, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpIn(List<String> values) {
            addCriterion("vi_ip in", values, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpNotIn(List<String> values) {
            addCriterion("vi_ip not in", values, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpBetween(String value1, String value2) {
            addCriterion("vi_ip between", value1, value2, "viIp");
            return (Criteria) this;
        }

        public Criteria andViIpNotBetween(String value1, String value2) {
            addCriterion("vi_ip not between", value1, value2, "viIp");
            return (Criteria) this;
        }

        public Criteria andViMemoIsNull() {
            addCriterion("vi_memo is null");
            return (Criteria) this;
        }

        public Criteria andViMemoIsNotNull() {
            addCriterion("vi_memo is not null");
            return (Criteria) this;
        }

        public Criteria andViMemoEqualTo(String value) {
            addCriterion("vi_memo =", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoNotEqualTo(String value) {
            addCriterion("vi_memo <>", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoGreaterThan(String value) {
            addCriterion("vi_memo >", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoGreaterThanOrEqualTo(String value) {
            addCriterion("vi_memo >=", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoLessThan(String value) {
            addCriterion("vi_memo <", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoLessThanOrEqualTo(String value) {
            addCriterion("vi_memo <=", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoLike(String value) {
            addCriterion("vi_memo like", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoNotLike(String value) {
            addCriterion("vi_memo not like", value, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoIn(List<String> values) {
            addCriterion("vi_memo in", values, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoNotIn(List<String> values) {
            addCriterion("vi_memo not in", values, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoBetween(String value1, String value2) {
            addCriterion("vi_memo between", value1, value2, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViMemoNotBetween(String value1, String value2) {
            addCriterion("vi_memo not between", value1, value2, "viMemo");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeIsNull() {
            addCriterion("vi_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeIsNotNull() {
            addCriterion("vi_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeEqualTo(String value) {
            addCriterion("vi_visit_time =", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeNotEqualTo(String value) {
            addCriterion("vi_visit_time <>", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeGreaterThan(String value) {
            addCriterion("vi_visit_time >", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("vi_visit_time >=", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeLessThan(String value) {
            addCriterion("vi_visit_time <", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeLessThanOrEqualTo(String value) {
            addCriterion("vi_visit_time <=", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeLike(String value) {
            addCriterion("vi_visit_time like", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeNotLike(String value) {
            addCriterion("vi_visit_time not like", value, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeIn(List<String> values) {
            addCriterion("vi_visit_time in", values, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeNotIn(List<String> values) {
            addCriterion("vi_visit_time not in", values, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeBetween(String value1, String value2) {
            addCriterion("vi_visit_time between", value1, value2, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViVisitTimeNotBetween(String value1, String value2) {
            addCriterion("vi_visit_time not between", value1, value2, "viVisitTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeIsNull() {
            addCriterion("vi_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeIsNotNull() {
            addCriterion("vi_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeEqualTo(String value) {
            addCriterion("vi_creat_time_change =", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeNotEqualTo(String value) {
            addCriterion("vi_creat_time_change <>", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeGreaterThan(String value) {
            addCriterion("vi_creat_time_change >", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("vi_creat_time_change >=", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeLessThan(String value) {
            addCriterion("vi_creat_time_change <", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("vi_creat_time_change <=", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeLike(String value) {
            addCriterion("vi_creat_time_change like", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeNotLike(String value) {
            addCriterion("vi_creat_time_change not like", value, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeIn(List<String> values) {
            addCriterion("vi_creat_time_change in", values, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeNotIn(List<String> values) {
            addCriterion("vi_creat_time_change not in", values, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("vi_creat_time_change between", value1, value2, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("vi_creat_time_change not between", value1, value2, "viCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeIsNull() {
            addCriterion("vi_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeIsNotNull() {
            addCriterion("vi_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeEqualTo(Date value) {
            addCriterion("vi_creat_time =", value, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeNotEqualTo(Date value) {
            addCriterion("vi_creat_time <>", value, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeGreaterThan(Date value) {
            addCriterion("vi_creat_time >", value, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vi_creat_time >=", value, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeLessThan(Date value) {
            addCriterion("vi_creat_time <", value, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("vi_creat_time <=", value, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeIn(List<Date> values) {
            addCriterion("vi_creat_time in", values, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeNotIn(List<Date> values) {
            addCriterion("vi_creat_time not in", values, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeBetween(Date value1, Date value2) {
            addCriterion("vi_creat_time between", value1, value2, "viCreatTime");
            return (Criteria) this;
        }

        public Criteria andViCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("vi_creat_time not between", value1, value2, "viCreatTime");
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