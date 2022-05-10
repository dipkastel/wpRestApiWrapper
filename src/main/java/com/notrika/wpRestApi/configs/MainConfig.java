package com.notrika.wpRestApi.configs;

import com.notrika.wpRestApi.core.RestClient;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfig {

    private final WpRestApiConfigService wpRestApiConfigService;

    @Autowired
    MainConfig(WpRestApiConfigService _wpRestApiConfigService){
        wpRestApiConfigService =_wpRestApiConfigService;
    }

    @Bean
    public void Test() throws Exception{
//        if(!wpRestApiConfigService.isInitial())
//            throw new Exception("Initialize wpRestApi first");
//        if(wpRestApiConfigService.getSiteUrl()==null)
//            throw new Exception("server url is required");
//        if(wpRestApiConfigService.getConsumerKey()==null)
//            throw new Exception("consumer key is required");
//        if(wpRestApiConfigService.getConsumerSecret()==null)
//            throw new Exception("consumer secret is required");
    }
}
