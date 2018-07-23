package com.slk.wph.module.WPH_Orderingfood.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphOrderingfoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphOrderingfoodExample() {
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

        public Criteria andOrderingnumberIsNull() {
            addCriterion("OrderingNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberIsNotNull() {
            addCriterion("OrderingNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberEqualTo(String value) {
            addCriterion("OrderingNumber =", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberNotEqualTo(String value) {
            addCriterion("OrderingNumber <>", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberGreaterThan(String value) {
            addCriterion("OrderingNumber >", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberGreaterThanOrEqualTo(String value) {
            addCriterion("OrderingNumber >=", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberLessThan(String value) {
            addCriterion("OrderingNumber <", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberLessThanOrEqualTo(String value) {
            addCriterion("OrderingNumber <=", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberLike(String value) {
            addCriterion("OrderingNumber like", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberNotLike(String value) {
            addCriterion("OrderingNumber not like", value, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberIn(List<String> values) {
            addCriterion("OrderingNumber in", values, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberNotIn(List<String> values) {
            addCriterion("OrderingNumber not in", values, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberBetween(String value1, String value2) {
            addCriterion("OrderingNumber between", value1, value2, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andOrderingnumberNotBetween(String value1, String value2) {
            addCriterion("OrderingNumber not between", value1, value2, "orderingnumber");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("Title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("Title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("Title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("Title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("Title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("Title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("Title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("Title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("Title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("Title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("Title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("Title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("Title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("Title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andDepictIsNull() {
            addCriterion("Depict is null");
            return (Criteria) this;
        }

        public Criteria andDepictIsNotNull() {
            addCriterion("Depict is not null");
            return (Criteria) this;
        }

        public Criteria andDepictEqualTo(String value) {
            addCriterion("Depict =", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotEqualTo(String value) {
            addCriterion("Depict <>", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictGreaterThan(String value) {
            addCriterion("Depict >", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictGreaterThanOrEqualTo(String value) {
            addCriterion("Depict >=", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictLessThan(String value) {
            addCriterion("Depict <", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictLessThanOrEqualTo(String value) {
            addCriterion("Depict <=", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictLike(String value) {
            addCriterion("Depict like", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotLike(String value) {
            addCriterion("Depict not like", value, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictIn(List<String> values) {
            addCriterion("Depict in", values, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotIn(List<String> values) {
            addCriterion("Depict not in", values, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictBetween(String value1, String value2) {
            addCriterion("Depict between", value1, value2, "depict");
            return (Criteria) this;
        }

        public Criteria andDepictNotBetween(String value1, String value2) {
            addCriterion("Depict not between", value1, value2, "depict");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("Numbers is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("Numbers is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(Integer value) {
            addCriterion("Numbers =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Integer value) {
            addCriterion("Numbers <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Integer value) {
            addCriterion("Numbers >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("Numbers >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Integer value) {
            addCriterion("Numbers <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("Numbers <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Integer> values) {
            addCriterion("Numbers in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Integer> values) {
            addCriterion("Numbers not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Integer value1, Integer value2) {
            addCriterion("Numbers between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("Numbers not between", value1, value2, "numbers");
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

        public Criteria andMealdateIsNull() {
            addCriterion("MealDate is null");
            return (Criteria) this;
        }

        public Criteria andMealdateIsNotNull() {
            addCriterion("MealDate is not null");
            return (Criteria) this;
        }

        public Criteria andMealdateEqualTo(Date value) {
            addCriterion("MealDate =", value, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateNotEqualTo(Date value) {
            addCriterion("MealDate <>", value, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateGreaterThan(Date value) {
            addCriterion("MealDate >", value, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateGreaterThanOrEqualTo(Date value) {
            addCriterion("MealDate >=", value, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateLessThan(Date value) {
            addCriterion("MealDate <", value, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateLessThanOrEqualTo(Date value) {
            addCriterion("MealDate <=", value, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateIn(List<Date> values) {
            addCriterion("MealDate in", values, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateNotIn(List<Date> values) {
            addCriterion("MealDate not in", values, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateBetween(Date value1, Date value2) {
            addCriterion("MealDate between", value1, value2, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealdateNotBetween(Date value1, Date value2) {
            addCriterion("MealDate not between", value1, value2, "mealdate");
            return (Criteria) this;
        }

        public Criteria andMealstatseIsNull() {
            addCriterion("MealStatse is null");
            return (Criteria) this;
        }

        public Criteria andMealstatseIsNotNull() {
            addCriterion("MealStatse is not null");
            return (Criteria) this;
        }

        public Criteria andMealstatseEqualTo(Integer value) {
            addCriterion("MealStatse =", value, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseNotEqualTo(Integer value) {
            addCriterion("MealStatse <>", value, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseGreaterThan(Integer value) {
            addCriterion("MealStatse >", value, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseGreaterThanOrEqualTo(Integer value) {
            addCriterion("MealStatse >=", value, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseLessThan(Integer value) {
            addCriterion("MealStatse <", value, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseLessThanOrEqualTo(Integer value) {
            addCriterion("MealStatse <=", value, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseIn(List<Integer> values) {
            addCriterion("MealStatse in", values, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseNotIn(List<Integer> values) {
            addCriterion("MealStatse not in", values, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseBetween(Integer value1, Integer value2) {
            addCriterion("MealStatse between", value1, value2, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealstatseNotBetween(Integer value1, Integer value2) {
            addCriterion("MealStatse not between", value1, value2, "mealstatse");
            return (Criteria) this;
        }

        public Criteria andMealaddIsNull() {
            addCriterion("MealAdd is null");
            return (Criteria) this;
        }

        public Criteria andMealaddIsNotNull() {
            addCriterion("MealAdd is not null");
            return (Criteria) this;
        }

        public Criteria andMealaddEqualTo(Integer value) {
            addCriterion("MealAdd =", value, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddNotEqualTo(Integer value) {
            addCriterion("MealAdd <>", value, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddGreaterThan(Integer value) {
            addCriterion("MealAdd >", value, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddGreaterThanOrEqualTo(Integer value) {
            addCriterion("MealAdd >=", value, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddLessThan(Integer value) {
            addCriterion("MealAdd <", value, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddLessThanOrEqualTo(Integer value) {
            addCriterion("MealAdd <=", value, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddIn(List<Integer> values) {
            addCriterion("MealAdd in", values, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddNotIn(List<Integer> values) {
            addCriterion("MealAdd not in", values, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddBetween(Integer value1, Integer value2) {
            addCriterion("MealAdd between", value1, value2, "mealadd");
            return (Criteria) this;
        }

        public Criteria andMealaddNotBetween(Integer value1, Integer value2) {
            addCriterion("MealAdd not between", value1, value2, "mealadd");
            return (Criteria) this;
        }

        public Criteria andCustomerFidIsNull() {
            addCriterion("Customer_Fid is null");
            return (Criteria) this;
        }

        public Criteria andCustomerFidIsNotNull() {
            addCriterion("Customer_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerFidEqualTo(Integer value) {
            addCriterion("Customer_Fid =", value, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidNotEqualTo(Integer value) {
            addCriterion("Customer_Fid <>", value, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidGreaterThan(Integer value) {
            addCriterion("Customer_Fid >", value, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Customer_Fid >=", value, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidLessThan(Integer value) {
            addCriterion("Customer_Fid <", value, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidLessThanOrEqualTo(Integer value) {
            addCriterion("Customer_Fid <=", value, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidIn(List<Integer> values) {
            addCriterion("Customer_Fid in", values, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidNotIn(List<Integer> values) {
            addCriterion("Customer_Fid not in", values, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Fid between", value1, value2, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerFidNotBetween(Integer value1, Integer value2) {
            addCriterion("Customer_Fid not between", value1, value2, "customerFid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidIsNull() {
            addCriterion("Customer_CardId is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidIsNotNull() {
            addCriterion("Customer_CardId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidEqualTo(String value) {
            addCriterion("Customer_CardId =", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidNotEqualTo(String value) {
            addCriterion("Customer_CardId <>", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidGreaterThan(String value) {
            addCriterion("Customer_CardId >", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_CardId >=", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidLessThan(String value) {
            addCriterion("Customer_CardId <", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidLessThanOrEqualTo(String value) {
            addCriterion("Customer_CardId <=", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidLike(String value) {
            addCriterion("Customer_CardId like", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidNotLike(String value) {
            addCriterion("Customer_CardId not like", value, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidIn(List<String> values) {
            addCriterion("Customer_CardId in", values, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidNotIn(List<String> values) {
            addCriterion("Customer_CardId not in", values, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidBetween(String value1, String value2) {
            addCriterion("Customer_CardId between", value1, value2, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerCardidNotBetween(String value1, String value2) {
            addCriterion("Customer_CardId not between", value1, value2, "customerCardid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldIsNull() {
            addCriterion("Customer_HosPitalld is null");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldIsNotNull() {
            addCriterion("Customer_HosPitalld is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldEqualTo(String value) {
            addCriterion("Customer_HosPitalld =", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotEqualTo(String value) {
            addCriterion("Customer_HosPitalld <>", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldGreaterThan(String value) {
            addCriterion("Customer_HosPitalld >", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_HosPitalld >=", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldLessThan(String value) {
            addCriterion("Customer_HosPitalld <", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldLessThanOrEqualTo(String value) {
            addCriterion("Customer_HosPitalld <=", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldLike(String value) {
            addCriterion("Customer_HosPitalld like", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotLike(String value) {
            addCriterion("Customer_HosPitalld not like", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldIn(List<String> values) {
            addCriterion("Customer_HosPitalld in", values, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotIn(List<String> values) {
            addCriterion("Customer_HosPitalld not in", values, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldBetween(String value1, String value2) {
            addCriterion("Customer_HosPitalld between", value1, value2, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotBetween(String value1, String value2) {
            addCriterion("Customer_HosPitalld not between", value1, value2, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andLunchfoodIsNull() {
            addCriterion("LunchFood is null");
            return (Criteria) this;
        }

        public Criteria andLunchfoodIsNotNull() {
            addCriterion("LunchFood is not null");
            return (Criteria) this;
        }

        public Criteria andLunchfoodEqualTo(Integer value) {
            addCriterion("LunchFood =", value, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodNotEqualTo(Integer value) {
            addCriterion("LunchFood <>", value, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodGreaterThan(Integer value) {
            addCriterion("LunchFood >", value, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("LunchFood >=", value, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodLessThan(Integer value) {
            addCriterion("LunchFood <", value, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodLessThanOrEqualTo(Integer value) {
            addCriterion("LunchFood <=", value, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodIn(List<Integer> values) {
            addCriterion("LunchFood in", values, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodNotIn(List<Integer> values) {
            addCriterion("LunchFood not in", values, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodBetween(Integer value1, Integer value2) {
            addCriterion("LunchFood between", value1, value2, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andLunchfoodNotBetween(Integer value1, Integer value2) {
            addCriterion("LunchFood not between", value1, value2, "lunchfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodIsNull() {
            addCriterion("DinnerFood is null");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodIsNotNull() {
            addCriterion("DinnerFood is not null");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodEqualTo(Integer value) {
            addCriterion("DinnerFood =", value, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodNotEqualTo(Integer value) {
            addCriterion("DinnerFood <>", value, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodGreaterThan(Integer value) {
            addCriterion("DinnerFood >", value, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("DinnerFood >=", value, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodLessThan(Integer value) {
            addCriterion("DinnerFood <", value, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodLessThanOrEqualTo(Integer value) {
            addCriterion("DinnerFood <=", value, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodIn(List<Integer> values) {
            addCriterion("DinnerFood in", values, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodNotIn(List<Integer> values) {
            addCriterion("DinnerFood not in", values, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodBetween(Integer value1, Integer value2) {
            addCriterion("DinnerFood between", value1, value2, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andDinnerfoodNotBetween(Integer value1, Integer value2) {
            addCriterion("DinnerFood not between", value1, value2, "dinnerfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodIsNull() {
            addCriterion("AddFood is null");
            return (Criteria) this;
        }

        public Criteria andAddfoodIsNotNull() {
            addCriterion("AddFood is not null");
            return (Criteria) this;
        }

        public Criteria andAddfoodEqualTo(Integer value) {
            addCriterion("AddFood =", value, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodNotEqualTo(Integer value) {
            addCriterion("AddFood <>", value, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodGreaterThan(Integer value) {
            addCriterion("AddFood >", value, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("AddFood >=", value, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodLessThan(Integer value) {
            addCriterion("AddFood <", value, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodLessThanOrEqualTo(Integer value) {
            addCriterion("AddFood <=", value, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodIn(List<Integer> values) {
            addCriterion("AddFood in", values, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodNotIn(List<Integer> values) {
            addCriterion("AddFood not in", values, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodBetween(Integer value1, Integer value2) {
            addCriterion("AddFood between", value1, value2, "addfood");
            return (Criteria) this;
        }

        public Criteria andAddfoodNotBetween(Integer value1, Integer value2) {
            addCriterion("AddFood not between", value1, value2, "addfood");
            return (Criteria) this;
        }

        public Criteria andFactingIsNull() {
            addCriterion("Facting is null");
            return (Criteria) this;
        }

        public Criteria andFactingIsNotNull() {
            addCriterion("Facting is not null");
            return (Criteria) this;
        }

        public Criteria andFactingEqualTo(Integer value) {
            addCriterion("Facting =", value, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingNotEqualTo(Integer value) {
            addCriterion("Facting <>", value, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingGreaterThan(Integer value) {
            addCriterion("Facting >", value, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingGreaterThanOrEqualTo(Integer value) {
            addCriterion("Facting >=", value, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingLessThan(Integer value) {
            addCriterion("Facting <", value, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingLessThanOrEqualTo(Integer value) {
            addCriterion("Facting <=", value, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingIn(List<Integer> values) {
            addCriterion("Facting in", values, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingNotIn(List<Integer> values) {
            addCriterion("Facting not in", values, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingBetween(Integer value1, Integer value2) {
            addCriterion("Facting between", value1, value2, "facting");
            return (Criteria) this;
        }

        public Criteria andFactingNotBetween(Integer value1, Integer value2) {
            addCriterion("Facting not between", value1, value2, "facting");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodIsNull() {
            addCriterion("VegetarianFood is null");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodIsNotNull() {
            addCriterion("VegetarianFood is not null");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodEqualTo(Integer value) {
            addCriterion("VegetarianFood =", value, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodNotEqualTo(Integer value) {
            addCriterion("VegetarianFood <>", value, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodGreaterThan(Integer value) {
            addCriterion("VegetarianFood >", value, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodGreaterThanOrEqualTo(Integer value) {
            addCriterion("VegetarianFood >=", value, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodLessThan(Integer value) {
            addCriterion("VegetarianFood <", value, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodLessThanOrEqualTo(Integer value) {
            addCriterion("VegetarianFood <=", value, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodIn(List<Integer> values) {
            addCriterion("VegetarianFood in", values, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodNotIn(List<Integer> values) {
            addCriterion("VegetarianFood not in", values, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodBetween(Integer value1, Integer value2) {
            addCriterion("VegetarianFood between", value1, value2, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andVegetarianfoodNotBetween(Integer value1, Integer value2) {
            addCriterion("VegetarianFood not between", value1, value2, "vegetarianfood");
            return (Criteria) this;
        }

        public Criteria andRaceIsNull() {
            addCriterion("Race is null");
            return (Criteria) this;
        }

        public Criteria andRaceIsNotNull() {
            addCriterion("Race is not null");
            return (Criteria) this;
        }

        public Criteria andRaceEqualTo(Integer value) {
            addCriterion("Race =", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotEqualTo(Integer value) {
            addCriterion("Race <>", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThan(Integer value) {
            addCriterion("Race >", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceGreaterThanOrEqualTo(Integer value) {
            addCriterion("Race >=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThan(Integer value) {
            addCriterion("Race <", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceLessThanOrEqualTo(Integer value) {
            addCriterion("Race <=", value, "race");
            return (Criteria) this;
        }

        public Criteria andRaceIn(List<Integer> values) {
            addCriterion("Race in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotIn(List<Integer> values) {
            addCriterion("Race not in", values, "race");
            return (Criteria) this;
        }

        public Criteria andRaceBetween(Integer value1, Integer value2) {
            addCriterion("Race between", value1, value2, "race");
            return (Criteria) this;
        }

        public Criteria andRaceNotBetween(Integer value1, Integer value2) {
            addCriterion("Race not between", value1, value2, "race");
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

        public Criteria andWphMealnumeNameIsNull() {
            addCriterion("WPH_MealNume_Name is null");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameIsNotNull() {
            addCriterion("WPH_MealNume_Name is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameEqualTo(String value) {
            addCriterion("WPH_MealNume_Name =", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameNotEqualTo(String value) {
            addCriterion("WPH_MealNume_Name <>", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameGreaterThan(String value) {
            addCriterion("WPH_MealNume_Name >", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameGreaterThanOrEqualTo(String value) {
            addCriterion("WPH_MealNume_Name >=", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameLessThan(String value) {
            addCriterion("WPH_MealNume_Name <", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameLessThanOrEqualTo(String value) {
            addCriterion("WPH_MealNume_Name <=", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameLike(String value) {
            addCriterion("WPH_MealNume_Name like", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameNotLike(String value) {
            addCriterion("WPH_MealNume_Name not like", value, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameIn(List<String> values) {
            addCriterion("WPH_MealNume_Name in", values, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameNotIn(List<String> values) {
            addCriterion("WPH_MealNume_Name not in", values, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameBetween(String value1, String value2) {
            addCriterion("WPH_MealNume_Name between", value1, value2, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealnumeNameNotBetween(String value1, String value2) {
            addCriterion("WPH_MealNume_Name not between", value1, value2, "wphMealnumeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidIsNull() {
            addCriterion("WPH_MealTime_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidIsNotNull() {
            addCriterion("WPH_MealTime_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidEqualTo(Integer value) {
            addCriterion("WPH_MealTime_Fid =", value, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidNotEqualTo(Integer value) {
            addCriterion("WPH_MealTime_Fid <>", value, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidGreaterThan(Integer value) {
            addCriterion("WPH_MealTime_Fid >", value, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealTime_Fid >=", value, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidLessThan(Integer value) {
            addCriterion("WPH_MealTime_Fid <", value, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_MealTime_Fid <=", value, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidIn(List<Integer> values) {
            addCriterion("WPH_MealTime_Fid in", values, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidNotIn(List<Integer> values) {
            addCriterion("WPH_MealTime_Fid not in", values, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealTime_Fid between", value1, value2, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_MealTime_Fid not between", value1, value2, "wphMealtimeFid");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameIsNull() {
            addCriterion("WPH_MealTime_Name is null");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameIsNotNull() {
            addCriterion("WPH_MealTime_Name is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameEqualTo(String value) {
            addCriterion("WPH_MealTime_Name =", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameNotEqualTo(String value) {
            addCriterion("WPH_MealTime_Name <>", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameGreaterThan(String value) {
            addCriterion("WPH_MealTime_Name >", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameGreaterThanOrEqualTo(String value) {
            addCriterion("WPH_MealTime_Name >=", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameLessThan(String value) {
            addCriterion("WPH_MealTime_Name <", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameLessThanOrEqualTo(String value) {
            addCriterion("WPH_MealTime_Name <=", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameLike(String value) {
            addCriterion("WPH_MealTime_Name like", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameNotLike(String value) {
            addCriterion("WPH_MealTime_Name not like", value, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameIn(List<String> values) {
            addCriterion("WPH_MealTime_Name in", values, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameNotIn(List<String> values) {
            addCriterion("WPH_MealTime_Name not in", values, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameBetween(String value1, String value2) {
            addCriterion("WPH_MealTime_Name between", value1, value2, "wphMealtimeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtimeNameNotBetween(String value1, String value2) {
            addCriterion("WPH_MealTime_Name not between", value1, value2, "wphMealtimeName");
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

        public Criteria andWphMealtypeNameIsNull() {
            addCriterion("WPH_MealType_Name is null");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameIsNotNull() {
            addCriterion("WPH_MealType_Name is not null");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameEqualTo(String value) {
            addCriterion("WPH_MealType_Name =", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameNotEqualTo(String value) {
            addCriterion("WPH_MealType_Name <>", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameGreaterThan(String value) {
            addCriterion("WPH_MealType_Name >", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("WPH_MealType_Name >=", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameLessThan(String value) {
            addCriterion("WPH_MealType_Name <", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameLessThanOrEqualTo(String value) {
            addCriterion("WPH_MealType_Name <=", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameLike(String value) {
            addCriterion("WPH_MealType_Name like", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameNotLike(String value) {
            addCriterion("WPH_MealType_Name not like", value, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameIn(List<String> values) {
            addCriterion("WPH_MealType_Name in", values, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameNotIn(List<String> values) {
            addCriterion("WPH_MealType_Name not in", values, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameBetween(String value1, String value2) {
            addCriterion("WPH_MealType_Name between", value1, value2, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andWphMealtypeNameNotBetween(String value1, String value2) {
            addCriterion("WPH_MealType_Name not between", value1, value2, "wphMealtypeName");
            return (Criteria) this;
        }

        public Criteria andUserFidIsNull() {
            addCriterion("User_Fid is null");
            return (Criteria) this;
        }

        public Criteria andUserFidIsNotNull() {
            addCriterion("User_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andUserFidEqualTo(Integer value) {
            addCriterion("User_Fid =", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidNotEqualTo(Integer value) {
            addCriterion("User_Fid <>", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidGreaterThan(Integer value) {
            addCriterion("User_Fid >", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("User_Fid >=", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidLessThan(Integer value) {
            addCriterion("User_Fid <", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidLessThanOrEqualTo(Integer value) {
            addCriterion("User_Fid <=", value, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidIn(List<Integer> values) {
            addCriterion("User_Fid in", values, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidNotIn(List<Integer> values) {
            addCriterion("User_Fid not in", values, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidBetween(Integer value1, Integer value2) {
            addCriterion("User_Fid between", value1, value2, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserFidNotBetween(Integer value1, Integer value2) {
            addCriterion("User_Fid not between", value1, value2, "userFid");
            return (Criteria) this;
        }

        public Criteria andUserroleIsNull() {
            addCriterion("UserRole is null");
            return (Criteria) this;
        }

        public Criteria andUserroleIsNotNull() {
            addCriterion("UserRole is not null");
            return (Criteria) this;
        }

        public Criteria andUserroleEqualTo(String value) {
            addCriterion("UserRole =", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotEqualTo(String value) {
            addCriterion("UserRole <>", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleGreaterThan(String value) {
            addCriterion("UserRole >", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleGreaterThanOrEqualTo(String value) {
            addCriterion("UserRole >=", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleLessThan(String value) {
            addCriterion("UserRole <", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleLessThanOrEqualTo(String value) {
            addCriterion("UserRole <=", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleLike(String value) {
            addCriterion("UserRole like", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotLike(String value) {
            addCriterion("UserRole not like", value, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleIn(List<String> values) {
            addCriterion("UserRole in", values, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotIn(List<String> values) {
            addCriterion("UserRole not in", values, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleBetween(String value1, String value2) {
            addCriterion("UserRole between", value1, value2, "userrole");
            return (Criteria) this;
        }

        public Criteria andUserroleNotBetween(String value1, String value2) {
            addCriterion("UserRole not between", value1, value2, "userrole");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("Notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("Notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("Notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("Notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("Notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("Notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("Notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("Notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("Notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("Notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("Notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("Notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("Notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("Notes not between", value1, value2, "notes");
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

        public Criteria andBednoIsNull() {
            addCriterion("BedNo is null");
            return (Criteria) this;
        }

        public Criteria andBednoIsNotNull() {
            addCriterion("BedNo is not null");
            return (Criteria) this;
        }

        public Criteria andBednoEqualTo(String value) {
            addCriterion("BedNo =", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotEqualTo(String value) {
            addCriterion("BedNo <>", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThan(String value) {
            addCriterion("BedNo >", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoGreaterThanOrEqualTo(String value) {
            addCriterion("BedNo >=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThan(String value) {
            addCriterion("BedNo <", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLessThanOrEqualTo(String value) {
            addCriterion("BedNo <=", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoLike(String value) {
            addCriterion("BedNo like", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotLike(String value) {
            addCriterion("BedNo not like", value, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoIn(List<String> values) {
            addCriterion("BedNo in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotIn(List<String> values) {
            addCriterion("BedNo not in", values, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoBetween(String value1, String value2) {
            addCriterion("BedNo between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andBednoNotBetween(String value1, String value2) {
            addCriterion("BedNo not between", value1, value2, "bedno");
            return (Criteria) this;
        }

        public Criteria andPassernameIsNull() {
            addCriterion("PasserName is null");
            return (Criteria) this;
        }

        public Criteria andPassernameIsNotNull() {
            addCriterion("PasserName is not null");
            return (Criteria) this;
        }

        public Criteria andPassernameEqualTo(String value) {
            addCriterion("PasserName =", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameNotEqualTo(String value) {
            addCriterion("PasserName <>", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameGreaterThan(String value) {
            addCriterion("PasserName >", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameGreaterThanOrEqualTo(String value) {
            addCriterion("PasserName >=", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameLessThan(String value) {
            addCriterion("PasserName <", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameLessThanOrEqualTo(String value) {
            addCriterion("PasserName <=", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameLike(String value) {
            addCriterion("PasserName like", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameNotLike(String value) {
            addCriterion("PasserName not like", value, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameIn(List<String> values) {
            addCriterion("PasserName in", values, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameNotIn(List<String> values) {
            addCriterion("PasserName not in", values, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameBetween(String value1, String value2) {
            addCriterion("PasserName between", value1, value2, "passername");
            return (Criteria) this;
        }

        public Criteria andPassernameNotBetween(String value1, String value2) {
            addCriterion("PasserName not between", value1, value2, "passername");
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