class Locker {

    String brand;
    String material;
    double price;
    int capacity;

    // Constructor 1
    Locker() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Locker(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    // Constructor 3
    Locker(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    // Constructor 4
    Locker(String brand, String material, double price, int capacity) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.capacity = capacity;
    }

    // Constructor 5 (Copy)
    Locker(Locker ref) {
        this.brand = ref.brand;
        this.material = ref.material;
        this.price = ref.price;
        this.capacity = ref.capacity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Capacity: " + capacity);
        System.out.println("------------------");
    }
}