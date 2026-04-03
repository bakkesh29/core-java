class Xerox {

    String brand;
    String type;
    double price;
    String colorMode;

    Xerox() {
        System.out.println("Default Constructor");
    }

    Xerox(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    Xerox(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    Xerox(String brand, String type, double price, String colorMode) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.colorMode = colorMode;
    }

    Xerox(Xerox ref) {
        this.brand = ref.brand;
        this.type = ref.type;
        this.price = ref.price;
        this.colorMode = ref.colorMode;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Color Mode: " + colorMode);
        System.out.println("------------------");
    }
}