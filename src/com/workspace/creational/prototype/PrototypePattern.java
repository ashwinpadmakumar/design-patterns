package com.workspace.creational.prototype;

import java.util.List;

/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-06
 * @version: 0.1
 */
public class PrototypePattern {

  public static void main(String[] args) throws CloneNotSupportedException {
    Vehicle originalObject = new Vehicle();
    originalObject.loadData();

    Vehicle clonedObject = (Vehicle) originalObject.clone();
    List<String> list = clonedObject.getVehicleList();
    list.add("Honda new Amaze");

    System.out.println("Original Object's Vehicle List : " + originalObject.getVehicleList());
    System.out.println("Cloned Object 's Vehicle list : " + clonedObject.getVehicleList());
  }
}
