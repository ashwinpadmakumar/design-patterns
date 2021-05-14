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
public class WebExplorerHelperFacade {

  public static void generateReports(String explorer, String report, String test) {
    Driver driver = null;
    switch (explorer) {
      case "firefox":
        driver = Firefox.getFirefoxDriver();
        switch (report) {
          case "html":
            Firefox.generateHTMLReport(test, driver);
            break;
          case "junit":
            Firefox.generateJUnitReport(test, driver);
            break;
          default:
            throw new IllegalStateException("Unexpected value: " + report);
        }
      break;
      case "chrome":
        driver = Chrome.getChromeDriver();
        switch (report) {
          case "html":
            Chrome.generateHTMLReport(test, driver);
            break;
          case "junit":
            Chrome.generateJUnitReport(test, driver);
            break;
          default:
            throw new IllegalStateException("Unexpected value: " + report);
        }
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + explorer);
    }
  }
}
