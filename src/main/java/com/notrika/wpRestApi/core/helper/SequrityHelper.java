package com.notrika.wpRestApi.core.helper;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Base64;

@Component
public class SequrityHelper {

    public String getBasicAuth(String consumerKey, String consumerSecret) {
        String result = "Basic "+ Base64.getEncoder().encodeToString((consumerKey + ":" + consumerSecret).getBytes());
        return result;
    }
}
