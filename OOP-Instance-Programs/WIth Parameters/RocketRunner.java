class RocketRunner {
    public static void main(String[] args) {

        Rocket r1 = new Rocket();
        r1.show();

        Rocket r2 = new Rocket("Falcon 9", "USA");
        r2.show();

        Rocket r3 = new Rocket("PSLV", "India", 150);
        r3.show();

        Rocket r4 = new Rocket("GSLV", "India", 250, "Launch Vehicle");
        r4.show();

        Rocket r5 = new Rocket("Starship", "USA", 500, "Reusable", 2);
        r5.show();
    }
}