class Xerox {

    String brand; 
    String type;
    String color; 
    String paperSize; 
    String mode; 
    String origin;
    double price;
    double weight;
    boolean wifi;
    int warranty;

    Xerox(String brand, String type, String color, double price, double weight,
          String paperSize, String mode, boolean wifi, int warranty, String origin) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.paperSize = paperSize;
        this.mode = mode;
        this.wifi = wifi;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Paper Size: " + paperSize);
        System.out.println("Mode: " + mode);
        System.out.println("WiFi: " + wifi);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}