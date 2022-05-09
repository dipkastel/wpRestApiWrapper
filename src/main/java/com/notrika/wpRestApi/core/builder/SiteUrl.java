package com.notrika.wpRestApi.core.builder;

public class SiteUrl {

    Paramic paramic ;
    SiteUrl(Paramic _paramic) {
        this.paramic = _paramic;
    }


    public ConsumerKey setConsumerKey(String consumerKey) {
        this.paramic.setConsumerKey(consumerKey);
        return new ConsumerKey(paramic);
    }
}
