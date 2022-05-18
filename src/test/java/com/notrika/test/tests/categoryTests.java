package com.notrika.test.tests;

import com.notrika.test.common.BaseApiTest;
import com.notrika.wpRestApi.entities.Tag.Tag;
import com.notrika.wpRestApi.entities.category.Category;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class categoryTests extends BaseApiTest {



    @Test
    @Order(1)
    public void getAllCategories() {
        for (int i = 0;i<3;i++){
            Category[] categoryList = wpRestApi.category.getAll((int) ((Math.random() * (3 - 1)) + 1), (int) ((Math.random() * (10 - 3)) + 3));
            assertNotNull(categoryList);
        }
    }
    @Test
    @Order(2)
    public void getSingleTag() {
        List<Long> categories =  List.of(600l, 604l, 629l, 403l, 596l);
        for (Long id:categories) {
            var result =wpRestApi.category.get(id);
            assertNotNull(result);
        }
    }

}
