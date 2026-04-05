class WindShield {

    String brand;
    String material;
    double price;
    String vehicleType;
    int quantity;

    WindShield() {
        System.out.println("Default Constructor");
    }

    WindShield(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    WindShield(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    WindShield(String brand, String material, double price, String vehicleType) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.vehicleType = vehicleType;
    }

    WindShield(String brand, String material, double price, String vehicleType, int quantity) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.vehicleType = vehicleType;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}