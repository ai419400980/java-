package com.liangzi.mgr.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgrLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgrLogsExample() {
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

        public Criteria andMlIdIsNull() {
            addCriterion("ml_id is null");
            return (Criteria) this;
        }

        public Criteria andMlIdIsNotNull() {
            addCriterion("ml_id is not null");
            return (Criteria) this;
        }

        public Criteria andMlIdEqualTo(Long value) {
            addCriterion("ml_id =", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdNotEqualTo(Long value) {
            addCriterion("ml_id <>", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdGreaterThan(Long value) {
            addCriterion("ml_id >", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ml_id >=", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdLessThan(Long value) {
            addCriterion("ml_id <", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdLessThanOrEqualTo(Long value) {
            addCriterion("ml_id <=", value, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdIn(List<Long> values) {
            addCriterion("ml_id in", values, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdNotIn(List<Long> values) {
            addCriterion("ml_id not in", values, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdBetween(Long value1, Long value2) {
            addCriterion("ml_id between", value1, value2, "mlId");
            return (Criteria) this;
        }

        public Criteria andMlIdNotBetween(Long value1, Long value2) {
            addCriterion("ml_id not between", value1, value2, "mlId");
            return (Criteria) this;
        }

        public Criteria andMgrIpIsNull() {
            addCriterion("mgr_ip is null");
            return (Criteria) this;
        }

        public Criteria andMgrIpIsNotNull() {
            addCriterion("mgr_ip is not null");
            return (Criteria) this;
        }

        public Criteria andMgrIpEqualTo(String value) {
            addCriterion("mgr_ip =", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpNotEqualTo(String value) {
            addCriterion("mgr_ip <>", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpGreaterThan(String value) {
            addCriterion("mgr_ip >", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpGreaterThanOrEqualTo(String value) {
            addCriterion("mgr_ip >=", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpLessThan(String value) {
            addCriterion("mgr_ip <", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpLessThanOrEqualTo(String value) {
            addCriterion("mgr_ip <=", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpLike(String value) {
            addCriterion("mgr_ip like", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpNotLike(String value) {
            addCriterion("mgr_ip not like", value, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpIn(List<String> values) {
            addCriterion("mgr_ip in", values, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpNotIn(List<String> values) {
            addCriterion("mgr_ip not in", values, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpBetween(String value1, String value2) {
            addCriterion("mgr_ip between", value1, value2, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMgrIpNotBetween(String value1, String value2) {
            addCriterion("mgr_ip not between", value1, value2, "mgrIp");
            return (Criteria) this;
        }

        public Criteria andMlNameIsNull() {
            addCriterion("ml_name is null");
            return (Criteria) this;
        }

        public Criteria andMlNameIsNotNull() {
            addCriterion("ml_name is not null");
            return (Criteria) this;
        }

        public Criteria andMlNameEqualTo(String value) {
            addCriterion("ml_name =", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotEqualTo(String value) {
            addCriterion("ml_name <>", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameGreaterThan(String value) {
            addCriterion("ml_name >", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameGreaterThanOrEqualTo(String value) {
            addCriterion("ml_name >=", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameLessThan(String value) {
            addCriterion("ml_name <", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameLessThanOrEqualTo(String value) {
            addCriterion("ml_name <=", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameLike(String value) {
            addCriterion("ml_name like", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotLike(String value) {
            addCriterion("ml_name not like", value, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameIn(List<String> values) {
            addCriterion("ml_name in", values, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotIn(List<String> values) {
            addCriterion("ml_name not in", values, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameBetween(String value1, String value2) {
            addCriterion("ml_name between", value1, value2, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlNameNotBetween(String value1, String value2) {
            addCriterion("ml_name not between", value1, value2, "mlName");
            return (Criteria) this;
        }

        public Criteria andMlTargetIsNull() {
            addCriterion("ml_target is null");
            return (Criteria) this;
        }

        public Criteria andMlTargetIsNotNull() {
            addCriterion("ml_target is not null");
            return (Criteria) this;
        }

        public Criteria andMlTargetEqualTo(String value) {
            addCriterion("ml_target =", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetNotEqualTo(String value) {
            addCriterion("ml_target <>", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetGreaterThan(String value) {
            addCriterion("ml_target >", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetGreaterThanOrEqualTo(String value) {
            addCriterion("ml_target >=", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetLessThan(String value) {
            addCriterion("ml_target <", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetLessThanOrEqualTo(String value) {
            addCriterion("ml_target <=", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetLike(String value) {
            addCriterion("ml_target like", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetNotLike(String value) {
            addCriterion("ml_target not like", value, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetIn(List<String> values) {
            addCriterion("ml_target in", values, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetNotIn(List<String> values) {
            addCriterion("ml_target not in", values, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetBetween(String value1, String value2) {
            addCriterion("ml_target between", value1, value2, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlTargetNotBetween(String value1, String value2) {
            addCriterion("ml_target not between", value1, value2, "mlTarget");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentIsNull() {
            addCriterion("ml_operation_content is null");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentIsNotNull() {
            addCriterion("ml_operation_content is not null");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentEqualTo(String value) {
            addCriterion("ml_operation_content =", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentNotEqualTo(String value) {
            addCriterion("ml_operation_content <>", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentGreaterThan(String value) {
            addCriterion("ml_operation_content >", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentGreaterThanOrEqualTo(String value) {
            addCriterion("ml_operation_content >=", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentLessThan(String value) {
            addCriterion("ml_operation_content <", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentLessThanOrEqualTo(String value) {
            addCriterion("ml_operation_content <=", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentLike(String value) {
            addCriterion("ml_operation_content like", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentNotLike(String value) {
            addCriterion("ml_operation_content not like", value, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentIn(List<String> values) {
            addCriterion("ml_operation_content in", values, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentNotIn(List<String> values) {
            addCriterion("ml_operation_content not in", values, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentBetween(String value1, String value2) {
            addCriterion("ml_operation_content between", value1, value2, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlOperationContentNotBetween(String value1, String value2) {
            addCriterion("ml_operation_content not between", value1, value2, "mlOperationContent");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeIsNull() {
            addCriterion("ml_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeIsNotNull() {
            addCriterion("ml_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeEqualTo(String value) {
            addCriterion("ml_creat_time_change =", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeNotEqualTo(String value) {
            addCriterion("ml_creat_time_change <>", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeGreaterThan(String value) {
            addCriterion("ml_creat_time_change >", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("ml_creat_time_change >=", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeLessThan(String value) {
            addCriterion("ml_creat_time_change <", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("ml_creat_time_change <=", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeLike(String value) {
            addCriterion("ml_creat_time_change like", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeNotLike(String value) {
            addCriterion("ml_creat_time_change not like", value, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeIn(List<String> values) {
            addCriterion("ml_creat_time_change in", values, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeNotIn(List<String> values) {
            addCriterion("ml_creat_time_change not in", values, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("ml_creat_time_change between", value1, value2, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("ml_creat_time_change not between", value1, value2, "mlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMlMemoIsNull() {
            addCriterion("ml_memo is null");
            return (Criteria) this;
        }

        public Criteria andMlMemoIsNotNull() {
            addCriterion("ml_memo is not null");
            return (Criteria) this;
        }

        public Criteria andMlMemoEqualTo(String value) {
            addCriterion("ml_memo =", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoNotEqualTo(String value) {
            addCriterion("ml_memo <>", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoGreaterThan(String value) {
            addCriterion("ml_memo >", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoGreaterThanOrEqualTo(String value) {
            addCriterion("ml_memo >=", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoLessThan(String value) {
            addCriterion("ml_memo <", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoLessThanOrEqualTo(String value) {
            addCriterion("ml_memo <=", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoLike(String value) {
            addCriterion("ml_memo like", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoNotLike(String value) {
            addCriterion("ml_memo not like", value, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoIn(List<String> values) {
            addCriterion("ml_memo in", values, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoNotIn(List<String> values) {
            addCriterion("ml_memo not in", values, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoBetween(String value1, String value2) {
            addCriterion("ml_memo between", value1, value2, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlMemoNotBetween(String value1, String value2) {
            addCriterion("ml_memo not between", value1, value2, "mlMemo");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeIsNull() {
            addCriterion("ml_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeIsNotNull() {
            addCriterion("ml_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeEqualTo(Date value) {
            addCriterion("ml_creat_time =", value, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeNotEqualTo(Date value) {
            addCriterion("ml_creat_time <>", value, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeGreaterThan(Date value) {
            addCriterion("ml_creat_time >", value, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ml_creat_time >=", value, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeLessThan(Date value) {
            addCriterion("ml_creat_time <", value, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("ml_creat_time <=", value, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeIn(List<Date> values) {
            addCriterion("ml_creat_time in", values, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeNotIn(List<Date> values) {
            addCriterion("ml_creat_time not in", values, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeBetween(Date value1, Date value2) {
            addCriterion("ml_creat_time between", value1, value2, "mlCreatTime");
            return (Criteria) this;
        }

        public Criteria andMlCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("ml_creat_time not between", value1, value2, "mlCreatTime");
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