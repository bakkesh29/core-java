class TissueStore {

    Tissue[] tissues = new Tissue[20];
    int index = 0;

    void store(Tissue tissue) {

        if (tissue != null) {

            if (index < tissues.length) {
                tissues[index] = tissue;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: Tissue cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n------ Tissue List ------\n");

        for (Tissue t : tissues) {
            if (t != null) {
                t.show();
                System.out.println("---------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No tissues available");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Tissue oldTissue, Tissue newTissue) {

        if (oldTissue == null && newTissue == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n-----------update-----------\n");

        for (int i = 0; i < tissues.length; i++) {

            if (tissues[i] == oldTissue) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldTissue.show();

                tissues[i] = newTissue;

                System.out.println("NEW DATA:");
                newTissue.show();

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