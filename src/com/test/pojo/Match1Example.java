package com.test.pojo;

import java.util.ArrayList;
import java.util.List;

public class Match1Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Match1Example() {
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

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andPlayer1IsNull() {
            addCriterion("player1 is null");
            return (Criteria) this;
        }

        public Criteria andPlayer1IsNotNull() {
            addCriterion("player1 is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer1EqualTo(String value) {
            addCriterion("player1 =", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1NotEqualTo(String value) {
            addCriterion("player1 <>", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1GreaterThan(String value) {
            addCriterion("player1 >", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1GreaterThanOrEqualTo(String value) {
            addCriterion("player1 >=", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1LessThan(String value) {
            addCriterion("player1 <", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1LessThanOrEqualTo(String value) {
            addCriterion("player1 <=", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1Like(String value) {
            addCriterion("player1 like", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1NotLike(String value) {
            addCriterion("player1 not like", value, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1In(List<String> values) {
            addCriterion("player1 in", values, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1NotIn(List<String> values) {
            addCriterion("player1 not in", values, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1Between(String value1, String value2) {
            addCriterion("player1 between", value1, value2, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer1NotBetween(String value1, String value2) {
            addCriterion("player1 not between", value1, value2, "player1");
            return (Criteria) this;
        }

        public Criteria andPlayer2IsNull() {
            addCriterion("player2 is null");
            return (Criteria) this;
        }

        public Criteria andPlayer2IsNotNull() {
            addCriterion("player2 is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer2EqualTo(String value) {
            addCriterion("player2 =", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2NotEqualTo(String value) {
            addCriterion("player2 <>", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2GreaterThan(String value) {
            addCriterion("player2 >", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2GreaterThanOrEqualTo(String value) {
            addCriterion("player2 >=", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2LessThan(String value) {
            addCriterion("player2 <", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2LessThanOrEqualTo(String value) {
            addCriterion("player2 <=", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2Like(String value) {
            addCriterion("player2 like", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2NotLike(String value) {
            addCriterion("player2 not like", value, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2In(List<String> values) {
            addCriterion("player2 in", values, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2NotIn(List<String> values) {
            addCriterion("player2 not in", values, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2Between(String value1, String value2) {
            addCriterion("player2 between", value1, value2, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer2NotBetween(String value1, String value2) {
            addCriterion("player2 not between", value1, value2, "player2");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoIsNull() {
            addCriterion("player1logo is null");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoIsNotNull() {
            addCriterion("player1logo is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoEqualTo(String value) {
            addCriterion("player1logo =", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoNotEqualTo(String value) {
            addCriterion("player1logo <>", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoGreaterThan(String value) {
            addCriterion("player1logo >", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoGreaterThanOrEqualTo(String value) {
            addCriterion("player1logo >=", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoLessThan(String value) {
            addCriterion("player1logo <", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoLessThanOrEqualTo(String value) {
            addCriterion("player1logo <=", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoLike(String value) {
            addCriterion("player1logo like", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoNotLike(String value) {
            addCriterion("player1logo not like", value, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoIn(List<String> values) {
            addCriterion("player1logo in", values, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoNotIn(List<String> values) {
            addCriterion("player1logo not in", values, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoBetween(String value1, String value2) {
            addCriterion("player1logo between", value1, value2, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logoNotBetween(String value1, String value2) {
            addCriterion("player1logo not between", value1, value2, "player1logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoIsNull() {
            addCriterion("player2logo is null");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoIsNotNull() {
            addCriterion("player2logo is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoEqualTo(String value) {
            addCriterion("player2logo =", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoNotEqualTo(String value) {
            addCriterion("player2logo <>", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoGreaterThan(String value) {
            addCriterion("player2logo >", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoGreaterThanOrEqualTo(String value) {
            addCriterion("player2logo >=", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoLessThan(String value) {
            addCriterion("player2logo <", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoLessThanOrEqualTo(String value) {
            addCriterion("player2logo <=", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoLike(String value) {
            addCriterion("player2logo like", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoNotLike(String value) {
            addCriterion("player2logo not like", value, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoIn(List<String> values) {
            addCriterion("player2logo in", values, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoNotIn(List<String> values) {
            addCriterion("player2logo not in", values, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoBetween(String value1, String value2) {
            addCriterion("player2logo between", value1, value2, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer2logoNotBetween(String value1, String value2) {
            addCriterion("player2logo not between", value1, value2, "player2logo");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigIsNull() {
            addCriterion("player1logobig is null");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigIsNotNull() {
            addCriterion("player1logobig is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigEqualTo(String value) {
            addCriterion("player1logobig =", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigNotEqualTo(String value) {
            addCriterion("player1logobig <>", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigGreaterThan(String value) {
            addCriterion("player1logobig >", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigGreaterThanOrEqualTo(String value) {
            addCriterion("player1logobig >=", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigLessThan(String value) {
            addCriterion("player1logobig <", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigLessThanOrEqualTo(String value) {
            addCriterion("player1logobig <=", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigLike(String value) {
            addCriterion("player1logobig like", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigNotLike(String value) {
            addCriterion("player1logobig not like", value, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigIn(List<String> values) {
            addCriterion("player1logobig in", values, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigNotIn(List<String> values) {
            addCriterion("player1logobig not in", values, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigBetween(String value1, String value2) {
            addCriterion("player1logobig between", value1, value2, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1logobigNotBetween(String value1, String value2) {
            addCriterion("player1logobig not between", value1, value2, "player1logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigIsNull() {
            addCriterion("player2logobig is null");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigIsNotNull() {
            addCriterion("player2logobig is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigEqualTo(String value) {
            addCriterion("player2logobig =", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigNotEqualTo(String value) {
            addCriterion("player2logobig <>", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigGreaterThan(String value) {
            addCriterion("player2logobig >", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigGreaterThanOrEqualTo(String value) {
            addCriterion("player2logobig >=", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigLessThan(String value) {
            addCriterion("player2logobig <", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigLessThanOrEqualTo(String value) {
            addCriterion("player2logobig <=", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigLike(String value) {
            addCriterion("player2logobig like", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigNotLike(String value) {
            addCriterion("player2logobig not like", value, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigIn(List<String> values) {
            addCriterion("player2logobig in", values, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigNotIn(List<String> values) {
            addCriterion("player2logobig not in", values, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigBetween(String value1, String value2) {
            addCriterion("player2logobig between", value1, value2, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer2logobigNotBetween(String value1, String value2) {
            addCriterion("player2logobig not between", value1, value2, "player2logobig");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlIsNull() {
            addCriterion("player1url is null");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlIsNotNull() {
            addCriterion("player1url is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlEqualTo(String value) {
            addCriterion("player1url =", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlNotEqualTo(String value) {
            addCriterion("player1url <>", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlGreaterThan(String value) {
            addCriterion("player1url >", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlGreaterThanOrEqualTo(String value) {
            addCriterion("player1url >=", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlLessThan(String value) {
            addCriterion("player1url <", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlLessThanOrEqualTo(String value) {
            addCriterion("player1url <=", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlLike(String value) {
            addCriterion("player1url like", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlNotLike(String value) {
            addCriterion("player1url not like", value, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlIn(List<String> values) {
            addCriterion("player1url in", values, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlNotIn(List<String> values) {
            addCriterion("player1url not in", values, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlBetween(String value1, String value2) {
            addCriterion("player1url between", value1, value2, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer1urlNotBetween(String value1, String value2) {
            addCriterion("player1url not between", value1, value2, "player1url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlIsNull() {
            addCriterion("player2url is null");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlIsNotNull() {
            addCriterion("player2url is not null");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlEqualTo(String value) {
            addCriterion("player2url =", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlNotEqualTo(String value) {
            addCriterion("player2url <>", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlGreaterThan(String value) {
            addCriterion("player2url >", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlGreaterThanOrEqualTo(String value) {
            addCriterion("player2url >=", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlLessThan(String value) {
            addCriterion("player2url <", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlLessThanOrEqualTo(String value) {
            addCriterion("player2url <=", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlLike(String value) {
            addCriterion("player2url like", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlNotLike(String value) {
            addCriterion("player2url not like", value, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlIn(List<String> values) {
            addCriterion("player2url in", values, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlNotIn(List<String> values) {
            addCriterion("player2url not in", values, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlBetween(String value1, String value2) {
            addCriterion("player2url between", value1, value2, "player2url");
            return (Criteria) this;
        }

        public Criteria andPlayer2urlNotBetween(String value1, String value2) {
            addCriterion("player2url not between", value1, value2, "player2url");
            return (Criteria) this;
        }

        public Criteria andLink1textIsNull() {
            addCriterion("link1text is null");
            return (Criteria) this;
        }

        public Criteria andLink1textIsNotNull() {
            addCriterion("link1text is not null");
            return (Criteria) this;
        }

        public Criteria andLink1textEqualTo(String value) {
            addCriterion("link1text =", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textNotEqualTo(String value) {
            addCriterion("link1text <>", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textGreaterThan(String value) {
            addCriterion("link1text >", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textGreaterThanOrEqualTo(String value) {
            addCriterion("link1text >=", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textLessThan(String value) {
            addCriterion("link1text <", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textLessThanOrEqualTo(String value) {
            addCriterion("link1text <=", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textLike(String value) {
            addCriterion("link1text like", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textNotLike(String value) {
            addCriterion("link1text not like", value, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textIn(List<String> values) {
            addCriterion("link1text in", values, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textNotIn(List<String> values) {
            addCriterion("link1text not in", values, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textBetween(String value1, String value2) {
            addCriterion("link1text between", value1, value2, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1textNotBetween(String value1, String value2) {
            addCriterion("link1text not between", value1, value2, "link1text");
            return (Criteria) this;
        }

        public Criteria andLink1urlIsNull() {
            addCriterion("link1url is null");
            return (Criteria) this;
        }

        public Criteria andLink1urlIsNotNull() {
            addCriterion("link1url is not null");
            return (Criteria) this;
        }

        public Criteria andLink1urlEqualTo(String value) {
            addCriterion("link1url =", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlNotEqualTo(String value) {
            addCriterion("link1url <>", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlGreaterThan(String value) {
            addCriterion("link1url >", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlGreaterThanOrEqualTo(String value) {
            addCriterion("link1url >=", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlLessThan(String value) {
            addCriterion("link1url <", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlLessThanOrEqualTo(String value) {
            addCriterion("link1url <=", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlLike(String value) {
            addCriterion("link1url like", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlNotLike(String value) {
            addCriterion("link1url not like", value, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlIn(List<String> values) {
            addCriterion("link1url in", values, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlNotIn(List<String> values) {
            addCriterion("link1url not in", values, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlBetween(String value1, String value2) {
            addCriterion("link1url between", value1, value2, "link1url");
            return (Criteria) this;
        }

        public Criteria andLink1urlNotBetween(String value1, String value2) {
            addCriterion("link1url not between", value1, value2, "link1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlIsNull() {
            addCriterion("m_link1url is null");
            return (Criteria) this;
        }

        public Criteria andMLink1urlIsNotNull() {
            addCriterion("m_link1url is not null");
            return (Criteria) this;
        }

        public Criteria andMLink1urlEqualTo(String value) {
            addCriterion("m_link1url =", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlNotEqualTo(String value) {
            addCriterion("m_link1url <>", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlGreaterThan(String value) {
            addCriterion("m_link1url >", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlGreaterThanOrEqualTo(String value) {
            addCriterion("m_link1url >=", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlLessThan(String value) {
            addCriterion("m_link1url <", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlLessThanOrEqualTo(String value) {
            addCriterion("m_link1url <=", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlLike(String value) {
            addCriterion("m_link1url like", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlNotLike(String value) {
            addCriterion("m_link1url not like", value, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlIn(List<String> values) {
            addCriterion("m_link1url in", values, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlNotIn(List<String> values) {
            addCriterion("m_link1url not in", values, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlBetween(String value1, String value2) {
            addCriterion("m_link1url between", value1, value2, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andMLink1urlNotBetween(String value1, String value2) {
            addCriterion("m_link1url not between", value1, value2, "mLink1url");
            return (Criteria) this;
        }

        public Criteria andLink2textIsNull() {
            addCriterion("link2text is null");
            return (Criteria) this;
        }

        public Criteria andLink2textIsNotNull() {
            addCriterion("link2text is not null");
            return (Criteria) this;
        }

        public Criteria andLink2textEqualTo(String value) {
            addCriterion("link2text =", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textNotEqualTo(String value) {
            addCriterion("link2text <>", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textGreaterThan(String value) {
            addCriterion("link2text >", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textGreaterThanOrEqualTo(String value) {
            addCriterion("link2text >=", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textLessThan(String value) {
            addCriterion("link2text <", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textLessThanOrEqualTo(String value) {
            addCriterion("link2text <=", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textLike(String value) {
            addCriterion("link2text like", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textNotLike(String value) {
            addCriterion("link2text not like", value, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textIn(List<String> values) {
            addCriterion("link2text in", values, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textNotIn(List<String> values) {
            addCriterion("link2text not in", values, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textBetween(String value1, String value2) {
            addCriterion("link2text between", value1, value2, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2textNotBetween(String value1, String value2) {
            addCriterion("link2text not between", value1, value2, "link2text");
            return (Criteria) this;
        }

        public Criteria andLink2urlIsNull() {
            addCriterion("link2url is null");
            return (Criteria) this;
        }

        public Criteria andLink2urlIsNotNull() {
            addCriterion("link2url is not null");
            return (Criteria) this;
        }

        public Criteria andLink2urlEqualTo(String value) {
            addCriterion("link2url =", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlNotEqualTo(String value) {
            addCriterion("link2url <>", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlGreaterThan(String value) {
            addCriterion("link2url >", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlGreaterThanOrEqualTo(String value) {
            addCriterion("link2url >=", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlLessThan(String value) {
            addCriterion("link2url <", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlLessThanOrEqualTo(String value) {
            addCriterion("link2url <=", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlLike(String value) {
            addCriterion("link2url like", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlNotLike(String value) {
            addCriterion("link2url not like", value, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlIn(List<String> values) {
            addCriterion("link2url in", values, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlNotIn(List<String> values) {
            addCriterion("link2url not in", values, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlBetween(String value1, String value2) {
            addCriterion("link2url between", value1, value2, "link2url");
            return (Criteria) this;
        }

        public Criteria andLink2urlNotBetween(String value1, String value2) {
            addCriterion("link2url not between", value1, value2, "link2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlIsNull() {
            addCriterion("m_link2url is null");
            return (Criteria) this;
        }

        public Criteria andMLink2urlIsNotNull() {
            addCriterion("m_link2url is not null");
            return (Criteria) this;
        }

        public Criteria andMLink2urlEqualTo(String value) {
            addCriterion("m_link2url =", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlNotEqualTo(String value) {
            addCriterion("m_link2url <>", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlGreaterThan(String value) {
            addCriterion("m_link2url >", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlGreaterThanOrEqualTo(String value) {
            addCriterion("m_link2url >=", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlLessThan(String value) {
            addCriterion("m_link2url <", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlLessThanOrEqualTo(String value) {
            addCriterion("m_link2url <=", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlLike(String value) {
            addCriterion("m_link2url like", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlNotLike(String value) {
            addCriterion("m_link2url not like", value, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlIn(List<String> values) {
            addCriterion("m_link2url in", values, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlNotIn(List<String> values) {
            addCriterion("m_link2url not in", values, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlBetween(String value1, String value2) {
            addCriterion("m_link2url between", value1, value2, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andMLink2urlNotBetween(String value1, String value2) {
            addCriterion("m_link2url not between", value1, value2, "mLink2url");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andScoreEqualTo(String value) {
            addCriterion("score =", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotEqualTo(String value) {
            addCriterion("score <>", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThan(String value) {
            addCriterion("score >", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreGreaterThanOrEqualTo(String value) {
            addCriterion("score >=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThan(String value) {
            addCriterion("score <", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLessThanOrEqualTo(String value) {
            addCriterion("score <=", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreLike(String value) {
            addCriterion("score like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotLike(String value) {
            addCriterion("score not like", value, "score");
            return (Criteria) this;
        }

        public Criteria andScoreIn(List<String> values) {
            addCriterion("score in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotIn(List<String> values) {
            addCriterion("score not in", values, "score");
            return (Criteria) this;
        }

        public Criteria andScoreBetween(String value1, String value2) {
            addCriterion("score between", value1, value2, "score");
            return (Criteria) this;
        }

        public Criteria andScoreNotBetween(String value1, String value2) {
            addCriterion("score not between", value1, value2, "score");
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