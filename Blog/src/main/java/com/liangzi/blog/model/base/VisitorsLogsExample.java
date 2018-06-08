package com.liangzi.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VisitorsLogsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VisitorsLogsExample() {
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

        public Criteria andVlIdIsNull() {
            addCriterion("vl_id is null");
            return (Criteria) this;
        }

        public Criteria andVlIdIsNotNull() {
            addCriterion("vl_id is not null");
            return (Criteria) this;
        }

        public Criteria andVlIdEqualTo(Long value) {
            addCriterion("vl_id =", value, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdNotEqualTo(Long value) {
            addCriterion("vl_id <>", value, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdGreaterThan(Long value) {
            addCriterion("vl_id >", value, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdGreaterThanOrEqualTo(Long value) {
            addCriterion("vl_id >=", value, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdLessThan(Long value) {
            addCriterion("vl_id <", value, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdLessThanOrEqualTo(Long value) {
            addCriterion("vl_id <=", value, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdIn(List<Long> values) {
            addCriterion("vl_id in", values, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdNotIn(List<Long> values) {
            addCriterion("vl_id not in", values, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdBetween(Long value1, Long value2) {
            addCriterion("vl_id between", value1, value2, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlIdNotBetween(Long value1, Long value2) {
            addCriterion("vl_id not between", value1, value2, "vlId");
            return (Criteria) this;
        }

        public Criteria andVlAreaIsNull() {
            addCriterion("vl_area is null");
            return (Criteria) this;
        }

        public Criteria andVlAreaIsNotNull() {
            addCriterion("vl_area is not null");
            return (Criteria) this;
        }

        public Criteria andVlAreaEqualTo(String value) {
            addCriterion("vl_area =", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaNotEqualTo(String value) {
            addCriterion("vl_area <>", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaGreaterThan(String value) {
            addCriterion("vl_area >", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaGreaterThanOrEqualTo(String value) {
            addCriterion("vl_area >=", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaLessThan(String value) {
            addCriterion("vl_area <", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaLessThanOrEqualTo(String value) {
            addCriterion("vl_area <=", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaLike(String value) {
            addCriterion("vl_area like", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaNotLike(String value) {
            addCriterion("vl_area not like", value, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaIn(List<String> values) {
            addCriterion("vl_area in", values, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaNotIn(List<String> values) {
            addCriterion("vl_area not in", values, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaBetween(String value1, String value2) {
            addCriterion("vl_area between", value1, value2, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlAreaNotBetween(String value1, String value2) {
            addCriterion("vl_area not between", value1, value2, "vlArea");
            return (Criteria) this;
        }

        public Criteria andVlIpIsNull() {
            addCriterion("vl_ip is null");
            return (Criteria) this;
        }

        public Criteria andVlIpIsNotNull() {
            addCriterion("vl_ip is not null");
            return (Criteria) this;
        }

        public Criteria andVlIpEqualTo(String value) {
            addCriterion("vl_ip =", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpNotEqualTo(String value) {
            addCriterion("vl_ip <>", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpGreaterThan(String value) {
            addCriterion("vl_ip >", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpGreaterThanOrEqualTo(String value) {
            addCriterion("vl_ip >=", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpLessThan(String value) {
            addCriterion("vl_ip <", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpLessThanOrEqualTo(String value) {
            addCriterion("vl_ip <=", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpLike(String value) {
            addCriterion("vl_ip like", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpNotLike(String value) {
            addCriterion("vl_ip not like", value, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpIn(List<String> values) {
            addCriterion("vl_ip in", values, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpNotIn(List<String> values) {
            addCriterion("vl_ip not in", values, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpBetween(String value1, String value2) {
            addCriterion("vl_ip between", value1, value2, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlIpNotBetween(String value1, String value2) {
            addCriterion("vl_ip not between", value1, value2, "vlIp");
            return (Criteria) this;
        }

        public Criteria andVlTargetIsNull() {
            addCriterion("vl_target is null");
            return (Criteria) this;
        }

        public Criteria andVlTargetIsNotNull() {
            addCriterion("vl_target is not null");
            return (Criteria) this;
        }

        public Criteria andVlTargetEqualTo(String value) {
            addCriterion("vl_target =", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetNotEqualTo(String value) {
            addCriterion("vl_target <>", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetGreaterThan(String value) {
            addCriterion("vl_target >", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetGreaterThanOrEqualTo(String value) {
            addCriterion("vl_target >=", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetLessThan(String value) {
            addCriterion("vl_target <", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetLessThanOrEqualTo(String value) {
            addCriterion("vl_target <=", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetLike(String value) {
            addCriterion("vl_target like", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetNotLike(String value) {
            addCriterion("vl_target not like", value, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetIn(List<String> values) {
            addCriterion("vl_target in", values, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetNotIn(List<String> values) {
            addCriterion("vl_target not in", values, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetBetween(String value1, String value2) {
            addCriterion("vl_target between", value1, value2, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlTargetNotBetween(String value1, String value2) {
            addCriterion("vl_target not between", value1, value2, "vlTarget");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentIsNull() {
            addCriterion("vl_operation_content is null");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentIsNotNull() {
            addCriterion("vl_operation_content is not null");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentEqualTo(String value) {
            addCriterion("vl_operation_content =", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentNotEqualTo(String value) {
            addCriterion("vl_operation_content <>", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentGreaterThan(String value) {
            addCriterion("vl_operation_content >", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentGreaterThanOrEqualTo(String value) {
            addCriterion("vl_operation_content >=", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentLessThan(String value) {
            addCriterion("vl_operation_content <", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentLessThanOrEqualTo(String value) {
            addCriterion("vl_operation_content <=", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentLike(String value) {
            addCriterion("vl_operation_content like", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentNotLike(String value) {
            addCriterion("vl_operation_content not like", value, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentIn(List<String> values) {
            addCriterion("vl_operation_content in", values, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentNotIn(List<String> values) {
            addCriterion("vl_operation_content not in", values, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentBetween(String value1, String value2) {
            addCriterion("vl_operation_content between", value1, value2, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlOperationContentNotBetween(String value1, String value2) {
            addCriterion("vl_operation_content not between", value1, value2, "vlOperationContent");
            return (Criteria) this;
        }

        public Criteria andVlMemoIsNull() {
            addCriterion("vl_memo is null");
            return (Criteria) this;
        }

        public Criteria andVlMemoIsNotNull() {
            addCriterion("vl_memo is not null");
            return (Criteria) this;
        }

        public Criteria andVlMemoEqualTo(String value) {
            addCriterion("vl_memo =", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoNotEqualTo(String value) {
            addCriterion("vl_memo <>", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoGreaterThan(String value) {
            addCriterion("vl_memo >", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoGreaterThanOrEqualTo(String value) {
            addCriterion("vl_memo >=", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoLessThan(String value) {
            addCriterion("vl_memo <", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoLessThanOrEqualTo(String value) {
            addCriterion("vl_memo <=", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoLike(String value) {
            addCriterion("vl_memo like", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoNotLike(String value) {
            addCriterion("vl_memo not like", value, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoIn(List<String> values) {
            addCriterion("vl_memo in", values, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoNotIn(List<String> values) {
            addCriterion("vl_memo not in", values, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoBetween(String value1, String value2) {
            addCriterion("vl_memo between", value1, value2, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlMemoNotBetween(String value1, String value2) {
            addCriterion("vl_memo not between", value1, value2, "vlMemo");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeIsNull() {
            addCriterion("vl_visit_time is null");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeIsNotNull() {
            addCriterion("vl_visit_time is not null");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeEqualTo(String value) {
            addCriterion("vl_visit_time =", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeNotEqualTo(String value) {
            addCriterion("vl_visit_time <>", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeGreaterThan(String value) {
            addCriterion("vl_visit_time >", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeGreaterThanOrEqualTo(String value) {
            addCriterion("vl_visit_time >=", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeLessThan(String value) {
            addCriterion("vl_visit_time <", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeLessThanOrEqualTo(String value) {
            addCriterion("vl_visit_time <=", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeLike(String value) {
            addCriterion("vl_visit_time like", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeNotLike(String value) {
            addCriterion("vl_visit_time not like", value, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeIn(List<String> values) {
            addCriterion("vl_visit_time in", values, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeNotIn(List<String> values) {
            addCriterion("vl_visit_time not in", values, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeBetween(String value1, String value2) {
            addCriterion("vl_visit_time between", value1, value2, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlVisitTimeNotBetween(String value1, String value2) {
            addCriterion("vl_visit_time not between", value1, value2, "vlVisitTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeIsNull() {
            addCriterion("vl_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeIsNotNull() {
            addCriterion("vl_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeEqualTo(String value) {
            addCriterion("vl_creat_time_change =", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeNotEqualTo(String value) {
            addCriterion("vl_creat_time_change <>", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeGreaterThan(String value) {
            addCriterion("vl_creat_time_change >", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("vl_creat_time_change >=", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeLessThan(String value) {
            addCriterion("vl_creat_time_change <", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("vl_creat_time_change <=", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeLike(String value) {
            addCriterion("vl_creat_time_change like", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeNotLike(String value) {
            addCriterion("vl_creat_time_change not like", value, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeIn(List<String> values) {
            addCriterion("vl_creat_time_change in", values, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeNotIn(List<String> values) {
            addCriterion("vl_creat_time_change not in", values, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("vl_creat_time_change between", value1, value2, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("vl_creat_time_change not between", value1, value2, "vlCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeIsNull() {
            addCriterion("vl_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeIsNotNull() {
            addCriterion("vl_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeEqualTo(Date value) {
            addCriterion("vl_creat_time =", value, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeNotEqualTo(Date value) {
            addCriterion("vl_creat_time <>", value, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeGreaterThan(Date value) {
            addCriterion("vl_creat_time >", value, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("vl_creat_time >=", value, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeLessThan(Date value) {
            addCriterion("vl_creat_time <", value, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("vl_creat_time <=", value, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeIn(List<Date> values) {
            addCriterion("vl_creat_time in", values, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeNotIn(List<Date> values) {
            addCriterion("vl_creat_time not in", values, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeBetween(Date value1, Date value2) {
            addCriterion("vl_creat_time between", value1, value2, "vlCreatTime");
            return (Criteria) this;
        }

        public Criteria andVlCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("vl_creat_time not between", value1, value2, "vlCreatTime");
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