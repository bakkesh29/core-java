class MainRunner12 {

    public static void main(String[] args) {

        MountainBike mb = new MountainBike(40, 5, 10);

        // Parent method
        mb.showBicycle();

        // Child method
        mb.showMountainBike();
    }
}