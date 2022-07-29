package com.alterspace.creational.abstractfactory;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class CarpenterWorker implements Worker {
  @Override
  public String getDescription() {
    return "This is local worker";
  }
}
