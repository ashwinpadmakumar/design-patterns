/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-04
 * @version: 0.1
 */

package com.workspace.creational.factory;

public class VehicleFactory {

  public static Vehicle getInstance(String type) {
    if (type.equalsIgnoreCase("car")) {
      return new Car(4);
    } else if (type.equalsIgnoreCase("bike")) {
      return new Bike(2);
    }

    return null;
  }
}
