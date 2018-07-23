package com.slk.wph.module.WPH_Card_Relation.po;

import java.util.ArrayList;
import java.util.List;

public class WphCardRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphCardRelationExample() {
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

        public Criteria andCardidIsNull() {
            addCriterion("CardId is null");
            return (Criteria) this;
        }

        public Criteria andCardidIsNotNull() {
            addCriterion("CardId is not null");
            return (Criteria) this;
        }

        public Criteria andCardidEqualTo(String value) {
            addCriterion("CardId =", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotEqualTo(String value) {
            addCriterion("CardId <>", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThan(String value) {
            addCriterion("CardId >", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidGreaterThanOrEqualTo(String value) {
            addCriterion("CardId >=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThan(String value) {
            addCriterion("CardId <", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLessThanOrEqualTo(String value) {
            addCriterion("CardId <=", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidLike(String value) {
            addCriterion("CardId like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotLike(String value) {
            addCriterion("CardId not like", value, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidIn(List<String> values) {
            addCriterion("CardId in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotIn(List<String> values) {
            addCriterion("CardId not in", values, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidBetween(String value1, String value2) {
            addCriterion("CardId between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardidNotBetween(String value1, String value2) {
            addCriterion("CardId not between", value1, value2, "cardid");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNull() {
            addCriterion("CardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardnumberIsNotNull() {
            addCriterion("CardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardnumberEqualTo(String value) {
            addCriterion("CardNumber =", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotEqualTo(String value) {
            addCriterion("CardNumber <>", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThan(String value) {
            addCriterion("CardNumber >", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("CardNumber >=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThan(String value) {
            addCriterion("CardNumber <", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLessThanOrEqualTo(String value) {
            addCriterion("CardNumber <=", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberLike(String value) {
            addCriterion("CardNumber like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotLike(String value) {
            addCriterion("CardNumber not like", value, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberIn(List<String> values) {
            addCriterion("CardNumber in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotIn(List<String> values) {
            addCriterion("CardNumber not in", values, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberBetween(String value1, String value2) {
            addCriterion("CardNumber between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andCardnumberNotBetween(String value1, String value2) {
            addCriterion("CardNumber not between", value1, value2, "cardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardidIsNull() {
            addCriterion("NewCardId is null");
            return (Criteria) this;
        }

        public Criteria andNewcardidIsNotNull() {
            addCriterion("NewCardId is not null");
            return (Criteria) this;
        }

        public Criteria andNewcardidEqualTo(String value) {
            addCriterion("NewCardId =", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidNotEqualTo(String value) {
            addCriterion("NewCardId <>", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidGreaterThan(String value) {
            addCriterion("NewCardId >", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidGreaterThanOrEqualTo(String value) {
            addCriterion("NewCardId >=", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidLessThan(String value) {
            addCriterion("NewCardId <", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidLessThanOrEqualTo(String value) {
            addCriterion("NewCardId <=", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidLike(String value) {
            addCriterion("NewCardId like", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidNotLike(String value) {
            addCriterion("NewCardId not like", value, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidIn(List<String> values) {
            addCriterion("NewCardId in", values, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidNotIn(List<String> values) {
            addCriterion("NewCardId not in", values, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidBetween(String value1, String value2) {
            addCriterion("NewCardId between", value1, value2, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardidNotBetween(String value1, String value2) {
            addCriterion("NewCardId not between", value1, value2, "newcardid");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberIsNull() {
            addCriterion("NewCardNumber is null");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberIsNotNull() {
            addCriterion("NewCardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberEqualTo(String value) {
            addCriterion("NewCardNumber =", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberNotEqualTo(String value) {
            addCriterion("NewCardNumber <>", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberGreaterThan(String value) {
            addCriterion("NewCardNumber >", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("NewCardNumber >=", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberLessThan(String value) {
            addCriterion("NewCardNumber <", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberLessThanOrEqualTo(String value) {
            addCriterion("NewCardNumber <=", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberLike(String value) {
            addCriterion("NewCardNumber like", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberNotLike(String value) {
            addCriterion("NewCardNumber not like", value, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberIn(List<String> values) {
            addCriterion("NewCardNumber in", values, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberNotIn(List<String> values) {
            addCriterion("NewCardNumber not in", values, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberBetween(String value1, String value2) {
            addCriterion("NewCardNumber between", value1, value2, "newcardnumber");
            return (Criteria) this;
        }

        public Criteria andNewcardnumberNotBetween(String value1, String value2) {
            addCriterion("NewCardNumber not between", value1, value2, "newcardnumber");
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