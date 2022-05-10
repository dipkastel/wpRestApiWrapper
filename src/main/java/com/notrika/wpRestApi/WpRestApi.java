package com.notrika.wpRestApi;

import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import com.notrika.wpRestApi.services.RestProductService;
import com.notrika.wpRestApi.core.builder.WpRestApiConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WpRestApi {

    @Autowired
    public WpRestApiConfigService wpRestApiConfigService;
    @Autowired
    public RestProductService product;


    public void init(WpRestApiConfig builder){
        if(wpRestApiConfigService!=null)
            wpRestApiConfigService.prepare(builder);
    }


}
