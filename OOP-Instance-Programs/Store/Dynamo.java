class Dynamo {

    String[] items = new String[5];
    int index;

    void saveDynamo(String name) {
        System.out.println("Trying to save dynamo");

        if (this.items != null) {
            System.out.println("Dynamo name: " + name);

            if (this.index < this.items.length) {
                this.items[this.index] = name;
                System.out.println("Dynamo stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Dynamo storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching dynamo: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i] == name) {
                    System.out.println("Dynamo found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Dynamo not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}