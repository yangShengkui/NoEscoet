package com.slk.wph.module.WPH_AppVersion.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphAppversionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphAppversionExample() {
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

        public Criteria andVersionnumberIsNull() {
            addCriterion("VersionNumber is null");
            return (Criteria) this;
        }

        public Criteria andVersionnumberIsNotNull() {
            addCriterion("VersionNumber is not null");
            return (Criteria) this;
        }

        public Criteria andVersionnumberEqualTo(String value) {
            addCriterion("VersionNumber =", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotEqualTo(String value) {
            addCriterion("VersionNumber <>", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberGreaterThan(String value) {
            addCriterion("VersionNumber >", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberGreaterThanOrEqualTo(String value) {
            addCriterion("VersionNumber >=", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberLessThan(String value) {
            addCriterion("VersionNumber <", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberLessThanOrEqualTo(String value) {
            addCriterion("VersionNumber <=", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberLike(String value) {
            addCriterion("VersionNumber like", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotLike(String value) {
            addCriterion("VersionNumber not like", value, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberIn(List<String> values) {
            addCriterion("VersionNumber in", values, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotIn(List<String> values) {
            addCriterion("VersionNumber not in", values, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberBetween(String value1, String value2) {
            addCriterion("VersionNumber between", value1, value2, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionnumberNotBetween(String value1, String value2) {
            addCriterion("VersionNumber not between", value1, value2, "versionnumber");
            return (Criteria) this;
        }

        public Criteria andVersionurlIsNull() {
            addCriterion("VersionUrl is null");
            return (Criteria) this;
        }

        public Criteria andVersionurlIsNotNull() {
            addCriterion("VersionUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVersionurlEqualTo(String value) {
            addCriterion("VersionUrl =", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlNotEqualTo(String value) {
            addCriterion("VersionUrl <>", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlGreaterThan(String value) {
            addCriterion("VersionUrl >", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlGreaterThanOrEqualTo(String value) {
            addCriterion("VersionUrl >=", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlLessThan(String value) {
            addCriterion("VersionUrl <", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlLessThanOrEqualTo(String value) {
            addCriterion("VersionUrl <=", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlLike(String value) {
            addCriterion("VersionUrl like", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlNotLike(String value) {
            addCriterion("VersionUrl not like", value, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlIn(List<String> values) {
            addCriterion("VersionUrl in", values, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlNotIn(List<String> values) {
            addCriterion("VersionUrl not in", values, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlBetween(String value1, String value2) {
            addCriterion("VersionUrl between", value1, value2, "versionurl");
            return (Criteria) this;
        }

        public Criteria andVersionurlNotBetween(String value1, String value2) {
            addCriterion("VersionUrl not between", value1, value2, "versionurl");
            return (Criteria) this;
        }

        public Criteria andMarkIsNull() {
            addCriterion("mark is null");
            return (Criteria) this;
        }

        public Criteria andMarkIsNotNull() {
            addCriterion("mark is not null");
            return (Criteria) this;
        }

        public Criteria andMarkEqualTo(String value) {
            addCriterion("mark =", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotEqualTo(String value) {
            addCriterion("mark <>", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThan(String value) {
            addCriterion("mark >", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkGreaterThanOrEqualTo(String value) {
            addCriterion("mark >=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThan(String value) {
            addCriterion("mark <", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLessThanOrEqualTo(String value) {
            addCriterion("mark <=", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkLike(String value) {
            addCriterion("mark like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotLike(String value) {
            addCriterion("mark not like", value, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkIn(List<String> values) {
            addCriterion("mark in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotIn(List<String> values) {
            addCriterion("mark not in", values, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkBetween(String value1, String value2) {
            addCriterion("mark between", value1, value2, "mark");
            return (Criteria) this;
        }

        public Criteria andMarkNotBetween(String value1, String value2) {
            addCriterion("mark not between", value1, value2, "mark");
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