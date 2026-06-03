class Rotater {

    String type;
    String color;
    double price;

    // No-arg constructor
    Rotater() {
        System.out.println("No-arg Rotater constructor");
    }

    // Parameterized constructor
    Rotater(String type, String color, double price) {
        this.type = type;
        this.color = color;
        this.price = price;
    }

    void show() {
        System.out.println("Type: " + this.type);
        System.out.println("Color: " + this.color);
        System.out.println("Price: " + this.price);
        System.out.println("-------------------");
    }
}