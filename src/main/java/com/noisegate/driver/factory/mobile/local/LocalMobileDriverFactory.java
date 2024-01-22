package com.noisegate.driver.factory.mobile.local;

import com.noisegate.config.enums.MobilePlatformType;
import com.noisegate.driver.manager.mobile.local.AndroidManager;
import com.noisegate.driver.manager.mobile.local.IosManager;
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