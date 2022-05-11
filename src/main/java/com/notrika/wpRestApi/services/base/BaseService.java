package com.notrika.wpRestApi.services.base;

import com.notrika.wpRestApi.core.RestClient;
import com.notrika.wpRestApi.core.helper.SequrityHelper;

public class BaseService extends RestClient  {

    public BaseService(WpRestApiConfigService _wpRestApiConfigService, SequrityHelper _sequrityHelper){
        super(_wpRestApiConfigService,_sequrityHelper);
    }

}
