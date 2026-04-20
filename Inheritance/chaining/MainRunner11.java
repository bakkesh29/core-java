class MainRunner11 {

    public static void main(String[] args) {

        // Creating Child object
        Child c = new Child(50, "Bakkesh");

        // Accessing Parent method
        c.showParent();

        // Accessing Child method
        c.showChild();
    }
}