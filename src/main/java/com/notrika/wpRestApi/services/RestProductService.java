package com.notrika.wpRestApi.services;

import com.notrika.wpRestApi.core.RestClient;
import com.notrika.wpRestApi.entities.Product;
import com.notrika.wpRestApi.services.base.BaseService;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestProductService extends BaseService {


    @Autowired
    RestProductService(WpRestApiConfigService _wpRestApiConfig) throws Exception {
        super(_wpRestApiConfig);
    }

    public  List<Product> getAll() {

         String server ;
         RestTemplate rest;
         HttpHeaders headers;
         HttpStatus status;
        rest = new RestTemplate();
        headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        HttpEntity<String> requestEntity = new HttpEntity<String>("", headers);
        ResponseEntity<String> responseEntity = rest.exchange(this.wpRestApiConfigService.getSiteUrl() + "/wp-json/wc/v3/products", HttpMethod.GET, requestEntity, String.class);
        status=responseEntity.getStatusCode();
        String kk= responseEntity.getBody();
        List<Product> products = new ArrayList<Product>();
        return products;
    }

}
