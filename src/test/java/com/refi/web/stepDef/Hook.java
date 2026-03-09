package com.refi.web.stepDef;

import com.refi.web.base.BaseWeb;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends BaseWeb {

    @Before
    public void setUp() {
        System.out.println("Hook sedang berjalan, menyiapkan driver...");
        getDriver();
        BaseWeb.driver.get(baseUrl);
    }

    @After
    public void tearDown(){
        close();
    }
}
