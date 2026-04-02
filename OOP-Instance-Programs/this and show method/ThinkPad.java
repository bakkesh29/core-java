class ThinkPad {

    // 10 instance variables
    String brand;
    String model;
    String processor;
    String color;
    String os;
    String origin;
    double price;
    double weight;
    boolean touchscreen;
    int warranty;

    // Parameterized Constructor
    ThinkPad(String brand, String model, String processor, double price, double weight,
             String color, String os, boolean touchscreen, int warranty, String origin) {

        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.price = price;
        this.weight = weight;
        this.color = color;
        this.os = os;
        this.touchscreen = touchscreen;
        this.warranty = warranty;
        this.origin = origin;
    }

    // Non-static method
    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Processor: " + processor);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("OS: " + os);
        System.out.println("Touchscreen: " + touchscreen);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}