package house.garage;

import house.InventoryItem;

public abstract class Vehicle implements InventoryItem {
  public String make;
  public String model;
  public int year;

  public String toString() {
    return getDescription();
  }

}
