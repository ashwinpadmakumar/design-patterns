package com.alterspace.creational.abstractfactory;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class WoodenDoor implements Door {
  @Override
  public String getDescription() {
    return "This is wooden door";
  }
}
