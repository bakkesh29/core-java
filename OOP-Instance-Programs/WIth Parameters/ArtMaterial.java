class ArtMaterial {

    String brand;
    String type;
    double price;
    String color;

    ArtMaterial() {
        System.out.println("Default Constructor");
    }

    ArtMaterial(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    ArtMaterial(String brand, String type, double price) {
        this.brand = brand;
        this.type = type;
        this.price = price;
    }

    ArtMaterial(String brand, String type, double price, String color) {
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color = color;
    }

    ArtMaterial(ArtMaterial ref) {
        this.brand = ref.brand;
        this.type = ref.type;
        this.price = ref.price;
        this.color = ref.color;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("------------------");
    }
}