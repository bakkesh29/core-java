class Glove {

    String material;
    String color;
    String size;
    boolean waterproof;
    int quantity;
    double price;
    String brand;
    String usage;
    double weight;
    boolean reusable;

    Glove(String material, String color, String size, boolean waterproof,
          int quantity, double price, String brand,
          String usage, double weight, boolean reusable) {

        this.material = material;
        this.color = color;
        this.size = size;
        this.waterproof = waterproof;
        this.quantity = quantity;
        this.price = price;
        this.brand = brand;
        this.usage = usage;
        this.weight = weight;
        this.reusable = reusable;
    }

    void show() {

        System.out.println("--------show method starts--------");
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Size: " + this.size);
        System.out.println("Waterproof: " + this.waterproof);
        System.out.println("Quantity: " + this.quantity);
        System.out.println("Price: " + this.price);
        System.out.println("Brand: " + this.brand);
        System.out.println("Usage: " + this.usage);
        System.out.println("Weight: " + this.weight);
        System.out.println("Reusable: " + this.reusable);
        System.out.println("------------show method ends---------------");
    }
}