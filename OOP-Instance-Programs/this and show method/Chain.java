class Chain {

    // 10 instance variables
    String brand;
    String material;
    String color;
    String type;
    String design;
    String origin;
    double price;
    double weight;
    boolean strong;
    int warranty;

    // Parameterized Constructor
    Chain(String brand, String material, String color, double price, double weight,
          String type, String design, boolean strong, int warranty, String origin) {

        this.brand = brand;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.design = design;
        this.strong = strong;
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
        System.out.println("Design: " + design);
        System.out.println("Strong: " + strong);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}