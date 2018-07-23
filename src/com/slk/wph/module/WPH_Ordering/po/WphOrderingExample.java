package com.slk.wph.module.WPH_Ordering.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphOrderingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphOrderingExample() {
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

        public Criteria andOrderingstatseIsNull() {
            addCriterion("OrderingStatse is null");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseIsNotNull() {
            addCriterion("OrderingStatse is not null");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseEqualTo(Integer value) {
            addCriterion("OrderingStatse =", value, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseNotEqualTo(Integer value) {
            addCriterion("OrderingStatse <>", value, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseGreaterThan(Integer value) {
            addCriterion("OrderingStatse >", value, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderingStatse >=", value, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseLessThan(Integer value) {
            addCriterion("OrderingStatse <", value, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseLessThanOrEqualTo(Integer value) {
            addCriterion("OrderingStatse <=", value, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseIn(List<Integer> values) {
            addCriterion("OrderingStatse in", values, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseNotIn(List<Integer> values) {
            addCriterion("OrderingStatse not in", values, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseBetween(Integer value1, Integer value2) {
            addCriterion("OrderingStatse between", value1, value2, "orderingstatse");
            return (Criteria) this;
        }

        public Criteria andOrderingstatseNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderingStatse not between", value1, value2, "orderingstatse");
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

        public Criteria andCustomerCaridIsNull() {
            addCriterion("Customer_CarId is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridIsNotNull() {
            addCriterion("Customer_CarId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridEqualTo(String value) {
            addCriterion("Customer_CarId =", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridNotEqualTo(String value) {
            addCriterion("Customer_CarId <>", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridGreaterThan(String value) {
            addCriterion("Customer_CarId >", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_CarId >=", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridLessThan(String value) {
            addCriterion("Customer_CarId <", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridLessThanOrEqualTo(String value) {
            addCriterion("Customer_CarId <=", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridLike(String value) {
            addCriterion("Customer_CarId like", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridNotLike(String value) {
            addCriterion("Customer_CarId not like", value, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridIn(List<String> values) {
            addCriterion("Customer_CarId in", values, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridNotIn(List<String> values) {
            addCriterion("Customer_CarId not in", values, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridBetween(String value1, String value2) {
            addCriterion("Customer_CarId between", value1, value2, "customerCarid");
            return (Criteria) this;
        }

        public Criteria andCustomerCaridNotBetween(String value1, String value2) {
            addCriterion("Customer_CarId not between", value1, value2, "customerCarid");
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

        public Criteria andCustomerBalanceIsNull() {
            addCriterion("Customer_Balance is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceIsNotNull() {
            addCriterion("Customer_Balance is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceEqualTo(Double value) {
            addCriterion("Customer_Balance =", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceNotEqualTo(Double value) {
            addCriterion("Customer_Balance <>", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceGreaterThan(Double value) {
            addCriterion("Customer_Balance >", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("Customer_Balance >=", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceLessThan(Double value) {
            addCriterion("Customer_Balance <", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceLessThanOrEqualTo(Double value) {
            addCriterion("Customer_Balance <=", value, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceIn(List<Double> values) {
            addCriterion("Customer_Balance in", values, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceNotIn(List<Double> values) {
            addCriterion("Customer_Balance not in", values, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceBetween(Double value1, Double value2) {
            addCriterion("Customer_Balance between", value1, value2, "customerBalance");
            return (Criteria) this;
        }

        public Criteria andCustomerBalanceNotBetween(Double value1, Double value2) {
            addCriterion("Customer_Balance not between", value1, value2, "customerBalance");
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

        public Criteria andWphQueryFidIsNull() {
            addCriterion("WPH_Query_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidIsNotNull() {
            addCriterion("WPH_Query_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidEqualTo(Integer value) {
            addCriterion("WPH_Query_Fid =", value, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidNotEqualTo(Integer value) {
            addCriterion("WPH_Query_Fid <>", value, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidGreaterThan(Integer value) {
            addCriterion("WPH_Query_Fid >", value, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_Query_Fid >=", value, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidLessThan(Integer value) {
            addCriterion("WPH_Query_Fid <", value, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_Query_Fid <=", value, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidIn(List<Integer> values) {
            addCriterion("WPH_Query_Fid in", values, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidNotIn(List<Integer> values) {
            addCriterion("WPH_Query_Fid not in", values, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Query_Fid between", value1, value2, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphQueryFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Query_Fid not between", value1, value2, "wphQueryFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidIsNull() {
            addCriterion("WPH_ServiceType_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidIsNotNull() {
            addCriterion("WPH_ServiceType_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidEqualTo(Integer value) {
            addCriterion("WPH_ServiceType_Fid =", value, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidNotEqualTo(Integer value) {
            addCriterion("WPH_ServiceType_Fid <>", value, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidGreaterThan(Integer value) {
            addCriterion("WPH_ServiceType_Fid >", value, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_ServiceType_Fid >=", value, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidLessThan(Integer value) {
            addCriterion("WPH_ServiceType_Fid <", value, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_ServiceType_Fid <=", value, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidIn(List<Integer> values) {
            addCriterion("WPH_ServiceType_Fid in", values, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidNotIn(List<Integer> values) {
            addCriterion("WPH_ServiceType_Fid not in", values, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_ServiceType_Fid between", value1, value2, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicetypeFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_ServiceType_Fid not between", value1, value2, "wphServicetypeFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidIsNull() {
            addCriterion("WPH_ServiceDetails_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidIsNotNull() {
            addCriterion("WPH_ServiceDetails_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidEqualTo(Integer value) {
            addCriterion("WPH_ServiceDetails_Fid =", value, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidNotEqualTo(Integer value) {
            addCriterion("WPH_ServiceDetails_Fid <>", value, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidGreaterThan(Integer value) {
            addCriterion("WPH_ServiceDetails_Fid >", value, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_ServiceDetails_Fid >=", value, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidLessThan(Integer value) {
            addCriterion("WPH_ServiceDetails_Fid <", value, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_ServiceDetails_Fid <=", value, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidIn(List<Integer> values) {
            addCriterion("WPH_ServiceDetails_Fid in", values, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidNotIn(List<Integer> values) {
            addCriterion("WPH_ServiceDetails_Fid not in", values, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_ServiceDetails_Fid between", value1, value2, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andWphServicedetailsFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_ServiceDetails_Fid not between", value1, value2, "wphServicedetailsFid");
            return (Criteria) this;
        }

        public Criteria andOrderingdateIsNull() {
            addCriterion("OrderingDate is null");
            return (Criteria) this;
        }

        public Criteria andOrderingdateIsNotNull() {
            addCriterion("OrderingDate is not null");
            return (Criteria) this;
        }

        public Criteria andOrderingdateEqualTo(Date value) {
            addCriterion("OrderingDate =", value, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateNotEqualTo(Date value) {
            addCriterion("OrderingDate <>", value, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateGreaterThan(Date value) {
            addCriterion("OrderingDate >", value, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OrderingDate >=", value, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateLessThan(Date value) {
            addCriterion("OrderingDate <", value, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateLessThanOrEqualTo(Date value) {
            addCriterion("OrderingDate <=", value, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateIn(List<Date> values) {
            addCriterion("OrderingDate in", values, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateNotIn(List<Date> values) {
            addCriterion("OrderingDate not in", values, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateBetween(Date value1, Date value2) {
            addCriterion("OrderingDate between", value1, value2, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andOrderingdateNotBetween(Date value1, Date value2) {
            addCriterion("OrderingDate not between", value1, value2, "orderingdate");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("PayType is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("PayType is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(Integer value) {
            addCriterion("PayType =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(Integer value) {
            addCriterion("PayType <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(Integer value) {
            addCriterion("PayType >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PayType >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(Integer value) {
            addCriterion("PayType <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(Integer value) {
            addCriterion("PayType <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<Integer> values) {
            addCriterion("PayType in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<Integer> values) {
            addCriterion("PayType not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(Integer value1, Integer value2) {
            addCriterion("PayType between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PayType not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPayordernumberIsNull() {
            addCriterion("PayOrderNumber is null");
            return (Criteria) this;
        }

        public Criteria andPayordernumberIsNotNull() {
            addCriterion("PayOrderNumber is not null");
            return (Criteria) this;
        }

        public Criteria andPayordernumberEqualTo(String value) {
            addCriterion("PayOrderNumber =", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberNotEqualTo(String value) {
            addCriterion("PayOrderNumber <>", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberGreaterThan(String value) {
            addCriterion("PayOrderNumber >", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberGreaterThanOrEqualTo(String value) {
            addCriterion("PayOrderNumber >=", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberLessThan(String value) {
            addCriterion("PayOrderNumber <", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberLessThanOrEqualTo(String value) {
            addCriterion("PayOrderNumber <=", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberLike(String value) {
            addCriterion("PayOrderNumber like", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberNotLike(String value) {
            addCriterion("PayOrderNumber not like", value, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberIn(List<String> values) {
            addCriterion("PayOrderNumber in", values, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberNotIn(List<String> values) {
            addCriterion("PayOrderNumber not in", values, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberBetween(String value1, String value2) {
            addCriterion("PayOrderNumber between", value1, value2, "payordernumber");
            return (Criteria) this;
        }

        public Criteria andPayordernumberNotBetween(String value1, String value2) {
            addCriterion("PayOrderNumber not between", value1, value2, "payordernumber");
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

        public Criteria andOldorderingnumberIsNull() {
            addCriterion("OldOrderingNumber is null");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberIsNotNull() {
            addCriterion("OldOrderingNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberEqualTo(String value) {
            addCriterion("OldOrderingNumber =", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberNotEqualTo(String value) {
            addCriterion("OldOrderingNumber <>", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberGreaterThan(String value) {
            addCriterion("OldOrderingNumber >", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberGreaterThanOrEqualTo(String value) {
            addCriterion("OldOrderingNumber >=", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberLessThan(String value) {
            addCriterion("OldOrderingNumber <", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberLessThanOrEqualTo(String value) {
            addCriterion("OldOrderingNumber <=", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberLike(String value) {
            addCriterion("OldOrderingNumber like", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberNotLike(String value) {
            addCriterion("OldOrderingNumber not like", value, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberIn(List<String> values) {
            addCriterion("OldOrderingNumber in", values, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberNotIn(List<String> values) {
            addCriterion("OldOrderingNumber not in", values, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberBetween(String value1, String value2) {
            addCriterion("OldOrderingNumber between", value1, value2, "oldorderingnumber");
            return (Criteria) this;
        }

        public Criteria andOldorderingnumberNotBetween(String value1, String value2) {
            addCriterion("OldOrderingNumber not between", value1, value2, "oldorderingnumber");
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