package com.notrika.wpRestApi.services;

import com.google.gson.Gson;
import com.notrika.wpRestApi.constAndEnums.Const;
import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.entities.product.Product;
import com.notrika.wpRestApi.entities.systemStatus.SystemStatus;
import com.notrika.wpRestApi.services.base.BaseService;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RestSystemStatusService extends BaseService {


    @Autowired
    public Gson gson;

    @Autowired
    RestSystemStatusService(WpRestApiConfigService _wpRestApiConfig, SequrityHelper _sequrityHelper) {
        super(_wpRestApiConfig, _sequrityHelper);
    }


    @Async
    public SystemStatus getSystemStatus() {
        var stringResult = get(Const.SYSTEM_STATUS_URL);
        return gson.fromJson(stringResult, SystemStatus.class);
    }


}
