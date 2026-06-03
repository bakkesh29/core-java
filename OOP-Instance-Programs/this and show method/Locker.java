class Locker {

    String brand;
    String material;
    String color;
    String type;
    String lockType;
    String origin;
    double price;
    double weight;
    boolean safe;
    int warranty;

    Locker(String brand, String material, String color, double price, double weight,
           String type, String lockType, boolean safe, int warranty, String origin) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.lockType = lockType;
        this.safe = safe;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Type: " + type);
        System.out.println("Lock Type: " + lockType);
        System.out.println("Safe: " + safe);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}