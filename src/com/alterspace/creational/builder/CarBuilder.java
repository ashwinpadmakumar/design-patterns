package com.alterspace.creational.builder;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class CarBuilder {

  private int wheels;
  private String fuel;
  private String engine;
  private int airbags;

  public CarBuilder setWheels(int wheels) {
    this.wheels = wheels;
    return this;
  }

  public CarBuilder setFuel(String fuel) {
    this.fuel = fuel;
    return this;
  }

  public CarBuilder setEngine(String engine) {
    this.engine = engine;
    return this;
  }

  public CarBuilder setAirbags(int airbags) {
    this.airbags = airbags;
    return this;
  }

  @Override
  public String toString() {
    return "CarBuilder{" +
        "wheels=" + wheels +
        ", fuel='" + fuel + '\'' +
        ", engine='" + engine + '\'' +
        ", airbags=" + airbags +
        '}';
  }
}
