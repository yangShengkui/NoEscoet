package com.slk.wph.module.WPH_Customer.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphCustomerExample() {
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

        public Criteria andHospitalldIsNull() {
            addCriterion("Hospitalld is null");
            return (Criteria) this;
        }

        public Criteria andHospitalldIsNotNull() {
            addCriterion("Hospitalld is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalldEqualTo(String value) {
            addCriterion("Hospitalld =", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldNotEqualTo(String value) {
            addCriterion("Hospitalld <>", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldGreaterThan(String value) {
            addCriterion("Hospitalld >", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldGreaterThanOrEqualTo(String value) {
            addCriterion("Hospitalld >=", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldLessThan(String value) {
            addCriterion("Hospitalld <", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldLessThanOrEqualTo(String value) {
            addCriterion("Hospitalld <=", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldLike(String value) {
            addCriterion("Hospitalld like", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldNotLike(String value) {
            addCriterion("Hospitalld not like", value, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldIn(List<String> values) {
            addCriterion("Hospitalld in", values, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldNotIn(List<String> values) {
            addCriterion("Hospitalld not in", values, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldBetween(String value1, String value2) {
            addCriterion("Hospitalld between", value1, value2, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andHospitalldNotBetween(String value1, String value2) {
            addCriterion("Hospitalld not between", value1, value2, "hospitalld");
            return (Criteria) this;
        }

        public Criteria andBindingtimeIsNull() {
            addCriterion("BindingTime is null");
            return (Criteria) this;
        }

        public Criteria andBindingtimeIsNotNull() {
            addCriterion("BindingTime is not null");
            return (Criteria) this;
        }

        public Criteria andBindingtimeEqualTo(Date value) {
            addCriterion("BindingTime =", value, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeNotEqualTo(Date value) {
            addCriterion("BindingTime <>", value, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeGreaterThan(Date value) {
            addCriterion("BindingTime >", value, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("BindingTime >=", value, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeLessThan(Date value) {
            addCriterion("BindingTime <", value, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeLessThanOrEqualTo(Date value) {
            addCriterion("BindingTime <=", value, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeIn(List<Date> values) {
            addCriterion("BindingTime in", values, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeNotIn(List<Date> values) {
            addCriterion("BindingTime not in", values, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeBetween(Date value1, Date value2) {
            addCriterion("BindingTime between", value1, value2, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andBindingtimeNotBetween(Date value1, Date value2) {
            addCriterion("BindingTime not between", value1, value2, "bindingtime");
            return (Criteria) this;
        }

        public Criteria andCodeidIsNull() {
            addCriterion("CodeId is null");
            return (Criteria) this;
        }

        public Criteria andCodeidIsNotNull() {
            addCriterion("CodeId is not null");
            return (Criteria) this;
        }

        public Criteria andCodeidEqualTo(String value) {
            addCriterion("CodeId =", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotEqualTo(String value) {
            addCriterion("CodeId <>", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThan(String value) {
            addCriterion("CodeId >", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidGreaterThanOrEqualTo(String value) {
            addCriterion("CodeId >=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThan(String value) {
            addCriterion("CodeId <", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLessThanOrEqualTo(String value) {
            addCriterion("CodeId <=", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidLike(String value) {
            addCriterion("CodeId like", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotLike(String value) {
            addCriterion("CodeId not like", value, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidIn(List<String> values) {
            addCriterion("CodeId in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotIn(List<String> values) {
            addCriterion("CodeId not in", values, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidBetween(String value1, String value2) {
            addCriterion("CodeId between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andCodeidNotBetween(String value1, String value2) {
            addCriterion("CodeId not between", value1, value2, "codeid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidIsNull() {
            addCriterion("WPH_Hospita_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidIsNotNull() {
            addCriterion("WPH_Hospita_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidEqualTo(Integer value) {
            addCriterion("WPH_Hospita_Fid =", value, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidNotEqualTo(Integer value) {
            addCriterion("WPH_Hospita_Fid <>", value, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidGreaterThan(Integer value) {
            addCriterion("WPH_Hospita_Fid >", value, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("WPH_Hospita_Fid >=", value, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidLessThan(Integer value) {
            addCriterion("WPH_Hospita_Fid <", value, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidLessThanOrEqualTo(Integer value) {
            addCriterion("WPH_Hospita_Fid <=", value, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidIn(List<Integer> values) {
            addCriterion("WPH_Hospita_Fid in", values, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidNotIn(List<Integer> values) {
            addCriterion("WPH_Hospita_Fid not in", values, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Hospita_Fid between", value1, value2, "wphHospitaFid");
            return (Criteria) this;
        }

        public Criteria andWphHospitaFidNotBetween(Integer value1, Integer value2) {
            addCriterion("WPH_Hospita_Fid not between", value1, value2, "wphHospitaFid");
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

        public Criteria andBirthdayIsNull() {
            addCriterion("Birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("Birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("Birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("Birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("Birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("Birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("Birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("Birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("Birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("Birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("Birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("Birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("Birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("Birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("Sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("Sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("Sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("Sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("Sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("Sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("Sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("Sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("Sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("Sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("Sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("Sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("Sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("Sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("Age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("Age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("Age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("Age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("Age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("Age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("Age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("Age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("Age like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("Age not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("Age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("Age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("Age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("Age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("Nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("Nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(Integer value) {
            addCriterion("Nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(Integer value) {
            addCriterion("Nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(Integer value) {
            addCriterion("Nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(Integer value) {
            addCriterion("Nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(Integer value) {
            addCriterion("Nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(Integer value) {
            addCriterion("Nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<Integer> values) {
            addCriterion("Nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<Integer> values) {
            addCriterion("Nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(Integer value1, Integer value2) {
            addCriterion("Nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(Integer value1, Integer value2) {
            addCriterion("Nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("Balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("Balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("Balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("Balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("Balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("Balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("Balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("Balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("Balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("Balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("Balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("Balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusIsNull() {
            addCriterion("HospitalldStatus is null");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusIsNotNull() {
            addCriterion("HospitalldStatus is not null");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusEqualTo(Integer value) {
            addCriterion("HospitalldStatus =", value, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusNotEqualTo(Integer value) {
            addCriterion("HospitalldStatus <>", value, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusGreaterThan(Integer value) {
            addCriterion("HospitalldStatus >", value, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("HospitalldStatus >=", value, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusLessThan(Integer value) {
            addCriterion("HospitalldStatus <", value, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusLessThanOrEqualTo(Integer value) {
            addCriterion("HospitalldStatus <=", value, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusIn(List<Integer> values) {
            addCriterion("HospitalldStatus in", values, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusNotIn(List<Integer> values) {
            addCriterion("HospitalldStatus not in", values, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusBetween(Integer value1, Integer value2) {
            addCriterion("HospitalldStatus between", value1, value2, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitalldstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("HospitalldStatus not between", value1, value2, "hospitalldstatus");
            return (Criteria) this;
        }

        public Criteria andHospitallddateIsNull() {
            addCriterion("HospitalldDate is null");
            return (Criteria) this;
        }

        public Criteria andHospitallddateIsNotNull() {
            addCriterion("HospitalldDate is not null");
            return (Criteria) this;
        }

        public Criteria andHospitallddateEqualTo(Date value) {
            addCriterion("HospitalldDate =", value, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateNotEqualTo(Date value) {
            addCriterion("HospitalldDate <>", value, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateGreaterThan(Date value) {
            addCriterion("HospitalldDate >", value, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateGreaterThanOrEqualTo(Date value) {
            addCriterion("HospitalldDate >=", value, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateLessThan(Date value) {
            addCriterion("HospitalldDate <", value, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateLessThanOrEqualTo(Date value) {
            addCriterion("HospitalldDate <=", value, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateIn(List<Date> values) {
            addCriterion("HospitalldDate in", values, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateNotIn(List<Date> values) {
            addCriterion("HospitalldDate not in", values, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateBetween(Date value1, Date value2) {
            addCriterion("HospitalldDate between", value1, value2, "hospitallddate");
            return (Criteria) this;
        }

        public Criteria andHospitallddateNotBetween(Date value1, Date value2) {
            addCriterion("HospitalldDate not between", value1, value2, "hospitallddate");
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

        public Criteria andWorkerIsNull() {
            addCriterion("Worker is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIsNotNull() {
            addCriterion("Worker is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerEqualTo(Integer value) {
            addCriterion("Worker =", value, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerNotEqualTo(Integer value) {
            addCriterion("Worker <>", value, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerGreaterThan(Integer value) {
            addCriterion("Worker >", value, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerGreaterThanOrEqualTo(Integer value) {
            addCriterion("Worker >=", value, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerLessThan(Integer value) {
            addCriterion("Worker <", value, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerLessThanOrEqualTo(Integer value) {
            addCriterion("Worker <=", value, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerIn(List<Integer> values) {
            addCriterion("Worker in", values, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerNotIn(List<Integer> values) {
            addCriterion("Worker not in", values, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerBetween(Integer value1, Integer value2) {
            addCriterion("Worker between", value1, value2, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerNotBetween(Integer value1, Integer value2) {
            addCriterion("Worker not between", value1, value2, "worker");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusIsNull() {
            addCriterion("WorkerStatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusIsNotNull() {
            addCriterion("WorkerStatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusEqualTo(Integer value) {
            addCriterion("WorkerStatus =", value, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusNotEqualTo(Integer value) {
            addCriterion("WorkerStatus <>", value, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusGreaterThan(Integer value) {
            addCriterion("WorkerStatus >", value, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("WorkerStatus >=", value, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusLessThan(Integer value) {
            addCriterion("WorkerStatus <", value, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusLessThanOrEqualTo(Integer value) {
            addCriterion("WorkerStatus <=", value, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusIn(List<Integer> values) {
            addCriterion("WorkerStatus in", values, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusNotIn(List<Integer> values) {
            addCriterion("WorkerStatus not in", values, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusBetween(Integer value1, Integer value2) {
            addCriterion("WorkerStatus between", value1, value2, "workerstatus");
            return (Criteria) this;
        }

        public Criteria andWorkerstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("WorkerStatus not between", value1, value2, "workerstatus");
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

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andImgIsNull() {
            addCriterion("Img is null");
            return (Criteria) this;
        }

        public Criteria andImgIsNotNull() {
            addCriterion("Img is not null");
            return (Criteria) this;
        }

        public Criteria andImgEqualTo(String value) {
            addCriterion("Img =", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotEqualTo(String value) {
            addCriterion("Img <>", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThan(String value) {
            addCriterion("Img >", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgGreaterThanOrEqualTo(String value) {
            addCriterion("Img >=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThan(String value) {
            addCriterion("Img <", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLessThanOrEqualTo(String value) {
            addCriterion("Img <=", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgLike(String value) {
            addCriterion("Img like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotLike(String value) {
            addCriterion("Img not like", value, "img");
            return (Criteria) this;
        }

        public Criteria andImgIn(List<String> values) {
            addCriterion("Img in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotIn(List<String> values) {
            addCriterion("Img not in", values, "img");
            return (Criteria) this;
        }

        public Criteria andImgBetween(String value1, String value2) {
            addCriterion("Img between", value1, value2, "img");
            return (Criteria) this;
        }

        public Criteria andImgNotBetween(String value1, String value2) {
            addCriterion("Img not between", value1, value2, "img");
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

        public Criteria andCreatetypeIsNull() {
            addCriterion("CreateType is null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIsNotNull() {
            addCriterion("CreateType is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetypeEqualTo(Integer value) {
            addCriterion("CreateType =", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotEqualTo(Integer value) {
            addCriterion("CreateType <>", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThan(Integer value) {
            addCriterion("CreateType >", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CreateType >=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThan(Integer value) {
            addCriterion("CreateType <", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeLessThanOrEqualTo(Integer value) {
            addCriterion("CreateType <=", value, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeIn(List<Integer> values) {
            addCriterion("CreateType in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotIn(List<Integer> values) {
            addCriterion("CreateType not in", values, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeBetween(Integer value1, Integer value2) {
            addCriterion("CreateType between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andCreatetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("CreateType not between", value1, value2, "createtype");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
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