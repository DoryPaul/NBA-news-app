package com.test.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Newinfo1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Newinfo1Example() {
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

        public Criteria andNewsidIsNull() {
            addCriterion("newsid is null");
            return (Criteria) this;
        }

        public Criteria andNewsidIsNotNull() {
            addCriterion("newsid is not null");
            return (Criteria) this;
        }

        public Criteria andNewsidEqualTo(Integer value) {
            addCriterion("newsid =", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotEqualTo(Integer value) {
            addCriterion("newsid <>", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThan(Integer value) {
            addCriterion("newsid >", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("newsid >=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThan(Integer value) {
            addCriterion("newsid <", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidLessThanOrEqualTo(Integer value) {
            addCriterion("newsid <=", value, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidIn(List<Integer> values) {
            addCriterion("newsid in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotIn(List<Integer> values) {
            addCriterion("newsid not in", values, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidBetween(Integer value1, Integer value2) {
            addCriterion("newsid between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewsidNotBetween(Integer value1, Integer value2) {
            addCriterion("newsid not between", value1, value2, "newsid");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNull() {
            addCriterion("newstime is null");
            return (Criteria) this;
        }

        public Criteria andNewstimeIsNotNull() {
            addCriterion("newstime is not null");
            return (Criteria) this;
        }

        public Criteria andNewstimeEqualTo(Date value) {
            addCriterion("newstime =", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotEqualTo(Date value) {
            addCriterion("newstime <>", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThan(Date value) {
            addCriterion("newstime >", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("newstime >=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThan(Date value) {
            addCriterion("newstime <", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeLessThanOrEqualTo(Date value) {
            addCriterion("newstime <=", value, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeIn(List<Date> values) {
            addCriterion("newstime in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotIn(List<Date> values) {
            addCriterion("newstime not in", values, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeBetween(Date value1, Date value2) {
            addCriterion("newstime between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andNewstimeNotBetween(Date value1, Date value2) {
            addCriterion("newstime not between", value1, value2, "newstime");
            return (Criteria) this;
        }

        public Criteria andQiuduiidIsNull() {
            addCriterion("qiuduiid is null");
            return (Criteria) this;
        }

        public Criteria andQiuduiidIsNotNull() {
            addCriterion("qiuduiid is not null");
            return (Criteria) this;
        }

        public Criteria andQiuduiidEqualTo(Integer value) {
            addCriterion("qiuduiid =", value, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidNotEqualTo(Integer value) {
            addCriterion("qiuduiid <>", value, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidGreaterThan(Integer value) {
            addCriterion("qiuduiid >", value, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qiuduiid >=", value, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidLessThan(Integer value) {
            addCriterion("qiuduiid <", value, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidLessThanOrEqualTo(Integer value) {
            addCriterion("qiuduiid <=", value, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidIn(List<Integer> values) {
            addCriterion("qiuduiid in", values, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidNotIn(List<Integer> values) {
            addCriterion("qiuduiid not in", values, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidBetween(Integer value1, Integer value2) {
            addCriterion("qiuduiid between", value1, value2, "qiuduiid");
            return (Criteria) this;
        }

        public Criteria andQiuduiidNotBetween(Integer value1, Integer value2) {
            addCriterion("qiuduiid not between", value1, value2, "qiuduiid");
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