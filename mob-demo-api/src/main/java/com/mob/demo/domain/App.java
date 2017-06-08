package com.mob.demo.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class App implements Serializable {
    private Integer appId;

    private Integer developerId;

    private Integer status;

    private String createIp;

    private Date createAt;

    private String appkey;

    private String appsecret;

    private String sellerName;

    private String sellerUrl;

    private String appname;

    private String appicon;

    private Integer appPlat;

    private String storename;

    private String storeicon;

    private String categoryId;

    private String downloadUrl;

    private String label;

    private Byte online;

    private Byte instore;

    private Date onlineAt;

    private Date firstAt;

    private String firstModel;

    private Date testAt;

    private String sdkVersion;

    private String sdkVersionConfirm;

    private String firstDevice;

    private Boolean level;

    private String _package;

    private String callback;

    private String type;

    private String thumb;

    private Boolean multiplePlat;

    private Boolean publish;

    private String storeId;

    private String packageName;

    private String language;

    private Boolean isRefresh;

    private String bundleId;

    private String urlSchemaSuffix;

    private String iphoneStoreId;

    private String ipadStoreId;

    private String appLevel;

    private BigDecimal bonus;

    private Boolean abandon;

    private String iosDownloadUrl;

    private String iosUniversalLink;

    private String teamId;

    private String androidPkgName;

    private String androidUrlScheme;

    private static final long serialVersionUID = 1L;

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Integer getDeveloperId() {
        return developerId;
    }

    public void setDeveloperId(Integer developerId) {
        this.developerId = developerId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateIp() {
        return createIp;
    }

    public void setCreateIp(String createIp) {
        this.createIp = createIp == null ? null : createIp.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey == null ? null : appkey.trim();
    }

    public String getAppsecret() {
        return appsecret;
    }

    public void setAppsecret(String appsecret) {
        this.appsecret = appsecret == null ? null : appsecret.trim();
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName == null ? null : sellerName.trim();
    }

    public String getSellerUrl() {
        return sellerUrl;
    }

    public void setSellerUrl(String sellerUrl) {
        this.sellerUrl = sellerUrl == null ? null : sellerUrl.trim();
    }

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    public String getAppicon() {
        return appicon;
    }

    public void setAppicon(String appicon) {
        this.appicon = appicon == null ? null : appicon.trim();
    }

    public Integer getAppPlat() {
        return appPlat;
    }

    public void setAppPlat(Integer appPlat) {
        this.appPlat = appPlat;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename == null ? null : storename.trim();
    }

    public String getStoreicon() {
        return storeicon;
    }

    public void setStoreicon(String storeicon) {
        this.storeicon = storeicon == null ? null : storeicon.trim();
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl == null ? null : downloadUrl.trim();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label == null ? null : label.trim();
    }

    public Byte getOnline() {
        return online;
    }

    public void setOnline(Byte online) {
        this.online = online;
    }

    public Byte getInstore() {
        return instore;
    }

    public void setInstore(Byte instore) {
        this.instore = instore;
    }

    public Date getOnlineAt() {
        return onlineAt;
    }

    public void setOnlineAt(Date onlineAt) {
        this.onlineAt = onlineAt;
    }

    public Date getFirstAt() {
        return firstAt;
    }

    public void setFirstAt(Date firstAt) {
        this.firstAt = firstAt;
    }

    public String getFirstModel() {
        return firstModel;
    }

    public void setFirstModel(String firstModel) {
        this.firstModel = firstModel == null ? null : firstModel.trim();
    }

    public Date getTestAt() {
        return testAt;
    }

    public void setTestAt(Date testAt) {
        this.testAt = testAt;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion == null ? null : sdkVersion.trim();
    }

    public String getSdkVersionConfirm() {
        return sdkVersionConfirm;
    }

    public void setSdkVersionConfirm(String sdkVersionConfirm) {
        this.sdkVersionConfirm = sdkVersionConfirm == null ? null : sdkVersionConfirm.trim();
    }

    public String getFirstDevice() {
        return firstDevice;
    }

    public void setFirstDevice(String firstDevice) {
        this.firstDevice = firstDevice == null ? null : firstDevice.trim();
    }

    public Boolean getLevel() {
        return level;
    }

    public void setLevel(Boolean level) {
        this.level = level;
    }

    public String get_package() {
        return _package;
    }

    public void set_package(String _package) {
        this._package = _package;
    }

    public String getCallback() {
        return callback;
    }

    public void setCallback(String callback) {
        this.callback = callback == null ? null : callback.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb == null ? null : thumb.trim();
    }

    public Boolean getMultiplePlat() {
        return multiplePlat;
    }

    public void setMultiplePlat(Boolean multiplePlat) {
        this.multiplePlat = multiplePlat;
    }

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName == null ? null : packageName.trim();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public Boolean getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(Boolean isRefresh) {
        this.isRefresh = isRefresh;
    }

    public String getBundleId() {
        return bundleId;
    }

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId == null ? null : bundleId.trim();
    }

    public String getUrlSchemaSuffix() {
        return urlSchemaSuffix;
    }

    public void setUrlSchemaSuffix(String urlSchemaSuffix) {
        this.urlSchemaSuffix = urlSchemaSuffix == null ? null : urlSchemaSuffix.trim();
    }

    public String getIphoneStoreId() {
        return iphoneStoreId;
    }

    public void setIphoneStoreId(String iphoneStoreId) {
        this.iphoneStoreId = iphoneStoreId == null ? null : iphoneStoreId.trim();
    }

    public String getIpadStoreId() {
        return ipadStoreId;
    }

    public void setIpadStoreId(String ipadStoreId) {
        this.ipadStoreId = ipadStoreId == null ? null : ipadStoreId.trim();
    }

    public String getAppLevel() {
        return appLevel;
    }

    public void setAppLevel(String appLevel) {
        this.appLevel = appLevel == null ? null : appLevel.trim();
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public Boolean getAbandon() {
        return abandon;
    }

    public void setAbandon(Boolean abandon) {
        this.abandon = abandon;
    }

    public String getIosDownloadUrl() {
        return iosDownloadUrl;
    }

    public void setIosDownloadUrl(String iosDownloadUrl) {
        this.iosDownloadUrl = iosDownloadUrl == null ? null : iosDownloadUrl.trim();
    }

    public String getIosUniversalLink() {
        return iosUniversalLink;
    }

    public void setIosUniversalLink(String iosUniversalLink) {
        this.iosUniversalLink = iosUniversalLink == null ? null : iosUniversalLink.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getAndroidPkgName() {
        return androidPkgName;
    }

    public void setAndroidPkgName(String androidPkgName) {
        this.androidPkgName = androidPkgName == null ? null : androidPkgName.trim();
    }

    public String getAndroidUrlScheme() {
        return androidUrlScheme;
    }

    public void setAndroidUrlScheme(String androidUrlScheme) {
        this.androidUrlScheme = androidUrlScheme == null ? null : androidUrlScheme.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        App other = (App) that;
        return (this.getAppId() == null ? other.getAppId() == null : this.getAppId().equals(other.getAppId()))
            && (this.getDeveloperId() == null ? other.getDeveloperId() == null : this.getDeveloperId().equals(other.getDeveloperId()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateIp() == null ? other.getCreateIp() == null : this.getCreateIp().equals(other.getCreateIp()))
            && (this.getCreateAt() == null ? other.getCreateAt() == null : this.getCreateAt().equals(other.getCreateAt()))
            && (this.getAppkey() == null ? other.getAppkey() == null : this.getAppkey().equals(other.getAppkey()))
            && (this.getAppsecret() == null ? other.getAppsecret() == null : this.getAppsecret().equals(other.getAppsecret()))
            && (this.getSellerName() == null ? other.getSellerName() == null : this.getSellerName().equals(other.getSellerName()))
            && (this.getSellerUrl() == null ? other.getSellerUrl() == null : this.getSellerUrl().equals(other.getSellerUrl()))
            && (this.getAppname() == null ? other.getAppname() == null : this.getAppname().equals(other.getAppname()))
            && (this.getAppicon() == null ? other.getAppicon() == null : this.getAppicon().equals(other.getAppicon()))
            && (this.getAppPlat() == null ? other.getAppPlat() == null : this.getAppPlat().equals(other.getAppPlat()))
            && (this.getStorename() == null ? other.getStorename() == null : this.getStorename().equals(other.getStorename()))
            && (this.getStoreicon() == null ? other.getStoreicon() == null : this.getStoreicon().equals(other.getStoreicon()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getDownloadUrl() == null ? other.getDownloadUrl() == null : this.getDownloadUrl().equals(other.getDownloadUrl()))
            && (this.getLabel() == null ? other.getLabel() == null : this.getLabel().equals(other.getLabel()))
            && (this.getOnline() == null ? other.getOnline() == null : this.getOnline().equals(other.getOnline()))
            && (this.getInstore() == null ? other.getInstore() == null : this.getInstore().equals(other.getInstore()))
            && (this.getOnlineAt() == null ? other.getOnlineAt() == null : this.getOnlineAt().equals(other.getOnlineAt()))
            && (this.getFirstAt() == null ? other.getFirstAt() == null : this.getFirstAt().equals(other.getFirstAt()))
            && (this.getFirstModel() == null ? other.getFirstModel() == null : this.getFirstModel().equals(other.getFirstModel()))
            && (this.getTestAt() == null ? other.getTestAt() == null : this.getTestAt().equals(other.getTestAt()))
            && (this.getSdkVersion() == null ? other.getSdkVersion() == null : this.getSdkVersion().equals(other.getSdkVersion()))
            && (this.getSdkVersionConfirm() == null ? other.getSdkVersionConfirm() == null : this.getSdkVersionConfirm().equals(other.getSdkVersionConfirm()))
            && (this.getFirstDevice() == null ? other.getFirstDevice() == null : this.getFirstDevice().equals(other.getFirstDevice()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.get_package() == null ? other.get_package() == null : this.get_package().equals(other.get_package()))
            && (this.getCallback() == null ? other.getCallback() == null : this.getCallback().equals(other.getCallback()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getThumb() == null ? other.getThumb() == null : this.getThumb().equals(other.getThumb()))
            && (this.getMultiplePlat() == null ? other.getMultiplePlat() == null : this.getMultiplePlat().equals(other.getMultiplePlat()))
            && (this.getPublish() == null ? other.getPublish() == null : this.getPublish().equals(other.getPublish()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getPackageName() == null ? other.getPackageName() == null : this.getPackageName().equals(other.getPackageName()))
            && (this.getLanguage() == null ? other.getLanguage() == null : this.getLanguage().equals(other.getLanguage()))
            && (this.getIsRefresh() == null ? other.getIsRefresh() == null : this.getIsRefresh().equals(other.getIsRefresh()))
            && (this.getBundleId() == null ? other.getBundleId() == null : this.getBundleId().equals(other.getBundleId()))
            && (this.getUrlSchemaSuffix() == null ? other.getUrlSchemaSuffix() == null : this.getUrlSchemaSuffix().equals(other.getUrlSchemaSuffix()))
            && (this.getIphoneStoreId() == null ? other.getIphoneStoreId() == null : this.getIphoneStoreId().equals(other.getIphoneStoreId()))
            && (this.getIpadStoreId() == null ? other.getIpadStoreId() == null : this.getIpadStoreId().equals(other.getIpadStoreId()))
            && (this.getAppLevel() == null ? other.getAppLevel() == null : this.getAppLevel().equals(other.getAppLevel()))
            && (this.getBonus() == null ? other.getBonus() == null : this.getBonus().equals(other.getBonus()))
            && (this.getAbandon() == null ? other.getAbandon() == null : this.getAbandon().equals(other.getAbandon()))
            && (this.getIosDownloadUrl() == null ? other.getIosDownloadUrl() == null : this.getIosDownloadUrl().equals(other.getIosDownloadUrl()))
            && (this.getIosUniversalLink() == null ? other.getIosUniversalLink() == null : this.getIosUniversalLink().equals(other.getIosUniversalLink()))
            && (this.getTeamId() == null ? other.getTeamId() == null : this.getTeamId().equals(other.getTeamId()))
            && (this.getAndroidPkgName() == null ? other.getAndroidPkgName() == null : this.getAndroidPkgName().equals(other.getAndroidPkgName()))
            && (this.getAndroidUrlScheme() == null ? other.getAndroidUrlScheme() == null : this.getAndroidUrlScheme().equals(other.getAndroidUrlScheme()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAppId() == null) ? 0 : getAppId().hashCode());
        result = prime * result + ((getDeveloperId() == null) ? 0 : getDeveloperId().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateIp() == null) ? 0 : getCreateIp().hashCode());
        result = prime * result + ((getCreateAt() == null) ? 0 : getCreateAt().hashCode());
        result = prime * result + ((getAppkey() == null) ? 0 : getAppkey().hashCode());
        result = prime * result + ((getAppsecret() == null) ? 0 : getAppsecret().hashCode());
        result = prime * result + ((getSellerName() == null) ? 0 : getSellerName().hashCode());
        result = prime * result + ((getSellerUrl() == null) ? 0 : getSellerUrl().hashCode());
        result = prime * result + ((getAppname() == null) ? 0 : getAppname().hashCode());
        result = prime * result + ((getAppicon() == null) ? 0 : getAppicon().hashCode());
        result = prime * result + ((getAppPlat() == null) ? 0 : getAppPlat().hashCode());
        result = prime * result + ((getStorename() == null) ? 0 : getStorename().hashCode());
        result = prime * result + ((getStoreicon() == null) ? 0 : getStoreicon().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        result = prime * result + ((getLabel() == null) ? 0 : getLabel().hashCode());
        result = prime * result + ((getOnline() == null) ? 0 : getOnline().hashCode());
        result = prime * result + ((getInstore() == null) ? 0 : getInstore().hashCode());
        result = prime * result + ((getOnlineAt() == null) ? 0 : getOnlineAt().hashCode());
        result = prime * result + ((getFirstAt() == null) ? 0 : getFirstAt().hashCode());
        result = prime * result + ((getFirstModel() == null) ? 0 : getFirstModel().hashCode());
        result = prime * result + ((getTestAt() == null) ? 0 : getTestAt().hashCode());
        result = prime * result + ((getSdkVersion() == null) ? 0 : getSdkVersion().hashCode());
        result = prime * result + ((getSdkVersionConfirm() == null) ? 0 : getSdkVersionConfirm().hashCode());
        result = prime * result + ((getFirstDevice() == null) ? 0 : getFirstDevice().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((get_package() == null) ? 0 : get_package().hashCode());
        result = prime * result + ((getCallback() == null) ? 0 : getCallback().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getThumb() == null) ? 0 : getThumb().hashCode());
        result = prime * result + ((getMultiplePlat() == null) ? 0 : getMultiplePlat().hashCode());
        result = prime * result + ((getPublish() == null) ? 0 : getPublish().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getPackageName() == null) ? 0 : getPackageName().hashCode());
        result = prime * result + ((getLanguage() == null) ? 0 : getLanguage().hashCode());
        result = prime * result + ((getIsRefresh() == null) ? 0 : getIsRefresh().hashCode());
        result = prime * result + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        result = prime * result + ((getUrlSchemaSuffix() == null) ? 0 : getUrlSchemaSuffix().hashCode());
        result = prime * result + ((getIphoneStoreId() == null) ? 0 : getIphoneStoreId().hashCode());
        result = prime * result + ((getIpadStoreId() == null) ? 0 : getIpadStoreId().hashCode());
        result = prime * result + ((getAppLevel() == null) ? 0 : getAppLevel().hashCode());
        result = prime * result + ((getBonus() == null) ? 0 : getBonus().hashCode());
        result = prime * result + ((getAbandon() == null) ? 0 : getAbandon().hashCode());
        result = prime * result + ((getIosDownloadUrl() == null) ? 0 : getIosDownloadUrl().hashCode());
        result = prime * result + ((getIosUniversalLink() == null) ? 0 : getIosUniversalLink().hashCode());
        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        result = prime * result + ((getAndroidPkgName() == null) ? 0 : getAndroidPkgName().hashCode());
        result = prime * result + ((getAndroidUrlScheme() == null) ? 0 : getAndroidUrlScheme().hashCode());
        return result;
    }
}