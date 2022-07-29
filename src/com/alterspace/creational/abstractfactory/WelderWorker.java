package com.alterspace.creational.abstractfactory;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class WelderWorker implements Worker {
  @Override
  public String getDescription() {
    return "This is an welder worker";
  }
}
