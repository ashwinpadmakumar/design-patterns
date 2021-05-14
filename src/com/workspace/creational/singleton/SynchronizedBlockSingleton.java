package com.workspace.creational.singleton;

/**
 * Description: Singleton object created using synchronized block.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-03
 * @version: 0.1
 */
public class SynchronizedBlockSingleton {

  private static SynchronizedBlockSingleton instance;

  private SynchronizedBlockSingleton() {}

  public static SynchronizedBlockSingleton getInstance() {
    if (instance == null) {
      synchronized (SynchronizedBlockSingleton.class) {
        if (instance == null) {
          instance = new SynchronizedBlockSingleton();
        }
      }
    }
    return instance;
  }
}
