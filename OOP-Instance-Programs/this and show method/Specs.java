class Specs {

    // 10 instance variables
    String brand;
    String type;
    String color;
    String frameType;
    String lensType;
    String origin;
    double price;
    double weight;
    boolean polarized;
    int warranty;

    // Parameterized Constructor
    Specs(String brand, String type, String color, double price, double weight,
          String frameType, String lensType, boolean polarized, int warranty, String origin) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.frameType = frameType;
        this.lensType = lensType;
        this.polarized = polarized;
        this.warranty = warranty;
        this.origin = origin;
    }

    // Non-static method
    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Frame Type: " + frameType);
        System.out.println("Lens Type: " + lensType);
        System.out.println("Polarized: " + polarized);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}