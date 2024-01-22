package com.noisegate.tests.mobile;

import com.noisegate.config.enums.MobilePlatformType;
import com.noisegate.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class MobileBase {

    @BeforeMethod
    public void setUp() {
        Driver.initDriverForMobile(MobilePlatformType.ANDROID);
    }

    @AfterMethod
    public void tearDown() {
        Driver.quitDriver();
    }
}