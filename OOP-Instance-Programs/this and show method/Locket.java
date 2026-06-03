class Locket {

    // 10 instance variables
    String brand;
    String material;
    String color;
    double price;
    double weight;
    String type;
    String shape;
    boolean isWaterproof;
    int warranty;
    String origin;

    // Constructor
    Locket(String brand, String material, String color, double price,
           double weight, String type, String shape,
           boolean isWaterproof, int warranty, String origin) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.shape = shape;
        this.isWaterproof = isWaterproof;
        this.warranty = warranty;
        this.origin = origin;
    }

    // Non-static method 
    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("---------------------------");
    }
}