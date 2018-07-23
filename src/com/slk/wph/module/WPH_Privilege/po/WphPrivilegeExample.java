package com.slk.wph.module.WPH_Privilege.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphPrivilegeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphPrivilegeExample() {
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

        public Criteria andPrivilegemasterIsNull() {
            addCriterion("PrivilegeMaster is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterIsNotNull() {
            addCriterion("PrivilegeMaster is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterEqualTo(String value) {
            addCriterion("PrivilegeMaster =", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterNotEqualTo(String value) {
            addCriterion("PrivilegeMaster <>", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterGreaterThan(String value) {
            addCriterion("PrivilegeMaster >", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterGreaterThanOrEqualTo(String value) {
            addCriterion("PrivilegeMaster >=", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterLessThan(String value) {
            addCriterion("PrivilegeMaster <", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterLessThanOrEqualTo(String value) {
            addCriterion("PrivilegeMaster <=", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterLike(String value) {
            addCriterion("PrivilegeMaster like", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterNotLike(String value) {
            addCriterion("PrivilegeMaster not like", value, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterIn(List<String> values) {
            addCriterion("PrivilegeMaster in", values, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterNotIn(List<String> values) {
            addCriterion("PrivilegeMaster not in", values, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterBetween(String value1, String value2) {
            addCriterion("PrivilegeMaster between", value1, value2, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemasterNotBetween(String value1, String value2) {
            addCriterion("PrivilegeMaster not between", value1, value2, "privilegemaster");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueIsNull() {
            addCriterion("PrivilegeMasterValue is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueIsNotNull() {
            addCriterion("PrivilegeMasterValue is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueEqualTo(Integer value) {
            addCriterion("PrivilegeMasterValue =", value, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueNotEqualTo(Integer value) {
            addCriterion("PrivilegeMasterValue <>", value, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueGreaterThan(Integer value) {
            addCriterion("PrivilegeMasterValue >", value, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrivilegeMasterValue >=", value, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueLessThan(Integer value) {
            addCriterion("PrivilegeMasterValue <", value, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueLessThanOrEqualTo(Integer value) {
            addCriterion("PrivilegeMasterValue <=", value, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueIn(List<Integer> values) {
            addCriterion("PrivilegeMasterValue in", values, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueNotIn(List<Integer> values) {
            addCriterion("PrivilegeMasterValue not in", values, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueBetween(Integer value1, Integer value2) {
            addCriterion("PrivilegeMasterValue between", value1, value2, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegemastervalueNotBetween(Integer value1, Integer value2) {
            addCriterion("PrivilegeMasterValue not between", value1, value2, "privilegemastervalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessIsNull() {
            addCriterion("PrivilegeAccess is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessIsNotNull() {
            addCriterion("PrivilegeAccess is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessEqualTo(String value) {
            addCriterion("PrivilegeAccess =", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessNotEqualTo(String value) {
            addCriterion("PrivilegeAccess <>", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessGreaterThan(String value) {
            addCriterion("PrivilegeAccess >", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessGreaterThanOrEqualTo(String value) {
            addCriterion("PrivilegeAccess >=", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessLessThan(String value) {
            addCriterion("PrivilegeAccess <", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessLessThanOrEqualTo(String value) {
            addCriterion("PrivilegeAccess <=", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessLike(String value) {
            addCriterion("PrivilegeAccess like", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessNotLike(String value) {
            addCriterion("PrivilegeAccess not like", value, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessIn(List<String> values) {
            addCriterion("PrivilegeAccess in", values, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessNotIn(List<String> values) {
            addCriterion("PrivilegeAccess not in", values, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessBetween(String value1, String value2) {
            addCriterion("PrivilegeAccess between", value1, value2, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessNotBetween(String value1, String value2) {
            addCriterion("PrivilegeAccess not between", value1, value2, "privilegeaccess");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueIsNull() {
            addCriterion("PrivilegeAccessValue is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueIsNotNull() {
            addCriterion("PrivilegeAccessValue is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueEqualTo(Integer value) {
            addCriterion("PrivilegeAccessValue =", value, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueNotEqualTo(Integer value) {
            addCriterion("PrivilegeAccessValue <>", value, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueGreaterThan(Integer value) {
            addCriterion("PrivilegeAccessValue >", value, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueGreaterThanOrEqualTo(Integer value) {
            addCriterion("PrivilegeAccessValue >=", value, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueLessThan(Integer value) {
            addCriterion("PrivilegeAccessValue <", value, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueLessThanOrEqualTo(Integer value) {
            addCriterion("PrivilegeAccessValue <=", value, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueIn(List<Integer> values) {
            addCriterion("PrivilegeAccessValue in", values, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueNotIn(List<Integer> values) {
            addCriterion("PrivilegeAccessValue not in", values, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueBetween(Integer value1, Integer value2) {
            addCriterion("PrivilegeAccessValue between", value1, value2, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccessvalueNotBetween(Integer value1, Integer value2) {
            addCriterion("PrivilegeAccessValue not between", value1, value2, "privilegeaccessvalue");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlIsNull() {
            addCriterion("PrivilegeAccessCodeOrUrl is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlIsNotNull() {
            addCriterion("PrivilegeAccessCodeOrUrl is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlEqualTo(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl =", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlNotEqualTo(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl <>", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlGreaterThan(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl >", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlGreaterThanOrEqualTo(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl >=", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlLessThan(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl <", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlLessThanOrEqualTo(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl <=", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlLike(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl like", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlNotLike(String value) {
            addCriterion("PrivilegeAccessCodeOrUrl not like", value, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlIn(List<String> values) {
            addCriterion("PrivilegeAccessCodeOrUrl in", values, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlNotIn(List<String> values) {
            addCriterion("PrivilegeAccessCodeOrUrl not in", values, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlBetween(String value1, String value2) {
            addCriterion("PrivilegeAccessCodeOrUrl between", value1, value2, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeaccesscodeorurlNotBetween(String value1, String value2) {
            addCriterion("PrivilegeAccessCodeOrUrl not between", value1, value2, "privilegeaccesscodeorurl");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationIsNull() {
            addCriterion("PrivilegeOperation is null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationIsNotNull() {
            addCriterion("PrivilegeOperation is not null");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationEqualTo(String value) {
            addCriterion("PrivilegeOperation =", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationNotEqualTo(String value) {
            addCriterion("PrivilegeOperation <>", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationGreaterThan(String value) {
            addCriterion("PrivilegeOperation >", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationGreaterThanOrEqualTo(String value) {
            addCriterion("PrivilegeOperation >=", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationLessThan(String value) {
            addCriterion("PrivilegeOperation <", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationLessThanOrEqualTo(String value) {
            addCriterion("PrivilegeOperation <=", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationLike(String value) {
            addCriterion("PrivilegeOperation like", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationNotLike(String value) {
            addCriterion("PrivilegeOperation not like", value, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationIn(List<String> values) {
            addCriterion("PrivilegeOperation in", values, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationNotIn(List<String> values) {
            addCriterion("PrivilegeOperation not in", values, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationBetween(String value1, String value2) {
            addCriterion("PrivilegeOperation between", value1, value2, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andPrivilegeoperationNotBetween(String value1, String value2) {
            addCriterion("PrivilegeOperation not between", value1, value2, "privilegeoperation");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidIsNull() {
            addCriterion("Modify_UserFid is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidIsNotNull() {
            addCriterion("Modify_UserFid is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidEqualTo(Integer value) {
            addCriterion("Modify_UserFid =", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidNotEqualTo(Integer value) {
            addCriterion("Modify_UserFid <>", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidGreaterThan(Integer value) {
            addCriterion("Modify_UserFid >", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Modify_UserFid >=", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidLessThan(Integer value) {
            addCriterion("Modify_UserFid <", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidLessThanOrEqualTo(Integer value) {
            addCriterion("Modify_UserFid <=", value, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidIn(List<Integer> values) {
            addCriterion("Modify_UserFid in", values, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidNotIn(List<Integer> values) {
            addCriterion("Modify_UserFid not in", values, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidBetween(Integer value1, Integer value2) {
            addCriterion("Modify_UserFid between", value1, value2, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifyUserfidNotBetween(Integer value1, Integer value2) {
            addCriterion("Modify_UserFid not between", value1, value2, "modifyUserfid");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNull() {
            addCriterion("ModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andModifydateIsNotNull() {
            addCriterion("ModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andModifydateEqualTo(Date value) {
            addCriterion("ModifyDate =", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotEqualTo(Date value) {
            addCriterion("ModifyDate <>", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThan(Date value) {
            addCriterion("ModifyDate >", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("ModifyDate >=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThan(Date value) {
            addCriterion("ModifyDate <", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateLessThanOrEqualTo(Date value) {
            addCriterion("ModifyDate <=", value, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateIn(List<Date> values) {
            addCriterion("ModifyDate in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotIn(List<Date> values) {
            addCriterion("ModifyDate not in", values, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateBetween(Date value1, Date value2) {
            addCriterion("ModifyDate between", value1, value2, "modifydate");
            return (Criteria) this;
        }

        public Criteria andModifydateNotBetween(Date value1, Date value2) {
            addCriterion("ModifyDate not between", value1, value2, "modifydate");
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