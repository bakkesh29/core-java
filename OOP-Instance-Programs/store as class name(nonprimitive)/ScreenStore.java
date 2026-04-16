class ScreenStore {

    Screen[] screens = new Screen[20];
    int index = 0;

    void store(Screen screen) {

        if (screen != null) {

            if (index < screens.length) {
                screens[index] = screen;
                System.out.println("Stored at index: " + index);
                index++;
            } else {
                System.out.println("Storage is full");
            }

        } else {
            System.out.println("Invalid input: Screen cannot be null");
        }
    }

    void display() {

        boolean isAvailable = false;

        System.out.println("\n------ Screen List ------\n");

        for (Screen s : screens) {
            if (s != null) {
                s.show();
                System.out.println("---------------------------");
                isAvailable = true;
            }
        }

        if (!isAvailable) {
            System.out.println("No screens available");
        }

        System.out.println("\n-------------------\n");
    }

    void update(Screen oldScreen, Screen newScreen) {

        if (oldScreen == null && newScreen == null) {
            System.out.println("Update failed: values cannot be null");
            return;
        }

        boolean isUpdated = false;

        System.out.println("\n-----------update-----------\n");

        for (int i = 0; i < screens.length; i++) {

            if (screens[i] == oldScreen) {

                System.out.println("Replaced at position: " + (i + 1));

                System.out.println("OLD DATA:");
                oldScreen.show();

                screens[i] = newScreen;

                System.out.println("NEW DATA:");
                newScreen.show();

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