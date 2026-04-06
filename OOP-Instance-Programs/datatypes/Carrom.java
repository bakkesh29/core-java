class Carrom {

    String brand;
    String color;
    double price;

    // No-arg constructor
    Carrom() {
        System.out.println("No-arg Carrom constructor");
    }

    // Parameterized constructor
    Carrom(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    void show() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("-------------------");
    }
}