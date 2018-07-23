package com.slk.wph.module.Wph_Servicedetails.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphServicedetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphServicedetailsExample() {
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

        public Criteria andJoinuuidIsNull() {
            addCriterion("JoinUUID is null");
            return (Criteria) this;
        }

        public Criteria andJoinuuidIsNotNull() {
            addCriterion("JoinUUID is not null");
            return (Criteria) this;
        }

        public Criteria andJoinuuidEqualTo(String value) {
            addCriterion("JoinUUID =", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidNotEqualTo(String value) {
            addCriterion("JoinUUID <>", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidGreaterThan(String value) {
            addCriterion("JoinUUID >", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidGreaterThanOrEqualTo(String value) {
            addCriterion("JoinUUID >=", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidLessThan(String value) {
            addCriterion("JoinUUID <", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidLessThanOrEqualTo(String value) {
            addCriterion("JoinUUID <=", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidLike(String value) {
            addCriterion("JoinUUID like", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidNotLike(String value) {
            addCriterion("JoinUUID not like", value, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidIn(List<String> values) {
            addCriterion("JoinUUID in", values, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidNotIn(List<String> values) {
            addCriterion("JoinUUID not in", values, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidBetween(String value1, String value2) {
            addCriterion("JoinUUID between", value1, value2, "joinuuid");
            return (Criteria) this;
        }

        public Criteria andJoinuuidNotBetween(String value1, String value2) {
            addCriterion("JoinUUID not between", value1, value2, "joinuuid");
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