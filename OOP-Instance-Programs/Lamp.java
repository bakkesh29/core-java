class Lamp {

    // 5 instance variables initialized with literals
    String type = "LED";
    String color = "White";
    int brightness = 800;
    boolean isRechargeable = true;
    double price = 499.99;

    // 10 instance variables (to be initialized using reference)
    String brand;
    String shape;
    String size;
    String location;
    boolean isPortable;
    int warranty;
    String material;
    String powerSource;
    int weight;
    String finish;

    // No-arg constructor
    Lamp() {
        System.out.println("Lamp created");
    }
}