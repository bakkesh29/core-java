class SwordRun {

    String owner;
    int price;

    SwordRun(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    void swordDetails() {
        System.out.println("Owner : " + this.owner);
        System.out.println("Price : " + this.price);
    }

    public Sword details() {
        Sword sword = new Sword("Long Sword", "Steel", 40);
        return sword;
    }
}