class Specs {

    String brand;
    String frameMaterial;
    double price;
    String color;

    // Constructor 1
    Specs() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Specs(String brand, String frameMaterial) {
        this.brand = brand;
        this.frameMaterial = frameMaterial;
    }

    // Constructor 3
    Specs(String brand, String frameMaterial, double price) {
        this.brand = brand;
        this.frameMaterial = frameMaterial;
        this.price = price;
    }

    // Constructor 4
    Specs(String brand, String frameMaterial, double price, String color) {
        this.brand = brand;
        this.frameMaterial = frameMaterial;
        this.price = price;
        this.color = color;
    }

    

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Frame Material: " + frameMaterial);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("------------------");
    }
}