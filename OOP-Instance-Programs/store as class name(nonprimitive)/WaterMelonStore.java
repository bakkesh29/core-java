class WaterMelonStore {

    WaterMelon[] melonArray = new WaterMelon[20];
    int index = 0;

    void store(WaterMelon melon) {

        if (melon == null) {
            System.out.println("Invalid input: Watermelon cannot be null");
            return;
        }

        if (index >= melonArray.length) {
            System.out.println("Storage is full");
            return;
        }

        melonArray[index] = melon;
        System.out.println("Stored at index: " + index);
        index++;
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n----------List of watermelon----------\n");

        for (WaterMelon item : melonArray) {
            if (item != null) {
                item.show();
                System.out.println("----------------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No watermelons available to display");
        }

        System.out.println("\n-------------------\n");
    }

    void update(WaterMelon oldMelon, WaterMelon newMelon) {

        if (oldMelon == null && newMelon == null) {
            System.out.println("Update failed: objects cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n---------------update-------------\n");

        for (int i = 0; i < melonArray.length; i++) {

            if (melonArray[i] == oldMelon) {

                System.out.println("Instance replaced at position: " + (i + 1));

                System.out.println("OLD INSTANCE:");
                oldMelon.show();

                melonArray[i] = newMelon;

                System.out.println("NEW INSTANCE:");
                newMelon.show();

                System.out.println("\n-------------------------------\n");

                isUpdated = true;
                break;
            }
        }

        if (!isUpdated) {
            System.out.println("Update failed: object not found in store");
        }
    }
}