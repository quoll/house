package house.bedroom;

import house.InventoryItem;

public class Bed implements InventoryItem {

  String material;

  public Bed(String material) {
    this.material = material;
  }

  public String getDescription() {
    return "Bed, made from: " + material;
  }
}
