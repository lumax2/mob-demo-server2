package com.mob.demo.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppExample() {
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

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNull() {
            addCriterion("developer_id is null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIsNotNull() {
            addCriterion("developer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdEqualTo(Integer value) {
            addCriterion("developer_id =", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotEqualTo(Integer value) {
            addCriterion("developer_id <>", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThan(Integer value) {
            addCriterion("developer_id >", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("developer_id >=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThan(Integer value) {
            addCriterion("developer_id <", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdLessThanOrEqualTo(Integer value) {
            addCriterion("developer_id <=", value, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdIn(List<Integer> values) {
            addCriterion("developer_id in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotIn(List<Integer> values) {
            addCriterion("developer_id not in", values, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdBetween(Integer value1, Integer value2) {
            addCriterion("developer_id between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andDeveloperIdNotBetween(Integer value1, Integer value2) {
            addCriterion("developer_id not between", value1, value2, "developerId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCreateIpIsNull() {
            addCriterion("create_ip is null");
            return (Criteria) this;
        }

        public Criteria andCreateIpIsNotNull() {
            addCriterion("create_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIpEqualTo(String value) {
            addCriterion("create_ip =", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpNotEqualTo(String value) {
            addCriterion("create_ip <>", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpGreaterThan(String value) {
            addCriterion("create_ip >", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpGreaterThanOrEqualTo(String value) {
            addCriterion("create_ip >=", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpLessThan(String value) {
            addCriterion("create_ip <", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpLessThanOrEqualTo(String value) {
            addCriterion("create_ip <=", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpLike(String value) {
            addCriterion("create_ip like", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpNotLike(String value) {
            addCriterion("create_ip not like", value, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpIn(List<String> values) {
            addCriterion("create_ip in", values, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpNotIn(List<String> values) {
            addCriterion("create_ip not in", values, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpBetween(String value1, String value2) {
            addCriterion("create_ip between", value1, value2, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateIpNotBetween(String value1, String value2) {
            addCriterion("create_ip not between", value1, value2, "createIp");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNull() {
            addCriterion("appkey is null");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNotNull() {
            addCriterion("appkey is not null");
            return (Criteria) this;
        }

        public Criteria andAppkeyEqualTo(String value) {
            addCriterion("appkey =", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotEqualTo(String value) {
            addCriterion("appkey <>", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThan(String value) {
            addCriterion("appkey >", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
            addCriterion("appkey >=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThan(String value) {
            addCriterion("appkey <", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThanOrEqualTo(String value) {
            addCriterion("appkey <=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLike(String value) {
            addCriterion("appkey like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotLike(String value) {
            addCriterion("appkey not like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyIn(List<String> values) {
            addCriterion("appkey in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotIn(List<String> values) {
            addCriterion("appkey not in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyBetween(String value1, String value2) {
            addCriterion("appkey between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotBetween(String value1, String value2) {
            addCriterion("appkey not between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNull() {
            addCriterion("appsecret is null");
            return (Criteria) this;
        }

        public Criteria andAppsecretIsNotNull() {
            addCriterion("appsecret is not null");
            return (Criteria) this;
        }

        public Criteria andAppsecretEqualTo(String value) {
            addCriterion("appsecret =", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotEqualTo(String value) {
            addCriterion("appsecret <>", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThan(String value) {
            addCriterion("appsecret >", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretGreaterThanOrEqualTo(String value) {
            addCriterion("appsecret >=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThan(String value) {
            addCriterion("appsecret <", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLessThanOrEqualTo(String value) {
            addCriterion("appsecret <=", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretLike(String value) {
            addCriterion("appsecret like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotLike(String value) {
            addCriterion("appsecret not like", value, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretIn(List<String> values) {
            addCriterion("appsecret in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotIn(List<String> values) {
            addCriterion("appsecret not in", values, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretBetween(String value1, String value2) {
            addCriterion("appsecret between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andAppsecretNotBetween(String value1, String value2) {
            addCriterion("appsecret not between", value1, value2, "appsecret");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNull() {
            addCriterion("seller_name is null");
            return (Criteria) this;
        }

        public Criteria andSellerNameIsNotNull() {
            addCriterion("seller_name is not null");
            return (Criteria) this;
        }

        public Criteria andSellerNameEqualTo(String value) {
            addCriterion("seller_name =", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotEqualTo(String value) {
            addCriterion("seller_name <>", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThan(String value) {
            addCriterion("seller_name >", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameGreaterThanOrEqualTo(String value) {
            addCriterion("seller_name >=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThan(String value) {
            addCriterion("seller_name <", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLessThanOrEqualTo(String value) {
            addCriterion("seller_name <=", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameLike(String value) {
            addCriterion("seller_name like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotLike(String value) {
            addCriterion("seller_name not like", value, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameIn(List<String> values) {
            addCriterion("seller_name in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotIn(List<String> values) {
            addCriterion("seller_name not in", values, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameBetween(String value1, String value2) {
            addCriterion("seller_name between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerNameNotBetween(String value1, String value2) {
            addCriterion("seller_name not between", value1, value2, "sellerName");
            return (Criteria) this;
        }

        public Criteria andSellerUrlIsNull() {
            addCriterion("seller_url is null");
            return (Criteria) this;
        }

        public Criteria andSellerUrlIsNotNull() {
            addCriterion("seller_url is not null");
            return (Criteria) this;
        }

        public Criteria andSellerUrlEqualTo(String value) {
            addCriterion("seller_url =", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlNotEqualTo(String value) {
            addCriterion("seller_url <>", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlGreaterThan(String value) {
            addCriterion("seller_url >", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlGreaterThanOrEqualTo(String value) {
            addCriterion("seller_url >=", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlLessThan(String value) {
            addCriterion("seller_url <", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlLessThanOrEqualTo(String value) {
            addCriterion("seller_url <=", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlLike(String value) {
            addCriterion("seller_url like", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlNotLike(String value) {
            addCriterion("seller_url not like", value, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlIn(List<String> values) {
            addCriterion("seller_url in", values, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlNotIn(List<String> values) {
            addCriterion("seller_url not in", values, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlBetween(String value1, String value2) {
            addCriterion("seller_url between", value1, value2, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andSellerUrlNotBetween(String value1, String value2) {
            addCriterion("seller_url not between", value1, value2, "sellerUrl");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNull() {
            addCriterion("appname is null");
            return (Criteria) this;
        }

        public Criteria andAppnameIsNotNull() {
            addCriterion("appname is not null");
            return (Criteria) this;
        }

        public Criteria andAppnameEqualTo(String value) {
            addCriterion("appname =", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotEqualTo(String value) {
            addCriterion("appname <>", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThan(String value) {
            addCriterion("appname >", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameGreaterThanOrEqualTo(String value) {
            addCriterion("appname >=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThan(String value) {
            addCriterion("appname <", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLessThanOrEqualTo(String value) {
            addCriterion("appname <=", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameLike(String value) {
            addCriterion("appname like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotLike(String value) {
            addCriterion("appname not like", value, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameIn(List<String> values) {
            addCriterion("appname in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotIn(List<String> values) {
            addCriterion("appname not in", values, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameBetween(String value1, String value2) {
            addCriterion("appname between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppnameNotBetween(String value1, String value2) {
            addCriterion("appname not between", value1, value2, "appname");
            return (Criteria) this;
        }

        public Criteria andAppiconIsNull() {
            addCriterion("appicon is null");
            return (Criteria) this;
        }

        public Criteria andAppiconIsNotNull() {
            addCriterion("appicon is not null");
            return (Criteria) this;
        }

        public Criteria andAppiconEqualTo(String value) {
            addCriterion("appicon =", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconNotEqualTo(String value) {
            addCriterion("appicon <>", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconGreaterThan(String value) {
            addCriterion("appicon >", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconGreaterThanOrEqualTo(String value) {
            addCriterion("appicon >=", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconLessThan(String value) {
            addCriterion("appicon <", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconLessThanOrEqualTo(String value) {
            addCriterion("appicon <=", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconLike(String value) {
            addCriterion("appicon like", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconNotLike(String value) {
            addCriterion("appicon not like", value, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconIn(List<String> values) {
            addCriterion("appicon in", values, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconNotIn(List<String> values) {
            addCriterion("appicon not in", values, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconBetween(String value1, String value2) {
            addCriterion("appicon between", value1, value2, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppiconNotBetween(String value1, String value2) {
            addCriterion("appicon not between", value1, value2, "appicon");
            return (Criteria) this;
        }

        public Criteria andAppPlatIsNull() {
            addCriterion("app_plat is null");
            return (Criteria) this;
        }

        public Criteria andAppPlatIsNotNull() {
            addCriterion("app_plat is not null");
            return (Criteria) this;
        }

        public Criteria andAppPlatEqualTo(Integer value) {
            addCriterion("app_plat =", value, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatNotEqualTo(Integer value) {
            addCriterion("app_plat <>", value, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatGreaterThan(Integer value) {
            addCriterion("app_plat >", value, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_plat >=", value, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatLessThan(Integer value) {
            addCriterion("app_plat <", value, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatLessThanOrEqualTo(Integer value) {
            addCriterion("app_plat <=", value, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatIn(List<Integer> values) {
            addCriterion("app_plat in", values, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatNotIn(List<Integer> values) {
            addCriterion("app_plat not in", values, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatBetween(Integer value1, Integer value2) {
            addCriterion("app_plat between", value1, value2, "appPlat");
            return (Criteria) this;
        }

        public Criteria andAppPlatNotBetween(Integer value1, Integer value2) {
            addCriterion("app_plat not between", value1, value2, "appPlat");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNull() {
            addCriterion("storename is null");
            return (Criteria) this;
        }

        public Criteria andStorenameIsNotNull() {
            addCriterion("storename is not null");
            return (Criteria) this;
        }

        public Criteria andStorenameEqualTo(String value) {
            addCriterion("storename =", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotEqualTo(String value) {
            addCriterion("storename <>", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThan(String value) {
            addCriterion("storename >", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("storename >=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThan(String value) {
            addCriterion("storename <", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLessThanOrEqualTo(String value) {
            addCriterion("storename <=", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameLike(String value) {
            addCriterion("storename like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotLike(String value) {
            addCriterion("storename not like", value, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameIn(List<String> values) {
            addCriterion("storename in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotIn(List<String> values) {
            addCriterion("storename not in", values, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameBetween(String value1, String value2) {
            addCriterion("storename between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStorenameNotBetween(String value1, String value2) {
            addCriterion("storename not between", value1, value2, "storename");
            return (Criteria) this;
        }

        public Criteria andStoreiconIsNull() {
            addCriterion("storeicon is null");
            return (Criteria) this;
        }

        public Criteria andStoreiconIsNotNull() {
            addCriterion("storeicon is not null");
            return (Criteria) this;
        }

        public Criteria andStoreiconEqualTo(String value) {
            addCriterion("storeicon =", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconNotEqualTo(String value) {
            addCriterion("storeicon <>", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconGreaterThan(String value) {
            addCriterion("storeicon >", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconGreaterThanOrEqualTo(String value) {
            addCriterion("storeicon >=", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconLessThan(String value) {
            addCriterion("storeicon <", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconLessThanOrEqualTo(String value) {
            addCriterion("storeicon <=", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconLike(String value) {
            addCriterion("storeicon like", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconNotLike(String value) {
            addCriterion("storeicon not like", value, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconIn(List<String> values) {
            addCriterion("storeicon in", values, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconNotIn(List<String> values) {
            addCriterion("storeicon not in", values, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconBetween(String value1, String value2) {
            addCriterion("storeicon between", value1, value2, "storeicon");
            return (Criteria) this;
        }

        public Criteria andStoreiconNotBetween(String value1, String value2) {
            addCriterion("storeicon not between", value1, value2, "storeicon");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(String value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(String value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(String value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(String value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(String value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(String value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLike(String value) {
            addCriterion("category_id like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotLike(String value) {
            addCriterion("category_id not like", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<String> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<String> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(String value1, String value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(String value1, String value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNull() {
            addCriterion("download_url is null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIsNotNull() {
            addCriterion("download_url is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlEqualTo(String value) {
            addCriterion("download_url =", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotEqualTo(String value) {
            addCriterion("download_url <>", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThan(String value) {
            addCriterion("download_url >", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("download_url >=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThan(String value) {
            addCriterion("download_url <", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("download_url <=", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlLike(String value) {
            addCriterion("download_url like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotLike(String value) {
            addCriterion("download_url not like", value, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlIn(List<String> values) {
            addCriterion("download_url in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotIn(List<String> values) {
            addCriterion("download_url not in", values, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlBetween(String value1, String value2) {
            addCriterion("download_url between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("download_url not between", value1, value2, "downloadUrl");
            return (Criteria) this;
        }

        public Criteria andLabelIsNull() {
            addCriterion("label is null");
            return (Criteria) this;
        }

        public Criteria andLabelIsNotNull() {
            addCriterion("label is not null");
            return (Criteria) this;
        }

        public Criteria andLabelEqualTo(String value) {
            addCriterion("label =", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotEqualTo(String value) {
            addCriterion("label <>", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThan(String value) {
            addCriterion("label >", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelGreaterThanOrEqualTo(String value) {
            addCriterion("label >=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThan(String value) {
            addCriterion("label <", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLessThanOrEqualTo(String value) {
            addCriterion("label <=", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelLike(String value) {
            addCriterion("label like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotLike(String value) {
            addCriterion("label not like", value, "label");
            return (Criteria) this;
        }

        public Criteria andLabelIn(List<String> values) {
            addCriterion("label in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotIn(List<String> values) {
            addCriterion("label not in", values, "label");
            return (Criteria) this;
        }

        public Criteria andLabelBetween(String value1, String value2) {
            addCriterion("label between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andLabelNotBetween(String value1, String value2) {
            addCriterion("label not between", value1, value2, "label");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(Byte value) {
            addCriterion("online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(Byte value) {
            addCriterion("online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(Byte value) {
            addCriterion("online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(Byte value) {
            addCriterion("online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(Byte value) {
            addCriterion("online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(Byte value) {
            addCriterion("online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<Byte> values) {
            addCriterion("online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<Byte> values) {
            addCriterion("online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(Byte value1, Byte value2) {
            addCriterion("online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(Byte value1, Byte value2) {
            addCriterion("online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andInstoreIsNull() {
            addCriterion("instore is null");
            return (Criteria) this;
        }

        public Criteria andInstoreIsNotNull() {
            addCriterion("instore is not null");
            return (Criteria) this;
        }

        public Criteria andInstoreEqualTo(Byte value) {
            addCriterion("instore =", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreNotEqualTo(Byte value) {
            addCriterion("instore <>", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreGreaterThan(Byte value) {
            addCriterion("instore >", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreGreaterThanOrEqualTo(Byte value) {
            addCriterion("instore >=", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreLessThan(Byte value) {
            addCriterion("instore <", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreLessThanOrEqualTo(Byte value) {
            addCriterion("instore <=", value, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreIn(List<Byte> values) {
            addCriterion("instore in", values, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreNotIn(List<Byte> values) {
            addCriterion("instore not in", values, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreBetween(Byte value1, Byte value2) {
            addCriterion("instore between", value1, value2, "instore");
            return (Criteria) this;
        }

        public Criteria andInstoreNotBetween(Byte value1, Byte value2) {
            addCriterion("instore not between", value1, value2, "instore");
            return (Criteria) this;
        }

        public Criteria andOnlineAtIsNull() {
            addCriterion("online_at is null");
            return (Criteria) this;
        }

        public Criteria andOnlineAtIsNotNull() {
            addCriterion("online_at is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineAtEqualTo(Date value) {
            addCriterion("online_at =", value, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtNotEqualTo(Date value) {
            addCriterion("online_at <>", value, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtGreaterThan(Date value) {
            addCriterion("online_at >", value, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtGreaterThanOrEqualTo(Date value) {
            addCriterion("online_at >=", value, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtLessThan(Date value) {
            addCriterion("online_at <", value, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtLessThanOrEqualTo(Date value) {
            addCriterion("online_at <=", value, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtIn(List<Date> values) {
            addCriterion("online_at in", values, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtNotIn(List<Date> values) {
            addCriterion("online_at not in", values, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtBetween(Date value1, Date value2) {
            addCriterion("online_at between", value1, value2, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andOnlineAtNotBetween(Date value1, Date value2) {
            addCriterion("online_at not between", value1, value2, "onlineAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtIsNull() {
            addCriterion("first_at is null");
            return (Criteria) this;
        }

        public Criteria andFirstAtIsNotNull() {
            addCriterion("first_at is not null");
            return (Criteria) this;
        }

        public Criteria andFirstAtEqualTo(Date value) {
            addCriterion("first_at =", value, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtNotEqualTo(Date value) {
            addCriterion("first_at <>", value, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtGreaterThan(Date value) {
            addCriterion("first_at >", value, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtGreaterThanOrEqualTo(Date value) {
            addCriterion("first_at >=", value, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtLessThan(Date value) {
            addCriterion("first_at <", value, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtLessThanOrEqualTo(Date value) {
            addCriterion("first_at <=", value, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtIn(List<Date> values) {
            addCriterion("first_at in", values, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtNotIn(List<Date> values) {
            addCriterion("first_at not in", values, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtBetween(Date value1, Date value2) {
            addCriterion("first_at between", value1, value2, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstAtNotBetween(Date value1, Date value2) {
            addCriterion("first_at not between", value1, value2, "firstAt");
            return (Criteria) this;
        }

        public Criteria andFirstModelIsNull() {
            addCriterion("first_model is null");
            return (Criteria) this;
        }

        public Criteria andFirstModelIsNotNull() {
            addCriterion("first_model is not null");
            return (Criteria) this;
        }

        public Criteria andFirstModelEqualTo(String value) {
            addCriterion("first_model =", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelNotEqualTo(String value) {
            addCriterion("first_model <>", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelGreaterThan(String value) {
            addCriterion("first_model >", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelGreaterThanOrEqualTo(String value) {
            addCriterion("first_model >=", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelLessThan(String value) {
            addCriterion("first_model <", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelLessThanOrEqualTo(String value) {
            addCriterion("first_model <=", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelLike(String value) {
            addCriterion("first_model like", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelNotLike(String value) {
            addCriterion("first_model not like", value, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelIn(List<String> values) {
            addCriterion("first_model in", values, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelNotIn(List<String> values) {
            addCriterion("first_model not in", values, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelBetween(String value1, String value2) {
            addCriterion("first_model between", value1, value2, "firstModel");
            return (Criteria) this;
        }

        public Criteria andFirstModelNotBetween(String value1, String value2) {
            addCriterion("first_model not between", value1, value2, "firstModel");
            return (Criteria) this;
        }

        public Criteria andTestAtIsNull() {
            addCriterion("test_at is null");
            return (Criteria) this;
        }

        public Criteria andTestAtIsNotNull() {
            addCriterion("test_at is not null");
            return (Criteria) this;
        }

        public Criteria andTestAtEqualTo(Date value) {
            addCriterion("test_at =", value, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtNotEqualTo(Date value) {
            addCriterion("test_at <>", value, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtGreaterThan(Date value) {
            addCriterion("test_at >", value, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtGreaterThanOrEqualTo(Date value) {
            addCriterion("test_at >=", value, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtLessThan(Date value) {
            addCriterion("test_at <", value, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtLessThanOrEqualTo(Date value) {
            addCriterion("test_at <=", value, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtIn(List<Date> values) {
            addCriterion("test_at in", values, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtNotIn(List<Date> values) {
            addCriterion("test_at not in", values, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtBetween(Date value1, Date value2) {
            addCriterion("test_at between", value1, value2, "testAt");
            return (Criteria) this;
        }

        public Criteria andTestAtNotBetween(Date value1, Date value2) {
            addCriterion("test_at not between", value1, value2, "testAt");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIsNull() {
            addCriterion("sdk_version is null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIsNotNull() {
            addCriterion("sdk_version is not null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionEqualTo(String value) {
            addCriterion("sdk_version =", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotEqualTo(String value) {
            addCriterion("sdk_version <>", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionGreaterThan(String value) {
            addCriterion("sdk_version >", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionGreaterThanOrEqualTo(String value) {
            addCriterion("sdk_version >=", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLessThan(String value) {
            addCriterion("sdk_version <", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLessThanOrEqualTo(String value) {
            addCriterion("sdk_version <=", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionLike(String value) {
            addCriterion("sdk_version like", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotLike(String value) {
            addCriterion("sdk_version not like", value, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionIn(List<String> values) {
            addCriterion("sdk_version in", values, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotIn(List<String> values) {
            addCriterion("sdk_version not in", values, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionBetween(String value1, String value2) {
            addCriterion("sdk_version between", value1, value2, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionNotBetween(String value1, String value2) {
            addCriterion("sdk_version not between", value1, value2, "sdkVersion");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmIsNull() {
            addCriterion("sdk_version_confirm is null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmIsNotNull() {
            addCriterion("sdk_version_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmEqualTo(String value) {
            addCriterion("sdk_version_confirm =", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmNotEqualTo(String value) {
            addCriterion("sdk_version_confirm <>", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmGreaterThan(String value) {
            addCriterion("sdk_version_confirm >", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("sdk_version_confirm >=", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmLessThan(String value) {
            addCriterion("sdk_version_confirm <", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmLessThanOrEqualTo(String value) {
            addCriterion("sdk_version_confirm <=", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmLike(String value) {
            addCriterion("sdk_version_confirm like", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmNotLike(String value) {
            addCriterion("sdk_version_confirm not like", value, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmIn(List<String> values) {
            addCriterion("sdk_version_confirm in", values, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmNotIn(List<String> values) {
            addCriterion("sdk_version_confirm not in", values, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmBetween(String value1, String value2) {
            addCriterion("sdk_version_confirm between", value1, value2, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andSdkVersionConfirmNotBetween(String value1, String value2) {
            addCriterion("sdk_version_confirm not between", value1, value2, "sdkVersionConfirm");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceIsNull() {
            addCriterion("first_device is null");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceIsNotNull() {
            addCriterion("first_device is not null");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceEqualTo(String value) {
            addCriterion("first_device =", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceNotEqualTo(String value) {
            addCriterion("first_device <>", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceGreaterThan(String value) {
            addCriterion("first_device >", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceGreaterThanOrEqualTo(String value) {
            addCriterion("first_device >=", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceLessThan(String value) {
            addCriterion("first_device <", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceLessThanOrEqualTo(String value) {
            addCriterion("first_device <=", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceLike(String value) {
            addCriterion("first_device like", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceNotLike(String value) {
            addCriterion("first_device not like", value, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceIn(List<String> values) {
            addCriterion("first_device in", values, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceNotIn(List<String> values) {
            addCriterion("first_device not in", values, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceBetween(String value1, String value2) {
            addCriterion("first_device between", value1, value2, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andFirstDeviceNotBetween(String value1, String value2) {
            addCriterion("first_device not between", value1, value2, "firstDevice");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Boolean value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Boolean value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Boolean value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Boolean value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Boolean> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Boolean> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andPackageIsNull() {
            addCriterion("package is null");
            return (Criteria) this;
        }

        public Criteria andPackageIsNotNull() {
            addCriterion("package is not null");
            return (Criteria) this;
        }

        public Criteria andPackageEqualTo(String value) {
            addCriterion("package =", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageNotEqualTo(String value) {
            addCriterion("package <>", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageGreaterThan(String value) {
            addCriterion("package >", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageGreaterThanOrEqualTo(String value) {
            addCriterion("package >=", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageLessThan(String value) {
            addCriterion("package <", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageLessThanOrEqualTo(String value) {
            addCriterion("package <=", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageLike(String value) {
            addCriterion("package like", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageNotLike(String value) {
            addCriterion("package not like", value, "package");
            return (Criteria) this;
        }

        public Criteria andPackageIn(List<String> values) {
            addCriterion("package in", values, "package");
            return (Criteria) this;
        }

        public Criteria andPackageNotIn(List<String> values) {
            addCriterion("package not in", values, "package");
            return (Criteria) this;
        }

        public Criteria andPackageBetween(String value1, String value2) {
            addCriterion("package between", value1, value2, "package");
            return (Criteria) this;
        }

        public Criteria andPackageNotBetween(String value1, String value2) {
            addCriterion("package not between", value1, value2, "package");
            return (Criteria) this;
        }

        public Criteria andCallbackIsNull() {
            addCriterion("callback is null");
            return (Criteria) this;
        }

        public Criteria andCallbackIsNotNull() {
            addCriterion("callback is not null");
            return (Criteria) this;
        }

        public Criteria andCallbackEqualTo(String value) {
            addCriterion("callback =", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotEqualTo(String value) {
            addCriterion("callback <>", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackGreaterThan(String value) {
            addCriterion("callback >", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackGreaterThanOrEqualTo(String value) {
            addCriterion("callback >=", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLessThan(String value) {
            addCriterion("callback <", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLessThanOrEqualTo(String value) {
            addCriterion("callback <=", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackLike(String value) {
            addCriterion("callback like", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotLike(String value) {
            addCriterion("callback not like", value, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackIn(List<String> values) {
            addCriterion("callback in", values, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotIn(List<String> values) {
            addCriterion("callback not in", values, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackBetween(String value1, String value2) {
            addCriterion("callback between", value1, value2, "callback");
            return (Criteria) this;
        }

        public Criteria andCallbackNotBetween(String value1, String value2) {
            addCriterion("callback not between", value1, value2, "callback");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andThumbIsNull() {
            addCriterion("thumb is null");
            return (Criteria) this;
        }

        public Criteria andThumbIsNotNull() {
            addCriterion("thumb is not null");
            return (Criteria) this;
        }

        public Criteria andThumbEqualTo(String value) {
            addCriterion("thumb =", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotEqualTo(String value) {
            addCriterion("thumb <>", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThan(String value) {
            addCriterion("thumb >", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbGreaterThanOrEqualTo(String value) {
            addCriterion("thumb >=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThan(String value) {
            addCriterion("thumb <", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLessThanOrEqualTo(String value) {
            addCriterion("thumb <=", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbLike(String value) {
            addCriterion("thumb like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotLike(String value) {
            addCriterion("thumb not like", value, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbIn(List<String> values) {
            addCriterion("thumb in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotIn(List<String> values) {
            addCriterion("thumb not in", values, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbBetween(String value1, String value2) {
            addCriterion("thumb between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andThumbNotBetween(String value1, String value2) {
            addCriterion("thumb not between", value1, value2, "thumb");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatIsNull() {
            addCriterion("multiple_plat is null");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatIsNotNull() {
            addCriterion("multiple_plat is not null");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatEqualTo(Boolean value) {
            addCriterion("multiple_plat =", value, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatNotEqualTo(Boolean value) {
            addCriterion("multiple_plat <>", value, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatGreaterThan(Boolean value) {
            addCriterion("multiple_plat >", value, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("multiple_plat >=", value, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatLessThan(Boolean value) {
            addCriterion("multiple_plat <", value, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatLessThanOrEqualTo(Boolean value) {
            addCriterion("multiple_plat <=", value, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatIn(List<Boolean> values) {
            addCriterion("multiple_plat in", values, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatNotIn(List<Boolean> values) {
            addCriterion("multiple_plat not in", values, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatBetween(Boolean value1, Boolean value2) {
            addCriterion("multiple_plat between", value1, value2, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andMultiplePlatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("multiple_plat not between", value1, value2, "multiplePlat");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(Boolean value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(Boolean value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(Boolean value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(Boolean value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(Boolean value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(Boolean value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<Boolean> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<Boolean> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(Boolean value1, Boolean value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(Boolean value1, Boolean value2) {
            addCriterion("publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(String value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(String value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(String value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(String value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(String value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLike(String value) {
            addCriterion("store_id like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotLike(String value) {
            addCriterion("store_id not like", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<String> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<String> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(String value1, String value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(String value1, String value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andIsRefreshIsNull() {
            addCriterion("is_refresh is null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshIsNotNull() {
            addCriterion("is_refresh is not null");
            return (Criteria) this;
        }

        public Criteria andIsRefreshEqualTo(Boolean value) {
            addCriterion("is_refresh =", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshNotEqualTo(Boolean value) {
            addCriterion("is_refresh <>", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshGreaterThan(Boolean value) {
            addCriterion("is_refresh >", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_refresh >=", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshLessThan(Boolean value) {
            addCriterion("is_refresh <", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshLessThanOrEqualTo(Boolean value) {
            addCriterion("is_refresh <=", value, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshIn(List<Boolean> values) {
            addCriterion("is_refresh in", values, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshNotIn(List<Boolean> values) {
            addCriterion("is_refresh not in", values, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refresh between", value1, value2, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andIsRefreshNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_refresh not between", value1, value2, "isRefresh");
            return (Criteria) this;
        }

        public Criteria andBundleIdIsNull() {
            addCriterion("bundle_id is null");
            return (Criteria) this;
        }

        public Criteria andBundleIdIsNotNull() {
            addCriterion("bundle_id is not null");
            return (Criteria) this;
        }

        public Criteria andBundleIdEqualTo(String value) {
            addCriterion("bundle_id =", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdNotEqualTo(String value) {
            addCriterion("bundle_id <>", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdGreaterThan(String value) {
            addCriterion("bundle_id >", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdGreaterThanOrEqualTo(String value) {
            addCriterion("bundle_id >=", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdLessThan(String value) {
            addCriterion("bundle_id <", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdLessThanOrEqualTo(String value) {
            addCriterion("bundle_id <=", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdLike(String value) {
            addCriterion("bundle_id like", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdNotLike(String value) {
            addCriterion("bundle_id not like", value, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdIn(List<String> values) {
            addCriterion("bundle_id in", values, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdNotIn(List<String> values) {
            addCriterion("bundle_id not in", values, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdBetween(String value1, String value2) {
            addCriterion("bundle_id between", value1, value2, "bundleId");
            return (Criteria) this;
        }

        public Criteria andBundleIdNotBetween(String value1, String value2) {
            addCriterion("bundle_id not between", value1, value2, "bundleId");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixIsNull() {
            addCriterion("url_schema_suffix is null");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixIsNotNull() {
            addCriterion("url_schema_suffix is not null");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixEqualTo(String value) {
            addCriterion("url_schema_suffix =", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixNotEqualTo(String value) {
            addCriterion("url_schema_suffix <>", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixGreaterThan(String value) {
            addCriterion("url_schema_suffix >", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixGreaterThanOrEqualTo(String value) {
            addCriterion("url_schema_suffix >=", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixLessThan(String value) {
            addCriterion("url_schema_suffix <", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixLessThanOrEqualTo(String value) {
            addCriterion("url_schema_suffix <=", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixLike(String value) {
            addCriterion("url_schema_suffix like", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixNotLike(String value) {
            addCriterion("url_schema_suffix not like", value, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixIn(List<String> values) {
            addCriterion("url_schema_suffix in", values, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixNotIn(List<String> values) {
            addCriterion("url_schema_suffix not in", values, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixBetween(String value1, String value2) {
            addCriterion("url_schema_suffix between", value1, value2, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andUrlSchemaSuffixNotBetween(String value1, String value2) {
            addCriterion("url_schema_suffix not between", value1, value2, "urlSchemaSuffix");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdIsNull() {
            addCriterion("iphone_store_id is null");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdIsNotNull() {
            addCriterion("iphone_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdEqualTo(String value) {
            addCriterion("iphone_store_id =", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdNotEqualTo(String value) {
            addCriterion("iphone_store_id <>", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdGreaterThan(String value) {
            addCriterion("iphone_store_id >", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("iphone_store_id >=", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdLessThan(String value) {
            addCriterion("iphone_store_id <", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdLessThanOrEqualTo(String value) {
            addCriterion("iphone_store_id <=", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdLike(String value) {
            addCriterion("iphone_store_id like", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdNotLike(String value) {
            addCriterion("iphone_store_id not like", value, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdIn(List<String> values) {
            addCriterion("iphone_store_id in", values, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdNotIn(List<String> values) {
            addCriterion("iphone_store_id not in", values, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdBetween(String value1, String value2) {
            addCriterion("iphone_store_id between", value1, value2, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIphoneStoreIdNotBetween(String value1, String value2) {
            addCriterion("iphone_store_id not between", value1, value2, "iphoneStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdIsNull() {
            addCriterion("ipad_store_id is null");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdIsNotNull() {
            addCriterion("ipad_store_id is not null");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdEqualTo(String value) {
            addCriterion("ipad_store_id =", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdNotEqualTo(String value) {
            addCriterion("ipad_store_id <>", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdGreaterThan(String value) {
            addCriterion("ipad_store_id >", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdGreaterThanOrEqualTo(String value) {
            addCriterion("ipad_store_id >=", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdLessThan(String value) {
            addCriterion("ipad_store_id <", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdLessThanOrEqualTo(String value) {
            addCriterion("ipad_store_id <=", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdLike(String value) {
            addCriterion("ipad_store_id like", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdNotLike(String value) {
            addCriterion("ipad_store_id not like", value, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdIn(List<String> values) {
            addCriterion("ipad_store_id in", values, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdNotIn(List<String> values) {
            addCriterion("ipad_store_id not in", values, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdBetween(String value1, String value2) {
            addCriterion("ipad_store_id between", value1, value2, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andIpadStoreIdNotBetween(String value1, String value2) {
            addCriterion("ipad_store_id not between", value1, value2, "ipadStoreId");
            return (Criteria) this;
        }

        public Criteria andAppLevelIsNull() {
            addCriterion("app_level is null");
            return (Criteria) this;
        }

        public Criteria andAppLevelIsNotNull() {
            addCriterion("app_level is not null");
            return (Criteria) this;
        }

        public Criteria andAppLevelEqualTo(String value) {
            addCriterion("app_level =", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelNotEqualTo(String value) {
            addCriterion("app_level <>", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelGreaterThan(String value) {
            addCriterion("app_level >", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelGreaterThanOrEqualTo(String value) {
            addCriterion("app_level >=", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelLessThan(String value) {
            addCriterion("app_level <", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelLessThanOrEqualTo(String value) {
            addCriterion("app_level <=", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelLike(String value) {
            addCriterion("app_level like", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelNotLike(String value) {
            addCriterion("app_level not like", value, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelIn(List<String> values) {
            addCriterion("app_level in", values, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelNotIn(List<String> values) {
            addCriterion("app_level not in", values, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelBetween(String value1, String value2) {
            addCriterion("app_level between", value1, value2, "appLevel");
            return (Criteria) this;
        }

        public Criteria andAppLevelNotBetween(String value1, String value2) {
            addCriterion("app_level not between", value1, value2, "appLevel");
            return (Criteria) this;
        }

        public Criteria andBonusIsNull() {
            addCriterion("bonus is null");
            return (Criteria) this;
        }

        public Criteria andBonusIsNotNull() {
            addCriterion("bonus is not null");
            return (Criteria) this;
        }

        public Criteria andBonusEqualTo(BigDecimal value) {
            addCriterion("bonus =", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotEqualTo(BigDecimal value) {
            addCriterion("bonus <>", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThan(BigDecimal value) {
            addCriterion("bonus >", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus >=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThan(BigDecimal value) {
            addCriterion("bonus <", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bonus <=", value, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusIn(List<BigDecimal> values) {
            addCriterion("bonus in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotIn(List<BigDecimal> values) {
            addCriterion("bonus not in", values, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andBonusNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bonus not between", value1, value2, "bonus");
            return (Criteria) this;
        }

        public Criteria andAbandonIsNull() {
            addCriterion("abandon is null");
            return (Criteria) this;
        }

        public Criteria andAbandonIsNotNull() {
            addCriterion("abandon is not null");
            return (Criteria) this;
        }

        public Criteria andAbandonEqualTo(Boolean value) {
            addCriterion("abandon =", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonNotEqualTo(Boolean value) {
            addCriterion("abandon <>", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonGreaterThan(Boolean value) {
            addCriterion("abandon >", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonGreaterThanOrEqualTo(Boolean value) {
            addCriterion("abandon >=", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonLessThan(Boolean value) {
            addCriterion("abandon <", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonLessThanOrEqualTo(Boolean value) {
            addCriterion("abandon <=", value, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonIn(List<Boolean> values) {
            addCriterion("abandon in", values, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonNotIn(List<Boolean> values) {
            addCriterion("abandon not in", values, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonBetween(Boolean value1, Boolean value2) {
            addCriterion("abandon between", value1, value2, "abandon");
            return (Criteria) this;
        }

        public Criteria andAbandonNotBetween(Boolean value1, Boolean value2) {
            addCriterion("abandon not between", value1, value2, "abandon");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlIsNull() {
            addCriterion("ios_download_url is null");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlIsNotNull() {
            addCriterion("ios_download_url is not null");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlEqualTo(String value) {
            addCriterion("ios_download_url =", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlNotEqualTo(String value) {
            addCriterion("ios_download_url <>", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlGreaterThan(String value) {
            addCriterion("ios_download_url >", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("ios_download_url >=", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlLessThan(String value) {
            addCriterion("ios_download_url <", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlLessThanOrEqualTo(String value) {
            addCriterion("ios_download_url <=", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlLike(String value) {
            addCriterion("ios_download_url like", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlNotLike(String value) {
            addCriterion("ios_download_url not like", value, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlIn(List<String> values) {
            addCriterion("ios_download_url in", values, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlNotIn(List<String> values) {
            addCriterion("ios_download_url not in", values, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlBetween(String value1, String value2) {
            addCriterion("ios_download_url between", value1, value2, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosDownloadUrlNotBetween(String value1, String value2) {
            addCriterion("ios_download_url not between", value1, value2, "iosDownloadUrl");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkIsNull() {
            addCriterion("ios_universal_link is null");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkIsNotNull() {
            addCriterion("ios_universal_link is not null");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkEqualTo(String value) {
            addCriterion("ios_universal_link =", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkNotEqualTo(String value) {
            addCriterion("ios_universal_link <>", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkGreaterThan(String value) {
            addCriterion("ios_universal_link >", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkGreaterThanOrEqualTo(String value) {
            addCriterion("ios_universal_link >=", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkLessThan(String value) {
            addCriterion("ios_universal_link <", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkLessThanOrEqualTo(String value) {
            addCriterion("ios_universal_link <=", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkLike(String value) {
            addCriterion("ios_universal_link like", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkNotLike(String value) {
            addCriterion("ios_universal_link not like", value, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkIn(List<String> values) {
            addCriterion("ios_universal_link in", values, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkNotIn(List<String> values) {
            addCriterion("ios_universal_link not in", values, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkBetween(String value1, String value2) {
            addCriterion("ios_universal_link between", value1, value2, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andIosUniversalLinkNotBetween(String value1, String value2) {
            addCriterion("ios_universal_link not between", value1, value2, "iosUniversalLink");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNull() {
            addCriterion("team_id is null");
            return (Criteria) this;
        }

        public Criteria andTeamIdIsNotNull() {
            addCriterion("team_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeamIdEqualTo(String value) {
            addCriterion("team_id =", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotEqualTo(String value) {
            addCriterion("team_id <>", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThan(String value) {
            addCriterion("team_id >", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdGreaterThanOrEqualTo(String value) {
            addCriterion("team_id >=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThan(String value) {
            addCriterion("team_id <", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLessThanOrEqualTo(String value) {
            addCriterion("team_id <=", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdLike(String value) {
            addCriterion("team_id like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotLike(String value) {
            addCriterion("team_id not like", value, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdIn(List<String> values) {
            addCriterion("team_id in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotIn(List<String> values) {
            addCriterion("team_id not in", values, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdBetween(String value1, String value2) {
            addCriterion("team_id between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andTeamIdNotBetween(String value1, String value2) {
            addCriterion("team_id not between", value1, value2, "teamId");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameIsNull() {
            addCriterion("android_pkg_name is null");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameIsNotNull() {
            addCriterion("android_pkg_name is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameEqualTo(String value) {
            addCriterion("android_pkg_name =", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameNotEqualTo(String value) {
            addCriterion("android_pkg_name <>", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameGreaterThan(String value) {
            addCriterion("android_pkg_name >", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameGreaterThanOrEqualTo(String value) {
            addCriterion("android_pkg_name >=", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameLessThan(String value) {
            addCriterion("android_pkg_name <", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameLessThanOrEqualTo(String value) {
            addCriterion("android_pkg_name <=", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameLike(String value) {
            addCriterion("android_pkg_name like", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameNotLike(String value) {
            addCriterion("android_pkg_name not like", value, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameIn(List<String> values) {
            addCriterion("android_pkg_name in", values, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameNotIn(List<String> values) {
            addCriterion("android_pkg_name not in", values, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameBetween(String value1, String value2) {
            addCriterion("android_pkg_name between", value1, value2, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidPkgNameNotBetween(String value1, String value2) {
            addCriterion("android_pkg_name not between", value1, value2, "androidPkgName");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeIsNull() {
            addCriterion("android_url_scheme is null");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeIsNotNull() {
            addCriterion("android_url_scheme is not null");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeEqualTo(String value) {
            addCriterion("android_url_scheme =", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeNotEqualTo(String value) {
            addCriterion("android_url_scheme <>", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeGreaterThan(String value) {
            addCriterion("android_url_scheme >", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeGreaterThanOrEqualTo(String value) {
            addCriterion("android_url_scheme >=", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeLessThan(String value) {
            addCriterion("android_url_scheme <", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeLessThanOrEqualTo(String value) {
            addCriterion("android_url_scheme <=", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeLike(String value) {
            addCriterion("android_url_scheme like", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeNotLike(String value) {
            addCriterion("android_url_scheme not like", value, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeIn(List<String> values) {
            addCriterion("android_url_scheme in", values, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeNotIn(List<String> values) {
            addCriterion("android_url_scheme not in", values, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeBetween(String value1, String value2) {
            addCriterion("android_url_scheme between", value1, value2, "androidUrlScheme");
            return (Criteria) this;
        }

        public Criteria andAndroidUrlSchemeNotBetween(String value1, String value2) {
            addCriterion("android_url_scheme not between", value1, value2, "androidUrlScheme");
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