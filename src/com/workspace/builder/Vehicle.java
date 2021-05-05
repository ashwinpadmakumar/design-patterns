/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-05
 * @version: 0.1
 */


package com.workspace.builder;


public class Vehicle {

  // Required parameters
  private String engine;
  private int wheel;

  // Optional parameters
  private int airbags;

  public String getEngine() {
    return engine;
  }

  public int getWheel() {
    return wheel;
  }

  public int getAirbags() {
    return airbags;
  }

  private Vehicle(VehicleBuilder vehicleBuilder) {
    this.engine = vehicleBuilder.engine;
    this.wheel = vehicleBuilder.wheel;
    this.airbags = vehicleBuilder.airbags;
  }


  public static class VehicleBuilder {
    private String engine;
    private int wheel;

    private int airbags;

    public VehicleBuilder(String engine, int wheel) {
      this.engine = engine;
      this.wheel = wheel;
    }

    public VehicleBuilder setAirbags(int airbags) {
      this.airbags = airbags;
      return this;
    }

    public Vehicle build() {
      return new Vehicle(this);
    }
  }
}
