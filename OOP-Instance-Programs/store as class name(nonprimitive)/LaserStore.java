class LaserStore {

    Laser[] laserArray = new Laser[20];
    int index = 0;

    void store(Laser laser) {

        if (laser != null) {

            if (index < laserArray.length) {
                laserArray[index] = laser;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: Laser cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n----------List of lasers----------\n");

        for (Laser item : laserArray) {
            if (item != null) {
                item.show();
                System.out.println("----------------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No lasers available to display");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Laser oldLaser, Laser newLaser) {

        if (oldLaser == null && newLaser == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n---------------update-------------\n");

        for (int i = 0; i < laserArray.length; i++) {

            if (laserArray[i] == oldLaser) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldLaser.show();

                laserArray[i] = newLaser;

                System.out.println("NEW DATA:");
                newLaser.show();

                System.out.println("\n-------------------------------\n");

                isUpdated = true;
                break;
            }
        }

        if (!isUpdated) {
            System.out.println("Update failed: data not found in store");
        }
    }
}