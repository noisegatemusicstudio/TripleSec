package com.noisegate.driver.factory;

import com.noisegate.config.enums.RunModeType;
import com.noisegate.driver.IMobileDriver;
import com.noisegate.driver.IWebDriver;

import com.noisegate.driver.impl.mobile.LocalMobileDriverImpl;
import com.noisegate.driver.impl.web.LocalWebDriverImpl;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class DriverFactory {

  private DriverFactory() {
  }

  private static final Map<RunModeType, Supplier<IWebDriver>> WEB = new EnumMap<>(RunModeType.class);
  private static final Map<RunModeType, Supplier<IMobileDriver>> MOBILE = new EnumMap<>(RunModeType.class);

  static {
    WEB.put(RunModeType.LOCAL, LocalWebDriverImpl::new);
    MOBILE.put(RunModeType.LOCAL, LocalMobileDriverImpl::new);
  }

  public static IWebDriver getDriverForWeb(RunModeType runModeType) {
    return WEB.get(runModeType).get();
  }

  public static IMobileDriver getDriverForMobile(RunModeType runModeType) {
    return MOBILE.get(runModeType).get();
  }
}