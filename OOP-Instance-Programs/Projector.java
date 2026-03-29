class Projector {

    // 5 instance variables initialized with literals
    String type = "LED";
    int price = 20000;
    boolean isPortable = true;
    String color = "White";
    int brightness = 2500;

    // 10 instance variables (reference variables)
    String brand;
    String resolution;
    int contrastRatio;
    String connectivity;
    int warranty;
    String weight;
    String usage;
    String displayTechnology;
    int lampLife;
    String aspectRatio;

    // Constructor
    Projector() {
        System.out.println("Projector created");
    }
}