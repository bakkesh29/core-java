class Umbrella {

    String brand;
    String type;
    double price;
    String color;
    int quantity;

    Umbrella() {
        System.out.println("Default Constructor");
    }

    Umbrella(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Umbrella(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    Umbrella(String brand, String type, double price, String color) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    Umbrella(String brand, String type, double price, String color, int quantity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}