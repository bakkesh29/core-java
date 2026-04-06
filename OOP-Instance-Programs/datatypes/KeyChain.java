class Keychain {

    String design;
    String material;
    double price;

    // No-arg constructor
    Keychain() {
        System.out.println("No-arg Keychain constructor");
    }

    // Parameterized constructor
    Keychain(String design, String material, double price) {
        this.design = design;
        this.material = material;
        this.price = price;
    }

    void show() {
        System.out.println("Design: " + this.design);
        System.out.println("Material: " + this.material);
        System.out.println("Price: " + this.price);
        System.out.println("-------------------");
    }
}