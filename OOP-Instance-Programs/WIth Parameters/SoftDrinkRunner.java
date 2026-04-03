class SoftDrinkRunner {
    public static void main(String[] args) {

        SoftDrink s1 = new SoftDrink();
        s1.show();

        SoftDrink s2 = new SoftDrink("CocaCola", "Cola");
        s2.show();

        SoftDrink s3 = new SoftDrink("Pepsi", "Cola", 40);
        s3.show();

        SoftDrink s4 = new SoftDrink("Fanta", "Orange", 50, 2);
        s4.show();

        SoftDrink s5 = new SoftDrink(s4);
        s5.show();
    }
}