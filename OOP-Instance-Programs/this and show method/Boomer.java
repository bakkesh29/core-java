class Boomer {

    String brand;
    String type;
    String color;
    String usage;
    String shape;
    String origin;
    double price;
    double weight;
    boolean durable;
    int warranty;

    Boomer(String brand, String type, String color, double price, double weight,
           String usage, String shape, boolean durable, int warranty, String origin) {

        this.brand = brand;
        this.type = type;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.usage = usage;
        this.shape = shape;
        this.durable = durable;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Usage: " + usage);
        System.out.println("Shape: " + shape);
        System.out.println("Durable: " + durable);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}