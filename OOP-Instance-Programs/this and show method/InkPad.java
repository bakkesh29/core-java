class InkPad {

    String brand;
    String color;
    String type;
    String shape;
    String use;
    String origin;
    double price;
    double weight;
    boolean refillable;
    int warranty;

    InkPad(String brand, String color, String type, double price, double weight,
           String shape, String use, boolean refillable, int warranty, String origin) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.shape = shape;
        this.use = use;
        this.refillable = refillable;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Use: " + use);
        System.out.println("Refillable: " + refillable);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}