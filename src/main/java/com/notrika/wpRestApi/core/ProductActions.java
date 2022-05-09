package com.notrika.wpRestApi.core;

import com.notrika.wpRestApi.core.builder.WpRestApiConfig;
import com.notrika.wpRestApi.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductActions {
    public ProductActions(WpRestApiConfig builder) {

    }

    public List<Product> getAll() {
        List<Product> products = new ArrayList<Product>();
        return products;
    }
}
