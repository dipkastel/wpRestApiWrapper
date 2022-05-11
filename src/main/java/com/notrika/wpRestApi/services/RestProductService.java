package com.notrika.wpRestApi.services;

import com.google.gson.Gson;
import com.notrika.wpRestApi.constAndEnums.Const;
import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.core.helper.WpApiService;
import com.notrika.wpRestApi.entities.Product;
import com.notrika.wpRestApi.services.base.BaseService;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RestProductService extends BaseService implements WpApiService<Product> {

    @Autowired
    RestProductService(WpRestApiConfigService _wpRestApiConfig, SequrityHelper _sequrityHelper) {
        super(_wpRestApiConfig, _sequrityHelper);
    }


    @Override
    @Async
    public Product[] getAll(int page, int per_page) {
        var stringResult = get(Const.PRODUCT_URL, page, per_page);
        return new Gson().fromJson(stringResult, Product[].class);
    }


    @Override
    public Product get(Long id) {
        var stringResult = get(Const.PRODUCT_URL, id);
        return new Gson().fromJson(stringResult, Product.class);
    }

    @Override
    public void create(Product obj) {

    }

    @Override
    public void update(Product obj) {

    }

    @Override
    public void delete(int id) {

    }
}
