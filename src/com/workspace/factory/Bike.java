/**
 * Classification: Trimble Confidential.
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-04
 * @version: 0.1
 */
package com.workspace.factory;

public class Bike extends Vehicle {
  int wheel;

  Bike(int wheel) {
    this.wheel = wheel;
  }

  @Override
  public int getWheel() {
    return this.wheel;
  }
}
