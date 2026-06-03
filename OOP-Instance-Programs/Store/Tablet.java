class Tablet {

    String[] medicines = new String[5];
    int index;

    void saveTablet(String name) {
        System.out.println("Trying to save tablet");

        if (this.medicines != null) {
            System.out.println("Tablet name: " + name);

            if (this.index < this.medicines.length) {
                this.medicines[this.index] = name;
                System.out.println("Tablet stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Tablet storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching tablet: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.medicines.length; i++) {
                if (this.medicines[i] == name) {
                    System.out.println("Tablet found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Tablet not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}