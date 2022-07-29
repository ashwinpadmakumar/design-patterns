package com.alterspace.creational.abstractfactory;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class IronDoor implements Door {

  @Override
  public String getDescription() {
    return "This is an iron door";
  }
}
