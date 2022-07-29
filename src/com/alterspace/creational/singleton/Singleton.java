package com.alterspace.creational.singleton;

/**
 * Description: Custom Banner for Startup.
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-10-24
 * @version: 0.1
 */
public class Singleton {

  public static void main(String[] args) {
    President president = President.getInstance();
    President president1 = President.getInstance();

    System.out.println(president);
    System.out.println(president1);
  }
}
