package com.slk.wph.module.WPH_Mealcleaning.po;

import java.util.ArrayList;
import java.util.List;

public class WphMealcleaningExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphMealcleaningExample() {
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

        public Criteria andWphCardFidIsNull() {
            addCriterion("WPH_Card_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphCardFidIsNotNull() {
            addCriterion("WPH_Card_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphCardFidEqualTo(Integer value) {
            addCriterion("WPH_Card_Fid =", value, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidNotEqualTo(Integer value) {
            addCriterion("WPH_Card_Fid <>", value, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidGreaterThan(Integer value) {
            addCriterion("WPH_Card_Fid >", value, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_Card_Fid >=", value, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidLessThan(Integer value) {
            addCriterion("WPH_Card_Fid <", value, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_Card_Fid <=", value, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidIn(List<Integer> values) {
            addCriterion("WPH_Card_Fid in", values, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidNotIn(List<Integer> values) {
            addCriterion("WPH_Card_Fid not in", values, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Card_Fid between", value1, value2, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Card_Fid not between", value1, value2, "wphCardFid");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberIsNull() {
            addCriterion("WPH_Card_Number is null");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberIsNotNull() {
            addCriterion("WPH_Card_Number is not null");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberEqualTo(String value) {
            addCriterion("WPH_Card_Number =", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberNotEqualTo(String value) {
            addCriterion("WPH_Card_Number <>", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberGreaterThan(String value) {
            addCriterion("WPH_Card_Number >", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("WPH_Card_Number >=", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberLessThan(String value) {
            addCriterion("WPH_Card_Number <", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberLessThanOrEqualTo(String value) {
            addCriterion("WPH_Card_Number <=", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberLike(String value) {
            addCriterion("WPH_Card_Number like", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberNotLike(String value) {
            addCriterion("WPH_Card_Number not like", value, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberIn(List<String> values) {
            addCriterion("WPH_Card_Number in", values, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberNotIn(List<String> values) {
            addCriterion("WPH_Card_Number not in", values, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberBetween(String value1, String value2) {
            addCriterion("WPH_Card_Number between", value1, value2, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andWphCardNumberNotBetween(String value1, String value2) {
            addCriterion("WPH_Card_Number not between", value1, value2, "wphCardNumber");
            return (Criteria) this;
        }

        public Criteria andCleanstateIsNull() {
            addCriterion("cleanstate is null");
            return (Criteria) this;
        }

        public Criteria andCleanstateIsNotNull() {
            addCriterion("cleanstate is not null");
            return (Criteria) this;
        }

        public Criteria andCleanstateEqualTo(Integer value) {
            addCriterion("cleanstate =", value, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateNotEqualTo(Integer value) {
            addCriterion("cleanstate <>", value, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateGreaterThan(Integer value) {
            addCriterion("cleanstate >", value, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateGreaterThanOrEqualTo(Integer value) {
            addCriterion("cleanstate >=", value, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateLessThan(Integer value) {
            addCriterion("cleanstate <", value, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateLessThanOrEqualTo(Integer value) {
            addCriterion("cleanstate <=", value, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateIn(List<Integer> values) {
            addCriterion("cleanstate in", values, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateNotIn(List<Integer> values) {
            addCriterion("cleanstate not in", values, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateBetween(Integer value1, Integer value2) {
            addCriterion("cleanstate between", value1, value2, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCleanstateNotBetween(Integer value1, Integer value2) {
            addCriterion("cleanstate not between", value1, value2, "cleanstate");
            return (Criteria) this;
        }

        public Criteria andCountIsNull() {
            addCriterion("count is null");
            return (Criteria) this;
        }

        public Criteria andCountIsNotNull() {
            addCriterion("count is not null");
            return (Criteria) this;
        }

        public Criteria andCountEqualTo(Integer value) {
            addCriterion("count =", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotEqualTo(Integer value) {
            addCriterion("count <>", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThan(Integer value) {
            addCriterion("count >", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("count >=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThan(Integer value) {
            addCriterion("count <", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountLessThanOrEqualTo(Integer value) {
            addCriterion("count <=", value, "count");
            return (Criteria) this;
        }

        public Criteria andCountIn(List<Integer> values) {
            addCriterion("count in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotIn(List<Integer> values) {
            addCriterion("count not in", values, "count");
            return (Criteria) this;
        }

        public Criteria andCountBetween(Integer value1, Integer value2) {
            addCriterion("count between", value1, value2, "count");
            return (Criteria) this;
        }

        public Criteria andCountNotBetween(Integer value1, Integer value2) {
            addCriterion("count not between", value1, value2, "count");
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