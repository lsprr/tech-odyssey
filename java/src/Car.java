public class Car extends Vehicle {
    //    Characteristics
    String name;
    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    int wheels = 4;

    int doors = 4;

    Car(String name) {
        this.name = name;
    }

    //    Methods
    void drive() {
        System.out.println("You drive the car");
    }

    void brake() {
        System.out.println("You step on the brakes");
    }

    public String toString() {
        return make + "\n" + model + "\n" + color + "\n" + year + "\n" + price;
    }
}
