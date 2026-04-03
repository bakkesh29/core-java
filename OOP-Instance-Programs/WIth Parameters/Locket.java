class Locket {

    String brand;
    String material;
    double price;
    String color;

    // no parameters
    Locket() {
        System.out.println("Default Constructor");
    }

    //2 parameters
    Locket(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    //3 parameters
    Locket(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    // 4 parameters
    Locket(String brand, String material, double price, String color) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.color = color;
    }
    // Non-static method
    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("------------------");
    }
}