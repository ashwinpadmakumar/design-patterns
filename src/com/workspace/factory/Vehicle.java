package com.workspace.factory;

/**
 * Classification: Trimble Confidential.
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-04
 * @version: 0.1
 */
abstract class Vehicle {

  public abstract int getWheel();

  public String toString() {
    return "Wheel: " + this.getWheel();
  }
}
