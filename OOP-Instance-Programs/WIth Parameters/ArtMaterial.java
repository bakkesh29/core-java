class ArtMaterial {

    String brand;
    String type;
    double price;
    String color;
    int quantity;   

    ArtMaterial() {
        System.out.println("Default Constructor");
    }

    ArtMaterial(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    ArtMaterial(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    ArtMaterial(String brand, String type, double price, String color) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    
    ArtMaterial(String brand, String type, double price, String color, int quantity) {
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