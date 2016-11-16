package house.garage;

public class Car extends Vehicle {

  public String registration;

  public Car(String make, String model, int year, String registration) {
    this.make = make;
    this.model = model;
    this.year = year;
    this.registration = registration;
  }

  public String getDescription() {
    return "Car: " + make + ", " + model + ", " + year + " <" + registration + ">";
  }

}
