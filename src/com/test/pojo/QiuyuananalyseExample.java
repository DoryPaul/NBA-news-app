package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class QiuyuananalyseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QiuyuananalyseExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andScoreIsNull() {
            addCriterion("score is null");
            return (Criteria) this;
        }

        public Criteria andScoreIsNotNull() {
            addCriterion("score is not null");
            return (Criteria) this;
        }

        public Criteria andScoreEqualTo(Double value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(Double value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(Double value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(Double value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(Double value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<Double> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<Double> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(Double value1, Double value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(Double value1, Double value2) {
            addCriterion("score not between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andAssistIsNull() {
            addCriterion("assist is null");
            return (Criteria) this;
        }

        public Criteria andAssistIsNotNull() {
            addCriterion("assist is not null");
            return (Criteria) this;
        }

        public Criteria andAssistEqualTo(Double value) {
            addCriterion("assist =", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotEqualTo(Double value) {
            addCriterion("assist <>", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistGreaterThan(Double value) {
            addCriterion("assist >", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistGreaterThanOrEqualTo(Double value) {
            addCriterion("assist >=", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistLessThan(Double value) {
            addCriterion("assist <", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistLessThanOrEqualTo(Double value) {
            addCriterion("assist <=", value, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistIn(List<Double> values) {
            addCriterion("assist in", values, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotIn(List<Double> values) {
            addCriterion("assist not in", values, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistBetween(Double value1, Double value2) {
            addCriterion("assist between", value1, value2, "assist");
            return (Criteria) this;
        }

        public Criteria andAssistNotBetween(Double value1, Double value2) {
            addCriterion("assist not between", value1, value2, "assist");
            return (Criteria) this;
        }

        public Criteria andBlockIsNull() {
            addCriterion("block is null");
            return (Criteria) this;
        }

        public Criteria andBlockIsNotNull() {
            addCriterion("block is not null");
            return (Criteria) this;
        }

        public Criteria andBlockEqualTo(Double value) {
            addCriterion("block =", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotEqualTo(Double value) {
            addCriterion("block <>", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThan(Double value) {
            addCriterion("block >", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockGreaterThanOrEqualTo(Double value) {
            addCriterion("block >=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThan(Double value) {
            addCriterion("block <", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockLessThanOrEqualTo(Double value) {
            addCriterion("block <=", value, "block");
            return (Criteria) this;
        }

        public Criteria andBlockIn(List<Double> values) {
            addCriterion("block in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotIn(List<Double> values) {
            addCriterion("block not in", values, "block");
            return (Criteria) this;
        }

        public Criteria andBlockBetween(Double value1, Double value2) {
            addCriterion("block between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andBlockNotBetween(Double value1, Double value2) {
            addCriterion("block not between", value1, value2, "block");
            return (Criteria) this;
        }

        public Criteria andReboundIsNull() {
            addCriterion("rebound is null");
            return (Criteria) this;
        }

        public Criteria andReboundIsNotNull() {
            addCriterion("rebound is not null");
            return (Criteria) this;
        }

        public Criteria andReboundEqualTo(Double value) {
            addCriterion("rebound =", value, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundNotEqualTo(Double value) {
            addCriterion("rebound <>", value, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundGreaterThan(Double value) {
            addCriterion("rebound >", value, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundGreaterThanOrEqualTo(Double value) {
            addCriterion("rebound >=", value, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundLessThan(Double value) {
            addCriterion("rebound <", value, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundLessThanOrEqualTo(Double value) {
            addCriterion("rebound <=", value, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundIn(List<Double> values) {
            addCriterion("rebound in", values, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundNotIn(List<Double> values) {
            addCriterion("rebound not in", values, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundBetween(Double value1, Double value2) {
            addCriterion("rebound between", value1, value2, "rebound");
            return (Criteria) this;
        }

        public Criteria andReboundNotBetween(Double value1, Double value2) {
            addCriterion("rebound not between", value1, value2, "rebound");
            return (Criteria) this;
        }

        public Criteria andStealIsNull() {
            addCriterion("steal is null");
            return (Criteria) this;
        }

        public Criteria andStealIsNotNull() {
            addCriterion("steal is not null");
            return (Criteria) this;
        }

        public Criteria andStealEqualTo(Double value) {
            addCriterion("steal =", value, "steal");
            return (Criteria) this;
        }

        public Criteria andStealNotEqualTo(Double value) {
            addCriterion("steal <>", value, "steal");
            return (Criteria) this;
        }

        public Criteria andStealGreaterThan(Double value) {
            addCriterion("steal >", value, "steal");
            return (Criteria) this;
        }

        public Criteria andStealGreaterThanOrEqualTo(Double value) {
            addCriterion("steal >=", value, "steal");
            return (Criteria) this;
        }

        public Criteria andStealLessThan(Double value) {
            addCriterion("steal <", value, "steal");
            return (Criteria) this;
        }

        public Criteria andStealLessThanOrEqualTo(Double value) {
            addCriterion("steal <=", value, "steal");
            return (Criteria) this;
        }

        public Criteria andStealIn(List<Double> values) {
            addCriterion("steal in", values, "steal");
            return (Criteria) this;
        }

        public Criteria andStealNotIn(List<Double> values) {
            addCriterion("steal not in", values, "steal");
            return (Criteria) this;
        }

        public Criteria andStealBetween(Double value1, Double value2) {
            addCriterion("steal between", value1, value2, "steal");
            return (Criteria) this;
        }

        public Criteria andStealNotBetween(Double value1, Double value2) {
            addCriterion("steal not between", value1, value2, "steal");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidIsNull() {
            addCriterion("qiuyuanid is null");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidIsNotNull() {
            addCriterion("qiuyuanid is not null");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidEqualTo(Integer value) {
            addCriterion("qiuyuanid =", value, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidNotEqualTo(Integer value) {
            addCriterion("qiuyuanid <>", value, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidGreaterThan(Integer value) {
            addCriterion("qiuyuanid >", value, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("qiuyuanid >=", value, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidLessThan(Integer value) {
            addCriterion("qiuyuanid <", value, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidLessThanOrEqualTo(Integer value) {
            addCriterion("qiuyuanid <=", value, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidIn(List<Integer> values) {
            addCriterion("qiuyuanid in", values, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidNotIn(List<Integer> values) {
            addCriterion("qiuyuanid not in", values, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidBetween(Integer value1, Integer value2) {
            addCriterion("qiuyuanid between", value1, value2, "qiuyuanid");
            return (Criteria) this;
        }

        public Criteria andQiuyuanidNotBetween(Integer value1, Integer value2) {
            addCriterion("qiuyuanid not between", value1, value2, "qiuyuanid");
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