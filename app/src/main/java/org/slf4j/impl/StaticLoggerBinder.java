package org.slf4j.impl;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.helpers.NOPLoggerFactory;
public class StaticLoggerBinder {
  private static final StaticLoggerBinder SINGLETON = new StaticLoggerBinder();
  public static StaticLoggerBinder getSingleton(){ return SINGLETON; }
  public ILoggerFactory getLoggerFactory(){ return new NOPLoggerFactory(); }
  public String getLoggerFactoryClassStr(){ return NOPLoggerFactory.class.getName(); }
}
