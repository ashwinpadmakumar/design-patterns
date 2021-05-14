/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-04
 * @version: 0.1
 */
package com.workspace.creational.factory;

public class FactoryPattern {

  public static void main(String[] args) {
    Vehicle car = VehicleFactory.getInstance("car");
    System.out.println("Object of car :- " + car);

    Vehicle bike = VehicleFactory.getInstance("bike");
    System.out.println("Object of bike :- " + bike);
  }
}
