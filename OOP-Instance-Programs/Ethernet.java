class Ethernet {

    // 5 literals
    String type = "LAN";
    String cableType = "Cat6";
    int speed = 1000;
    boolean isWired = true;
    double price = 500.5;

    // 10 reference
    String brand;
    String length;
    String connectorType;
    String usage;
    int warranty;
    String color;
    boolean isShielded;
    String compatibility;
    String material;
    String version;

    Ethernet() {
        System.out.println("Ethernet created");
    }
}