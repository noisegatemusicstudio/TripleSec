package com.noisegate.driver.factory.web.remote;



import com.noisegate.config.enums.BrowserType;
import com.noisegate.driver.manager.web.remote.BrowserStackChromeManager;
import com.noisegate.driver.manager.web.remote.BrowserStackFirefoxManager;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class BrowserStackFactory {

  private BrowserStackFactory() {
  }

  private static final Map<BrowserType, Supplier<WebDriver>> MAP =
    new EnumMap<>(BrowserType.class);

  static {
    MAP.put(BrowserType.CHROME, BrowserStackChromeManager::getDriver);
    MAP.put(BrowserType.FIREFOX, BrowserStackFirefoxManager::getDriver);
  }

  public static WebDriver getDriver(BrowserType browserType) {
    return MAP.get(browserType).get();
  }
}