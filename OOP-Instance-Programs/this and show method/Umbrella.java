class Umbrella {

    String brand;
    String color;
    String type;
    String material;
    String handle; 
    String origin;
    double price; 
    double weight;
    boolean waterproof;
    int warranty;

    Umbrella(String brand, String color, String type, double price, double weight,
             String material, String handle, boolean waterproof, int warranty, String origin) {

        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.weight = weight;
        this.material = material;
        this.handle = handle;
        this.waterproof = waterproof;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Handle: " + handle);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}