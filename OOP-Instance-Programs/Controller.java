class Controller {

    // 5 instance variables initialized with literals
    String type = "Gamepad";
    String brand = "Sony";
    int buttons = 12;
    boolean isWireless = true;
    double price = 4999.99;

    // 10 instance variables (reference variables)
    String connectivity;
    String compatibility;
    String color;
    int batteryLife;
    boolean hasVibration;
    String material;
    String layout;
    int warranty;
    double weight;
    String finish;

    // Constructor
    Controller() {
        System.out.println("Controller created");
    }
}