class Locket {

    String brand;
    String material;
    double price;
    String design;
    int quantity;

    Locket() {
        System.out.println("Default Constructor");
    }

    Locket(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    Locket(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    Locket(String brand, String material, double price, String design) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.design = design;
    }

    Locket(String brand, String material, double price, String design, int quantity) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.design = design;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Design: " + design);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}