package com.workspace.singleton;

/**
 * Description: Singleton object created using lazy initialization.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-03
 * @version: 0.1
 */
public class LazySingleton {

  private static LazySingleton instance;

  private LazySingleton() {}

  public static LazySingleton getInstance() {
    if (instance == null) {
      instance = new LazySingleton();
    }
    return instance;
  }
}
