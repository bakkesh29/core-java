class WindShieldRunner {
    public static void main(String[] args) {

        WindShield w1 = new WindShield();
        w1.show();

        WindShield w2 = new WindShield("SaintGobain", "Glass");
        w2.show();

        WindShield w3 = new WindShield("Asahi", "Fiber", 5000);
        w3.show();

        WindShield w4 = new WindShield("Guardian", "Tempered", 8000, "Large");
        w4.show();

        WindShield w5 = new WindShield(w4);
        w5.show();
    }
}