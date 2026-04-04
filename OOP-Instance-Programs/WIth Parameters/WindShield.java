class WindShield {

    String brand;
    String material;
    double price;
    String size;

    WindShield() {
        System.out.println("Default Constructor");
    }

    WindShield(String brand, String material) {
        this.brand = brand;
        this.material = material;
    }

    WindShield(String brand, String material, double price) {
        this.brand = brand;
        this.material = material;
        this.price = price;
    }

    WindShield(String brand, String material, double price, String size) {
        this.brand = brand;
        this.material = material;
        this.price = price;
        this.size = size;
    }

    WindShield(WindShield ref) {
        this.brand = ref.brand;
        this.material = ref.material;
        this.price = ref.price;
        this.size = ref.size;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("------------------");
    }
}