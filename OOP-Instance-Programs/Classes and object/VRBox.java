class VRBox {
    String brand;
    String model;
    String color;
    double weight;
    double price;
    String compatibility;
    String lensType;
    boolean remote;
    String material;
    int warranty;

    // Parameterized Constructor
    VRBox(String brand, String model, String color, double weight,
          double price, String compatibility, String lensType,
          boolean remote, String material, int warranty) {

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.compatibility = compatibility;
        this.lensType = lensType;
        this.remote = remote;
        this.material = material;
        this.warranty = warranty;
    }

    // display method
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Lens Type: " + lensType);
        System.out.println("Remote: " + remote);
        System.out.println("Material: " + material);
        System.out.println("Warranty: " + warranty);
        System.out.println("========================");
    }
}