package com.noisegate.driver;


import com.noisegate.config.enums.BrowserType;
import com.noisegate.config.enums.MobilePlatformType;
import com.noisegate.config.enums.RunModeType;
import com.noisegate.config.factory.ConfigFactory;
import com.noisegate.driver.entity.MobileDriverData;
import com.noisegate.driver.entity.WebDriverData;
import com.noisegate.driver.factory.DriverFactory;
import com.noisegate.driver.factory.mobile.local.LocalMobileDriverFactory;

import com.noisegate.driver.factory.web.local.LocalWebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.Objects;

import static com.noisegate.config.factory.ConfigFactory.getConfig;

public final class Driver {

    private Driver() {
    }
    // Local Web, Remote Web, Local Mobile, Remote Mobile

    public static void initDriverForWeb() {
      //  WebDriver driver = LocalWebDriverFactory.getDriver(BrowserType.CHROME);

        if (Objects.isNull(DriverManager.getDriver())) {
            WebDriverData driverData = new WebDriverData(getConfig().browser());
            WebDriver driver = DriverFactory
                    .getDriverForWeb(RunModeType.LOCAL)
                    .getDriver(driverData);
            DriverManager.setDriver(driver);
            loadURL();
        }
    }

    public static void loadURL() {
        DriverManager.getDriver().get(getConfig().webUrl());
    }

    public static void initDriverForMobile(MobilePlatformType mobilePlatformType) {
        MobileDriverData driverData = new MobileDriverData(mobilePlatformType);
        WebDriver driver = DriverFactory
                .getDriverForMobile(RunModeType.LOCAL)
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