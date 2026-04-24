class Vehicle {
    int speed;

    Vehicle(int speed) {
        this.speed = speed;
        System.out.println("Vehicle constructor");
    }

    void displaySpeed() {
        System.out.println("Speed: " + speed);
    }
}