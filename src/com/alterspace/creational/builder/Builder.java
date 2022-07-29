package com.alterspace.creational.builder;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class Builder {

  public static void main(String[] args) {
    CarBuilder car = new CarBuilder()
        .setEngine("1500cc")
        .setAirbags(2)
        .setFuel("petrol");
    System.out.println(car);
  }

}
