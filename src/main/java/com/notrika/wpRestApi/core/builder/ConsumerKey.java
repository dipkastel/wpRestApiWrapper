package com.notrika.wpRestApi.core.builder;

public class ConsumerKey {
    Paramic paramic ;
     ConsumerKey(Paramic _paramic) {
        this.paramic = _paramic;
    }

    public ConsumerSecret setConsumerSecret(String consumerSecret) {
         this.paramic.setConsumerSecret(consumerSecret);
        return new ConsumerSecret(this.paramic);
    }
}
