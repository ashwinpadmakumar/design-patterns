/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-05
 * @version: 0.1
 */
package com.workspace.builder;


import java.util.logging.Level;
import java.util.logging.Logger;

public class BuilderPattern {

  private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

  public static void main(String[] args) {

    // Airbag value is set.
    Vehicle car = new Vehicle.VehicleBuilder("1500cc",4).setAirbags(4).build();
    // Airbag value is not set
    Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

    logger.log(Level.INFO, "Car Configurations");
    logger.log(Level.INFO, car.getEngine());
    logger.log(Level.INFO, String.valueOf(car.getWheel()));
    logger.log(Level.INFO, String.valueOf(car.getAirbags()));

    logger.log(Level.INFO, "Bike Configurations");
    logger.log(Level.INFO, bike.getEngine());
    logger.log(Level.INFO, String.valueOf(bike.getWheel()));
    logger.log(Level.INFO, String.valueOf(bike.getAirbags()));

  }
}
