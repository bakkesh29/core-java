class Rock {

    String type;
    double weight;
    String color;
    String hardness;
    double price;        
    String origin;
    String usage;
    boolean polished;
    int quantity;        
    String texture;

    Rock(String type, double weight, String color, String hardness,
         double price, String origin, String usage,
         boolean polished, int quantity, String texture) {

        this.type = type;
        this.weight = weight;
        this.color = color;
        this.hardness = hardness;
        this.price = price;
        this.origin = origin;
        this.usage = usage;
        this.polished = polished;
        this.quantity = quantity;
        this.texture = texture;
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
        System.out.println("Hardness: " + hardness);
        System.out.println("Price: " + price);
        System.out.println("Origin: " + origin);
        System.out.println("Usage: " + usage);
        System.out.println("Polished: " + polished);
        System.out.println("Quantity: " + quantity);
        System.out.println("Texture: " + texture);
        System.out.println("========================");
    }
}