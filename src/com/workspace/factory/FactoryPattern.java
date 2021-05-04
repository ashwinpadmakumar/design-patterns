/**
 * Classification: Trimble Confidential.
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-04
 * @version: 0.1
 */
package com.workspace.factory;


import java.util.logging.Level;
import java.util.logging.Logger;

public class FactoryPattern {

  private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public static void main(String[] args) {
    Vehicle car = VehicleFactory.getInstance("car");
    logger.log(Level.INFO, "Object of car :- " + car);

    Vehicle bike = VehicleFactory.getInstance("bike");
    logger.log(Level.INFO, "Object of bike :- " + bike);
  }
}
