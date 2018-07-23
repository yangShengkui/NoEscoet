package com.slk.wph.module.WPH_Mealgroup.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphMealgroupExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphMealgroupExample() {
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

        public Criteria andFidIsNull() {
            addCriterion("fid is null");
            return (Criteria) this;
        }

        public Criteria andFidIsNotNull() {
            addCriterion("fid is not null");
            return (Criteria) this;
        }

        public Criteria andFidEqualTo(Integer value) {
            addCriterion("fid =", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotEqualTo(Integer value) {
            addCriterion("fid <>", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThan(Integer value) {
            addCriterion("fid >", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fid >=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThan(Integer value) {
            addCriterion("fid <", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidLessThanOrEqualTo(Integer value) {
            addCriterion("fid <=", value, "fid");
            return (Criteria) this;
        }

        public Criteria andFidIn(List<Integer> values) {
            addCriterion("fid in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotIn(List<Integer> values) {
            addCriterion("fid not in", values, "fid");
            return (Criteria) this;
        }

        public Criteria andFidBetween(Integer value1, Integer value2) {
            addCriterion("fid between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andFidNotBetween(Integer value1, Integer value2) {
            addCriterion("fid not between", value1, value2, "fid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIsNull() {
            addCriterion("WPH_Ward_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIsNotNull() {
            addCriterion("WPH_Ward_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphWardFidEqualTo(Integer value) {
            addCriterion("WPH_Ward_Fid =", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotEqualTo(Integer value) {
            addCriterion("WPH_Ward_Fid <>", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidGreaterThan(Integer value) {
            addCriterion("WPH_Ward_Fid >", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_Ward_Fid >=", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidLessThan(Integer value) {
            addCriterion("WPH_Ward_Fid <", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_Ward_Fid <=", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIn(List<Integer> values) {
            addCriterion("WPH_Ward_Fid in", values, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotIn(List<Integer> values) {
            addCriterion("WPH_Ward_Fid not in", values, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Ward_Fid between", value1, value2, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Ward_Fid not between", value1, value2, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardNameIsNull() {
            addCriterion("WPH_Ward_Name is null");
            return (Criteria) this;
        }

        public Criteria andWphWardNameIsNotNull() {
            addCriterion("WPH_Ward_Name is not null");
            return (Criteria) this;
        }

        public Criteria andWphWardNameEqualTo(String value) {
            addCriterion("WPH_Ward_Name =", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotEqualTo(String value) {
            addCriterion("WPH_Ward_Name <>", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameGreaterThan(String value) {
            addCriterion("WPH_Ward_Name >", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameGreaterThanOrEqualTo(String value) {
            addCriterion("WPH_Ward_Name >=", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameLessThan(String value) {
            addCriterion("WPH_Ward_Name <", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameLessThanOrEqualTo(String value) {
            addCriterion("WPH_Ward_Name <=", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameLike(String value) {
            addCriterion("WPH_Ward_Name like", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotLike(String value) {
            addCriterion("WPH_Ward_Name not like", value, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameIn(List<String> values) {
            addCriterion("WPH_Ward_Name in", values, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotIn(List<String> values) {
            addCriterion("WPH_Ward_Name not in", values, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameBetween(String value1, String value2) {
            addCriterion("WPH_Ward_Name between", value1, value2, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andWphWardNameNotBetween(String value1, String value2) {
            addCriterion("WPH_Ward_Name not between", value1, value2, "wphWardName");
            return (Criteria) this;
        }

        public Criteria andGroup1IsNull() {
            addCriterion("Group1 is null");
            return (Criteria) this;
        }

        public Criteria andGroup1IsNotNull() {
            addCriterion("Group1 is not null");
            return (Criteria) this;
        }

        public Criteria andGroup1EqualTo(String value) {
            addCriterion("Group1 =", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotEqualTo(String value) {
            addCriterion("Group1 <>", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1GreaterThan(String value) {
            addCriterion("Group1 >", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1GreaterThanOrEqualTo(String value) {
            addCriterion("Group1 >=", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1LessThan(String value) {
            addCriterion("Group1 <", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1LessThanOrEqualTo(String value) {
            addCriterion("Group1 <=", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1Like(String value) {
            addCriterion("Group1 like", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotLike(String value) {
            addCriterion("Group1 not like", value, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1In(List<String> values) {
            addCriterion("Group1 in", values, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotIn(List<String> values) {
            addCriterion("Group1 not in", values, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1Between(String value1, String value2) {
            addCriterion("Group1 between", value1, value2, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup1NotBetween(String value1, String value2) {
            addCriterion("Group1 not between", value1, value2, "group1");
            return (Criteria) this;
        }

        public Criteria andGroup2IsNull() {
            addCriterion("Group2 is null");
            return (Criteria) this;
        }

        public Criteria andGroup2IsNotNull() {
            addCriterion("Group2 is not null");
            return (Criteria) this;
        }

        public Criteria andGroup2EqualTo(String value) {
            addCriterion("Group2 =", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotEqualTo(String value) {
            addCriterion("Group2 <>", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2GreaterThan(String value) {
            addCriterion("Group2 >", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2GreaterThanOrEqualTo(String value) {
            addCriterion("Group2 >=", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2LessThan(String value) {
            addCriterion("Group2 <", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2LessThanOrEqualTo(String value) {
            addCriterion("Group2 <=", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2Like(String value) {
            addCriterion("Group2 like", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotLike(String value) {
            addCriterion("Group2 not like", value, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2In(List<String> values) {
            addCriterion("Group2 in", values, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotIn(List<String> values) {
            addCriterion("Group2 not in", values, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2Between(String value1, String value2) {
            addCriterion("Group2 between", value1, value2, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup2NotBetween(String value1, String value2) {
            addCriterion("Group2 not between", value1, value2, "group2");
            return (Criteria) this;
        }

        public Criteria andGroup3IsNull() {
            addCriterion("Group3 is null");
            return (Criteria) this;
        }

        public Criteria andGroup3IsNotNull() {
            addCriterion("Group3 is not null");
            return (Criteria) this;
        }

        public Criteria andGroup3EqualTo(String value) {
            addCriterion("Group3 =", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3NotEqualTo(String value) {
            addCriterion("Group3 <>", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3GreaterThan(String value) {
            addCriterion("Group3 >", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3GreaterThanOrEqualTo(String value) {
            addCriterion("Group3 >=", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3LessThan(String value) {
            addCriterion("Group3 <", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3LessThanOrEqualTo(String value) {
            addCriterion("Group3 <=", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3Like(String value) {
            addCriterion("Group3 like", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3NotLike(String value) {
            addCriterion("Group3 not like", value, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3In(List<String> values) {
            addCriterion("Group3 in", values, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3NotIn(List<String> values) {
            addCriterion("Group3 not in", values, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3Between(String value1, String value2) {
            addCriterion("Group3 between", value1, value2, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup3NotBetween(String value1, String value2) {
            addCriterion("Group3 not between", value1, value2, "group3");
            return (Criteria) this;
        }

        public Criteria andGroup4IsNull() {
            addCriterion("Group4 is null");
            return (Criteria) this;
        }

        public Criteria andGroup4IsNotNull() {
            addCriterion("Group4 is not null");
            return (Criteria) this;
        }

        public Criteria andGroup4EqualTo(String value) {
            addCriterion("Group4 =", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4NotEqualTo(String value) {
            addCriterion("Group4 <>", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4GreaterThan(String value) {
            addCriterion("Group4 >", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4GreaterThanOrEqualTo(String value) {
            addCriterion("Group4 >=", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4LessThan(String value) {
            addCriterion("Group4 <", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4LessThanOrEqualTo(String value) {
            addCriterion("Group4 <=", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4Like(String value) {
            addCriterion("Group4 like", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4NotLike(String value) {
            addCriterion("Group4 not like", value, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4In(List<String> values) {
            addCriterion("Group4 in", values, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4NotIn(List<String> values) {
            addCriterion("Group4 not in", values, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4Between(String value1, String value2) {
            addCriterion("Group4 between", value1, value2, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup4NotBetween(String value1, String value2) {
            addCriterion("Group4 not between", value1, value2, "group4");
            return (Criteria) this;
        }

        public Criteria andGroup5IsNull() {
            addCriterion("Group5 is null");
            return (Criteria) this;
        }

        public Criteria andGroup5IsNotNull() {
            addCriterion("Group5 is not null");
            return (Criteria) this;
        }

        public Criteria andGroup5EqualTo(String value) {
            addCriterion("Group5 =", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5NotEqualTo(String value) {
            addCriterion("Group5 <>", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5GreaterThan(String value) {
            addCriterion("Group5 >", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5GreaterThanOrEqualTo(String value) {
            addCriterion("Group5 >=", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5LessThan(String value) {
            addCriterion("Group5 <", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5LessThanOrEqualTo(String value) {
            addCriterion("Group5 <=", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5Like(String value) {
            addCriterion("Group5 like", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5NotLike(String value) {
            addCriterion("Group5 not like", value, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5In(List<String> values) {
            addCriterion("Group5 in", values, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5NotIn(List<String> values) {
            addCriterion("Group5 not in", values, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5Between(String value1, String value2) {
            addCriterion("Group5 between", value1, value2, "group5");
            return (Criteria) this;
        }

        public Criteria andGroup5NotBetween(String value1, String value2) {
            addCriterion("Group5 not between", value1, value2, "group5");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNull() {
            addCriterion("CreateDate is null");
            return (Criteria) this;
        }

        public Criteria andCreatedateIsNotNull() {
            addCriterion("CreateDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedateEqualTo(Date value) {
            addCriterion("CreateDate =", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotEqualTo(Date value) {
            addCriterion("CreateDate <>", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThan(Date value) {
            addCriterion("CreateDate >", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateGreaterThanOrEqualTo(Date value) {
            addCriterion("CreateDate >=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThan(Date value) {
            addCriterion("CreateDate <", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateLessThanOrEqualTo(Date value) {
            addCriterion("CreateDate <=", value, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateIn(List<Date> values) {
            addCriterion("CreateDate in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotIn(List<Date> values) {
            addCriterion("CreateDate not in", values, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateBetween(Date value1, Date value2) {
            addCriterion("CreateDate between", value1, value2, "createdate");
            return (Criteria) this;
        }

        public Criteria andCreatedateNotBetween(Date value1, Date value2) {
            addCriterion("CreateDate not between", value1, value2, "createdate");
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