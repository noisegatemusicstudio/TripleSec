package com.noisegate.driver.factory.mobile;

import com.noisegate.config.enums.MobilePlatformType;
import com.noisegate.driver.manager.mobile.AndroidManager;
import com.noisegate.driver.manager.mobile.IosManager;
import com.noisegate.driver.manager.web.ChromeManager;
import com.noisegate.driver.manager.web.FirefoxManager;
import org.openqa.selenium.WebDriver;

public final class LocalMobileDriverFactory {

    private LocalMobileDriverFactory() {
    }

    public static WebDriver getDriver(MobilePlatformType mobilePlatformType) {
        return isPlatformAndroid(mobilePlatformType)
                ? AndroidManager.getDriver()
                : IosManager.getDriver();
    }

    private static boolean isPlatformAndroid(MobilePlatformType mobilePlatformType) {
        return mobilePlatformType == MobilePlatformType.ANDROID;
    }

}