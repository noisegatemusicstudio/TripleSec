package com.noisegate.driver;


import com.noisegate.config.enums.MobilePlatformType;
import com.noisegate.driver.entity.WebDriverData;
import com.noisegate.driver.factory.DriverFactory;
import com.noisegate.driver.factory.mobile.LocalMobileDriverFactory;
import com.noisegate.driver.factory.web.LocalDriverFactory;
import org.openqa.selenium.WebDriver;



import java.util.Objects;

import com.noisegate.config.factory.ConfigFactory;


public final class Driver {

    private Driver() {
    }

    public static void initDriverForWeb() {

        //WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
        WebDriver driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.ANDROID);
        driver.quit();
        /*if (Objects.isNull(DriverManager.getDriver())) {
            WebDriver driverData = new WebDriverData(getConfig().browser());
            WebDriver driver = DriverFactory
                    .getDriverForWeb(getConfig())
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            //loadURL();

//            WebDriverData driverData = new WebDriverData(getConfig().browser());
//            WebDriver driver = DriverFactory
//                    .getDriverForWeb(getConfig())
//                    .getDriver(driverData);
//            DriverManager.setDriver(driver);
//            loadURL();
        }*/

        /*public static void loadURL() {
            DriverManager.getDriver().get(getConfig().webUrl());
        }*/
    }





    public static void quitDriver() {

    }
}