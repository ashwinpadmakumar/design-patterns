package com.workspace.structural.proxy;

/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-14
 * @version: 0.1
 */
public interface DatabaseExecuter {
  public void executeDatabase(String query) throws Exception;
}
