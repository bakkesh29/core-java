class Specs {

    String brand;
    String frameType;
    double price;
    String color;
    int quantity;

    Specs() {
        System.out.println("Default Constructor");
    }

    Specs(String brand, String frameType) {
        this.brand = brand;
        this.frameType = frameType;
    }

    Specs(String brand, String frameType, double price) {
        this.brand = brand;
        this.frameType = frameType;
        this.price = price;
    }

    Specs(String brand, String frameType, double price, String color) {
        this.brand = brand;
        this.frameType = frameType;
        this.price = price;
        this.color = color;
    }

    Specs(String brand, String frameType, double price, String color, int quantity) {
        this.brand = brand;
        this.frameType = frameType;
        this.price = price;
        this.color = color;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Frame Type: " + frameType);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}