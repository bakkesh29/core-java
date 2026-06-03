class GraphicCard {

    String model = "RTX 3060";
    int memory = 12;
    boolean isGaming = true;
    double price = 35000;
    String brand = "NVIDIA";

    int cores;
    String architecture;
    int clockSpeed;
    boolean rayTracing;
    int warranty;
    String coolingType;
    String compatibility;
    int powerConsumption;
    String portType;
    String size;

    GraphicCard() {
        System.out.println("Graphic Card created");
    }
}
