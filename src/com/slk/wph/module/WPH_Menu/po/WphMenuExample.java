package com.slk.wph.module.WPH_Menu.po;

import java.util.ArrayList;
import java.util.List;

public class WphMenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphMenuExample() {
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

        public Criteria andMenunameIsNull() {
            addCriterion("MenuName is null");
            return (Criteria) this;
        }

        public Criteria andMenunameIsNotNull() {
            addCriterion("MenuName is not null");
            return (Criteria) this;
        }

        public Criteria andMenunameEqualTo(String value) {
            addCriterion("MenuName =", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotEqualTo(String value) {
            addCriterion("MenuName <>", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThan(String value) {
            addCriterion("MenuName >", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameGreaterThanOrEqualTo(String value) {
            addCriterion("MenuName >=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThan(String value) {
            addCriterion("MenuName <", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLessThanOrEqualTo(String value) {
            addCriterion("MenuName <=", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameLike(String value) {
            addCriterion("MenuName like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotLike(String value) {
            addCriterion("MenuName not like", value, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameIn(List<String> values) {
            addCriterion("MenuName in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotIn(List<String> values) {
            addCriterion("MenuName not in", values, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameBetween(String value1, String value2) {
            addCriterion("MenuName between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenunameNotBetween(String value1, String value2) {
            addCriterion("MenuName not between", value1, value2, "menuname");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNull() {
            addCriterion("MenuUrl is null");
            return (Criteria) this;
        }

        public Criteria andMenuurlIsNotNull() {
            addCriterion("MenuUrl is not null");
            return (Criteria) this;
        }

        public Criteria andMenuurlEqualTo(String value) {
            addCriterion("MenuUrl =", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotEqualTo(String value) {
            addCriterion("MenuUrl <>", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThan(String value) {
            addCriterion("MenuUrl >", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlGreaterThanOrEqualTo(String value) {
            addCriterion("MenuUrl >=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThan(String value) {
            addCriterion("MenuUrl <", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLessThanOrEqualTo(String value) {
            addCriterion("MenuUrl <=", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlLike(String value) {
            addCriterion("MenuUrl like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotLike(String value) {
            addCriterion("MenuUrl not like", value, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlIn(List<String> values) {
            addCriterion("MenuUrl in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotIn(List<String> values) {
            addCriterion("MenuUrl not in", values, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlBetween(String value1, String value2) {
            addCriterion("MenuUrl between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenuurlNotBetween(String value1, String value2) {
            addCriterion("MenuUrl not between", value1, value2, "menuurl");
            return (Criteria) this;
        }

        public Criteria andMenudescIsNull() {
            addCriterion("MenuDesc is null");
            return (Criteria) this;
        }

        public Criteria andMenudescIsNotNull() {
            addCriterion("MenuDesc is not null");
            return (Criteria) this;
        }

        public Criteria andMenudescEqualTo(String value) {
            addCriterion("MenuDesc =", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescNotEqualTo(String value) {
            addCriterion("MenuDesc <>", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescGreaterThan(String value) {
            addCriterion("MenuDesc >", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescGreaterThanOrEqualTo(String value) {
            addCriterion("MenuDesc >=", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescLessThan(String value) {
            addCriterion("MenuDesc <", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescLessThanOrEqualTo(String value) {
            addCriterion("MenuDesc <=", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescLike(String value) {
            addCriterion("MenuDesc like", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescNotLike(String value) {
            addCriterion("MenuDesc not like", value, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescIn(List<String> values) {
            addCriterion("MenuDesc in", values, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescNotIn(List<String> values) {
            addCriterion("MenuDesc not in", values, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescBetween(String value1, String value2) {
            addCriterion("MenuDesc between", value1, value2, "menudesc");
            return (Criteria) this;
        }

        public Criteria andMenudescNotBetween(String value1, String value2) {
            addCriterion("MenuDesc not between", value1, value2, "menudesc");
            return (Criteria) this;
        }

        public Criteria andParentFidIsNull() {
            addCriterion("Parent_Fid is null");
            return (Criteria) this;
        }

        public Criteria andParentFidIsNotNull() {
            addCriterion("Parent_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andParentFidEqualTo(Integer value) {
            addCriterion("Parent_Fid =", value, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidNotEqualTo(Integer value) {
            addCriterion("Parent_Fid <>", value, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidGreaterThan(Integer value) {
            addCriterion("Parent_Fid >", value, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Parent_Fid >=", value, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidLessThan(Integer value) {
            addCriterion("Parent_Fid <", value, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidLessThanOrEqualTo(Integer value) {
            addCriterion("Parent_Fid <=", value, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidIn(List<Integer> values) {
            addCriterion("Parent_Fid in", values, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidNotIn(List<Integer> values) {
            addCriterion("Parent_Fid not in", values, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidBetween(Integer value1, Integer value2) {
            addCriterion("Parent_Fid between", value1, value2, "parentFid");
            return (Criteria) this;
        }

        public Criteria andParentFidNotBetween(Integer value1, Integer value2) {
            addCriterion("Parent_Fid not between", value1, value2, "parentFid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidIsNull() {
            addCriterion("Create_UserFid is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidIsNotNull() {
            addCriterion("Create_UserFid is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidEqualTo(Integer value) {
            addCriterion("Create_UserFid =", value, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidNotEqualTo(Integer value) {
            addCriterion("Create_UserFid <>", value, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidGreaterThan(Integer value) {
            addCriterion("Create_UserFid >", value, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Create_UserFid >=", value, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidLessThan(Integer value) {
            addCriterion("Create_UserFid <", value, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidLessThanOrEqualTo(Integer value) {
            addCriterion("Create_UserFid <=", value, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidIn(List<Integer> values) {
            addCriterion("Create_UserFid in", values, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidNotIn(List<Integer> values) {
            addCriterion("Create_UserFid not in", values, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidBetween(Integer value1, Integer value2) {
            addCriterion("Create_UserFid between", value1, value2, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andCreateUserfidNotBetween(Integer value1, Integer value2) {
            addCriterion("Create_UserFid not between", value1, value2, "createUserfid");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNull() {
            addCriterion("levels is null");
            return (Criteria) this;
        }

        public Criteria andLevelsIsNotNull() {
            addCriterion("levels is not null");
            return (Criteria) this;
        }

        public Criteria andLevelsEqualTo(Integer value) {
            addCriterion("levels =", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotEqualTo(Integer value) {
            addCriterion("levels <>", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThan(Integer value) {
            addCriterion("levels >", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsGreaterThanOrEqualTo(Integer value) {
            addCriterion("levels >=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThan(Integer value) {
            addCriterion("levels <", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsLessThanOrEqualTo(Integer value) {
            addCriterion("levels <=", value, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsIn(List<Integer> values) {
            addCriterion("levels in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotIn(List<Integer> values) {
            addCriterion("levels not in", values, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsBetween(Integer value1, Integer value2) {
            addCriterion("levels between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andLevelsNotBetween(Integer value1, Integer value2) {
            addCriterion("levels not between", value1, value2, "levels");
            return (Criteria) this;
        }

        public Criteria andMenutypeIsNull() {
            addCriterion("MenuType is null");
            return (Criteria) this;
        }

        public Criteria andMenutypeIsNotNull() {
            addCriterion("MenuType is not null");
            return (Criteria) this;
        }

        public Criteria andMenutypeEqualTo(Integer value) {
            addCriterion("MenuType =", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotEqualTo(Integer value) {
            addCriterion("MenuType <>", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeGreaterThan(Integer value) {
            addCriterion("MenuType >", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("MenuType >=", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeLessThan(Integer value) {
            addCriterion("MenuType <", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeLessThanOrEqualTo(Integer value) {
            addCriterion("MenuType <=", value, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeIn(List<Integer> values) {
            addCriterion("MenuType in", values, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotIn(List<Integer> values) {
            addCriterion("MenuType not in", values, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeBetween(Integer value1, Integer value2) {
            addCriterion("MenuType between", value1, value2, "menutype");
            return (Criteria) this;
        }

        public Criteria andMenutypeNotBetween(Integer value1, Integer value2) {
            addCriterion("MenuType not between", value1, value2, "menutype");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("OrderS is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("OrderS is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("OrderS =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("OrderS <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("OrderS >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderS >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("OrderS <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("OrderS <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("OrderS in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("OrderS not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("OrderS between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderS not between", value1, value2, "orders");
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