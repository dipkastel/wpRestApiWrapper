package com.notrika.test.tests;

import com.notrika.test.common.BaseApiTest;
import com.notrika.wpRestApi.entities.Tag.Tag;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class tagTests  extends BaseApiTest {



    @Test
    @Order(1)
    public void getAllTags() {
        for (int i = 0;i<3;i++){
            Tag[] tagList = wpRestApi.tag.getAll((int) ((Math.random() * (100 - 10)) + 10), (int) ((Math.random() * (10 - 3)) + 3));
            assertNotNull(tagList);
        }
    }
    @Test
    @Order(2)
    public void getSingleTag() {
        List<Long> tags =  List.of(9286l, 6240l, 8537l, 552l, 7483l);
        for (Long id:tags) {
            var result =wpRestApi.tag.get(id);
            assertNotNull(result);
        }
    }

}
