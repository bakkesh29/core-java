class SoftDrink {

    String brand;
    String flavor;
    double price;
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

    SoftDrink(String brand, String flavor, double price, int quantity) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
        this.quantity = quantity;
    }

    SoftDrink(SoftDrink ref) {
        this.brand = ref.brand;
        this.flavor = ref.flavor;
        this.price = ref.price;
        this.quantity = ref.quantity;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------");
    }
}