class Tyre {

    String brand;
    String type; 
    String size; 
    String vehicle;
    String grip; 
    String origin;
    double price; 
    double weight;
    boolean tubeless;
    int warranty;

    Tyre(String brand, String type, String size, double price, double weight,
         String vehicle, String grip, boolean tubeless, int warranty, String origin) {

        this.brand = brand;
        this.type = type;
        this.size = size;
        this.price = price;
        this.weight = weight;
        this.vehicle = vehicle;
        this.grip = grip;
        this.tubeless = tubeless;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Grip: " + grip);
        System.out.println("Tubeless: " + tubeless);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}