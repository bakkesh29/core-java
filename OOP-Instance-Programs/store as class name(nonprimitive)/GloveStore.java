class GloveStore {

    Glove[] gloves = new Glove[20];
    int index = 0;

    void store(Glove glove) {

        if (glove != null) {

            if (index < gloves.length) {
                gloves[index] = glove;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: Glove cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n------ Glove List ------\n");

        for (Glove g : gloves) {
            if (g != null) {
                g.show();
                System.out.println("---------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No gloves available");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Glove oldGlove, Glove newGlove) {

        if (oldGlove == null && newGlove == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n-----------update-----------\n");

        for (int i = 0; i < gloves.length; i++) {

            if (gloves[i] == oldGlove) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldGlove.show();

                gloves[i] = newGlove;

                System.out.println("NEW DATA:");
                newGlove.show();

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