class Xbox {

    // 5 instance variables (literals)
    String model = "Xbox Series X";
    String brand = "Microsoft";
    int storage = 1000;
    boolean isNextGen = true;
    double price = 49999;

    // 10 instance variables (reference)
    String creatorName;
    String familyName;
    String edition;
    String color;
    String controllerType;
    int warranty;
    boolean hasGamePass;
    String resolution;
    int powerConsumption;
    String coolingSystem;

    // Constructor
    Xbox() {
        System.out.println("Xbox created");
    }
}