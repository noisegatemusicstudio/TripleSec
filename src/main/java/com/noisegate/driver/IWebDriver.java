package com.noisegate.driver;


import com.noisegate.driver.entity.WebDriverData;
import org.openqa.selenium.WebDriver;

public interface IWebDriver {
  WebDriver getDriver(WebDriverData driverData);
}