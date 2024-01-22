package com.noisegate.config.factory;


import com.noisegate.config.BrowserStackConfig;
import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigFactory {

  private BrowserStackConfigFactory() {
  }

  public static BrowserStackConfig getConfig() {
    return ConfigCache.getOrCreate(BrowserStackConfig.class);
  }
}