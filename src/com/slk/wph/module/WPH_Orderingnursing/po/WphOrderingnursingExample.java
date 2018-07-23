package com.slk.wph.module.WPH_Orderingnursing.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WphOrderingnursingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphOrderingnursingExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andWphWardOmFidIsNull() {
            addCriterion("WPH_Ward_OM_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidIsNotNull() {
            addCriterion("WPH_Ward_OM_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidEqualTo(Integer value) {
            addCriterion("WPH_Ward_OM_Fid =", value, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidNotEqualTo(Integer value) {
            addCriterion("WPH_Ward_OM_Fid <>", value, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidGreaterThan(Integer value) {
            addCriterion("WPH_Ward_OM_Fid >", value, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_Ward_OM_Fid >=", value, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidLessThan(Integer value) {
            addCriterion("WPH_Ward_OM_Fid <", value, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_Ward_OM_Fid <=", value, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidIn(List<Integer> values) {
            addCriterion("WPH_Ward_OM_Fid in", values, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidNotIn(List<Integer> values) {
            addCriterion("WPH_Ward_OM_Fid not in", values, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Ward_OM_Fid between", value1, value2, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andWphWardOmFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Ward_OM_Fid not between", value1, value2, "wphWardOmFid");
            return (Criteria) this;
        }

        public Criteria andNursingNameIsNull() {
            addCriterion("Nursing_Name is null");
            return (Criteria) this;
        }

        public Criteria andNursingNameIsNotNull() {
            addCriterion("Nursing_Name is not null");
            return (Criteria) this;
        }

        public Criteria andNursingNameEqualTo(String value) {
            addCriterion("Nursing_Name =", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameNotEqualTo(String value) {
            addCriterion("Nursing_Name <>", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameGreaterThan(String value) {
            addCriterion("Nursing_Name >", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameGreaterThanOrEqualTo(String value) {
            addCriterion("Nursing_Name >=", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameLessThan(String value) {
            addCriterion("Nursing_Name <", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameLessThanOrEqualTo(String value) {
            addCriterion("Nursing_Name <=", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameLike(String value) {
            addCriterion("Nursing_Name like", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameNotLike(String value) {
            addCriterion("Nursing_Name not like", value, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameIn(List<String> values) {
            addCriterion("Nursing_Name in", values, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameNotIn(List<String> values) {
            addCriterion("Nursing_Name not in", values, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameBetween(String value1, String value2) {
            addCriterion("Nursing_Name between", value1, value2, "nursingName");
            return (Criteria) this;
        }

        public Criteria andNursingNameNotBetween(String value1, String value2) {
            addCriterion("Nursing_Name not between", value1, value2, "nursingName");
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

        public Criteria andNursingdateIsNull() {
            addCriterion("NursingDate is null");
            return (Criteria) this;
        }

        public Criteria andNursingdateIsNotNull() {
            addCriterion("NursingDate is not null");
            return (Criteria) this;
        }

        public Criteria andNursingdateEqualTo(Date value) {
            addCriterionForJDBCDate("NursingDate =", value, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("NursingDate <>", value, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateGreaterThan(Date value) {
            addCriterionForJDBCDate("NursingDate >", value, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NursingDate >=", value, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateLessThan(Date value) {
            addCriterionForJDBCDate("NursingDate <", value, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("NursingDate <=", value, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateIn(List<Date> values) {
            addCriterionForJDBCDate("NursingDate in", values, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("NursingDate not in", values, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NursingDate between", value1, value2, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("NursingDate not between", value1, value2, "nursingdate");
            return (Criteria) this;
        }

        public Criteria andNursingstatesIsNull() {
            addCriterion("NursingStates is null");
            return (Criteria) this;
        }

        public Criteria andNursingstatesIsNotNull() {
            addCriterion("NursingStates is not null");
            return (Criteria) this;
        }

        public Criteria andNursingstatesEqualTo(Integer value) {
            addCriterion("NursingStates =", value, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesNotEqualTo(Integer value) {
            addCriterion("NursingStates <>", value, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesGreaterThan(Integer value) {
            addCriterion("NursingStates >", value, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("NursingStates >=", value, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesLessThan(Integer value) {
            addCriterion("NursingStates <", value, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesLessThanOrEqualTo(Integer value) {
            addCriterion("NursingStates <=", value, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesIn(List<Integer> values) {
            addCriterion("NursingStates in", values, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesNotIn(List<Integer> values) {
            addCriterion("NursingStates not in", values, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesBetween(Integer value1, Integer value2) {
            addCriterion("NursingStates between", value1, value2, "nursingstates");
            return (Criteria) this;
        }

        public Criteria andNursingstatesNotBetween(Integer value1, Integer value2) {
            addCriterion("NursingStates not between", value1, value2, "nursingstates");
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

        public Criteria andCustomerHospitalldIsNull() {
            addCriterion("Customer_Hospitalld is null");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldIsNotNull() {
            addCriterion("Customer_Hospitalld is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldEqualTo(String value) {
            addCriterion("Customer_Hospitalld =", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotEqualTo(String value) {
            addCriterion("Customer_Hospitalld <>", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldGreaterThan(String value) {
            addCriterion("Customer_Hospitalld >", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_Hospitalld >=", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldLessThan(String value) {
            addCriterion("Customer_Hospitalld <", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldLessThanOrEqualTo(String value) {
            addCriterion("Customer_Hospitalld <=", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldLike(String value) {
            addCriterion("Customer_Hospitalld like", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotLike(String value) {
            addCriterion("Customer_Hospitalld not like", value, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldIn(List<String> values) {
            addCriterion("Customer_Hospitalld in", values, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotIn(List<String> values) {
            addCriterion("Customer_Hospitalld not in", values, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldBetween(String value1, String value2) {
            addCriterion("Customer_Hospitalld between", value1, value2, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalldNotBetween(String value1, String value2) {
            addCriterion("Customer_Hospitalld not between", value1, value2, "customerHospitalld");
            return (Criteria) this;
        }

        public Criteria andNursingTypeIsNull() {
            addCriterion("Nursing_Type is null");
            return (Criteria) this;
        }

        public Criteria andNursingTypeIsNotNull() {
            addCriterion("Nursing_Type is not null");
            return (Criteria) this;
        }

        public Criteria andNursingTypeEqualTo(Integer value) {
            addCriterion("Nursing_Type =", value, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeNotEqualTo(Integer value) {
            addCriterion("Nursing_Type <>", value, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeGreaterThan(Integer value) {
            addCriterion("Nursing_Type >", value, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Nursing_Type >=", value, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeLessThan(Integer value) {
            addCriterion("Nursing_Type <", value, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Nursing_Type <=", value, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeIn(List<Integer> values) {
            addCriterion("Nursing_Type in", values, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeNotIn(List<Integer> values) {
            addCriterion("Nursing_Type not in", values, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeBetween(Integer value1, Integer value2) {
            addCriterion("Nursing_Type between", value1, value2, "nursingType");
            return (Criteria) this;
        }

        public Criteria andNursingTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Nursing_Type not between", value1, value2, "nursingType");
            return (Criteria) this;
        }

        public Criteria andWphOneFidIsNull() {
            addCriterion("WPH_One_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphOneFidIsNotNull() {
            addCriterion("WPH_One_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphOneFidEqualTo(Integer value) {
            addCriterion("WPH_One_Fid =", value, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidNotEqualTo(Integer value) {
            addCriterion("WPH_One_Fid <>", value, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidGreaterThan(Integer value) {
            addCriterion("WPH_One_Fid >", value, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_One_Fid >=", value, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidLessThan(Integer value) {
            addCriterion("WPH_One_Fid <", value, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_One_Fid <=", value, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidIn(List<Integer> values) {
            addCriterion("WPH_One_Fid in", values, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidNotIn(List<Integer> values) {
            addCriterion("WPH_One_Fid not in", values, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_One_Fid between", value1, value2, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWphOneFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_One_Fid not between", value1, value2, "wphOneFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidIsNull() {
            addCriterion("Workers_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWorkersFidIsNotNull() {
            addCriterion("Workers_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkersFidEqualTo(Integer value) {
            addCriterion("Workers_Fid =", value, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidNotEqualTo(Integer value) {
            addCriterion("Workers_Fid <>", value, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidGreaterThan(Integer value) {
            addCriterion("Workers_Fid >", value, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Workers_Fid >=", value, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidLessThan(Integer value) {
            addCriterion("Workers_Fid <", value, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidLessThanOrEqualTo(Integer value) {
            addCriterion("Workers_Fid <=", value, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidIn(List<Integer> values) {
            addCriterion("Workers_Fid in", values, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidNotIn(List<Integer> values) {
            addCriterion("Workers_Fid not in", values, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidBetween(Integer value1, Integer value2) {
            addCriterion("Workers_Fid between", value1, value2, "workersFid");
            return (Criteria) this;
        }

        public Criteria andWorkersFidNotBetween(Integer value1, Integer value2) {
            addCriterion("Workers_Fid not between", value1, value2, "workersFid");
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

        public Criteria andUsenameIsNull() {
            addCriterion("UseName is null");
            return (Criteria) this;
        }

        public Criteria andUsenameIsNotNull() {
            addCriterion("UseName is not null");
            return (Criteria) this;
        }

        public Criteria andUsenameEqualTo(String value) {
            addCriterion("UseName =", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotEqualTo(String value) {
            addCriterion("UseName <>", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThan(String value) {
            addCriterion("UseName >", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameGreaterThanOrEqualTo(String value) {
            addCriterion("UseName >=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThan(String value) {
            addCriterion("UseName <", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLessThanOrEqualTo(String value) {
            addCriterion("UseName <=", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameLike(String value) {
            addCriterion("UseName like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotLike(String value) {
            addCriterion("UseName not like", value, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameIn(List<String> values) {
            addCriterion("UseName in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotIn(List<String> values) {
            addCriterion("UseName not in", values, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameBetween(String value1, String value2) {
            addCriterion("UseName between", value1, value2, "usename");
            return (Criteria) this;
        }

        public Criteria andUsenameNotBetween(String value1, String value2) {
            addCriterion("UseName not between", value1, value2, "usename");
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