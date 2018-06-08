package com.liangzi.mgr.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgrLoginLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgrLoginLogsExample() {
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

        public Criteria andMllIdIsNull() {
            addCriterion("mll_id is null");
            return (Criteria) this;
        }

        public Criteria andMllIdIsNotNull() {
            addCriterion("mll_id is not null");
            return (Criteria) this;
        }

        public Criteria andMllIdEqualTo(Long value) {
            addCriterion("mll_id =", value, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdNotEqualTo(Long value) {
            addCriterion("mll_id <>", value, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdGreaterThan(Long value) {
            addCriterion("mll_id >", value, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mll_id >=", value, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdLessThan(Long value) {
            addCriterion("mll_id <", value, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdLessThanOrEqualTo(Long value) {
            addCriterion("mll_id <=", value, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdIn(List<Long> values) {
            addCriterion("mll_id in", values, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdNotIn(List<Long> values) {
            addCriterion("mll_id not in", values, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdBetween(Long value1, Long value2) {
            addCriterion("mll_id between", value1, value2, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIdNotBetween(Long value1, Long value2) {
            addCriterion("mll_id not between", value1, value2, "mllId");
            return (Criteria) this;
        }

        public Criteria andMllIpIsNull() {
            addCriterion("mll_ip is null");
            return (Criteria) this;
        }

        public Criteria andMllIpIsNotNull() {
            addCriterion("mll_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMllIpEqualTo(String value) {
            addCriterion("mll_ip =", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpNotEqualTo(String value) {
            addCriterion("mll_ip <>", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpGreaterThan(String value) {
            addCriterion("mll_ip >", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpGreaterThanOrEqualTo(String value) {
            addCriterion("mll_ip >=", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpLessThan(String value) {
            addCriterion("mll_ip <", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpLessThanOrEqualTo(String value) {
            addCriterion("mll_ip <=", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpLike(String value) {
            addCriterion("mll_ip like", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpNotLike(String value) {
            addCriterion("mll_ip not like", value, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpIn(List<String> values) {
            addCriterion("mll_ip in", values, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpNotIn(List<String> values) {
            addCriterion("mll_ip not in", values, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpBetween(String value1, String value2) {
            addCriterion("mll_ip between", value1, value2, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllIpNotBetween(String value1, String value2) {
            addCriterion("mll_ip not between", value1, value2, "mllIp");
            return (Criteria) this;
        }

        public Criteria andMllAccountIsNull() {
            addCriterion("mll_account is null");
            return (Criteria) this;
        }

        public Criteria andMllAccountIsNotNull() {
            addCriterion("mll_account is not null");
            return (Criteria) this;
        }

        public Criteria andMllAccountEqualTo(String value) {
            addCriterion("mll_account =", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountNotEqualTo(String value) {
            addCriterion("mll_account <>", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountGreaterThan(String value) {
            addCriterion("mll_account >", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountGreaterThanOrEqualTo(String value) {
            addCriterion("mll_account >=", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountLessThan(String value) {
            addCriterion("mll_account <", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountLessThanOrEqualTo(String value) {
            addCriterion("mll_account <=", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountLike(String value) {
            addCriterion("mll_account like", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountNotLike(String value) {
            addCriterion("mll_account not like", value, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountIn(List<String> values) {
            addCriterion("mll_account in", values, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountNotIn(List<String> values) {
            addCriterion("mll_account not in", values, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountBetween(String value1, String value2) {
            addCriterion("mll_account between", value1, value2, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllAccountNotBetween(String value1, String value2) {
            addCriterion("mll_account not between", value1, value2, "mllAccount");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusIsNull() {
            addCriterion("mll_login_status is null");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusIsNotNull() {
            addCriterion("mll_login_status is not null");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusEqualTo(String value) {
            addCriterion("mll_login_status =", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusNotEqualTo(String value) {
            addCriterion("mll_login_status <>", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusGreaterThan(String value) {
            addCriterion("mll_login_status >", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mll_login_status >=", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusLessThan(String value) {
            addCriterion("mll_login_status <", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusLessThanOrEqualTo(String value) {
            addCriterion("mll_login_status <=", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusLike(String value) {
            addCriterion("mll_login_status like", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusNotLike(String value) {
            addCriterion("mll_login_status not like", value, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusIn(List<String> values) {
            addCriterion("mll_login_status in", values, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusNotIn(List<String> values) {
            addCriterion("mll_login_status not in", values, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusBetween(String value1, String value2) {
            addCriterion("mll_login_status between", value1, value2, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllLoginStatusNotBetween(String value1, String value2) {
            addCriterion("mll_login_status not between", value1, value2, "mllLoginStatus");
            return (Criteria) this;
        }

        public Criteria andMllMemoIsNull() {
            addCriterion("mll_memo is null");
            return (Criteria) this;
        }

        public Criteria andMllMemoIsNotNull() {
            addCriterion("mll_memo is not null");
            return (Criteria) this;
        }

        public Criteria andMllMemoEqualTo(String value) {
            addCriterion("mll_memo =", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoNotEqualTo(String value) {
            addCriterion("mll_memo <>", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoGreaterThan(String value) {
            addCriterion("mll_memo >", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoGreaterThanOrEqualTo(String value) {
            addCriterion("mll_memo >=", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoLessThan(String value) {
            addCriterion("mll_memo <", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoLessThanOrEqualTo(String value) {
            addCriterion("mll_memo <=", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoLike(String value) {
            addCriterion("mll_memo like", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoNotLike(String value) {
            addCriterion("mll_memo not like", value, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoIn(List<String> values) {
            addCriterion("mll_memo in", values, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoNotIn(List<String> values) {
            addCriterion("mll_memo not in", values, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoBetween(String value1, String value2) {
            addCriterion("mll_memo between", value1, value2, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllMemoNotBetween(String value1, String value2) {
            addCriterion("mll_memo not between", value1, value2, "mllMemo");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeIsNull() {
            addCriterion("mll_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeIsNotNull() {
            addCriterion("mll_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeEqualTo(String value) {
            addCriterion("mll_creat_time_change =", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeNotEqualTo(String value) {
            addCriterion("mll_creat_time_change <>", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeGreaterThan(String value) {
            addCriterion("mll_creat_time_change >", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("mll_creat_time_change >=", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeLessThan(String value) {
            addCriterion("mll_creat_time_change <", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("mll_creat_time_change <=", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeLike(String value) {
            addCriterion("mll_creat_time_change like", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeNotLike(String value) {
            addCriterion("mll_creat_time_change not like", value, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeIn(List<String> values) {
            addCriterion("mll_creat_time_change in", values, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeNotIn(List<String> values) {
            addCriterion("mll_creat_time_change not in", values, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("mll_creat_time_change between", value1, value2, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("mll_creat_time_change not between", value1, value2, "mllCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeIsNull() {
            addCriterion("mll_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeIsNotNull() {
            addCriterion("mll_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeEqualTo(Date value) {
            addCriterion("mll_creat_time =", value, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeNotEqualTo(Date value) {
            addCriterion("mll_creat_time <>", value, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeGreaterThan(Date value) {
            addCriterion("mll_creat_time >", value, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mll_creat_time >=", value, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeLessThan(Date value) {
            addCriterion("mll_creat_time <", value, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("mll_creat_time <=", value, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeIn(List<Date> values) {
            addCriterion("mll_creat_time in", values, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeNotIn(List<Date> values) {
            addCriterion("mll_creat_time not in", values, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeBetween(Date value1, Date value2) {
            addCriterion("mll_creat_time between", value1, value2, "mllCreatTime");
            return (Criteria) this;
        }

        public Criteria andMllCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("mll_creat_time not between", value1, value2, "mllCreatTime");
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