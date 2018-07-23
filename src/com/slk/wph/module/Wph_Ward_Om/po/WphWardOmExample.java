package com.slk.wph.module.Wph_Ward_Om.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphWardOmExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphWardOmExample() {
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

        public Criteria andOmNameIsNull() {
            addCriterion("OM_Name is null");
            return (Criteria) this;
        }

        public Criteria andOmNameIsNotNull() {
            addCriterion("OM_Name is not null");
            return (Criteria) this;
        }

        public Criteria andOmNameEqualTo(String value) {
            addCriterion("OM_Name =", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotEqualTo(String value) {
            addCriterion("OM_Name <>", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameGreaterThan(String value) {
            addCriterion("OM_Name >", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameGreaterThanOrEqualTo(String value) {
            addCriterion("OM_Name >=", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameLessThan(String value) {
            addCriterion("OM_Name <", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameLessThanOrEqualTo(String value) {
            addCriterion("OM_Name <=", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameLike(String value) {
            addCriterion("OM_Name like", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotLike(String value) {
            addCriterion("OM_Name not like", value, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameIn(List<String> values) {
            addCriterion("OM_Name in", values, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotIn(List<String> values) {
            addCriterion("OM_Name not in", values, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameBetween(String value1, String value2) {
            addCriterion("OM_Name between", value1, value2, "omName");
            return (Criteria) this;
        }

        public Criteria andOmNameNotBetween(String value1, String value2) {
            addCriterion("OM_Name not between", value1, value2, "omName");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeIsNull() {
            addCriterion("WPH_NursingGrade_type is null");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeIsNotNull() {
            addCriterion("WPH_NursingGrade_type is not null");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_type =", value, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeNotEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_type <>", value, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeGreaterThan(Integer value) {
            addCriterion("WPH_NursingGrade_type >", value, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_type >=", value, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeLessThan(Integer value) {
            addCriterion("WPH_NursingGrade_type <", value, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_type <=", value, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeIn(List<Integer> values) {
            addCriterion("WPH_NursingGrade_type in", values, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeNotIn(List<Integer> values) {
            addCriterion("WPH_NursingGrade_type not in", values, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("WPH_NursingGrade_type between", value1, value2, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_NursingGrade_type not between", value1, value2, "wphNursinggradeType");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidIsNull() {
            addCriterion("WPH_NursingGrade_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidIsNotNull() {
            addCriterion("WPH_NursingGrade_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_Fid =", value, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidNotEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_Fid <>", value, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidGreaterThan(Integer value) {
            addCriterion("WPH_NursingGrade_Fid >", value, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_Fid >=", value, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidLessThan(Integer value) {
            addCriterion("WPH_NursingGrade_Fid <", value, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_NursingGrade_Fid <=", value, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidIn(List<Integer> values) {
            addCriterion("WPH_NursingGrade_Fid in", values, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidNotIn(List<Integer> values) {
            addCriterion("WPH_NursingGrade_Fid not in", values, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_NursingGrade_Fid between", value1, value2, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andWphNursinggradeFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_NursingGrade_Fid not between", value1, value2, "wphNursinggradeFid");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("Money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("Money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("Money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("Money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("Money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("Money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("Money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("Money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("Money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("Money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("Money not between", value1, value2, "money");
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

        public Criteria andWagesIsNull() {
            addCriterion("Wages is null");
            return (Criteria) this;
        }

        public Criteria andWagesIsNotNull() {
            addCriterion("Wages is not null");
            return (Criteria) this;
        }

        public Criteria andWagesEqualTo(Double value) {
            addCriterion("Wages =", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotEqualTo(Double value) {
            addCriterion("Wages <>", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThan(Double value) {
            addCriterion("Wages >", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesGreaterThanOrEqualTo(Double value) {
            addCriterion("Wages >=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThan(Double value) {
            addCriterion("Wages <", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesLessThanOrEqualTo(Double value) {
            addCriterion("Wages <=", value, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesIn(List<Double> values) {
            addCriterion("Wages in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotIn(List<Double> values) {
            addCriterion("Wages not in", values, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesBetween(Double value1, Double value2) {
            addCriterion("Wages between", value1, value2, "wages");
            return (Criteria) this;
        }

        public Criteria andWagesNotBetween(Double value1, Double value2) {
            addCriterion("Wages not between", value1, value2, "wages");
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