package com.notrika.wpRestApi.services;

import com.google.gson.Gson;
import com.notrika.wpRestApi.constAndEnums.Const;
import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.core.helper.WpApiService;
import com.notrika.wpRestApi.entities.Tag.Tag;
import com.notrika.wpRestApi.services.base.BaseService;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RestTagService extends BaseService implements WpApiService<Tag> {

    @Autowired
    private Gson gson;

    @Autowired
    RestTagService(WpRestApiConfigService _wpRestApiConfig, SequrityHelper _sequrityHelper) {
        super(_wpRestApiConfig, _sequrityHelper);
    }


    @Override
    @Async
    public Tag[] getAll(int page, int per_page) {
        var stringResult = get(Const.TAG_URL, page, per_page);
        return gson.fromJson(stringResult, Tag[].class);
    }


    @Override
    @Async
    public Tag get(Long id) {
        var stringResult = get(Const.TAG_URL, id);
        return gson.fromJson(stringResult, Tag.class);
    }

    @Override
    @Async
    public void create(Tag obj) {

    }

    @Override
    @Async
    public void update(Tag obj) {

    }

    @Override
    @Async
    public void delete(int id) {

    }
}
