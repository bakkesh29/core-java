class Masha {

    String dressColor;
    String type;
    double price;

    // No-arg constructor
    Masha() {
        System.out.println("No-arg Masha constructor");
    }

    // Parameterized constructor
    Masha(String dressColor, String type, double price) {
        this.dressColor = dressColor;
        this.type = type;
        this.price = price;
    }

    void show() {
        System.out.println("Dress Color: " + this.dressColor);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("-------------------");
    }
}