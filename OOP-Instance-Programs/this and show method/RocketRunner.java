class RocketRunner {
    public static void main(String[] args) {

        Rocket r1 = new Rocket("PSLV", "Solid", "White", 5000000, 320,
                "Satellite", "ISRO", false, 4, "India");

        Rocket r2 = new Rocket("Falcon9", "Liquid", "Black", 7000000, 550,
                "Orbital", "SpaceX", true, 2, "USA");

        Rocket r3 = new Rocket("GSLV", "Cryogenic", "White", 9000000, 420,
                "Heavy", "ISRO", false, 3, "India");

        r1.show();
        r2.show();
        r3.show();
    }
}