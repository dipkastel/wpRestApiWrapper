package com.notrika.wpRestApi.core;

import com.notrika.wpRestApi.core.builder.WpRestApiConfig;

public class WpRestApi {
    public ProductActions product;

    public WpRestApi(WpRestApiConfig builder){
        product = new ProductActions(builder);
    }


}
