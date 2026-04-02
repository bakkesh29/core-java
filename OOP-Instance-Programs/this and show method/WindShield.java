class WindShield {

    String brand; 
    String type;
    String color; 
    String vehicle; 
    String material; 
    String origin;
    double price, weight;
    boolean strong;
    int warranty;

    WindShield(String brand, String type, String color, double price, double weight,
               String vehicle, String material, boolean strong, int warranty, String origin) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.vehicle = vehicle;
        this.material = material;
        this.strong = strong;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Vehicle: " + vehicle);
        System.out.println("Material: " + material);
        System.out.println("Strong: " + strong);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}