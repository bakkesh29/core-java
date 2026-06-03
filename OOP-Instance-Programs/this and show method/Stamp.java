class Stamp {

    String type;
    String shape;
    String color; 
    String use;
    String material; 
    String origin;
    double price;
    double  weight;
    boolean reusable;
    int warranty;

    Stamp(String type, String shape, String color, double price, double weight,
          String use, String material, boolean reusable, int warranty, String origin) {

        this.type = type;
        this.shape = shape;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.use = use;
        this.material = material;
        this.reusable = reusable;
        this.warranty = warranty;
        this.origin = origin;
    }

    void show() {
        System.out.println("Type: " + type);
        System.out.println("Shape: " + shape);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Use: " + use);
        System.out.println("Material: " + material);
        System.out.println("Reusable: " + reusable);
        System.out.println("Warranty: " + warranty);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}