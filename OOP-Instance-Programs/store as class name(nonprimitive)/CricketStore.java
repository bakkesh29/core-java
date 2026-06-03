class CricketStore {

    Cricket[] cricketArray = new Cricket[20];
    int index = 0;

    void store(Cricket player) {

        if (player == null) {
            System.out.println("Invalid input: Cricket cannot be null");
            return;
        }

        if (index >= cricketArray.length) {
            System.out.println("Storage is full");
            return;
        }

        cricketArray[index] = player;
        System.out.println("Stored at index: " + index);
        index++;
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n----------List of Cricket Players----------\n");

        for (Cricket item : cricketArray) {
            if (item != null) {
                item.show();
                System.out.println("----------------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No players available to display");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Cricket oldPlayer, Cricket newPlayer) {

        if (oldPlayer == null && newPlayer == null) {
            System.out.println("Update failed: cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n---------------update-------------\n");

        for (int i = 0; i < cricketArray.length; i++) {

            if (cricketArray[i] == oldPlayer) {

                System.out.println("Instance replaced at position: " + (i + 1));

                System.out.println("OLD INSTANCE:");
                oldPlayer.show();

                cricketArray[i] = newPlayer;

                System.out.println("NEW INSTANCE:");
                newPlayer.show();

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