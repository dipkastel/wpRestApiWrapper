package com.notrika.wpRestApi.core;

import com.notrika.wpRestApi.core.helper.SequrityHelper;
import com.notrika.wpRestApi.services.base.WpRestApiConfigService;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

public class RestClient {

    private WpRestApiConfigService wpRestApiConfigService ;
    private SequrityHelper sequrityHelper;
    private RestTemplate rest;
    private HttpStatus status;

    public RestClient(WpRestApiConfigService _wpRestApiConfigService,SequrityHelper _sequrityHelper) {
        this.rest = new RestTemplate();
        this.wpRestApiConfigService = _wpRestApiConfigService;
        this.sequrityHelper = _sequrityHelper;
       }


    public String get(String uri) {

        HttpEntity<String> requestEntity = new HttpEntity<String>(getHeaders());
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(wpRestApiConfigService.getSiteUrl() + uri)
                .encode()
                .toUriString();
        ResponseEntity<String> responseEntity = rest.exchange(urlTemplate, HttpMethod.GET, requestEntity, String.class);
        this.setStatus(responseEntity.getStatusCode());
        return responseEntity.getBody();
    }

    public String get(String uri,Long id) {

        HttpEntity<String> requestEntity = new HttpEntity<String>(getHeaders());
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(wpRestApiConfigService.getSiteUrl() + uri+"/"+id)
                .encode()
                .toUriString();
        ResponseEntity<String> responseEntity = rest.exchange(urlTemplate, HttpMethod.GET, requestEntity, String.class);
        this.setStatus(responseEntity.getStatusCode());
        return responseEntity.getBody();
    }
    public String get(String uri,int page,int per_page) {

        HttpEntity<String> requestEntity = new HttpEntity<String>(getHeaders());
        String urlTemplate = UriComponentsBuilder.fromHttpUrl(wpRestApiConfigService.getSiteUrl() + uri)
                .queryParam("page", String.valueOf(page))
                .queryParam("per_page", String.valueOf(per_page))
                .encode()
                .toUriString();
        ResponseEntity<String> responseEntity = rest.exchange(urlTemplate, HttpMethod.GET, requestEntity, String.class);
        this.setStatus(responseEntity.getStatusCode());
        return responseEntity.getBody();
    }

    public String post(String uri, String json) {
        HttpEntity<String> requestEntity = new HttpEntity<String>(json, getHeaders());
        ResponseEntity<String> responseEntity = rest.exchange(wpRestApiConfigService.getSiteUrl() + uri, HttpMethod.POST, requestEntity, String.class);
        this.setStatus(responseEntity.getStatusCode());
        return responseEntity.getBody();
    }

    public void put(String uri, String json) {
        HttpEntity<String> requestEntity = new HttpEntity<String>(json, getHeaders());
        ResponseEntity<String> responseEntity = rest.exchange(wpRestApiConfigService.getSiteUrl() + uri, HttpMethod.PUT, requestEntity, (Class<String>) null);
        this.setStatus(responseEntity.getStatusCode());
    }

    public void delete(String uri) {
        HttpEntity<String> requestEntity = new HttpEntity<String>( getHeaders());
        ResponseEntity<String> responseEntity = rest.exchange(wpRestApiConfigService.getSiteUrl() + uri, HttpMethod.DELETE, requestEntity, (Class<String>) null);
        this.setStatus(responseEntity.getStatusCode());
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/json");
        headers.add("Accept", "*/*");
        headers.add("Authorization", sequrityHelper.getBasicAuth(wpRestApiConfigService.getConsumerKey(),wpRestApiConfigService.getConsumerSecret()));
        return headers;
    }
}
