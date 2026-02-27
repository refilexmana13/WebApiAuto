package com.refi.web.stepDef;

import com.refi.web.base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseTest {

    @Before
    public void setUp() {
        System.out.println("DEBUG: Hook sedang berjalan, menyiapkan driver...");
        getDriver();
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
