class ThreadMill {
    String brand;
    double speed;
    String type;
    double price;
    boolean automatic;
    String material;
    String color;
    int warranty;
    double weight;
    String usage;

    // Parameterized Constructor
    ThreadMill(String brand, double speed, String type, double price,
               boolean automatic, String material, String color,
               int warranty, double weight, String usage) {

        this.brand = brand;
        this.speed = speed;
        this.type = type;
        this.price = price;
        this.automatic = automatic;
        this.material = material;
        this.color = color;
        this.warranty = warranty;
        this.weight = weight;
        this.usage = usage;
    }

    // display method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Automatic: " + automatic);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty);
        System.out.println("Weight: " + weight);
        System.out.println("Usage: " + usage);
        System.out.println("========================");
    }
}