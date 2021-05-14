package com.workspace.proxy;

/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-14
 * @version: 0.1
 */
public class ProxyPattern {

  public static void main(String[] args) throws Exception {
    DatabaseExecuter nonAdminExecuter = new DatabaseExecuterProxy("NonAdmin", "Admin@123");
    DatabaseExecuter adminExecuter = new DatabaseExecuterProxy("Admin", "Admin@123");

    nonAdminExecuter.executeDatabase("ADD");
    adminExecuter.executeDatabase("DELETE");
    nonAdminExecuter.executeDatabase("DELETE");
  }
}
