class SparkPlug {

    String[] plugs = new String[5];
    int index;

    void saveSparkPlug(String name) {
        System.out.println("Trying to save spark plug");

        if (this.plugs != null) {
            System.out.println("Spark plug name: " + name);

            if (this.index < this.plugs.length) {
                this.plugs[this.index] = name;
                System.out.println("Spark plug stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Spark plug storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching spark plug: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.plugs.length; i++) {
                if (this.plugs[i] == name) {
                    System.out.println("Spark plug found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Spark plug not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}