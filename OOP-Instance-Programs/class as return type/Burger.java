class Burger {

    String type;
    String ingredient;
    int price;

    Burger(String type, String ingredient, int price) {
        this.type = type;
        this.ingredient = ingredient;
        this.price = price;
    }

    void display() {
        System.out.println("Type : " + this.type);
        System.out.println("Ingredient : " + this.ingredient);
        System.out.println("Price : " + this.price);
    }
}