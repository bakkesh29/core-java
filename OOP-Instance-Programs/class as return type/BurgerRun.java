class BurgerRun {

    String shopName;
    int quantity;

    BurgerRun(String shopName, int quantity) {
        this.shopName = shopName;
        this.quantity = quantity;
    }

    void burgerDetails() {
        System.out.println("Shop Name : " + this.shopName);
        System.out.println("Quantity : " + this.quantity);
    }

    public Burger details() {
        Burger burger = new Burger("Veg", "Paneer", 150);
        return burger;
    }
}