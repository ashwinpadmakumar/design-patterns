/**
 * Description: Singleton Pattern implementation main class.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-03
 * @version: 0.1
 */
package com.workspace.singleton;

import java.util.logging.Level;
import java.util.logging.Logger;

public class SingletonPattern {

  private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
  private static final String LINE = "==============================================================";

  public static void main(String[] args) {

    logger.log(Level.INFO, "Eager Initialization Singleton approach");
    EagerSingleton eagerSingletonObj1 = EagerSingleton.getInstance();
    EagerSingleton eagerSingletonObj2 = EagerSingleton.getInstance();
    logger.log(Level.INFO, String.valueOf(eagerSingletonObj1));
    logger.log(Level.INFO, String.valueOf(eagerSingletonObj2));

    logger.log(Level.INFO, LINE);

    logger.log(Level.INFO, "Lazy Initialization Singleton approach");
    LazySingleton lazySingletonObj1 = LazySingleton.getInstance();
    LazySingleton lazySingletonObj2 = LazySingleton.getInstance();
    logger.log(Level.INFO, String.valueOf(lazySingletonObj1));
    logger.log(Level.INFO, String.valueOf(lazySingletonObj2));

    logger.log(Level.INFO, LINE);

    logger.log(Level.INFO, "Synchronized Method Singleton approach");
    SynchronizedMethodSingleton synchronizedMethodSingleton1 = SynchronizedMethodSingleton.getInstance();
    SynchronizedMethodSingleton synchronizedMethodSingleton2 = SynchronizedMethodSingleton.getInstance();
    logger.log(Level.INFO, String.valueOf(synchronizedMethodSingleton1));
    logger.log(Level.INFO, String.valueOf(synchronizedMethodSingleton2));

    logger.log(Level.INFO, LINE);

    logger.log(Level.INFO, "Synchronized Block Singleton approach");
    SynchronizedBlockSingleton synchronizedBlockSingleton1 = SynchronizedBlockSingleton.getInstance();
    SynchronizedBlockSingleton synchronizedBlockSingleton2 = SynchronizedBlockSingleton.getInstance();
    logger.log(Level.INFO, String.valueOf(synchronizedBlockSingleton1));
    logger.log(Level.INFO, String.valueOf(synchronizedBlockSingleton2));

    logger.log(Level.INFO, LINE);
  }
}
