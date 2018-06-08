package com.liangzi.mgr.blog.model.base;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MgrCountEverydayExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MgrCountEverydayExample() {
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

        public Criteria andMceIdIsNull() {
            addCriterion("mce_id is null");
            return (Criteria) this;
        }

        public Criteria andMceIdIsNotNull() {
            addCriterion("mce_id is not null");
            return (Criteria) this;
        }

        public Criteria andMceIdEqualTo(Long value) {
            addCriterion("mce_id =", value, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdNotEqualTo(Long value) {
            addCriterion("mce_id <>", value, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdGreaterThan(Long value) {
            addCriterion("mce_id >", value, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_id >=", value, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdLessThan(Long value) {
            addCriterion("mce_id <", value, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdLessThanOrEqualTo(Long value) {
            addCriterion("mce_id <=", value, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdIn(List<Long> values) {
            addCriterion("mce_id in", values, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdNotIn(List<Long> values) {
            addCriterion("mce_id not in", values, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdBetween(Long value1, Long value2) {
            addCriterion("mce_id between", value1, value2, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIdNotBetween(Long value1, Long value2) {
            addCriterion("mce_id not between", value1, value2, "mceId");
            return (Criteria) this;
        }

        public Criteria andMceIpCountIsNull() {
            addCriterion("mce_ip_count is null");
            return (Criteria) this;
        }

        public Criteria andMceIpCountIsNotNull() {
            addCriterion("mce_ip_count is not null");
            return (Criteria) this;
        }

        public Criteria andMceIpCountEqualTo(Long value) {
            addCriterion("mce_ip_count =", value, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountNotEqualTo(Long value) {
            addCriterion("mce_ip_count <>", value, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountGreaterThan(Long value) {
            addCriterion("mce_ip_count >", value, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_ip_count >=", value, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountLessThan(Long value) {
            addCriterion("mce_ip_count <", value, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountLessThanOrEqualTo(Long value) {
            addCriterion("mce_ip_count <=", value, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountIn(List<Long> values) {
            addCriterion("mce_ip_count in", values, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountNotIn(List<Long> values) {
            addCriterion("mce_ip_count not in", values, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountBetween(Long value1, Long value2) {
            addCriterion("mce_ip_count between", value1, value2, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpCountNotBetween(Long value1, Long value2) {
            addCriterion("mce_ip_count not between", value1, value2, "mceIpCount");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneIsNull() {
            addCriterion("mce_ip_for_phone is null");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneIsNotNull() {
            addCriterion("mce_ip_for_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneEqualTo(Long value) {
            addCriterion("mce_ip_for_phone =", value, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneNotEqualTo(Long value) {
            addCriterion("mce_ip_for_phone <>", value, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneGreaterThan(Long value) {
            addCriterion("mce_ip_for_phone >", value, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_ip_for_phone >=", value, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneLessThan(Long value) {
            addCriterion("mce_ip_for_phone <", value, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneLessThanOrEqualTo(Long value) {
            addCriterion("mce_ip_for_phone <=", value, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneIn(List<Long> values) {
            addCriterion("mce_ip_for_phone in", values, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneNotIn(List<Long> values) {
            addCriterion("mce_ip_for_phone not in", values, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneBetween(Long value1, Long value2) {
            addCriterion("mce_ip_for_phone between", value1, value2, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPhoneNotBetween(Long value1, Long value2) {
            addCriterion("mce_ip_for_phone not between", value1, value2, "mceIpForPhone");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcIsNull() {
            addCriterion("mce_ip_for_pc is null");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcIsNotNull() {
            addCriterion("mce_ip_for_pc is not null");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcEqualTo(Long value) {
            addCriterion("mce_ip_for_pc =", value, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcNotEqualTo(Long value) {
            addCriterion("mce_ip_for_pc <>", value, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcGreaterThan(Long value) {
            addCriterion("mce_ip_for_pc >", value, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_ip_for_pc >=", value, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcLessThan(Long value) {
            addCriterion("mce_ip_for_pc <", value, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcLessThanOrEqualTo(Long value) {
            addCriterion("mce_ip_for_pc <=", value, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcIn(List<Long> values) {
            addCriterion("mce_ip_for_pc in", values, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcNotIn(List<Long> values) {
            addCriterion("mce_ip_for_pc not in", values, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcBetween(Long value1, Long value2) {
            addCriterion("mce_ip_for_pc between", value1, value2, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceIpForPcNotBetween(Long value1, Long value2) {
            addCriterion("mce_ip_for_pc not between", value1, value2, "mceIpForPc");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountIsNull() {
            addCriterion("mce_operation_count is null");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountIsNotNull() {
            addCriterion("mce_operation_count is not null");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountEqualTo(Long value) {
            addCriterion("mce_operation_count =", value, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountNotEqualTo(Long value) {
            addCriterion("mce_operation_count <>", value, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountGreaterThan(Long value) {
            addCriterion("mce_operation_count >", value, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_operation_count >=", value, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountLessThan(Long value) {
            addCriterion("mce_operation_count <", value, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountLessThanOrEqualTo(Long value) {
            addCriterion("mce_operation_count <=", value, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountIn(List<Long> values) {
            addCriterion("mce_operation_count in", values, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountNotIn(List<Long> values) {
            addCriterion("mce_operation_count not in", values, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountBetween(Long value1, Long value2) {
            addCriterion("mce_operation_count between", value1, value2, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceOperationCountNotBetween(Long value1, Long value2) {
            addCriterion("mce_operation_count not between", value1, value2, "mceOperationCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountIsNull() {
            addCriterion("mce_search_count is null");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountIsNotNull() {
            addCriterion("mce_search_count is not null");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountEqualTo(Long value) {
            addCriterion("mce_search_count =", value, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountNotEqualTo(Long value) {
            addCriterion("mce_search_count <>", value, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountGreaterThan(Long value) {
            addCriterion("mce_search_count >", value, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_search_count >=", value, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountLessThan(Long value) {
            addCriterion("mce_search_count <", value, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountLessThanOrEqualTo(Long value) {
            addCriterion("mce_search_count <=", value, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountIn(List<Long> values) {
            addCriterion("mce_search_count in", values, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountNotIn(List<Long> values) {
            addCriterion("mce_search_count not in", values, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountBetween(Long value1, Long value2) {
            addCriterion("mce_search_count between", value1, value2, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceSearchCountNotBetween(Long value1, Long value2) {
            addCriterion("mce_search_count not between", value1, value2, "mceSearchCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountIsNull() {
            addCriterion("mce_message_count is null");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountIsNotNull() {
            addCriterion("mce_message_count is not null");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountEqualTo(Long value) {
            addCriterion("mce_message_count =", value, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountNotEqualTo(Long value) {
            addCriterion("mce_message_count <>", value, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountGreaterThan(Long value) {
            addCriterion("mce_message_count >", value, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_message_count >=", value, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountLessThan(Long value) {
            addCriterion("mce_message_count <", value, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountLessThanOrEqualTo(Long value) {
            addCriterion("mce_message_count <=", value, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountIn(List<Long> values) {
            addCriterion("mce_message_count in", values, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountNotIn(List<Long> values) {
            addCriterion("mce_message_count not in", values, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountBetween(Long value1, Long value2) {
            addCriterion("mce_message_count between", value1, value2, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceMessageCountNotBetween(Long value1, Long value2) {
            addCriterion("mce_message_count not between", value1, value2, "mceMessageCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountIsNull() {
            addCriterion("mce_praise_count is null");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountIsNotNull() {
            addCriterion("mce_praise_count is not null");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountEqualTo(Long value) {
            addCriterion("mce_praise_count =", value, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountNotEqualTo(Long value) {
            addCriterion("mce_praise_count <>", value, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountGreaterThan(Long value) {
            addCriterion("mce_praise_count >", value, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_praise_count >=", value, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountLessThan(Long value) {
            addCriterion("mce_praise_count <", value, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountLessThanOrEqualTo(Long value) {
            addCriterion("mce_praise_count <=", value, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountIn(List<Long> values) {
            addCriterion("mce_praise_count in", values, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountNotIn(List<Long> values) {
            addCriterion("mce_praise_count not in", values, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountBetween(Long value1, Long value2) {
            addCriterion("mce_praise_count between", value1, value2, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMcePraiseCountNotBetween(Long value1, Long value2) {
            addCriterion("mce_praise_count not between", value1, value2, "mcePraiseCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountIsNull() {
            addCriterion("mce_article_message_count is null");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountIsNotNull() {
            addCriterion("mce_article_message_count is not null");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountEqualTo(Long value) {
            addCriterion("mce_article_message_count =", value, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountNotEqualTo(Long value) {
            addCriterion("mce_article_message_count <>", value, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountGreaterThan(Long value) {
            addCriterion("mce_article_message_count >", value, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountGreaterThanOrEqualTo(Long value) {
            addCriterion("mce_article_message_count >=", value, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountLessThan(Long value) {
            addCriterion("mce_article_message_count <", value, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountLessThanOrEqualTo(Long value) {
            addCriterion("mce_article_message_count <=", value, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountIn(List<Long> values) {
            addCriterion("mce_article_message_count in", values, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountNotIn(List<Long> values) {
            addCriterion("mce_article_message_count not in", values, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountBetween(Long value1, Long value2) {
            addCriterion("mce_article_message_count between", value1, value2, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceArticleMessageCountNotBetween(Long value1, Long value2) {
            addCriterion("mce_article_message_count not between", value1, value2, "mceArticleMessageCount");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeIsNull() {
            addCriterion("mce_creat_time_change is null");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeIsNotNull() {
            addCriterion("mce_creat_time_change is not null");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeEqualTo(String value) {
            addCriterion("mce_creat_time_change =", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeNotEqualTo(String value) {
            addCriterion("mce_creat_time_change <>", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeGreaterThan(String value) {
            addCriterion("mce_creat_time_change >", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeGreaterThanOrEqualTo(String value) {
            addCriterion("mce_creat_time_change >=", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeLessThan(String value) {
            addCriterion("mce_creat_time_change <", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeLessThanOrEqualTo(String value) {
            addCriterion("mce_creat_time_change <=", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeLike(String value) {
            addCriterion("mce_creat_time_change like", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeNotLike(String value) {
            addCriterion("mce_creat_time_change not like", value, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeIn(List<String> values) {
            addCriterion("mce_creat_time_change in", values, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeNotIn(List<String> values) {
            addCriterion("mce_creat_time_change not in", values, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeBetween(String value1, String value2) {
            addCriterion("mce_creat_time_change between", value1, value2, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeChangeNotBetween(String value1, String value2) {
            addCriterion("mce_creat_time_change not between", value1, value2, "mceCreatTimeChange");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeIsNull() {
            addCriterion("mce_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeIsNotNull() {
            addCriterion("mce_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeEqualTo(Date value) {
            addCriterion("mce_creat_time =", value, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeNotEqualTo(Date value) {
            addCriterion("mce_creat_time <>", value, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeGreaterThan(Date value) {
            addCriterion("mce_creat_time >", value, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mce_creat_time >=", value, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeLessThan(Date value) {
            addCriterion("mce_creat_time <", value, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("mce_creat_time <=", value, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeIn(List<Date> values) {
            addCriterion("mce_creat_time in", values, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeNotIn(List<Date> values) {
            addCriterion("mce_creat_time not in", values, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeBetween(Date value1, Date value2) {
            addCriterion("mce_creat_time between", value1, value2, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("mce_creat_time not between", value1, value2, "mceCreatTime");
            return (Criteria) this;
        }

        public Criteria andMceMemoIsNull() {
            addCriterion("mce_memo is null");
            return (Criteria) this;
        }

        public Criteria andMceMemoIsNotNull() {
            addCriterion("mce_memo is not null");
            return (Criteria) this;
        }

        public Criteria andMceMemoEqualTo(String value) {
            addCriterion("mce_memo =", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoNotEqualTo(String value) {
            addCriterion("mce_memo <>", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoGreaterThan(String value) {
            addCriterion("mce_memo >", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoGreaterThanOrEqualTo(String value) {
            addCriterion("mce_memo >=", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoLessThan(String value) {
            addCriterion("mce_memo <", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoLessThanOrEqualTo(String value) {
            addCriterion("mce_memo <=", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoLike(String value) {
            addCriterion("mce_memo like", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoNotLike(String value) {
            addCriterion("mce_memo not like", value, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoIn(List<String> values) {
            addCriterion("mce_memo in", values, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoNotIn(List<String> values) {
            addCriterion("mce_memo not in", values, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoBetween(String value1, String value2) {
            addCriterion("mce_memo between", value1, value2, "mceMemo");
            return (Criteria) this;
        }

        public Criteria andMceMemoNotBetween(String value1, String value2) {
            addCriterion("mce_memo not between", value1, value2, "mceMemo");
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