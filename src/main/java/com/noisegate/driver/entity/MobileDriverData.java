package com.noisegate.driver.entity;


import com.noisegate.config.enums.MobilePlatformType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MobileDriverData {
  private MobilePlatformType mobilePlatformType;
}