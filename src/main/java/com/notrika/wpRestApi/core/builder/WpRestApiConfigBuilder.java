package com.notrika.wpRestApi.core.builder;

import org.springframework.beans.factory.annotation.Autowired;

public class WpRestApiConfigBuilder{
    Paramic paramic;
    private WpRestApiConfigBuilder(Paramic param){
        this.paramic = param;
    }



    public static SiteUrl setSiteUrl(String siteUrl) {
        Paramic paramic = new Paramic();
        paramic.setSiteUrl(siteUrl);
        return new SiteUrl(paramic);
    }

}
