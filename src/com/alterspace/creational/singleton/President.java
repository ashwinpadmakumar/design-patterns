package com.alterspace.creational.singleton;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class President {

  private static President instance;

  public static President getInstance() {
    if (instance == null) {
      instance = new President();
    }
    return instance;
  }
}
