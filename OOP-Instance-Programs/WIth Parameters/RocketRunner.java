class RocketRunner {
    public static void main(String[] args) {

        Rocket r1 = new Rocket();
        r1.show();

        Rocket r2 = new Rocket("Falcon", "Liquid");
        r2.show();

        Rocket r3 = new Rocket("GSLV", "Solid", 5000000);
        r3.show();

        Rocket r4 = new Rocket("PSLV", "Hybrid", 8000000, "India");
        r4.show();

        Rocket r5 = new Rocket(r4);
        r5.show();
    }
}