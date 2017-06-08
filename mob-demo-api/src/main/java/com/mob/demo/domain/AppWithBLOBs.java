package com.mob.demo.domain;

import java.io.Serializable;

public class AppWithBLOBs extends App implements Serializable {
    private String appVersion;

    private String apppkg;

    private String description;

    private static final long serialVersionUID = 1L;

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public String getApppkg() {
        return apppkg;
    }

    public void setApppkg(String apppkg) {
        this.apppkg = apppkg == null ? null : apppkg.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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
        AppWithBLOBs other = (AppWithBLOBs) that;
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
            && (this.getAndroidUrlScheme() == null ? other.getAndroidUrlScheme() == null : this.getAndroidUrlScheme().equals(other.getAndroidUrlScheme()))
            && (this.getAppVersion() == null ? other.getAppVersion() == null : this.getAppVersion().equals(other.getAppVersion()))
            && (this.getApppkg() == null ? other.getApppkg() == null : this.getApppkg().equals(other.getApppkg()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()));
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
        result = prime * result + ((getAppVersion() == null) ? 0 : getAppVersion().hashCode());
        result = prime * result + ((getApppkg() == null) ? 0 : getApppkg().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        return result;
    }
}