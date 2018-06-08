package com.liangzi.mgr.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgrAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgrAccountExample() {
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

        public Criteria andMacIdIsNull() {
            addCriterion("mac_id is null");
            return (Criteria) this;
        }

        public Criteria andMacIdIsNotNull() {
            addCriterion("mac_id is not null");
            return (Criteria) this;
        }

        public Criteria andMacIdEqualTo(Long value) {
            addCriterion("mac_id =", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotEqualTo(Long value) {
            addCriterion("mac_id <>", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThan(Long value) {
            addCriterion("mac_id >", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mac_id >=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThan(Long value) {
            addCriterion("mac_id <", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdLessThanOrEqualTo(Long value) {
            addCriterion("mac_id <=", value, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdIn(List<Long> values) {
            addCriterion("mac_id in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotIn(List<Long> values) {
            addCriterion("mac_id not in", values, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdBetween(Long value1, Long value2) {
            addCriterion("mac_id between", value1, value2, "macId");
            return (Criteria) this;
        }

        public Criteria andMacIdNotBetween(Long value1, Long value2) {
            addCriterion("mac_id not between", value1, value2, "macId");
            return (Criteria) this;
        }

        public Criteria andMacTittleIsNull() {
            addCriterion("mac_tittle is null");
            return (Criteria) this;
        }

        public Criteria andMacTittleIsNotNull() {
            addCriterion("mac_tittle is not null");
            return (Criteria) this;
        }

        public Criteria andMacTittleEqualTo(String value) {
            addCriterion("mac_tittle =", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleNotEqualTo(String value) {
            addCriterion("mac_tittle <>", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleGreaterThan(String value) {
            addCriterion("mac_tittle >", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleGreaterThanOrEqualTo(String value) {
            addCriterion("mac_tittle >=", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleLessThan(String value) {
            addCriterion("mac_tittle <", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleLessThanOrEqualTo(String value) {
            addCriterion("mac_tittle <=", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleLike(String value) {
            addCriterion("mac_tittle like", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleNotLike(String value) {
            addCriterion("mac_tittle not like", value, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleIn(List<String> values) {
            addCriterion("mac_tittle in", values, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleNotIn(List<String> values) {
            addCriterion("mac_tittle not in", values, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleBetween(String value1, String value2) {
            addCriterion("mac_tittle between", value1, value2, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacTittleNotBetween(String value1, String value2) {
            addCriterion("mac_tittle not between", value1, value2, "macTittle");
            return (Criteria) this;
        }

        public Criteria andMacPasswordIsNull() {
            addCriterion("mac_password is null");
            return (Criteria) this;
        }

        public Criteria andMacPasswordIsNotNull() {
            addCriterion("mac_password is not null");
            return (Criteria) this;
        }

        public Criteria andMacPasswordEqualTo(String value) {
            addCriterion("mac_password =", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordNotEqualTo(String value) {
            addCriterion("mac_password <>", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordGreaterThan(String value) {
            addCriterion("mac_password >", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("mac_password >=", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordLessThan(String value) {
            addCriterion("mac_password <", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordLessThanOrEqualTo(String value) {
            addCriterion("mac_password <=", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordLike(String value) {
            addCriterion("mac_password like", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordNotLike(String value) {
            addCriterion("mac_password not like", value, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordIn(List<String> values) {
            addCriterion("mac_password in", values, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordNotIn(List<String> values) {
            addCriterion("mac_password not in", values, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordBetween(String value1, String value2) {
            addCriterion("mac_password between", value1, value2, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacPasswordNotBetween(String value1, String value2) {
            addCriterion("mac_password not between", value1, value2, "macPassword");
            return (Criteria) this;
        }

        public Criteria andMacNickIsNull() {
            addCriterion("mac_nick is null");
            return (Criteria) this;
        }

        public Criteria andMacNickIsNotNull() {
            addCriterion("mac_nick is not null");
            return (Criteria) this;
        }

        public Criteria andMacNickEqualTo(String value) {
            addCriterion("mac_nick =", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickNotEqualTo(String value) {
            addCriterion("mac_nick <>", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickGreaterThan(String value) {
            addCriterion("mac_nick >", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickGreaterThanOrEqualTo(String value) {
            addCriterion("mac_nick >=", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickLessThan(String value) {
            addCriterion("mac_nick <", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickLessThanOrEqualTo(String value) {
            addCriterion("mac_nick <=", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickLike(String value) {
            addCriterion("mac_nick like", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickNotLike(String value) {
            addCriterion("mac_nick not like", value, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickIn(List<String> values) {
            addCriterion("mac_nick in", values, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickNotIn(List<String> values) {
            addCriterion("mac_nick not in", values, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickBetween(String value1, String value2) {
            addCriterion("mac_nick between", value1, value2, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacNickNotBetween(String value1, String value2) {
            addCriterion("mac_nick not between", value1, value2, "macNick");
            return (Criteria) this;
        }

        public Criteria andMacMemoIsNull() {
            addCriterion("mac_memo is null");
            return (Criteria) this;
        }

        public Criteria andMacMemoIsNotNull() {
            addCriterion("mac_memo is not null");
            return (Criteria) this;
        }

        public Criteria andMacMemoEqualTo(String value) {
            addCriterion("mac_memo =", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoNotEqualTo(String value) {
            addCriterion("mac_memo <>", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoGreaterThan(String value) {
            addCriterion("mac_memo >", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoGreaterThanOrEqualTo(String value) {
            addCriterion("mac_memo >=", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoLessThan(String value) {
            addCriterion("mac_memo <", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoLessThanOrEqualTo(String value) {
            addCriterion("mac_memo <=", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoLike(String value) {
            addCriterion("mac_memo like", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoNotLike(String value) {
            addCriterion("mac_memo not like", value, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoIn(List<String> values) {
            addCriterion("mac_memo in", values, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoNotIn(List<String> values) {
            addCriterion("mac_memo not in", values, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoBetween(String value1, String value2) {
            addCriterion("mac_memo between", value1, value2, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacMemoNotBetween(String value1, String value2) {
            addCriterion("mac_memo not between", value1, value2, "macMemo");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeIsNull() {
            addCriterion("mac_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeIsNotNull() {
            addCriterion("mac_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeEqualTo(String value) {
            addCriterion("mac_creat_time_change =", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeNotEqualTo(String value) {
            addCriterion("mac_creat_time_change <>", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeGreaterThan(String value) {
            addCriterion("mac_creat_time_change >", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("mac_creat_time_change >=", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeLessThan(String value) {
            addCriterion("mac_creat_time_change <", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("mac_creat_time_change <=", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeLike(String value) {
            addCriterion("mac_creat_time_change like", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeNotLike(String value) {
            addCriterion("mac_creat_time_change not like", value, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeIn(List<String> values) {
            addCriterion("mac_creat_time_change in", values, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeNotIn(List<String> values) {
            addCriterion("mac_creat_time_change not in", values, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("mac_creat_time_change between", value1, value2, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("mac_creat_time_change not between", value1, value2, "macCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeIsNull() {
            addCriterion("mac_modify_time is null");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeIsNotNull() {
            addCriterion("mac_modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeEqualTo(Date value) {
            addCriterion("mac_modify_time =", value, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeNotEqualTo(Date value) {
            addCriterion("mac_modify_time <>", value, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeGreaterThan(Date value) {
            addCriterion("mac_modify_time >", value, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mac_modify_time >=", value, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeLessThan(Date value) {
            addCriterion("mac_modify_time <", value, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("mac_modify_time <=", value, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeIn(List<Date> values) {
            addCriterion("mac_modify_time in", values, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeNotIn(List<Date> values) {
            addCriterion("mac_modify_time not in", values, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeBetween(Date value1, Date value2) {
            addCriterion("mac_modify_time between", value1, value2, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("mac_modify_time not between", value1, value2, "macModifyTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeIsNull() {
            addCriterion("mac_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeIsNotNull() {
            addCriterion("mac_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeEqualTo(Date value) {
            addCriterion("mac_creat_time =", value, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeNotEqualTo(Date value) {
            addCriterion("mac_creat_time <>", value, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeGreaterThan(Date value) {
            addCriterion("mac_creat_time >", value, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mac_creat_time >=", value, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeLessThan(Date value) {
            addCriterion("mac_creat_time <", value, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("mac_creat_time <=", value, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeIn(List<Date> values) {
            addCriterion("mac_creat_time in", values, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeNotIn(List<Date> values) {
            addCriterion("mac_creat_time not in", values, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeBetween(Date value1, Date value2) {
            addCriterion("mac_creat_time between", value1, value2, "macCreatTime");
            return (Criteria) this;
        }

        public Criteria andMacCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("mac_creat_time not between", value1, value2, "macCreatTime");
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