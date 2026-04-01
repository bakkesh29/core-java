class AsianPaint {
    String color;
    String type;
    double price;
    double quantity;
    String finish;
    String brand;
    boolean waterproof;
    String usage;
    int warranty;
    String quality;

    // Parameterized Constructor
    AsianPaint(String color, String type, double price, double quantity,
               String finish, String brand, boolean waterproof,
               String usage, int warranty, String quality) {

        this.color = color;
        this.type = type;
        this.price = price;
        this.quantity = quantity;
        this.finish = finish;
        this.brand = brand;
        this.waterproof = waterproof;
        this.usage = usage;
        this.warranty = warranty;
        this.quality = quality;
    }
    // display it used to print 
    //void it doesnt return any value
    // display method
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Finish: " + finish);
        System.out.println("Brand: " + brand);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Usage: " + usage);
        System.out.println("Warranty: " + warranty);
        System.out.println("Quality: " + quality);
        System.out.println("========================");
    }
}