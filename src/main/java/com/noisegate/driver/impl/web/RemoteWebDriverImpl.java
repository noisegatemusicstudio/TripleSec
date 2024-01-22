package com.noisegate.driver.impl.web;


import com.noisegate.driver.IWebDriver;
import com.noisegate.driver.entity.WebDriverData;
import com.noisegate.driver.factory.web.remote.RemoteDriverFactory;
import org.openqa.selenium.WebDriver;

public class RemoteWebDriverImpl implements IWebDriver {
  @Override
  public WebDriver getDriver(WebDriverData driverData) {
    return RemoteDriverFactory.getDriver(driverData.getBrowserRemoteModeType(), driverData.getBrowserType());
  }
}