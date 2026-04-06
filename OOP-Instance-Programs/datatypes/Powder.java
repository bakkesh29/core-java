class Powder {

    String brand;
    String type;
    double price;

    // No-arg constructor
    Powder() {
        System.out.println("No-arg Powder constructor");
    }

    // Parameterized constructor
    Powder(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    void show() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("-------------------");
    }
}