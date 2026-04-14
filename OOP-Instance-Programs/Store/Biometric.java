class Biometric {

    String[] users = new String[5];
    int index;

    void saveUser(String name) {
        System.out.println("Trying to save user");

        if (this.users != null) {
            System.out.println("User name: " + name);

            if (this.index < this.users.length) {
                this.users[this.index] = name;
                System.out.println("User stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Biometric storage is full");
            }
        } else {
            System.out.println("Array not found");
        }
    }

    void search(String name) {
        System.out.println("Searching user: " + name);

        if (name != null) {
            boolean found = false;

            for (int i = 0; i < this.users.length; i++) {
                if (this.users[i] == name) {
                    System.out.println("User found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("User not found");
            }
        } else {
            System.out.println("Name is null");
        }
    }
}