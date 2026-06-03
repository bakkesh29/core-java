class Sand {

    String color;
    String type;
    int quantity;

    Sand(String color, String type, int quantity) {
        this.color = color;
        this.type = type;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Color : " + this.color);
        System.out.println("Type : " + this.type);
        System.out.println("Quantity : " + this.quantity);
    }
}