/**
 * Description: Singleton Pattern implementation main class.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-03
 * @version: 0.1
 */
package com.workspace.creational.singleton;

public class SingletonPattern {

  private static final String LINE = "==============================================================";

  public static void main(String[] args) {

    System.out.println("Eager Initialization Singleton approach");
    EagerSingleton eagerSingletonObj1 = EagerSingleton.getInstance();
    EagerSingleton eagerSingletonObj2 = EagerSingleton.getInstance();
    System.out.println(eagerSingletonObj1);
    System.out.println(eagerSingletonObj2);

    System.out.println(LINE);

    System.out.println("Lazy Initialization Singleton approach");
    LazySingleton lazySingletonObj1 = LazySingleton.getInstance();
    LazySingleton lazySingletonObj2 = LazySingleton.getInstance();
    System.out.println(lazySingletonObj1);
    System.out.println(lazySingletonObj2);

    System.out.println(LINE);

    System.out.println("Synchronized Method Singleton approach");
    SynchronizedMethodSingleton synchronizedMethodSingleton1 = SynchronizedMethodSingleton.getInstance();
    SynchronizedMethodSingleton synchronizedMethodSingleton2 = SynchronizedMethodSingleton.getInstance();
    System.out.println(synchronizedMethodSingleton1);
    System.out.println(synchronizedMethodSingleton2);

    System.out.println(LINE);

    System.out.println("Synchronized Block Singleton approach");
    SynchronizedBlockSingleton synchronizedBlockSingleton1 = SynchronizedBlockSingleton.getInstance();
    SynchronizedBlockSingleton synchronizedBlockSingleton2 = SynchronizedBlockSingleton.getInstance();
    System.out.println(synchronizedBlockSingleton1);
    System.out.println(synchronizedBlockSingleton2);

    System.out.println(LINE);
  }
}
