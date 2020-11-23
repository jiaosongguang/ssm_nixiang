package com.tusdao.catalogmanager.model;

import java.util.ArrayList;
import java.util.List;

public class DatabaseManagerTableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DatabaseManagerTableExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDmIdIsNull() {
            addCriterion("dm_id is null");
            return (Criteria) this;
        }

        public Criteria andDmIdIsNotNull() {
            addCriterion("dm_id is not null");
            return (Criteria) this;
        }

        public Criteria andDmIdEqualTo(Long value) {
            addCriterion("dm_id =", value, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdNotEqualTo(Long value) {
            addCriterion("dm_id <>", value, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdGreaterThan(Long value) {
            addCriterion("dm_id >", value, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdGreaterThanOrEqualTo(Long value) {
            addCriterion("dm_id >=", value, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdLessThan(Long value) {
            addCriterion("dm_id <", value, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdLessThanOrEqualTo(Long value) {
            addCriterion("dm_id <=", value, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdIn(List<Long> values) {
            addCriterion("dm_id in", values, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdNotIn(List<Long> values) {
            addCriterion("dm_id not in", values, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdBetween(Long value1, Long value2) {
            addCriterion("dm_id between", value1, value2, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmIdNotBetween(Long value1, Long value2) {
            addCriterion("dm_id not between", value1, value2, "dmId");
            return (Criteria) this;
        }

        public Criteria andDmTypeIsNull() {
            addCriterion("dm_type is null");
            return (Criteria) this;
        }

        public Criteria andDmTypeIsNotNull() {
            addCriterion("dm_type is not null");
            return (Criteria) this;
        }

        public Criteria andDmTypeEqualTo(Integer value) {
            addCriterion("dm_type =", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeNotEqualTo(Integer value) {
            addCriterion("dm_type <>", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeGreaterThan(Integer value) {
            addCriterion("dm_type >", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dm_type >=", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeLessThan(Integer value) {
            addCriterion("dm_type <", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeLessThanOrEqualTo(Integer value) {
            addCriterion("dm_type <=", value, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeIn(List<Integer> values) {
            addCriterion("dm_type in", values, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeNotIn(List<Integer> values) {
            addCriterion("dm_type not in", values, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeBetween(Integer value1, Integer value2) {
            addCriterion("dm_type between", value1, value2, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("dm_type not between", value1, value2, "dmType");
            return (Criteria) this;
        }

        public Criteria andDmNameIsNull() {
            addCriterion("dm_name is null");
            return (Criteria) this;
        }

        public Criteria andDmNameIsNotNull() {
            addCriterion("dm_name is not null");
            return (Criteria) this;
        }

        public Criteria andDmNameEqualTo(String value) {
            addCriterion("dm_name =", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameNotEqualTo(String value) {
            addCriterion("dm_name <>", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameGreaterThan(String value) {
            addCriterion("dm_name >", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameGreaterThanOrEqualTo(String value) {
            addCriterion("dm_name >=", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameLessThan(String value) {
            addCriterion("dm_name <", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameLessThanOrEqualTo(String value) {
            addCriterion("dm_name <=", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameLike(String value) {
            addCriterion("dm_name like", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameNotLike(String value) {
            addCriterion("dm_name not like", value, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameIn(List<String> values) {
            addCriterion("dm_name in", values, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameNotIn(List<String> values) {
            addCriterion("dm_name not in", values, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameBetween(String value1, String value2) {
            addCriterion("dm_name between", value1, value2, "dmName");
            return (Criteria) this;
        }

        public Criteria andDmNameNotBetween(String value1, String value2) {
            addCriterion("dm_name not between", value1, value2, "dmName");
            return (Criteria) this;
        }

        public Criteria andDtNameIsNull() {
            addCriterion("dt_name is null");
            return (Criteria) this;
        }

        public Criteria andDtNameIsNotNull() {
            addCriterion("dt_name is not null");
            return (Criteria) this;
        }

        public Criteria andDtNameEqualTo(String value) {
            addCriterion("dt_name =", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotEqualTo(String value) {
            addCriterion("dt_name <>", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameGreaterThan(String value) {
            addCriterion("dt_name >", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameGreaterThanOrEqualTo(String value) {
            addCriterion("dt_name >=", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLessThan(String value) {
            addCriterion("dt_name <", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLessThanOrEqualTo(String value) {
            addCriterion("dt_name <=", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameLike(String value) {
            addCriterion("dt_name like", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotLike(String value) {
            addCriterion("dt_name not like", value, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameIn(List<String> values) {
            addCriterion("dt_name in", values, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotIn(List<String> values) {
            addCriterion("dt_name not in", values, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameBetween(String value1, String value2) {
            addCriterion("dt_name between", value1, value2, "dtName");
            return (Criteria) this;
        }

        public Criteria andDtNameNotBetween(String value1, String value2) {
            addCriterion("dt_name not between", value1, value2, "dtName");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Integer value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Integer value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Integer value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Integer value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Integer value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Integer> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Integer> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Integer value1, Integer value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Integer value1, Integer value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }
    }

    /**
     * database_manager_table
     */
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