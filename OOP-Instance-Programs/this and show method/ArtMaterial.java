class ArtMaterial {

    String type; 
    String brand; 
    String color; 
    String use; 
    String quality; 
    String origin;
    double price, weight;
    boolean ecoFriendly;
    int warranty;

    ArtMaterial(String type, String brand, String color, double price, double weight,
                String use, String quality, boolean ecoFriendly, int warranty, String origin) {

        this.type = type;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.use = use;
        this.quality = quality;
        this.ecoFriendly = ecoFriendly;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Use: " + use);
        System.out.println("Quality: " + quality);
        System.out.println("EcoFriendly: " + ecoFriendly);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}