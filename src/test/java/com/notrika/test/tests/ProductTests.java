package com.notrika.test.tests;


import com.notrika.test.common.BaseApiTest;
import com.notrika.wpRestApi.Main;
import com.notrika.wpRestApi.entities.product.Product;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ProductTests extends BaseApiTest {



    @Test
    @Order(1)
    public void getAllProduct() {
        for (int i = 0;i<3;i++){
            Product[] productsList = wpRestApi.product.getAll((int) ((Math.random() * (100 - 10)) + 10), (int) ((Math.random() * (10 - 3)) + 3));
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
