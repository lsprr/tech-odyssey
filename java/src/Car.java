public class Car extends Vehicle1 {
//    //    Characteristics
//    String name;
//    String make = "Chevrolet";
//    String model = "Corvette";
//    int year = 2020;
//    String color = "blue";
//    double price = 50000.00;
//
//    int wheels = 4;
//
//    int doors = 4;
//
//    Car(String name) {
//        this.name = name;
//    }
//
//    //    Methods
//    void drive() {
//        System.out.println("You drive the car");
//    }
//
//    void brake() {
//        System.out.println("You step on the brakes");
//    }
//
//    public String toString() {
//        return make + "\n" + model + "\n" + color + "\n" + year + "\n" + price;
//    }
//
//    @Override
//    void go() {
//        System.out.println("The driver is driving the car");
//    }

    private String make;
    private String model;
    private int year;

    Car(String make, String model, int year) {
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    Car(Car x) {
        this.copy(x);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void copy(Car x) {
        this.setMake(x.getMake());
        this.setModel(x.getModel());
        this.setYear(x.getYear());
    }

    @Override
    void go() {

    }
}
