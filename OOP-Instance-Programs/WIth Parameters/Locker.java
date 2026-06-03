class Locker {

    String brand;
    String material;
    double price;
    int capacity;
    int quantity;

    Locker() {
        System.out.println("Default Constructor");
    }

    Locker(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    Locker(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    Locker(String brand, String material, double price, int capacity) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.capacity = capacity;
    }

    Locker(String brand, String material, double price, int capacity, int quantity) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.capacity = capacity;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}