class Net {

    String type;
    String material;
    double price;
    Net() {
        System.out.println("No-arg Net constructor");
    }
    Net(String type, String material, double price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    void show() {
        System.out.println("Type: " + this.type);
        System.out.println("Material: " + this.material);
        System.out.println("Price: " + this.price);
        System.out.println("-------------------");
    }
}