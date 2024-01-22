package com.noisegate.driver;


import com.noisegate.config.enums.MobilePlatformType;
import com.noisegate.config.factory.ConfigFactory;
import com.noisegate.driver.entity.MobileDriverData;
import com.noisegate.driver.entity.WebDriverData;
import com.noisegate.driver.factory.DriverFactory;
import com.noisegate.driver.factory.mobile.local.LocalMobileDriverFactory;
import com.noisegate.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import com.noisegate.driver.factory.web.local.LocalDriverFactory;
import com.noisegate.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.noisegate.config.factory.ConfigFactory.getConfig;

public final class Driver {

    private Driver() {
    }
    // Local Web, Remote Web, Local Mobile, Remote Mobile

    public static void initDriverForWeb() {
        //WebDriver driver = LocalMobileDriverFactory.getDriver(MobilePlatformType.ANDROID);
        WebDriver driver = RemoteMobileDriverFactory.getDriver(getConfig().mobileRemoteMode(),
                MobilePlatformType.ANDROID);
////        if (Objects.isNull(DriverManager.getDriver())) {
////            WebDriverData driverData = new WebDriverData(getConfig().browser(), getConfig().browserRemoteMode());
////            WebDriver driver = DriverFactory
////                    .getDriverForWeb(getConfig().browserRunMode())
////                    .getDriver(driverData);
////            DriverManager.setDriver(driver);
////            loadURL();
//        }
    }

    public static void loadURL() {
        DriverManager.getDriver().get(getConfig().webUrl());
    }

    public static void initDriverForMobile(MobilePlatformType mobilePlatformType) {
        MobileDriverData driverData = new MobileDriverData(mobilePlatformType, getConfig().mobileRemoteMode());
        WebDriver driver = DriverFactory
                .getDriverForMobile(getConfig().mobileRunMode())
                .getDriver(driverData);
        DriverManager.setDriver(driver);
    }

    public static void quitDriver() {
        if (Objects.nonNull(DriverManager.getDriver())) {
            DriverManager.getDriver()
                    .quit();
            DriverManager.unload();
        }
    }
}