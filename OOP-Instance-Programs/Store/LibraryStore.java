class LibraryStore {

    String[] names = new String[5];
    int index;

    void saveBook(String name) {
        System.out.println("Trying to save the details");

        if (this.names != null) {
            System.out.println("The name of the book is: " + name);

            if (this.index < this.names.length) {
                this.names[this.index] = name;
                System.out.println("Book stored at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Library is full. Last index is: " + (this.names.length - 1));
            }
        } else {
            System.out.println("Array not found: " + this.names);
        }
    }

    void search(String name) {
        System.out.println("Searching: " + name);

        if (name != null) {
            System.out.println("Name is not null");

            boolean found = false;

            for (int i = 0; i < this.names.length; i++) {
                if (this.names[i] == name) {
                    System.out.println("Book is found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Book is not found");
            }

        } else {
            System.out.println("Name is null, cannot search");
        }
    }
}