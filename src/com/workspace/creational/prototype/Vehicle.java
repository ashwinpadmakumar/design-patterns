package com.workspace.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Description: Custom Banner for Startup
 *
 * @author: Ashwin Padmakumar
 * @since: 2021-05-06
 * @version: 0.1
 */
public class Vehicle implements Cloneable {

  private List<String> vehicleList;

  public Vehicle() {
    this.vehicleList = new ArrayList<>();
  }

  public Vehicle(List<String> list) {
    this.vehicleList = list;
  }

  public void loadData() {
    vehicleList.add("Honda Amaze");
    vehicleList.add("Audi A4");
    vehicleList.add("Hyundai Creta");
    vehicleList.add("Maruti Baleno");
    vehicleList.add("Renault Duster");
  }

  public List<String> getVehicleList() {
    return this.vehicleList;
  }

  @Override
  public Object clone() throws CloneNotSupportedException {

    List<String> tempList = new ArrayList<>(this.vehicleList);

    return new Vehicle(tempList);
  }
}
