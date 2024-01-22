package com.noisegate.driver.factory.web.local;


import com.noisegate.config.enums.BrowserType;
import com.noisegate.driver.manager.web.local.ChromeManager;
import com.noisegate.driver.manager.web.local.FirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalWebDriverFactory {

  private LocalWebDriverFactory() {
  }

  private static final Map<BrowserType, Supplier<WebDriver>> MAP =
    new EnumMap<>(BrowserType.class);

  static {
    MAP.put(BrowserType.CHROME, ChromeManager::getDriver);
    MAP.put(BrowserType.FIREFOX, FirefoxManager::getDriver);
  }

  public static WebDriver getDriver(BrowserType browserType) {
    return MAP.get(browserType).get();
  }

}