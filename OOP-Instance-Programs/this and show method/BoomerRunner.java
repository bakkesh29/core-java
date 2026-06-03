class BoomerRunner {
    public static void main(String[] args) {

        Boomer b1 = new Boomer("BoomCo", "Toy", "Red", 500, 0.5,
                "Kids", "Round", true, 1, "India");

        Boomer b2 = new Boomer("FunPlay", "Outdoor", "Blue", 700, 0.6,
                "Game", "Curved", true, 2, "Australia");

        Boomer b3 = new Boomer("Sporty", "Professional", "Black", 1200, 0.8,
                "Sport", "Aerodynamic", true, 3, "USA");

        b1.show();
        b2.show();
        b3.show();
    }
}