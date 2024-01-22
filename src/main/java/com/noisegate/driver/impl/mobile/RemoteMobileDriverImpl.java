package com.noisegate.driver.impl.mobile;


import com.noisegate.driver.IMobileDriver;
import com.noisegate.driver.entity.MobileDriverData;
import com.noisegate.driver.factory.mobile.remote.RemoteMobileDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteMobileDriverImpl implements IMobileDriver {

  @Override
  public WebDriver getDriver(MobileDriverData driverData) {
    return RemoteMobileDriverFactory.getDriver(driverData.getMobileRemoteModeType(), driverData.getMobilePlatformType());
  }
}