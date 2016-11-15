package house.garage;

public class Boat extends Vehicle {

  public Boat(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  public String getDescription() {
    return "Boat: " + make + ", " + model + ", " + year;
  }
}
