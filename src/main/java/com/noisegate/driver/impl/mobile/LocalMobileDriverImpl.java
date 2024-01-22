package com.noisegate.driver.impl.mobile;


import com.noisegate.driver.IMobileDriver;
import com.noisegate.driver.entity.MobileDriverData;
import com.noisegate.driver.factory.mobile.local.LocalMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalMobileDriverImpl implements IMobileDriver {

  @Override
  public WebDriver getDriver(MobileDriverData driverData) {
    return LocalMobileDriverFactory.getDriver(driverData.getMobilePlatformType());
  }
}