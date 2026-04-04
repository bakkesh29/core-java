class Umbrella {

    String brand;
    String color;
    double price;
    String size;

    Umbrella() {
        System.out.println("Default Constructor");
    }

    Umbrella(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    Umbrella(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    Umbrella(String brand, String color, double price, String size) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    Umbrella(Umbrella ref) {
        this.brand = ref.brand;
        this.color = ref.color;
        this.price = ref.price;
        this.size = ref.size;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("------------------");
    }
}