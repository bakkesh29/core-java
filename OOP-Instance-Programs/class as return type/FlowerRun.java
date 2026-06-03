class FlowerRun {

    String gardenName;
    int quantity;

    FlowerRun(String gardenName, int quantity) {
        this.gardenName = gardenName;
        this.quantity = quantity;
    }

    void flowerDetails() {
        System.out.println("Garden Name : " + this.gardenName);
        System.out.println("Quantity : " + this.quantity);
    }

    public Flower details() {
        Flower flower = new Flower("Rose", "Red", 20);
        return flower;
    }
}