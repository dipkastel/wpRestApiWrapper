package com.notrika.wpRestApi.services.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BaseService {

    public WpRestApiConfigService wpRestApiConfigService;
    public BaseService(WpRestApiConfigService _wpRestApiConfigService){
        this.wpRestApiConfigService = _wpRestApiConfigService;
    }

}
