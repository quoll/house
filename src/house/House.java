package house;

import house.garage.Car;
import house.garage.Boat;
import house.bedroom.Bed;
import java.util.List;
import java.util.LinkedList;

public class House {

  public static void main(String[] args) {
    List<InventoryItem> inventory = getInventory();
    System.out.println("House contents:");

    for (InventoryItem i: inventory) {
      System.out.println("item: " + i);
      if (i instanceof house.garage.Vehicle) {
        System.out.println("    make=" + ((house.garage.Vehicle)i).make);
      } else {
        System.out.println("    not a vehicle");
      }
    }
  }

  static List<InventoryItem> getInventory() {
    List<InventoryItem> i = new LinkedList<>();
    i.add(new Car("VW", "Jetta", 2007, "XMN-7854"));
    i.add(new Car("Nissan", "Versa", 2007, "SPARQL"));
    i.add(new Boat("Pride", "Charger", 1982));
    i.add(new Bed("wood"));
    return i;
  }

}
