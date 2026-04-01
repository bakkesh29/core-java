class Stumps {
    double height;
    String shape;
    double diameter;
    double width;
    String placement;
    String type;
    String brand;
    double cost;
    String durability;
    boolean lights;

    // ParameterizedConstructor 
    Stumps(double height, String shape, double diameter, double width,
           String placement, String type, String brand,
           double cost, String durability, boolean lights) {

        this.height = height;
        this.shape = shape;
        this.diameter = diameter;
        this.width = width;
        this.placement = placement;
        this.type = type;
        this.brand = brand;
        this.cost = cost;
        this.durability = durability;
        this.lights = lights;
    }

    // display it used to print 
    //void it doesnt return any value
    void display() {
        System.out.println("Height: " + height);
        System.out.println("Shape: " + shape);
        System.out.println("Diameter: " + diameter);
        System.out.println("Width: " + width);
        System.out.println("Placement: " + placement);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Cost: " + cost);
        System.out.println("Durability: " + durability);
        System.out.println("Lights: " + lights);
        System.out.println("========================");
    }
}