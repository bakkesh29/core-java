class Water {

    String type;
    String source;
    double quantity;

    // No-arg constructor
    Water() {
        System.out.println("No-arg Water constructor");
    }

    // Parameterized constructor
    Water(String type, String source, double quantity) {
        this.type = type;
        this.source = source;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Type: " + this.type);
        System.out.println("Source: " + this.source);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("-------------------");
    }
}