package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class MatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MatchExample() {
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

        public Criteria andMatchidIsNull() {
            addCriterion("matchid is null");
            return (Criteria) this;
        }

        public Criteria andMatchidIsNotNull() {
            addCriterion("matchid is not null");
            return (Criteria) this;
        }

        public Criteria andMatchidEqualTo(Integer value) {
            addCriterion("matchid =", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidNotEqualTo(Integer value) {
            addCriterion("matchid <>", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidGreaterThan(Integer value) {
            addCriterion("matchid >", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidGreaterThanOrEqualTo(Integer value) {
            addCriterion("matchid >=", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidLessThan(Integer value) {
            addCriterion("matchid <", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidLessThanOrEqualTo(Integer value) {
            addCriterion("matchid <=", value, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidIn(List<Integer> values) {
            addCriterion("matchid in", values, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidNotIn(List<Integer> values) {
            addCriterion("matchid not in", values, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidBetween(Integer value1, Integer value2) {
            addCriterion("matchid between", value1, value2, "matchid");
            return (Criteria) this;
        }

        public Criteria andMatchidNotBetween(Integer value1, Integer value2) {
            addCriterion("matchid not between", value1, value2, "matchid");
            return (Criteria) this;
        }

        public Criteria andTeam1IsNull() {
            addCriterion("team1 is null");
            return (Criteria) this;
        }

        public Criteria andTeam1IsNotNull() {
            addCriterion("team1 is not null");
            return (Criteria) this;
        }

        public Criteria andTeam1EqualTo(String value) {
            addCriterion("team1 =", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1NotEqualTo(String value) {
            addCriterion("team1 <>", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1GreaterThan(String value) {
            addCriterion("team1 >", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1GreaterThanOrEqualTo(String value) {
            addCriterion("team1 >=", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1LessThan(String value) {
            addCriterion("team1 <", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1LessThanOrEqualTo(String value) {
            addCriterion("team1 <=", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1Like(String value) {
            addCriterion("team1 like", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1NotLike(String value) {
            addCriterion("team1 not like", value, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1In(List<String> values) {
            addCriterion("team1 in", values, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1NotIn(List<String> values) {
            addCriterion("team1 not in", values, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1Between(String value1, String value2) {
            addCriterion("team1 between", value1, value2, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam1NotBetween(String value1, String value2) {
            addCriterion("team1 not between", value1, value2, "team1");
            return (Criteria) this;
        }

        public Criteria andTeam2IsNull() {
            addCriterion("team2 is null");
            return (Criteria) this;
        }

        public Criteria andTeam2IsNotNull() {
            addCriterion("team2 is not null");
            return (Criteria) this;
        }

        public Criteria andTeam2EqualTo(String value) {
            addCriterion("team2 =", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotEqualTo(String value) {
            addCriterion("team2 <>", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2GreaterThan(String value) {
            addCriterion("team2 >", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2GreaterThanOrEqualTo(String value) {
            addCriterion("team2 >=", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2LessThan(String value) {
            addCriterion("team2 <", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2LessThanOrEqualTo(String value) {
            addCriterion("team2 <=", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2Like(String value) {
            addCriterion("team2 like", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotLike(String value) {
            addCriterion("team2 not like", value, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2In(List<String> values) {
            addCriterion("team2 in", values, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotIn(List<String> values) {
            addCriterion("team2 not in", values, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2Between(String value1, String value2) {
            addCriterion("team2 between", value1, value2, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam2NotBetween(String value1, String value2) {
            addCriterion("team2 not between", value1, value2, "team2");
            return (Criteria) this;
        }

        public Criteria andTeam1supportIsNull() {
            addCriterion("team1support is null");
            return (Criteria) this;
        }

        public Criteria andTeam1supportIsNotNull() {
            addCriterion("team1support is not null");
            return (Criteria) this;
        }

        public Criteria andTeam1supportEqualTo(Integer value) {
            addCriterion("team1support =", value, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportNotEqualTo(Integer value) {
            addCriterion("team1support <>", value, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportGreaterThan(Integer value) {
            addCriterion("team1support >", value, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportGreaterThanOrEqualTo(Integer value) {
            addCriterion("team1support >=", value, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportLessThan(Integer value) {
            addCriterion("team1support <", value, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportLessThanOrEqualTo(Integer value) {
            addCriterion("team1support <=", value, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportIn(List<Integer> values) {
            addCriterion("team1support in", values, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportNotIn(List<Integer> values) {
            addCriterion("team1support not in", values, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportBetween(Integer value1, Integer value2) {
            addCriterion("team1support between", value1, value2, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam1supportNotBetween(Integer value1, Integer value2) {
            addCriterion("team1support not between", value1, value2, "team1support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportIsNull() {
            addCriterion("team2support is null");
            return (Criteria) this;
        }

        public Criteria andTeam2supportIsNotNull() {
            addCriterion("team2support is not null");
            return (Criteria) this;
        }

        public Criteria andTeam2supportEqualTo(Integer value) {
            addCriterion("team2support =", value, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportNotEqualTo(Integer value) {
            addCriterion("team2support <>", value, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportGreaterThan(Integer value) {
            addCriterion("team2support >", value, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportGreaterThanOrEqualTo(Integer value) {
            addCriterion("team2support >=", value, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportLessThan(Integer value) {
            addCriterion("team2support <", value, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportLessThanOrEqualTo(Integer value) {
            addCriterion("team2support <=", value, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportIn(List<Integer> values) {
            addCriterion("team2support in", values, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportNotIn(List<Integer> values) {
            addCriterion("team2support not in", values, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportBetween(Integer value1, Integer value2) {
            addCriterion("team2support between", value1, value2, "team2support");
            return (Criteria) this;
        }

        public Criteria andTeam2supportNotBetween(Integer value1, Integer value2) {
            addCriterion("team2support not between", value1, value2, "team2support");
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