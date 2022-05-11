package com.notrika.test.common;

import com.notrika.wpRestApi.Main;
import com.notrika.wpRestApi.WpRestApi;
import com.notrika.wpRestApi.constAndEnums.EnumWpApiVersion;
import com.notrika.wpRestApi.core.builder.WpRestApiConfig;
import com.notrika.wpRestApi.core.builder.WpRestApiConfigBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = Main.class)
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseApiTest {



    @Autowired
    public WpRestApi wpRestApi;

    @BeforeEach
    public void before() {
        new BaseApiTest().fillDatas(wpRestApi);
    }


    public void fillDatas(WpRestApi wpRestApi){

        if (wpRestApi.wpRestApiConfigService.isInitial()) return;
        WpRestApiConfig wpRestApiConfig = WpRestApiConfigBuilder
                .setSiteUrl("kalamiss.ir")
                .setConsumerKey("ck_7186f7821630792004f0a26b9a0954f92e9fc920")
                .setConsumerSecret("cs_3359be762022b82c27d5d675ae6da1f6c3dc1021")
                .serVersion(EnumWpApiVersion.v3)
                .useHttps(true)
                .build();
        wpRestApi.init(wpRestApiConfig);
    }
}
