package com.slk.wph.module.WPH_Feedmenu.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WphFeedmenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WphFeedmenuExample() {
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

        public Criteria andWphFeedtypeFidIsNull() {
            addCriterion("wph_feedType_Fid is null");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidIsNotNull() {
            addCriterion("wph_feedType_Fid is not null");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid =", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidNotEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid <>", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidGreaterThan(Integer value) {
            addCriterion("wph_feedType_Fid >", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidGreaterThanOrEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid >=", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidLessThan(Integer value) {
            addCriterion("wph_feedType_Fid <", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidLessThanOrEqualTo(Integer value) {
            addCriterion("wph_feedType_Fid <=", value, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidIn(List<Integer> values) {
            addCriterion("wph_feedType_Fid in", values, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidNotIn(List<Integer> values) {
            addCriterion("wph_feedType_Fid not in", values, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedType_Fid between", value1, value2, "wphFeedtypeFid");
            return (Criteria) this;
        }

        public Criteria andWphFeedtypeFidNotBetween(Integer value1, Integer value2) {
            addCriterion("wph_feedType_Fid not between", value1, value2, "wphFeedtypeFid");
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

        public Criteria andTypeIsNull() {
            addCriterion("Type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("Type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("Type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("Type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("Type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("Type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("Type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("Type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("Type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("Type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("Type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("Type not between", value1, value2, "type");
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

        public Criteria andMeterageIsNull() {
            addCriterion("Meterage is null");
            return (Criteria) this;
        }

        public Criteria andMeterageIsNotNull() {
            addCriterion("Meterage is not null");
            return (Criteria) this;
        }

        public Criteria andMeterageEqualTo(Integer value) {
            addCriterion("Meterage =", value, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageNotEqualTo(Integer value) {
            addCriterion("Meterage <>", value, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageGreaterThan(Integer value) {
            addCriterion("Meterage >", value, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageGreaterThanOrEqualTo(Integer value) {
            addCriterion("Meterage >=", value, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageLessThan(Integer value) {
            addCriterion("Meterage <", value, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageLessThanOrEqualTo(Integer value) {
            addCriterion("Meterage <=", value, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageIn(List<Integer> values) {
            addCriterion("Meterage in", values, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageNotIn(List<Integer> values) {
            addCriterion("Meterage not in", values, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageBetween(Integer value1, Integer value2) {
            addCriterion("Meterage between", value1, value2, "meterage");
            return (Criteria) this;
        }

        public Criteria andMeterageNotBetween(Integer value1, Integer value2) {
            addCriterion("Meterage not between", value1, value2, "meterage");
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

        public Criteria andUuidIsNull() {
            addCriterion("UUID is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("UUID is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("UUID =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("UUID <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("UUID >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("UUID >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("UUID <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("UUID <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("UUID like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("UUID not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("UUID in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("UUID not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("UUID between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("UUID not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNull() {
            addCriterion("maxNum is null");
            return (Criteria) this;
        }

        public Criteria andMaxnumIsNotNull() {
            addCriterion("maxNum is not null");
            return (Criteria) this;
        }

        public Criteria andMaxnumEqualTo(Integer value) {
            addCriterion("maxNum =", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotEqualTo(Integer value) {
            addCriterion("maxNum <>", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThan(Integer value) {
            addCriterion("maxNum >", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maxNum >=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThan(Integer value) {
            addCriterion("maxNum <", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumLessThanOrEqualTo(Integer value) {
            addCriterion("maxNum <=", value, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumIn(List<Integer> values) {
            addCriterion("maxNum in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotIn(List<Integer> values) {
            addCriterion("maxNum not in", values, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumBetween(Integer value1, Integer value2) {
            addCriterion("maxNum between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andMaxnumNotBetween(Integer value1, Integer value2) {
            addCriterion("maxNum not between", value1, value2, "maxnum");
            return (Criteria) this;
        }

        public Criteria andNownumIsNull() {
            addCriterion("nowNum is null");
            return (Criteria) this;
        }

        public Criteria andNownumIsNotNull() {
            addCriterion("nowNum is not null");
            return (Criteria) this;
        }

        public Criteria andNownumEqualTo(Integer value) {
            addCriterion("nowNum =", value, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumNotEqualTo(Integer value) {
            addCriterion("nowNum <>", value, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumGreaterThan(Integer value) {
            addCriterion("nowNum >", value, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumGreaterThanOrEqualTo(Integer value) {
            addCriterion("nowNum >=", value, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumLessThan(Integer value) {
            addCriterion("nowNum <", value, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumLessThanOrEqualTo(Integer value) {
            addCriterion("nowNum <=", value, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumIn(List<Integer> values) {
            addCriterion("nowNum in", values, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumNotIn(List<Integer> values) {
            addCriterion("nowNum not in", values, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumBetween(Integer value1, Integer value2) {
            addCriterion("nowNum between", value1, value2, "nownum");
            return (Criteria) this;
        }

        public Criteria andNownumNotBetween(Integer value1, Integer value2) {
            addCriterion("nowNum not between", value1, value2, "nownum");
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