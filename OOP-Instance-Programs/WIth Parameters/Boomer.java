class Boomer {

    String brand;
    String type;
    double price;
    String flavor;

    // Constructor 1
    Boomer() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Boomer(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    // Constructor 3
    Boomer(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    // Constructor 4
    Boomer(String brand, String type, double price, String flavor) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.flavor = flavor;
    }

    // Constructor 5 (Copy)
    Boomer(Boomer ref) {
        this.brand = ref.brand;
        this.type = ref.type;
        this.price = ref.price;
        this.flavor = ref.flavor;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Flavor: " + flavor);
        System.out.println("------------------");
    }
}