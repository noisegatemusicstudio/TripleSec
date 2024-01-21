package com.noisegate.driver.factory.web;

import com.noisegate.config.enums.BrowserType;
import com.noisegate.driver.manager.web.ChromeManager;
import com.noisegate.driver.manager.web.FirefoxManager;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory() {
    }

//    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
//            new EnumMap<>(BrowserType.class);
//
//    static {
//        MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
//        MAP.put(BrowserType.FIREFOX, FirefoxManager::getDriver);
//    }

    public static WebDriver getDriver(BrowserType browserType) {
        return isBrowserChrome(browserType)
                ? ChromeManager.getDriver()
                : FirefoxManager.getDriver();
    }

    private static boolean isBrowserChrome(BrowserType browserType) {
        return browserType == BrowserType.CHROME;
    }

}