package com.workspace.facade;

import java.sql.Driver;

/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-14
 * @version: 0.1
 */
public class Chrome {

  public static Driver getChromeDriver() {
    return null;
  }

  public static void generateHTMLReport(String test, Driver driver) {
    System.out.println("Generating HTML Report for Chrome Driver");
  }

  public static void generateJUnitReport (String test, Driver driver) {
    System.out.println("Generating JUnit Report for Chrome Driver");
  }
}
