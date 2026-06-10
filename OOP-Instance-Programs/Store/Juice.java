class Juice {

    String[] flavors = new String[5];
    int index;

    void saveJuice(String name) {
        System.out.println("Trying to save juice");

        if (this.flavors != null) {
            System.out.println("Juice flavor: " + name);

            if (this.index < this.flavors.length) {
                this.flavors[this.index] = name;
                System.out.println("Juice stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Juice storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching juice: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.flavors.length; i++) {
                if (this.flavors[i] == name) {
                    System.out.println("Juice found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Juice not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}