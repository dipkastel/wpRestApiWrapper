package com.notrika.wpRestApi.core.builder;


import com.notrika.wpRestApi.constAndEnums.EnumWpApiVersion;

public class WpRestApiConfig {

    public String siteUrl;
    public String consumerKey;
    public String consumerSecret;
    public EnumWpApiVersion apiVersion;
    public boolean isHttps = true;


    public WpRestApiConfig(Paramic p){
        this.siteUrl = p.getSiteUrl();
        this.consumerKey = p.getConsumerKey();
        this.consumerSecret = p.getConsumerSecret();
        this.apiVersion = p.getApiVersion();
        this.isHttps = p.isHttps();
    }

}
