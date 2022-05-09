package com.notrika.wpRestApi.core.builder;

public class Initializer {


    Paramic paramic ;
    public Initializer(Paramic _paramic) {
        this.paramic = _paramic;
    }

    public Initializer useHttps(boolean useHttps) {
        this.paramic.setHttps(useHttps);
        return this;
    }


    public WpRestApiConfig build() {
        return new WpRestApiConfig(this.paramic);
    }
}
