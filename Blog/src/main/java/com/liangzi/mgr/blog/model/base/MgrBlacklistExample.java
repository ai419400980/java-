package com.liangzi.mgr.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgrBlacklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgrBlacklistExample() {
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

        public Criteria andMbIdIsNull() {
            addCriterion("mb_id is null");
            return (Criteria) this;
        }

        public Criteria andMbIdIsNotNull() {
            addCriterion("mb_id is not null");
            return (Criteria) this;
        }

        public Criteria andMbIdEqualTo(Long value) {
            addCriterion("mb_id =", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotEqualTo(Long value) {
            addCriterion("mb_id <>", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdGreaterThan(Long value) {
            addCriterion("mb_id >", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mb_id >=", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdLessThan(Long value) {
            addCriterion("mb_id <", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdLessThanOrEqualTo(Long value) {
            addCriterion("mb_id <=", value, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdIn(List<Long> values) {
            addCriterion("mb_id in", values, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotIn(List<Long> values) {
            addCriterion("mb_id not in", values, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdBetween(Long value1, Long value2) {
            addCriterion("mb_id between", value1, value2, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIdNotBetween(Long value1, Long value2) {
            addCriterion("mb_id not between", value1, value2, "mbId");
            return (Criteria) this;
        }

        public Criteria andMbIpIsNull() {
            addCriterion("mb_ip is null");
            return (Criteria) this;
        }

        public Criteria andMbIpIsNotNull() {
            addCriterion("mb_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMbIpEqualTo(String value) {
            addCriterion("mb_ip =", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpNotEqualTo(String value) {
            addCriterion("mb_ip <>", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpGreaterThan(String value) {
            addCriterion("mb_ip >", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpGreaterThanOrEqualTo(String value) {
            addCriterion("mb_ip >=", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpLessThan(String value) {
            addCriterion("mb_ip <", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpLessThanOrEqualTo(String value) {
            addCriterion("mb_ip <=", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpLike(String value) {
            addCriterion("mb_ip like", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpNotLike(String value) {
            addCriterion("mb_ip not like", value, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpIn(List<String> values) {
            addCriterion("mb_ip in", values, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpNotIn(List<String> values) {
            addCriterion("mb_ip not in", values, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpBetween(String value1, String value2) {
            addCriterion("mb_ip between", value1, value2, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbIpNotBetween(String value1, String value2) {
            addCriterion("mb_ip not between", value1, value2, "mbIp");
            return (Criteria) this;
        }

        public Criteria andMbGradeIsNull() {
            addCriterion("mb_grade is null");
            return (Criteria) this;
        }

        public Criteria andMbGradeIsNotNull() {
            addCriterion("mb_grade is not null");
            return (Criteria) this;
        }

        public Criteria andMbGradeEqualTo(Integer value) {
            addCriterion("mb_grade =", value, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeNotEqualTo(Integer value) {
            addCriterion("mb_grade <>", value, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeGreaterThan(Integer value) {
            addCriterion("mb_grade >", value, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("mb_grade >=", value, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeLessThan(Integer value) {
            addCriterion("mb_grade <", value, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeLessThanOrEqualTo(Integer value) {
            addCriterion("mb_grade <=", value, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeIn(List<Integer> values) {
            addCriterion("mb_grade in", values, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeNotIn(List<Integer> values) {
            addCriterion("mb_grade not in", values, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeBetween(Integer value1, Integer value2) {
            addCriterion("mb_grade between", value1, value2, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("mb_grade not between", value1, value2, "mbGrade");
            return (Criteria) this;
        }

        public Criteria andMbReasonIsNull() {
            addCriterion("mb_reason is null");
            return (Criteria) this;
        }

        public Criteria andMbReasonIsNotNull() {
            addCriterion("mb_reason is not null");
            return (Criteria) this;
        }

        public Criteria andMbReasonEqualTo(String value) {
            addCriterion("mb_reason =", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonNotEqualTo(String value) {
            addCriterion("mb_reason <>", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonGreaterThan(String value) {
            addCriterion("mb_reason >", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonGreaterThanOrEqualTo(String value) {
            addCriterion("mb_reason >=", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonLessThan(String value) {
            addCriterion("mb_reason <", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonLessThanOrEqualTo(String value) {
            addCriterion("mb_reason <=", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonLike(String value) {
            addCriterion("mb_reason like", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonNotLike(String value) {
            addCriterion("mb_reason not like", value, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonIn(List<String> values) {
            addCriterion("mb_reason in", values, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonNotIn(List<String> values) {
            addCriterion("mb_reason not in", values, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonBetween(String value1, String value2) {
            addCriterion("mb_reason between", value1, value2, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbReasonNotBetween(String value1, String value2) {
            addCriterion("mb_reason not between", value1, value2, "mbReason");
            return (Criteria) this;
        }

        public Criteria andMbMemoIsNull() {
            addCriterion("mb_memo is null");
            return (Criteria) this;
        }

        public Criteria andMbMemoIsNotNull() {
            addCriterion("mb_memo is not null");
            return (Criteria) this;
        }

        public Criteria andMbMemoEqualTo(String value) {
            addCriterion("mb_memo =", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoNotEqualTo(String value) {
            addCriterion("mb_memo <>", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoGreaterThan(String value) {
            addCriterion("mb_memo >", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoGreaterThanOrEqualTo(String value) {
            addCriterion("mb_memo >=", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoLessThan(String value) {
            addCriterion("mb_memo <", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoLessThanOrEqualTo(String value) {
            addCriterion("mb_memo <=", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoLike(String value) {
            addCriterion("mb_memo like", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoNotLike(String value) {
            addCriterion("mb_memo not like", value, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoIn(List<String> values) {
            addCriterion("mb_memo in", values, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoNotIn(List<String> values) {
            addCriterion("mb_memo not in", values, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoBetween(String value1, String value2) {
            addCriterion("mb_memo between", value1, value2, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbMemoNotBetween(String value1, String value2) {
            addCriterion("mb_memo not between", value1, value2, "mbMemo");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeIsNull() {
            addCriterion("mb_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeIsNotNull() {
            addCriterion("mb_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeEqualTo(String value) {
            addCriterion("mb_creat_time_change =", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeNotEqualTo(String value) {
            addCriterion("mb_creat_time_change <>", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeGreaterThan(String value) {
            addCriterion("mb_creat_time_change >", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("mb_creat_time_change >=", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeLessThan(String value) {
            addCriterion("mb_creat_time_change <", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("mb_creat_time_change <=", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeLike(String value) {
            addCriterion("mb_creat_time_change like", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeNotLike(String value) {
            addCriterion("mb_creat_time_change not like", value, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeIn(List<String> values) {
            addCriterion("mb_creat_time_change in", values, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeNotIn(List<String> values) {
            addCriterion("mb_creat_time_change not in", values, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("mb_creat_time_change between", value1, value2, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("mb_creat_time_change not between", value1, value2, "mbCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeIsNull() {
            addCriterion("mb_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeIsNotNull() {
            addCriterion("mb_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeEqualTo(Date value) {
            addCriterion("mb_creat_time =", value, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeNotEqualTo(Date value) {
            addCriterion("mb_creat_time <>", value, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeGreaterThan(Date value) {
            addCriterion("mb_creat_time >", value, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mb_creat_time >=", value, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeLessThan(Date value) {
            addCriterion("mb_creat_time <", value, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("mb_creat_time <=", value, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeIn(List<Date> values) {
            addCriterion("mb_creat_time in", values, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeNotIn(List<Date> values) {
            addCriterion("mb_creat_time not in", values, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeBetween(Date value1, Date value2) {
            addCriterion("mb_creat_time between", value1, value2, "mbCreatTime");
            return (Criteria) this;
        }

        public Criteria andMbCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("mb_creat_time not between", value1, value2, "mbCreatTime");
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