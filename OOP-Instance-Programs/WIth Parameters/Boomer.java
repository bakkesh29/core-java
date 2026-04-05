class Boomer {

    String brand;
    String type;
    double price;
    String flavor;
    int quantity;

    Boomer() {
        System.out.println("Default Constructor");
    }

    Boomer(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Boomer(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    Boomer(String brand, String type, double price, String flavor) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.flavor = flavor;
    }

    Boomer(String brand, String type, double price, String flavor, int quantity) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.flavor = flavor;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Flavor: " + flavor);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}