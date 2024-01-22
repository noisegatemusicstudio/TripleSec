package com.noisegate.driver.entity;


import com.noisegate.config.enums.BrowserRemoteModeType;
import com.noisegate.config.enums.BrowserType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class WebDriverData {
  private BrowserType browserType;
  private BrowserRemoteModeType browserRemoteModeType;
}