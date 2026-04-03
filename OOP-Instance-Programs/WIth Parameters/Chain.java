class Chain {

    String brand;
    String material;
    double price;
    double length;

    // Constructor 1
    Chain() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Chain(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    // Constructor 3
    Chain(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    // Constructor 4
    Chain(String brand, String material, double price, double length) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.length = length;
    }


    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Length: " + length);
        System.out.println("------------------");
    }
}