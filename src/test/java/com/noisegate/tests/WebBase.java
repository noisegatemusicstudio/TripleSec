package com.noisegate.tests;

import com.noisegate.driver.Driver;
import org.testng.annotations.BeforeMethod;

public class WebBase {

    @BeforeMethod
    public void setUp() {
        Driver.initDriverForWeb();
    }
}