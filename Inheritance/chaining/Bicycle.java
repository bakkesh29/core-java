class Bicycle {

    int speed;
    int gear;

    // Constructor
    Bicycle(int speed, int gear) {
        this.speed = speed;
        this.gear = gear;
        System.out.println("Bicycle constructor called");
    }

    void showBicycle() {
        System.out.println("Speed: " + speed);
        System.out.println("Gear: " + gear);
    }
}