package com.noisegate.driver.impl.web;



import com.noisegate.driver.IWebDriver;
import com.noisegate.driver.entity.WebDriverData;
import com.noisegate.driver.factory.web.local.LocalWebDriverFactory;
import org.openqa.selenium.WebDriver;

public class LocalWebDriverImpl implements IWebDriver {

  @Override
  public WebDriver getDriver(WebDriverData driverData) {
    return LocalWebDriverFactory.getDriver(driverData.getBrowserType());
  }
}