class Bike extends Vehicle {
    String type;

    Bike(int speed, String type) {
        super(speed);
        this.type = type;
        System.out.println("Bike constructor");
    }

    void showBike() {
        System.out.println("Type: " + type);
    }
}