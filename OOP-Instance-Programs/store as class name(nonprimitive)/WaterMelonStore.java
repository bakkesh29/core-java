class WaterMelonStore {

    WaterMelon[] melonArray = new WaterMelon[20];
    int index = 0;

    void store(WaterMelon melon) {

        if (melon != null) {

            if (index < melonArray.length) {
                melonArray[index] = melon;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: WaterMelon cannot be null");
        }
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
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n---------------update-------------\n");

        for (int i = 0; i < melonArray.length; i++) {

            if (melonArray[i] == oldMelon) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldMelon.show();

                melonArray[i] = newMelon;

                System.out.println("NEW DATA:");
                newMelon.show();

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