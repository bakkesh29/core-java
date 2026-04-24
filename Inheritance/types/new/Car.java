class Car extends Vehicle {
    String brand;

    Car(int speed, String brand) {
        super(speed); // calling parent constructor
        this.brand = brand;
        System.out.println("Car constructor");
    }

    void showCar() {
        System.out.println("Brand: " + brand);
    }
}