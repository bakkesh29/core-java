class InkPad {

    String brand;
    String color;
    double price;
    String type;
    int quantity;

    InkPad() {
        System.out.println("Default Constructor");
    }

    InkPad(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    InkPad(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    InkPad(String brand, String color, double price, String type) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.type = type;
    }

    InkPad(String brand, String color, double price, String type, int quantity) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.type = type;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}