package com.notrika.test;


import com.notrika.wpRestApi.Main;
import com.notrika.wpRestApi.WpRestApi;
import com.notrika.wpRestApi.constAndEnums.EnumWpApiVersion;
import com.notrika.wpRestApi.core.builder.WpRestApiConfig;
import com.notrika.wpRestApi.core.builder.WpRestApiConfigBuilder;
import com.notrika.wpRestApi.entities.Product;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = Main.class)
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class productTests {

    @Autowired
    private WpRestApi wpRestApi;

    Product[] productsList = new Product[0];

    @BeforeEach
    public void before() {
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


    @Test
    @Order(1)
    public void getAllProduct() {
        for (int i = 0;i<3;i++){
            productsList = wpRestApi.product.getAll((int) ((Math.random() * (100 - 10)) + 10), (int) ((Math.random() * (10 - 3)) + 3));
            assertNotNull(productsList);
        }
    }
    @Test
    @Order(2)
    public void getSingleProduct() {
        List<Long> products =  List.of(24018l, 24016l, 23896l, 23898l, 23907l);
        for (Long id:products) {
            var result =wpRestApi.product.get(id);
            assertNotNull(result);
        }
    }

}
