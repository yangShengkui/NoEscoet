package com.slk.wph.module.WPH_Mealmenu_Time.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphMealmenuTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphMealmenuTimeExample() {
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

        public Criteria andWphMealmenuFidIsNull() {
            addCriterion("WPH_MealMenu_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidIsNotNull() {
            addCriterion("WPH_MealMenu_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidEqualTo(Integer value) {
            addCriterion("WPH_MealMenu_Fid =", value, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidNotEqualTo(Integer value) {
            addCriterion("WPH_MealMenu_Fid <>", value, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidGreaterThan(Integer value) {
            addCriterion("WPH_MealMenu_Fid >", value, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealMenu_Fid >=", value, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidLessThan(Integer value) {
            addCriterion("WPH_MealMenu_Fid <", value, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealMenu_Fid <=", value, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidIn(List<Integer> values) {
            addCriterion("WPH_MealMenu_Fid in", values, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidNotIn(List<Integer> values) {
            addCriterion("WPH_MealMenu_Fid not in", values, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealMenu_Fid between", value1, value2, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealmenuFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealMenu_Fid not between", value1, value2, "wphMealmenuFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidIsNull() {
            addCriterion("WPH_MealType_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidIsNotNull() {
            addCriterion("WPH_MealType_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidEqualTo(Integer value) {
            addCriterion("WPH_MealType_Fid =", value, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidNotEqualTo(Integer value) {
            addCriterion("WPH_MealType_Fid <>", value, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidGreaterThan(Integer value) {
            addCriterion("WPH_MealType_Fid >", value, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealType_Fid >=", value, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidLessThan(Integer value) {
            addCriterion("WPH_MealType_Fid <", value, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealType_Fid <=", value, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidIn(List<Integer> values) {
            addCriterion("WPH_MealType_Fid in", values, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidNotIn(List<Integer> values) {
            addCriterion("WPH_MealType_Fid not in", values, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealType_Fid between", value1, value2, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealType_Fid not between", value1, value2, "wphMealtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeIsNull() {
            addCriterion("WPH_MealTime is null");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeIsNotNull() {
            addCriterion("WPH_MealTime is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeEqualTo(Integer value) {
            addCriterion("WPH_MealTime =", value, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNotEqualTo(Integer value) {
            addCriterion("WPH_MealTime <>", value, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeGreaterThan(Integer value) {
            addCriterion("WPH_MealTime >", value, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealTime >=", value, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeLessThan(Integer value) {
            addCriterion("WPH_MealTime <", value, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealTime <=", value, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeIn(List<Integer> values) {
            addCriterion("WPH_MealTime in", values, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNotIn(List<Integer> values) {
            addCriterion("WPH_MealTime not in", values, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealTime between", value1, value2, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealTime not between", value1, value2, "wphMealtime");
            return (Criteria) this;
        }

        public Criteria andWphMealweekIsNull() {
            addCriterion("WPH_MealWeek is null");
            return (Criteria) this;
        }

        public Criteria andWphMealweekIsNotNull() {
            addCriterion("WPH_MealWeek is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealweekEqualTo(Integer value) {
            addCriterion("WPH_MealWeek =", value, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekNotEqualTo(Integer value) {
            addCriterion("WPH_MealWeek <>", value, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekGreaterThan(Integer value) {
            addCriterion("WPH_MealWeek >", value, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealWeek >=", value, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekLessThan(Integer value) {
            addCriterion("WPH_MealWeek <", value, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealWeek <=", value, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekIn(List<Integer> values) {
            addCriterion("WPH_MealWeek in", values, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekNotIn(List<Integer> values) {
            addCriterion("WPH_MealWeek not in", values, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealWeek between", value1, value2, "wphMealweek");
            return (Criteria) this;
        }

        public Criteria andWphMealweekNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealWeek not between", value1, value2, "wphMealweek");
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