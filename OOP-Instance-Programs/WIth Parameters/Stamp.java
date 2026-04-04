class Stamp {

    String brand;
    String color;
    double price;
    String type;

    Stamp() {
        System.out.println("Default Constructor");
    }

    Stamp(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Stamp(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    Stamp(String brand, String color, double price, String type) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.type = type;
    }

    Stamp(Stamp ref) {
        this.brand = ref.brand;
        this.color = ref.color;
        this.price = ref.price;
        this.type = ref.type;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("------------------");
    }
}