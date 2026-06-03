class Alloy {

    String[] metals = new String[5];
    int index;

    void saveAlloy(String name) {
        System.out.println("Trying to save alloy");

        if (this.metals != null) {
            System.out.println("Alloy name: " + name);

            if (this.index < this.metals.length) {
                this.metals[this.index] = name;
                System.out.println("Alloy stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Alloy storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching alloy: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.metals.length; i++) {
                if (this.metals[i] == name) {
                    System.out.println("Alloy found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Alloy not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}