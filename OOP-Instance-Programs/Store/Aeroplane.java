class Aeroplane {

    String[] flights = new String[5];
    int index;

    void saveFlight(String name) {
        System.out.println("Trying to save flight");

        if (this.flights != null) {
            System.out.println("Flight name: " + name);

            if (this.index < this.flights.length) {
                this.flights[this.index] = name;
                System.out.println("Flight stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Flight storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching flight: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.flights.length; i++) {
                if (this.flights[i] == name) {
                    System.out.println("Flight found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Flight not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}