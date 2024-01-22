package com.noisegate.config.converters;


import com.noisegate.config.enums.MobilePlatformType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToMobilePlatformTypeConverter implements Converter<MobilePlatformType> {
  @Override
  public MobilePlatformType convert(Method method, String platformType) {
    return MobilePlatformType.valueOf(platformType.toUpperCase());
  }
}