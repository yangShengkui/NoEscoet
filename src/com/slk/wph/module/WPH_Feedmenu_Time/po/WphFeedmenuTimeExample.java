package com.slk.wph.module.WPH_Feedmenu_Time.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphFeedmenuTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphFeedmenuTimeExample() {
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

        public Criteria andWphFeedmenuFidIsNull() {
            addCriterion("wph_feedMenu_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidIsNotNull() {
            addCriterion("wph_feedMenu_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidEqualTo(Integer value) {
            addCriterion("wph_feedMenu_Fid =", value, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidNotEqualTo(Integer value) {
            addCriterion("wph_feedMenu_Fid <>", value, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidGreaterThan(Integer value) {
            addCriterion("wph_feedMenu_Fid >", value, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_feedMenu_Fid >=", value, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidLessThan(Integer value) {
            addCriterion("wph_feedMenu_Fid <", value, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidLessThanOrEqualTo(Integer value) {
            addCriterion("wph_feedMenu_Fid <=", value, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidIn(List<Integer> values) {
            addCriterion("wph_feedMenu_Fid in", values, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidNotIn(List<Integer> values) {
            addCriterion("wph_feedMenu_Fid not in", values, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedMenu_Fid between", value1, value2, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedmenuFidNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedMenu_Fid not between", value1, value2, "wphFeedmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidIsNull() {
            addCriterion("wph_feedType_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidIsNotNull() {
            addCriterion("wph_feedType_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid =", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidNotEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid <>", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidGreaterThan(Integer value) {
            addCriterion("wph_feedType_Fid >", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid >=", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidLessThan(Integer value) {
            addCriterion("wph_feedType_Fid <", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidLessThanOrEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid <=", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidIn(List<Integer> values) {
            addCriterion("wph_feedType_Fid in", values, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidNotIn(List<Integer> values) {
            addCriterion("wph_feedType_Fid not in", values, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedType_Fid between", value1, value2, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedType_Fid not between", value1, value2, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeIsNull() {
            addCriterion("wph_feedTime is null");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeIsNotNull() {
            addCriterion("wph_feedTime is not null");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeEqualTo(Integer value) {
            addCriterion("wph_feedTime =", value, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeNotEqualTo(Integer value) {
            addCriterion("wph_feedTime <>", value, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeGreaterThan(Integer value) {
            addCriterion("wph_feedTime >", value, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_feedTime >=", value, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeLessThan(Integer value) {
            addCriterion("wph_feedTime <", value, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeLessThanOrEqualTo(Integer value) {
            addCriterion("wph_feedTime <=", value, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeIn(List<Integer> values) {
            addCriterion("wph_feedTime in", values, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeNotIn(List<Integer> values) {
            addCriterion("wph_feedTime not in", values, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedTime between", value1, value2, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedTime not between", value1, value2, "wphFeedtime");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekIsNull() {
            addCriterion("wph_feedWeek is null");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekIsNotNull() {
            addCriterion("wph_feedWeek is not null");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekEqualTo(Integer value) {
            addCriterion("wph_feedWeek =", value, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekNotEqualTo(Integer value) {
            addCriterion("wph_feedWeek <>", value, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekGreaterThan(Integer value) {
            addCriterion("wph_feedWeek >", value, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_feedWeek >=", value, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekLessThan(Integer value) {
            addCriterion("wph_feedWeek <", value, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekLessThanOrEqualTo(Integer value) {
            addCriterion("wph_feedWeek <=", value, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekIn(List<Integer> values) {
            addCriterion("wph_feedWeek in", values, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekNotIn(List<Integer> values) {
            addCriterion("wph_feedWeek not in", values, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedWeek between", value1, value2, "wphFeedweek");
            return (Criteria) this;
        }

        public Criteria andWphFeedweekNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedWeek not between", value1, value2, "wphFeedweek");
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