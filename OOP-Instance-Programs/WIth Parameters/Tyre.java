class Tyre {

    String brand;
    String type;
    double price;
    int size;

    Tyre() {
        System.out.println("Default Constructor");
    }

    Tyre(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Tyre(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    Tyre(String brand, String type, double price, int size) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.size = size;
    }

    Tyre(Tyre ref) {
        this.brand = ref.brand;
        this.type = ref.type;
        this.price = ref.price;
        this.size = ref.size;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("------------------");
    }
}