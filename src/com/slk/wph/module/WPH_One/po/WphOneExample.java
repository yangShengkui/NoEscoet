package com.slk.wph.module.WPH_One.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphOneExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphOneExample() {
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
            addCriterion("WPH_Ward_fid is null");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIsNotNull() {
            addCriterion("WPH_Ward_fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphWardFidEqualTo(Integer value) {
            addCriterion("WPH_Ward_fid =", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotEqualTo(Integer value) {
            addCriterion("WPH_Ward_fid <>", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidGreaterThan(Integer value) {
            addCriterion("WPH_Ward_fid >", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_Ward_fid >=", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidLessThan(Integer value) {
            addCriterion("WPH_Ward_fid <", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_Ward_fid <=", value, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidIn(List<Integer> values) {
            addCriterion("WPH_Ward_fid in", values, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotIn(List<Integer> values) {
            addCriterion("WPH_Ward_fid not in", values, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Ward_fid between", value1, value2, "wphWardFid");
            return (Criteria) this;
        }

        public Criteria andWphWardFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Ward_fid not between", value1, value2, "wphWardFid");
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

        public Criteria andStartdateIsNull() {
            addCriterion("StartDate is null");
            return (Criteria) this;
        }

        public Criteria andStartdateIsNotNull() {
            addCriterion("StartDate is not null");
            return (Criteria) this;
        }

        public Criteria andStartdateEqualTo(Date value) {
            addCriterion("StartDate =", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotEqualTo(Date value) {
            addCriterion("StartDate <>", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThan(Date value) {
            addCriterion("StartDate >", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateGreaterThanOrEqualTo(Date value) {
            addCriterion("StartDate >=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThan(Date value) {
            addCriterion("StartDate <", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateLessThanOrEqualTo(Date value) {
            addCriterion("StartDate <=", value, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateIn(List<Date> values) {
            addCriterion("StartDate in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotIn(List<Date> values) {
            addCriterion("StartDate not in", values, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateBetween(Date value1, Date value2) {
            addCriterion("StartDate between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andStartdateNotBetween(Date value1, Date value2) {
            addCriterion("StartDate not between", value1, value2, "startdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("EndDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("EndDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterion("EndDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterion("EndDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterion("EndDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterion("EndDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterion("EndDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterion("EndDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterion("EndDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterion("EndDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterion("EndDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterion("EndDate not between", value1, value2, "enddate");
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

        public Criteria andStatseIsNull() {
            addCriterion("statse is null");
            return (Criteria) this;
        }

        public Criteria andStatseIsNotNull() {
            addCriterion("statse is not null");
            return (Criteria) this;
        }

        public Criteria andStatseEqualTo(Integer value) {
            addCriterion("statse =", value, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseNotEqualTo(Integer value) {
            addCriterion("statse <>", value, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseGreaterThan(Integer value) {
            addCriterion("statse >", value, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseGreaterThanOrEqualTo(Integer value) {
            addCriterion("statse >=", value, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseLessThan(Integer value) {
            addCriterion("statse <", value, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseLessThanOrEqualTo(Integer value) {
            addCriterion("statse <=", value, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseIn(List<Integer> values) {
            addCriterion("statse in", values, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseNotIn(List<Integer> values) {
            addCriterion("statse not in", values, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseBetween(Integer value1, Integer value2) {
            addCriterion("statse between", value1, value2, "statse");
            return (Criteria) this;
        }

        public Criteria andStatseNotBetween(Integer value1, Integer value2) {
            addCriterion("statse not between", value1, value2, "statse");
            return (Criteria) this;
        }

        public Criteria andImgsIsNull() {
            addCriterion("imgs is null");
            return (Criteria) this;
        }

        public Criteria andImgsIsNotNull() {
            addCriterion("imgs is not null");
            return (Criteria) this;
        }

        public Criteria andImgsEqualTo(String value) {
            addCriterion("imgs =", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotEqualTo(String value) {
            addCriterion("imgs <>", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsGreaterThan(String value) {
            addCriterion("imgs >", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsGreaterThanOrEqualTo(String value) {
            addCriterion("imgs >=", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLessThan(String value) {
            addCriterion("imgs <", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLessThanOrEqualTo(String value) {
            addCriterion("imgs <=", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsLike(String value) {
            addCriterion("imgs like", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotLike(String value) {
            addCriterion("imgs not like", value, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsIn(List<String> values) {
            addCriterion("imgs in", values, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotIn(List<String> values) {
            addCriterion("imgs not in", values, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsBetween(String value1, String value2) {
            addCriterion("imgs between", value1, value2, "imgs");
            return (Criteria) this;
        }

        public Criteria andImgsNotBetween(String value1, String value2) {
            addCriterion("imgs not between", value1, value2, "imgs");
            return (Criteria) this;
        }

        public Criteria andTrueenddateIsNull() {
            addCriterion("TrueEndDate is null");
            return (Criteria) this;
        }

        public Criteria andTrueenddateIsNotNull() {
            addCriterion("TrueEndDate is not null");
            return (Criteria) this;
        }

        public Criteria andTrueenddateEqualTo(Date value) {
            addCriterion("TrueEndDate =", value, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateNotEqualTo(Date value) {
            addCriterion("TrueEndDate <>", value, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateGreaterThan(Date value) {
            addCriterion("TrueEndDate >", value, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateGreaterThanOrEqualTo(Date value) {
            addCriterion("TrueEndDate >=", value, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateLessThan(Date value) {
            addCriterion("TrueEndDate <", value, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateLessThanOrEqualTo(Date value) {
            addCriterion("TrueEndDate <=", value, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateIn(List<Date> values) {
            addCriterion("TrueEndDate in", values, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateNotIn(List<Date> values) {
            addCriterion("TrueEndDate not in", values, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateBetween(Date value1, Date value2) {
            addCriterion("TrueEndDate between", value1, value2, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andTrueenddateNotBetween(Date value1, Date value2) {
            addCriterion("TrueEndDate not between", value1, value2, "trueenddate");
            return (Criteria) this;
        }

        public Criteria andWagesstatesIsNull() {
            addCriterion("WagesStates is null");
            return (Criteria) this;
        }

        public Criteria andWagesstatesIsNotNull() {
            addCriterion("WagesStates is not null");
            return (Criteria) this;
        }

        public Criteria andWagesstatesEqualTo(Integer value) {
            addCriterion("WagesStates =", value, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesNotEqualTo(Integer value) {
            addCriterion("WagesStates <>", value, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesGreaterThan(Integer value) {
            addCriterion("WagesStates >", value, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("WagesStates >=", value, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesLessThan(Integer value) {
            addCriterion("WagesStates <", value, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesLessThanOrEqualTo(Integer value) {
            addCriterion("WagesStates <=", value, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesIn(List<Integer> values) {
            addCriterion("WagesStates in", values, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesNotIn(List<Integer> values) {
            addCriterion("WagesStates not in", values, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesBetween(Integer value1, Integer value2) {
            addCriterion("WagesStates between", value1, value2, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andWagesstatesNotBetween(Integer value1, Integer value2) {
            addCriterion("WagesStates not between", value1, value2, "wagesstates");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIsNull() {
            addCriterion("SettlementMoney is null");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIsNotNull() {
            addCriterion("SettlementMoney is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyEqualTo(Double value) {
            addCriterion("SettlementMoney =", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotEqualTo(Double value) {
            addCriterion("SettlementMoney <>", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyGreaterThan(Double value) {
            addCriterion("SettlementMoney >", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("SettlementMoney >=", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyLessThan(Double value) {
            addCriterion("SettlementMoney <", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyLessThanOrEqualTo(Double value) {
            addCriterion("SettlementMoney <=", value, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyIn(List<Double> values) {
            addCriterion("SettlementMoney in", values, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotIn(List<Double> values) {
            addCriterion("SettlementMoney not in", values, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyBetween(Double value1, Double value2) {
            addCriterion("SettlementMoney between", value1, value2, "settlementmoney");
            return (Criteria) this;
        }

        public Criteria andSettlementmoneyNotBetween(Double value1, Double value2) {
            addCriterion("SettlementMoney not between", value1, value2, "settlementmoney");
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