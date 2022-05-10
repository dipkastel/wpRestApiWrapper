package com.notrika.wpRestApi.services.base;

import com.notrika.wpRestApi.core.RestClient;
import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.core.helper.WpApiService;

import java.util.Map;

public class BaseService extends RestClient  {

    public BaseService(WpRestApiConfigService _wpRestApiConfigService, SequrityHelper _sequrityHelper){
        super(_wpRestApiConfigService,_sequrityHelper);
    }

}
