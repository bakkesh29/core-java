class Wheel {

    String type;
    double size;
    String material;
    String brand;
    double price;
    String vehicleType;
    String color;
    double weight;
    boolean tubeless;
    int durability;

    // Parameterized Constructor
    Wheel(String type, double size, String material, String brand,
          double price, String vehicleType, String color,
          double weight, boolean tubeless, int durability) {

        this.type = type;
        this.size = size;
        this.material = material;
        this.brand = brand;
        this.price = price;
        this.vehicleType = vehicleType;
        this.color = color;
        this.weight = weight;
        this.tubeless = tubeless;
        this.durability = durability;
    }

    // display method
    void display() {
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Material: " + material);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Tubeless: " + tubeless);
        System.out.println("Durability: " + durability);
        System.out.println("========================");
    }
}