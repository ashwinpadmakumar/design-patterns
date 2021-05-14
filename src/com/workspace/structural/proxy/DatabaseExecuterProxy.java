package com.workspace.structural.proxy;

/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-14
 * @version: 0.1
 */
public class DatabaseExecuterProxy implements DatabaseExecuter {

  boolean ifAdmin;
  DatabaseExecuterImpl databaseExecuter;

  public DatabaseExecuterProxy(String name, String password) {
    databaseExecuter = new DatabaseExecuterImpl();
    if (name == "Admin" && password == "Admin@123") {
      ifAdmin = true;
    }
  }

  /**
   * If admin, then they can do any operation on DB
   * Else, check if query is DELETE. If it is DELETE, then throw an error. Else execute the non-delete query.
   *
   * @param query
   * @throws Exception
   */
  @Override
  public void executeDatabase(String query) throws Exception {
    if (ifAdmin) {
      databaseExecuter.executeDatabase(query);
    } else {
      if (query.equalsIgnoreCase("DELETE")) {
        throw new Exception("Delete not allowed for non-admin user");
      } else {
        databaseExecuter.executeDatabase(query);
      }
    }
  }
}
