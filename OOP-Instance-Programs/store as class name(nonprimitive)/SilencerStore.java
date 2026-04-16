class SilencerStore {

    Silencer[] silencers = new Silencer[20];
    int index = 0;

    void store(Silencer silencer) {

        if (silencer != null) {

            if (index < silencers.length) {
                silencers[index] = silencer;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: Silencer cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n------ Silencer List ------\n");

        for (Silencer s : silencers) {
            if (s != null) {
                s.show();
                System.out.println("---------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No silencers available");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Silencer oldSilencer, Silencer newSilencer) {

        if (oldSilencer == null && newSilencer == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n-----------update-----------\n");

        for (int i = 0; i < silencers.length; i++) {

            if (silencers[i] == oldSilencer) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldSilencer.show();

                silencers[i] = newSilencer;

                System.out.println("NEW DATA:");
                newSilencer.show();

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