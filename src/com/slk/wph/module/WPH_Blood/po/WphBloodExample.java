package com.slk.wph.module.WPH_Blood.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphBloodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphBloodExample() {
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

        public Criteria andCustomerHospitalidIsNull() {
            addCriterion("Customer_HospitalId is null");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidIsNotNull() {
            addCriterion("Customer_HospitalId is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidEqualTo(String value) {
            addCriterion("Customer_HospitalId =", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidNotEqualTo(String value) {
            addCriterion("Customer_HospitalId <>", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidGreaterThan(String value) {
            addCriterion("Customer_HospitalId >", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidGreaterThanOrEqualTo(String value) {
            addCriterion("Customer_HospitalId >=", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidLessThan(String value) {
            addCriterion("Customer_HospitalId <", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidLessThanOrEqualTo(String value) {
            addCriterion("Customer_HospitalId <=", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidLike(String value) {
            addCriterion("Customer_HospitalId like", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidNotLike(String value) {
            addCriterion("Customer_HospitalId not like", value, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidIn(List<String> values) {
            addCriterion("Customer_HospitalId in", values, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidNotIn(List<String> values) {
            addCriterion("Customer_HospitalId not in", values, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidBetween(String value1, String value2) {
            addCriterion("Customer_HospitalId between", value1, value2, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustomerHospitalidNotBetween(String value1, String value2) {
            addCriterion("Customer_HospitalId not between", value1, value2, "customerHospitalid");
            return (Criteria) this;
        }

        public Criteria andCustmerNameIsNull() {
            addCriterion("Custmer_Name is null");
            return (Criteria) this;
        }

        public Criteria andCustmerNameIsNotNull() {
            addCriterion("Custmer_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCustmerNameEqualTo(String value) {
            addCriterion("Custmer_Name =", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameNotEqualTo(String value) {
            addCriterion("Custmer_Name <>", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameGreaterThan(String value) {
            addCriterion("Custmer_Name >", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameGreaterThanOrEqualTo(String value) {
            addCriterion("Custmer_Name >=", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameLessThan(String value) {
            addCriterion("Custmer_Name <", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameLessThanOrEqualTo(String value) {
            addCriterion("Custmer_Name <=", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameLike(String value) {
            addCriterion("Custmer_Name like", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameNotLike(String value) {
            addCriterion("Custmer_Name not like", value, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameIn(List<String> values) {
            addCriterion("Custmer_Name in", values, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameNotIn(List<String> values) {
            addCriterion("Custmer_Name not in", values, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameBetween(String value1, String value2) {
            addCriterion("Custmer_Name between", value1, value2, "custmerName");
            return (Criteria) this;
        }

        public Criteria andCustmerNameNotBetween(String value1, String value2) {
            addCriterion("Custmer_Name not between", value1, value2, "custmerName");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNull() {
            addCriterion("BloodType is null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIsNotNull() {
            addCriterion("BloodType is not null");
            return (Criteria) this;
        }

        public Criteria andBloodtypeEqualTo(String value) {
            addCriterion("BloodType =", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotEqualTo(String value) {
            addCriterion("BloodType <>", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThan(String value) {
            addCriterion("BloodType >", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeGreaterThanOrEqualTo(String value) {
            addCriterion("BloodType >=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThan(String value) {
            addCriterion("BloodType <", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLessThanOrEqualTo(String value) {
            addCriterion("BloodType <=", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeLike(String value) {
            addCriterion("BloodType like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotLike(String value) {
            addCriterion("BloodType not like", value, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeIn(List<String> values) {
            addCriterion("BloodType in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotIn(List<String> values) {
            addCriterion("BloodType not in", values, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeBetween(String value1, String value2) {
            addCriterion("BloodType between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andBloodtypeNotBetween(String value1, String value2) {
            addCriterion("BloodType not between", value1, value2, "bloodtype");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("Picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("Picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("Picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("Picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("Picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("Picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("Picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("Picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("Picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("Picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("Picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("Picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("Picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("Picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andDosageIsNull() {
            addCriterion("Dosage is null");
            return (Criteria) this;
        }

        public Criteria andDosageIsNotNull() {
            addCriterion("Dosage is not null");
            return (Criteria) this;
        }

        public Criteria andDosageEqualTo(Double value) {
            addCriterion("Dosage =", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotEqualTo(Double value) {
            addCriterion("Dosage <>", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThan(Double value) {
            addCriterion("Dosage >", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageGreaterThanOrEqualTo(Double value) {
            addCriterion("Dosage >=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThan(Double value) {
            addCriterion("Dosage <", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageLessThanOrEqualTo(Double value) {
            addCriterion("Dosage <=", value, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageIn(List<Double> values) {
            addCriterion("Dosage in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotIn(List<Double> values) {
            addCriterion("Dosage not in", values, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageBetween(Double value1, Double value2) {
            addCriterion("Dosage between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andDosageNotBetween(Double value1, Double value2) {
            addCriterion("Dosage not between", value1, value2, "dosage");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyIsNull() {
            addCriterion("NowDosageMoney is null");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyIsNotNull() {
            addCriterion("NowDosageMoney is not null");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyEqualTo(Double value) {
            addCriterion("NowDosageMoney =", value, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyNotEqualTo(Double value) {
            addCriterion("NowDosageMoney <>", value, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyGreaterThan(Double value) {
            addCriterion("NowDosageMoney >", value, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("NowDosageMoney >=", value, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyLessThan(Double value) {
            addCriterion("NowDosageMoney <", value, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyLessThanOrEqualTo(Double value) {
            addCriterion("NowDosageMoney <=", value, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyIn(List<Double> values) {
            addCriterion("NowDosageMoney in", values, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyNotIn(List<Double> values) {
            addCriterion("NowDosageMoney not in", values, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyBetween(Double value1, Double value2) {
            addCriterion("NowDosageMoney between", value1, value2, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosagemoneyNotBetween(Double value1, Double value2) {
            addCriterion("NowDosageMoney not between", value1, value2, "nowdosagemoney");
            return (Criteria) this;
        }

        public Criteria andNowdosageIsNull() {
            addCriterion("NowDosage is null");
            return (Criteria) this;
        }

        public Criteria andNowdosageIsNotNull() {
            addCriterion("NowDosage is not null");
            return (Criteria) this;
        }

        public Criteria andNowdosageEqualTo(Double value) {
            addCriterion("NowDosage =", value, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageNotEqualTo(Double value) {
            addCriterion("NowDosage <>", value, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageGreaterThan(Double value) {
            addCriterion("NowDosage >", value, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageGreaterThanOrEqualTo(Double value) {
            addCriterion("NowDosage >=", value, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageLessThan(Double value) {
            addCriterion("NowDosage <", value, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageLessThanOrEqualTo(Double value) {
            addCriterion("NowDosage <=", value, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageIn(List<Double> values) {
            addCriterion("NowDosage in", values, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageNotIn(List<Double> values) {
            addCriterion("NowDosage not in", values, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageBetween(Double value1, Double value2) {
            addCriterion("NowDosage between", value1, value2, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andNowdosageNotBetween(Double value1, Double value2) {
            addCriterion("NowDosage not between", value1, value2, "nowdosage");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("Status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("Status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("Status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("Status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("Status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("Status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("Status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("Status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("Status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("Status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Status not between", value1, value2, "status");
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