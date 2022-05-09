package com.notrika.wpRestApi.core.builder;

class Paramic {

    private String siteUrl;
    private String consumerKey;
    private String consumerSecret;
    private EnumWpApiVersion apiVersion;
    private boolean isHttps = true;

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    public EnumWpApiVersion getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(EnumWpApiVersion apiVersion) {
        this.apiVersion = apiVersion;
    }

    public boolean isHttps() {
        return isHttps;
    }

    public void setHttps(boolean https) {
        isHttps = https;
    }
}
