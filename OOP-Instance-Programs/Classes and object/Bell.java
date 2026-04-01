class Bell {
    String material;
    double weight;
    String color;
    String type;
    double price;
    String soundLevel;
    String usage;
    boolean electric;
    int warranty;
    String brand;

    // Parameterized Constructor
    Bell(String material, double weight, String color, String type,
         double price, String soundLevel, String usage,
         boolean electric, int warranty, String brand) {

        this.material = material;
        this.weight = weight;
        this.color = color;
        this.type = type;
        this.price = price;
        this.soundLevel = soundLevel;
        this.usage = usage;
        this.electric = electric;
        this.warranty = warranty;
        this.brand = brand;
    }

    // display method
    void display() {
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Sound Level: " + soundLevel);
        System.out.println("Usage: " + usage);
        System.out.println("Electric: " + electric);
        System.out.println("Warranty: " + warranty);
        System.out.println("Brand: " + brand);
        System.out.println("========================");
    }
}