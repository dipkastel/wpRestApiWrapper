package com.notrika.test.tests;


import com.notrika.test.common.BaseApiTest;
import com.notrika.wpRestApi.entities.systemStatus.SystemStatus;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class SystemStatusTests extends BaseApiTest {


    @Test
    @Order(1)
    public void getSystemStatus() {
            SystemStatus systemStatus = wpRestApi.system.getSystemStatus();
            assertNotNull(systemStatus);
    }

}
