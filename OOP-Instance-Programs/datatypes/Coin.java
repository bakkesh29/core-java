class Coin {

    String type;
    String material;
    double value;

    Coin() {
        System.out.println("No-arg constructor called");
    }

    // Parameterized constructor
    Coin(String type, String material, double value) {
        this.type = type;
        this.material = material;
        this.value = value;
    }

    // Method to print info
    void show() {
        System.out.println("Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Value: " + this.value);
        System.out.println("-------------------");
    }
}