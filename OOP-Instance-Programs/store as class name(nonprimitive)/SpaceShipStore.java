class SpaceShipStore {

    SpaceShip[] shipArray = new SpaceShip[20];
    int index = 0;

    void store(SpaceShip ship) {

        if (ship != null) {

            if (index < shipArray.length) {
                shipArray[index] = ship;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: SpaceShip cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n----------List of SpaceShips----------\n");

        for (SpaceShip item : shipArray) {
            if (item != null) {
                item.show();
                System.out.println("----------------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No spaceships available to display");
        }

        System.out.println("\n-------------------\n");
    }

    void update(SpaceShip oldShip, SpaceShip newShip) {

        if (oldShip == null && newShip == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n---------------update-------------\n");

        for (int i = 0; i < shipArray.length; i++) {

            if (shipArray[i] == oldShip) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldShip.show();

                shipArray[i] = newShip;

                System.out.println("NEW DATA:");
                newShip.show();

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