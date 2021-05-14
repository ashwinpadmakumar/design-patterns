package com.workspace.creational.singleton;

/**
 * Description: Singleton object created using eager initialization.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-03
 * @version: 0.1
 */
public class EagerSingleton {

  private static final EagerSingleton instance = new EagerSingleton();

  private EagerSingleton() {

  }

  public static EagerSingleton getInstance() {
    return instance;
  }
}
