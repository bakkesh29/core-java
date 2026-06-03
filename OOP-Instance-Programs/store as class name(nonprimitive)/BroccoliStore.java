class BroccoliStore {

    Broccoli[] broccoliArray = new Broccoli[20];
    int index = 0;

    void store(Broccoli broccoli) {

        if (broccoli != null) {

            if (index < broccoliArray.length) {
                broccoliArray[index] = broccoli;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: Broccoli cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n------ Broccoli List ------\n");

        for (Broccoli b : broccoliArray) {
            if (b != null) {
                b.show();
                System.out.println("---------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No broccoli available");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Broccoli oldBroccoli, Broccoli newBroccoli) {

        if (oldBroccoli == null && newBroccoli == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n-----------update-----------\n");

        for (int i = 0; i < broccoliArray.length; i++) {

            if (broccoliArray[i] == oldBroccoli) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldBroccoli.show();

                broccoliArray[i] = newBroccoli;

                System.out.println("NEW DATA:");
                newBroccoli.show();

                System.out.println("\n----------------------------\n");

                isUpdated = true;
                break;
            }
        }

        if (!isUpdated) {
            System.out.println("Update failed: data not found in store");
        }
    }
}