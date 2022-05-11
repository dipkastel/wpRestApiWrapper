package com.notrika.wpRestApi.core.builder;


import com.notrika.wpRestApi.constAndEnums.EnumWpApiVersion;

public class ConsumerSecret {

    Paramic paramic ;
    ConsumerSecret(Paramic _paramic) {
        this.paramic = _paramic;
    }


    public Initializer serVersion(EnumWpApiVersion apiv) {
        this.paramic.setApiVersion(apiv);
        return new Initializer(this.paramic);
    }
}
