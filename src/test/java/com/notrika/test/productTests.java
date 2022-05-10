package com.notrika.test;


import com.notrika.wpRestApi.WpRestApi;
import com.notrika.wpRestApi.core.builder.EnumWpApiVersion;
import com.notrika.wpRestApi.core.builder.WpRestApiConfig;
import com.notrika.wpRestApi.core.builder.WpRestApiConfigBuilder;
import com.notrika.wpRestApi.Main;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.*;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;
import org.springframework.test.context.event.annotation.BeforeTestExecution;
import org.springframework.test.context.event.annotation.BeforeTestMethod;

import static org.junit.jupiter.api.Assertions.assertNotNull;



@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = Main.class)
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class productTests {

    @Autowired
    private WpRestApi wpRestApi;

    @BeforeEach
    public void before(){
        if(wpRestApi.wpRestApiConfigService.isInitial()) return;
        WpRestApiConfig wpRestApiConfig = WpRestApiConfigBuilder
                .setSiteUrl("kalamiss.ir")
                .setConsumerKey("ck_7186f7821630792004f0a26b9a0954f92e9fc920")
                .setConsumerSecret("cs_3359be762022b82c27d5d675ae6da1f6c3dc1021")
                .serVersion(EnumWpApiVersion.v3)
                .useHttps(true)
                .build();
        wpRestApi.init(wpRestApiConfig);
    }


    @Test
    public void test() {
        var result =  wpRestApi.product.getAll(15,1);
        assertNotNull(result);
    }

}
