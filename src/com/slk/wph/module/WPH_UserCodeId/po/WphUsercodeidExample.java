package com.slk.wph.module.WPH_UserCodeId.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphUsercodeidExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphUsercodeidExample() {
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

        public Criteria andCodenumberIsNull() {
            addCriterion("CodeNumber is null");
            return (Criteria) this;
        }

        public Criteria andCodenumberIsNotNull() {
            addCriterion("CodeNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCodenumberEqualTo(String value) {
            addCriterion("CodeNumber =", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotEqualTo(String value) {
            addCriterion("CodeNumber <>", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberGreaterThan(String value) {
            addCriterion("CodeNumber >", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberGreaterThanOrEqualTo(String value) {
            addCriterion("CodeNumber >=", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberLessThan(String value) {
            addCriterion("CodeNumber <", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberLessThanOrEqualTo(String value) {
            addCriterion("CodeNumber <=", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberLike(String value) {
            addCriterion("CodeNumber like", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotLike(String value) {
            addCriterion("CodeNumber not like", value, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberIn(List<String> values) {
            addCriterion("CodeNumber in", values, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotIn(List<String> values) {
            addCriterion("CodeNumber not in", values, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberBetween(String value1, String value2) {
            addCriterion("CodeNumber between", value1, value2, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodenumberNotBetween(String value1, String value2) {
            addCriterion("CodeNumber not between", value1, value2, "codenumber");
            return (Criteria) this;
        }

        public Criteria andCodestatusIsNull() {
            addCriterion("CodeStatus is null");
            return (Criteria) this;
        }

        public Criteria andCodestatusIsNotNull() {
            addCriterion("CodeStatus is not null");
            return (Criteria) this;
        }

        public Criteria andCodestatusEqualTo(Integer value) {
            addCriterion("CodeStatus =", value, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusNotEqualTo(Integer value) {
            addCriterion("CodeStatus <>", value, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusGreaterThan(Integer value) {
            addCriterion("CodeStatus >", value, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("CodeStatus >=", value, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusLessThan(Integer value) {
            addCriterion("CodeStatus <", value, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusLessThanOrEqualTo(Integer value) {
            addCriterion("CodeStatus <=", value, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusIn(List<Integer> values) {
            addCriterion("CodeStatus in", values, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusNotIn(List<Integer> values) {
            addCriterion("CodeStatus not in", values, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusBetween(Integer value1, Integer value2) {
            addCriterion("CodeStatus between", value1, value2, "codestatus");
            return (Criteria) this;
        }

        public Criteria andCodestatusNotBetween(Integer value1, Integer value2) {
            addCriterion("CodeStatus not between", value1, value2, "codestatus");
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

        public Criteria andTypesIsNull() {
            addCriterion("types is null");
            return (Criteria) this;
        }

        public Criteria andTypesIsNotNull() {
            addCriterion("types is not null");
            return (Criteria) this;
        }

        public Criteria andTypesEqualTo(Integer value) {
            addCriterion("types =", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotEqualTo(Integer value) {
            addCriterion("types <>", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThan(Integer value) {
            addCriterion("types >", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesGreaterThanOrEqualTo(Integer value) {
            addCriterion("types >=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThan(Integer value) {
            addCriterion("types <", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesLessThanOrEqualTo(Integer value) {
            addCriterion("types <=", value, "types");
            return (Criteria) this;
        }

        public Criteria andTypesIn(List<Integer> values) {
            addCriterion("types in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotIn(List<Integer> values) {
            addCriterion("types not in", values, "types");
            return (Criteria) this;
        }

        public Criteria andTypesBetween(Integer value1, Integer value2) {
            addCriterion("types between", value1, value2, "types");
            return (Criteria) this;
        }

        public Criteria andTypesNotBetween(Integer value1, Integer value2) {
            addCriterion("types not between", value1, value2, "types");
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