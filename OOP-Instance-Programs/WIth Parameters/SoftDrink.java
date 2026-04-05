class SoftDrink {

    String brand;
    String flavor;
    double price;
    String size;
    int quantity;

    SoftDrink() {
        System.out.println("Default Constructor");
    }

    SoftDrink(String brand, String flavor) {
        this.brand = brand;
        this.flavor = flavor;
    }

    SoftDrink(String brand, String flavor, double price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    SoftDrink(String brand, String flavor, double price, String size) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.size = size;
    }

    SoftDrink(String brand, String flavor, double price, String size, int quantity) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.size = size;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}