package com.notrika.wpRestApi.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.core.helper.WpApiService;
import com.notrika.wpRestApi.entities.Product;
import com.notrika.wpRestApi.services.base.BaseService;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class RestProductService extends BaseService implements WpApiService<Product> {

    @Autowired
    RestProductService(WpRestApiConfigService _wpRestApiConfig, SequrityHelper _sequrityHelper) {
        super(_wpRestApiConfig,_sequrityHelper);
    }


    @Override
    @Async
    public Product[] getAll(int page,int per_page) {


        var stringResult = get("/wp-json/wc/v3/products",page,per_page);
        Product[] result = new Gson().fromJson(stringResult, Product[].class);
        return result;
    }

    @Override
    public Product[] getAll(Map<String, String> params) {
        return new Product[0];
    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public Product get(int id, Map<String, String> params) {
        return null;
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

    @Override
    public Class<Product> getType() {
        return null;
    }

}
