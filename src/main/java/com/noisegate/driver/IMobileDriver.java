package com.noisegate.driver;


import com.noisegate.driver.entity.MobileDriverData;
import org.openqa.selenium.WebDriver;

public interface IMobileDriver {
  WebDriver getDriver(MobileDriverData driverData);
}