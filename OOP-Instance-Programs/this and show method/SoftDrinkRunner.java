class SoftDrinkRunner {
    public static void main(String[] args) {

        SoftDrink s1 = new SoftDrink("CocaCola", "Cola", "Black", 40, 0.5,
                "Carbonated", "500ml", true, 6, "USA");

        SoftDrink s2 = new SoftDrink("Pepsi", "Cola", "Dark Brown", 35, 0.5,
                "Carbonated", "500ml", true, 6, "USA");

        SoftDrink s3 = new SoftDrink("Sprite", "Lemon", "Clear", 30, 0.5,
                "Carbonated", "500ml", true, 6, "India");

        s1.show();
        s2.show();
        s3.show();
    }
}