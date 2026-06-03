class MountainBike extends Bicycle {

    int seatHeight;

    // Constructor
    MountainBike(int speed, int gear, int seatHeight) {
        super(speed, gear); // calling parent constructor
        this.seatHeight = seatHeight;
        System.out.println("MountainBike constructor called");
    }

    void showMountainBike() {
        System.out.println("Seat Height: " + seatHeight);
    }
}