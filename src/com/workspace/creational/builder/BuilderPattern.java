/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-05
 * @version: 0.1
 */
package com.workspace.creational.builder;

public class BuilderPattern {

  public static void main(String[] args) {

    // Airbag value is set.
    Vehicle car = new Vehicle.VehicleBuilder("1500cc",4).setAirbags(4).build();
    // Airbag value is not set
    Vehicle bike = new Vehicle.VehicleBuilder("250cc", 2).build();

    System.out.println("Car Configurations");
    System.out.println(car.getEngine());
    System.out.println(car.getWheel());
    System.out.println(car.getAirbags());

    System.out.println("Bike Configurations");
    System.out.println(bike.getEngine());
    System.out.println(bike.getWheel());
    System.out.println(bike.getAirbags());

  }
}
