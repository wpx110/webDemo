package org.swinglife.common.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonsExample {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    protected String orderByClause;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    protected List oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public PersonsExample() {
        oredCriteria = new ArrayList();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    protected PersonsExample(PersonsExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public List getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table persons
     *
     * @abatorgenerated Sat Sep 20 22:56:53 CST 2014
     */
    public static class Criteria {
        protected List criteriaWithoutValue;

        protected List criteriaWithSingleValue;

        protected List criteriaWithListValue;

        protected List criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList();
            criteriaWithSingleValue = new ArrayList();
            criteriaWithListValue = new ArrayList();
            criteriaWithBetweenValue = new ArrayList();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List list = new ArrayList();
            list.add(value1);
            list.add(value2);
            Map map = new HashMap();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdPIsNull() {
            addCriterion("Id_P is null");
            return this;
        }

        public Criteria andIdPIsNotNull() {
            addCriterion("Id_P is not null");
            return this;
        }

        public Criteria andIdPEqualTo(Integer value) {
            addCriterion("Id_P =", value, "idP");
            return this;
        }

        public Criteria andIdPNotEqualTo(Integer value) {
            addCriterion("Id_P <>", value, "idP");
            return this;
        }

        public Criteria andIdPGreaterThan(Integer value) {
            addCriterion("Id_P >", value, "idP");
            return this;
        }

        public Criteria andIdPGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id_P >=", value, "idP");
            return this;
        }

        public Criteria andIdPLessThan(Integer value) {
            addCriterion("Id_P <", value, "idP");
            return this;
        }

        public Criteria andIdPLessThanOrEqualTo(Integer value) {
            addCriterion("Id_P <=", value, "idP");
            return this;
        }

        public Criteria andIdPIn(List values) {
            addCriterion("Id_P in", values, "idP");
            return this;
        }

        public Criteria andIdPNotIn(List values) {
            addCriterion("Id_P not in", values, "idP");
            return this;
        }

        public Criteria andIdPBetween(Integer value1, Integer value2) {
            addCriterion("Id_P between", value1, value2, "idP");
            return this;
        }

        public Criteria andIdPNotBetween(Integer value1, Integer value2) {
            addCriterion("Id_P not between", value1, value2, "idP");
            return this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("LastName is null");
            return this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("LastName is not null");
            return this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("LastName =", value, "lastname");
            return this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("LastName <>", value, "lastname");
            return this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("LastName >", value, "lastname");
            return this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("LastName >=", value, "lastname");
            return this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("LastName <", value, "lastname");
            return this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("LastName <=", value, "lastname");
            return this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("LastName like", value, "lastname");
            return this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("LastName not like", value, "lastname");
            return this;
        }

        public Criteria andLastnameIn(List values) {
            addCriterion("LastName in", values, "lastname");
            return this;
        }

        public Criteria andLastnameNotIn(List values) {
            addCriterion("LastName not in", values, "lastname");
            return this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("LastName between", value1, value2, "lastname");
            return this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("LastName not between", value1, value2, "lastname");
            return this;
        }

        public Criteria andFirstnameIsNull() {
            addCriterion("FirstName is null");
            return this;
        }

        public Criteria andFirstnameIsNotNull() {
            addCriterion("FirstName is not null");
            return this;
        }

        public Criteria andFirstnameEqualTo(String value) {
            addCriterion("FirstName =", value, "firstname");
            return this;
        }

        public Criteria andFirstnameNotEqualTo(String value) {
            addCriterion("FirstName <>", value, "firstname");
            return this;
        }

        public Criteria andFirstnameGreaterThan(String value) {
            addCriterion("FirstName >", value, "firstname");
            return this;
        }

        public Criteria andFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("FirstName >=", value, "firstname");
            return this;
        }

        public Criteria andFirstnameLessThan(String value) {
            addCriterion("FirstName <", value, "firstname");
            return this;
        }

        public Criteria andFirstnameLessThanOrEqualTo(String value) {
            addCriterion("FirstName <=", value, "firstname");
            return this;
        }

        public Criteria andFirstnameLike(String value) {
            addCriterion("FirstName like", value, "firstname");
            return this;
        }

        public Criteria andFirstnameNotLike(String value) {
            addCriterion("FirstName not like", value, "firstname");
            return this;
        }

        public Criteria andFirstnameIn(List values) {
            addCriterion("FirstName in", values, "firstname");
            return this;
        }

        public Criteria andFirstnameNotIn(List values) {
            addCriterion("FirstName not in", values, "firstname");
            return this;
        }

        public Criteria andFirstnameBetween(String value1, String value2) {
            addCriterion("FirstName between", value1, value2, "firstname");
            return this;
        }

        public Criteria andFirstnameNotBetween(String value1, String value2) {
            addCriterion("FirstName not between", value1, value2, "firstname");
            return this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("Address is null");
            return this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("Address is not null");
            return this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("Address =", value, "address");
            return this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("Address <>", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("Address >", value, "address");
            return this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("Address >=", value, "address");
            return this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("Address <", value, "address");
            return this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("Address <=", value, "address");
            return this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("Address like", value, "address");
            return this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("Address not like", value, "address");
            return this;
        }

        public Criteria andAddressIn(List values) {
            addCriterion("Address in", values, "address");
            return this;
        }

        public Criteria andAddressNotIn(List values) {
            addCriterion("Address not in", values, "address");
            return this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("Address between", value1, value2, "address");
            return this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("Address not between", value1, value2, "address");
            return this;
        }

        public Criteria andCityIsNull() {
            addCriterion("City is null");
            return this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("City is not null");
            return this;
        }

        public Criteria andCityEqualTo(String value) {
            addCriterion("City =", value, "city");
            return this;
        }

        public Criteria andCityNotEqualTo(String value) {
            addCriterion("City <>", value, "city");
            return this;
        }

        public Criteria andCityGreaterThan(String value) {
            addCriterion("City >", value, "city");
            return this;
        }

        public Criteria andCityGreaterThanOrEqualTo(String value) {
            addCriterion("City >=", value, "city");
            return this;
        }

        public Criteria andCityLessThan(String value) {
            addCriterion("City <", value, "city");
            return this;
        }

        public Criteria andCityLessThanOrEqualTo(String value) {
            addCriterion("City <=", value, "city");
            return this;
        }

        public Criteria andCityLike(String value) {
            addCriterion("City like", value, "city");
            return this;
        }

        public Criteria andCityNotLike(String value) {
            addCriterion("City not like", value, "city");
            return this;
        }

        public Criteria andCityIn(List values) {
            addCriterion("City in", values, "city");
            return this;
        }

        public Criteria andCityNotIn(List values) {
            addCriterion("City not in", values, "city");
            return this;
        }

        public Criteria andCityBetween(String value1, String value2) {
            addCriterion("City between", value1, value2, "city");
            return this;
        }

        public Criteria andCityNotBetween(String value1, String value2) {
            addCriterion("City not between", value1, value2, "city");
            return this;
        }
    }
}