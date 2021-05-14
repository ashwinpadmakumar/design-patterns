package com.workspace.creational.singleton;

/**
 * Description: Singleton object created using synchronized method.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-03
 * @version: 0.1
 */
public class SynchronizedMethodSingleton {

  private static SynchronizedMethodSingleton instance;

  private SynchronizedMethodSingleton() {}

  public static synchronized SynchronizedMethodSingleton getInstance() {
    if (instance == null) {
      instance = new SynchronizedMethodSingleton();
    }
    return instance;
  }
}
