class Chain {

    String brand;
    String material;
    double price;
    double length;
    int quantity;

    Chain() {
        System.out.println("Default Constructor");
    }

    Chain(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    Chain(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    Chain(String brand, String material, double price, double length) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.length = length;
    }

    Chain(String brand, String material, double price, double length, int quantity) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.length = length;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}