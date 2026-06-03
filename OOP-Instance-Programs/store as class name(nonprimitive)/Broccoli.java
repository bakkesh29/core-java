class Broccoli {

    String color;
    double weight;
    String type;
    boolean organic;
    int pieces;
    double price;
    String taste;
    String origin;
    double size;
    boolean fresh;

    Broccoli(String color, double weight, String type, boolean organic,
             int pieces, double price, String taste,
             String origin, double size, boolean fresh) {

        this.color = color;
        this.weight = weight;
        this.type = type;
        this.organic = organic;
        this.pieces = pieces;
        this.price = price;
        this.taste = taste;
        this.origin = origin;
        this.size = size;
        this.fresh = fresh;
    }

    void show() {

        System.out.println("--------show method starts--------");
        System.out.println("Color: " + this.color);
        System.out.println("Weight: " + this.weight);
        System.out.println("Type: " + this.type);
        System.out.println("Organic: " + this.organic);
        System.out.println("Pieces: " + this.pieces);
        System.out.println("Price: " + this.price);
        System.out.println("Taste: " + this.taste);
        System.out.println("Origin: " + this.origin);
        System.out.println("Size: " + this.size);
        System.out.println("Fresh: " + this.fresh);
        System.out.println("------------show method ends---------------");
    }
}