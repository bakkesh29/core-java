class Cup {

    String[] brands = new String[5];
    int index;

    void saveCup(String name) {
        System.out.println("Trying to save cup");

        if (this.brands != null) {
            System.out.println("Cup brand: " + name);

            if (this.index < this.brands.length) {
                this.brands[this.index] = name;
                System.out.println("Cup stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Cup storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching cup: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.brands.length; i++) {
                if (this.brands[i] == name) {
                    System.out.println("Cup found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Cup not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}