package com.notrika.wpRestApi.services.base;

import com.notrika.wpRestApi.core.builder.EnumWpApiVersion;
import com.notrika.wpRestApi.core.builder.WpRestApiConfig;
import org.springframework.stereotype.Service;

@Service
public class WpRestApiConfigService {

    private boolean isInitial = false;
    private String siteUrl;
    private String consumerKey;
    private String consumerSecret;
    private EnumWpApiVersion apiVersion;
    private boolean isHttps = true;

    public boolean isInitial() {
        return isInitial;
    }

    public void setInitial(boolean initial) {
        isInitial = initial;
    }

    public String getSiteUrl() {
        if (isHttps)
            return String.format("https://%s", siteUrl.replace("https://", "").replace("https://", ""));
        else
            return String.format("http://%s", siteUrl.replace("http://", "").replace("https://", ""));
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

    public void prepare(WpRestApiConfig p) {

        this.isInitial = true;
        this.setSiteUrl(p.siteUrl);
        this.setHttps(p.isHttps);
        this.setApiVersion(p.apiVersion);
        this.setConsumerKey(p.consumerKey);
        this.setConsumerSecret(p.consumerSecret);
    }
}
