class MickeyMouse {

    String color;
    String type;
    double price;

    // No-arg constructor
    MickeyMouse() {
        System.out.println("No-arg MickeyMouse constructor");
    }

    // Parameterized constructor
    MickeyMouse(String color, String type, double price) {
        this.color = color;
        this.type = type;
        this.price = price;
    }

    void show() {
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
        System.out.println("Price: " + this.price);
        System.out.println("-------------------");
    }
}