class Lock {

    String type;
    String material;
    int price;

    Lock(String type, String material, int price) {
        this.type = type;
        this.material = material;
        this.price = price;
    }

    void display() {
        System.out.println("Type : " + this.type);
        System.out.println("Material : " + this.material);
        System.out.println("Price : " + this.price);
    }
}