class DiamondRun {

    String brand;
    int price;

    DiamondRun(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    void diamondDetails() {
        System.out.println("Brand : " + this.brand);
        System.out.println("Price : " + this.price);
    }

    public Diamond details() {
        Diamond diamond = new Diamond("White", 2, "Round");
        return diamond;
    }
}