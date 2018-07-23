package com.slk.wph.module.WPH_Invoice.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphInvoiceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphInvoiceExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("Name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("Name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("Name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("Name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("Name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("Name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("Name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("Name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("Name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("Name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("Name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("Name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("Name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("Name not between", value1, value2, "name");
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

        public Criteria andWphInvoicerateFidIsNull() {
            addCriterion("WPH_InvoiceRate_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidIsNotNull() {
            addCriterion("WPH_InvoiceRate_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidEqualTo(Integer value) {
            addCriterion("WPH_InvoiceRate_Fid =", value, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidNotEqualTo(Integer value) {
            addCriterion("WPH_InvoiceRate_Fid <>", value, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidGreaterThan(Integer value) {
            addCriterion("WPH_InvoiceRate_Fid >", value, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_InvoiceRate_Fid >=", value, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidLessThan(Integer value) {
            addCriterion("WPH_InvoiceRate_Fid <", value, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_InvoiceRate_Fid <=", value, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidIn(List<Integer> values) {
            addCriterion("WPH_InvoiceRate_Fid in", values, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidNotIn(List<Integer> values) {
            addCriterion("WPH_InvoiceRate_Fid not in", values, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_InvoiceRate_Fid between", value1, value2, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andWphInvoicerateFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_InvoiceRate_Fid not between", value1, value2, "wphInvoicerateFid");
            return (Criteria) this;
        }

        public Criteria andRateIsNull() {
            addCriterion("Rate is null");
            return (Criteria) this;
        }

        public Criteria andRateIsNotNull() {
            addCriterion("Rate is not null");
            return (Criteria) this;
        }

        public Criteria andRateEqualTo(Double value) {
            addCriterion("Rate =", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotEqualTo(Double value) {
            addCriterion("Rate <>", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThan(Double value) {
            addCriterion("Rate >", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateGreaterThanOrEqualTo(Double value) {
            addCriterion("Rate >=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThan(Double value) {
            addCriterion("Rate <", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateLessThanOrEqualTo(Double value) {
            addCriterion("Rate <=", value, "rate");
            return (Criteria) this;
        }

        public Criteria andRateIn(List<Double> values) {
            addCriterion("Rate in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotIn(List<Double> values) {
            addCriterion("Rate not in", values, "rate");
            return (Criteria) this;
        }

        public Criteria andRateBetween(Double value1, Double value2) {
            addCriterion("Rate between", value1, value2, "rate");
            return (Criteria) this;
        }

        public Criteria andRateNotBetween(Double value1, Double value2) {
            addCriterion("Rate not between", value1, value2, "rate");
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

        public Criteria andTaxationIsNull() {
            addCriterion("Taxation is null");
            return (Criteria) this;
        }

        public Criteria andTaxationIsNotNull() {
            addCriterion("Taxation is not null");
            return (Criteria) this;
        }

        public Criteria andTaxationEqualTo(Double value) {
            addCriterion("Taxation =", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotEqualTo(Double value) {
            addCriterion("Taxation <>", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationGreaterThan(Double value) {
            addCriterion("Taxation >", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationGreaterThanOrEqualTo(Double value) {
            addCriterion("Taxation >=", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationLessThan(Double value) {
            addCriterion("Taxation <", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationLessThanOrEqualTo(Double value) {
            addCriterion("Taxation <=", value, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationIn(List<Double> values) {
            addCriterion("Taxation in", values, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotIn(List<Double> values) {
            addCriterion("Taxation not in", values, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationBetween(Double value1, Double value2) {
            addCriterion("Taxation between", value1, value2, "taxation");
            return (Criteria) this;
        }

        public Criteria andTaxationNotBetween(Double value1, Double value2) {
            addCriterion("Taxation not between", value1, value2, "taxation");
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