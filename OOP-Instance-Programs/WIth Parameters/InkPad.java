class InkPad {

    String brand;
    String color;
    double price;
    String size;

    InkPad() {
        System.out.println("Default Constructor");
    }

    InkPad(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    InkPad(String brand, String color, double price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    InkPad(String brand, String color, double price, String size) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.size = size;
    }

    InkPad(InkPad ref) {
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