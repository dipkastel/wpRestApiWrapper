package com.notrika.wpRestApi.services;

import com.google.gson.Gson;
import com.notrika.wpRestApi.constAndEnums.Const;
import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.core.helper.WpApiService;
import com.notrika.wpRestApi.entities.category.Category;
import com.notrika.wpRestApi.services.base.BaseService;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RestCategoryService extends BaseService implements WpApiService<Category> {

    @Autowired
    private Gson gson;

    @Autowired
    RestCategoryService(WpRestApiConfigService _wpRestApiConfig, SequrityHelper _sequrityHelper) {
        super(_wpRestApiConfig, _sequrityHelper);
    }


    @Override
    @Async
    public Category[] getAll(int page, int per_page) {
        var stringResult = get(Const.CATEGORY_URL, page, per_page);
        return gson.fromJson(stringResult, Category[].class);
    }


    @Override
    @Async
    public Category get(Long id) {
        var stringResult = get(Const.CATEGORY_URL, id);
        return gson.fromJson(stringResult, Category.class);
    }

    @Override
    @Async
    public void create(Category obj) {

    }

    @Override
    @Async
    public void update(Category obj) {

    }

    @Override
    @Async
    public void delete(int id) {

    }
}
