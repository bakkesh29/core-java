class Lift {

    String[] floors = new String[5];
    int index;

    void saveLift(String name) {
        System.out.println("Trying to save lift");

        if (this.floors != null) {
            System.out.println("Floor name: " + name);

            if (this.index < this.floors.length) {
                this.floors[this.index] = name;
                System.out.println("Lift stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Lift storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching lift: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.floors.length; i++) {
                if (this.floors[i] == name) {
                    System.out.println("Lift found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Lift not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}