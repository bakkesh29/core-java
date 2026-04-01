class DumbBells {
    String brand;
    double weight;
    String material;
    String color;
    double price;
    String type;
    String gripType;
    boolean adjustable;
    int warranty;
    String usage;

    // Parameterized Constructor
    DumbBells(String brand, double weight, String material, String color,
              double price, String type, String gripType,
              boolean adjustable, int warranty, String usage) {

        this.brand = brand;
        this.weight = weight;
        this.material = material;
        this.color = color;
        this.price = price;
        this.type = type;
        this.gripType = gripType;
        this.adjustable = adjustable;
        this.warranty = warranty;
        this.usage = usage;
    }

    // display method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Adjustable: " + adjustable);
        System.out.println("Warranty: " + warranty);
        System.out.println("Usage: " + usage);
        System.out.println("========================");
    }
}