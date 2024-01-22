package com.noisegate.driver.factory.mobile.remote;


import com.noisegate.config.enums.MobilePlatformType;
import com.noisegate.config.enums.MobileRemoteModeType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteMobileDriverFactory {

  private RemoteMobileDriverFactory() {
  }

  private static final Map<MobileRemoteModeType, Function<MobilePlatformType, WebDriver>> MAP =
    new EnumMap<>(MobileRemoteModeType.class);

  static {
    MAP.put(MobileRemoteModeType.BROWSER_STACK, BrowserStackMobileFactory::getDriver);
  }

  public static WebDriver getDriver(MobileRemoteModeType browserRemoteModeType,
                                    MobilePlatformType platformType) {
    return MAP.get(browserRemoteModeType).apply(platformType);
  }
}