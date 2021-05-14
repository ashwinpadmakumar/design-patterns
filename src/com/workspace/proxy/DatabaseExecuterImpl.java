package com.workspace.proxy;

/**
 * Classification: Trimble Confidential.
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-14
 * @version: 0.1
 */
public class DatabaseExecuterImpl implements DatabaseExecuter {

  @Override
  public void executeDatabase(String query) throws Exception {
    System.out.println("Going to execute query : " + query);
  }
}
