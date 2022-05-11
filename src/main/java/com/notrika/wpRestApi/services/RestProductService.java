package com.notrika.wpRestApi.services;

import com.google.gson.Gson;
import com.notrika.wpRestApi.constAndEnums.Const;
import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.core.helper.WpApiService;
import com.notrika.wpRestApi.entities.product.Product;
import com.notrika.wpRestApi.services.base.BaseService;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class RestProductService extends BaseService implements WpApiService<Product> {

    @Autowired
    private Gson gson;

    @Autowired
    RestProductService(WpRestApiConfigService _wpRestApiConfig, SequrityHelper _sequrityHelper) {
        super(_wpRestApiConfig, _sequrityHelper);
    }


    @Override
    @Async
    public Product[] getAll(int page, int per_page) {
        var stringResult = get(Const.PRODUCT_URL, page, per_page);
        return gson.fromJson(stringResult, Product[].class);
    }


    @Override
    @Async
    public Product get(Long id) {
        var stringResult = get(Const.PRODUCT_URL, id);
        return gson.fromJson(stringResult, Product.class);
    }

    @Override
    @Async
    public void create(Product obj) {

    }

    @Override
    @Async
    public void update(Product obj) {

    }

    @Override
    @Async
    public void delete(int id) {

    }
}
