class WindShieldRunner {
    public static void main(String[] args) {

        WindShield w1 = new WindShield();
        w1.show();

        WindShield w2 = new WindShield("Saint-Gobain", "Laminated");
        w2.show();

        WindShield w3 = new WindShield("Asahi", "Tempered", 5000);
        w3.show();

        WindShield w4 = new WindShield("Pilkington", "Laminated", 8000, "Car");
        w4.show();

        WindShield w5 = new WindShield("Fuyao", "Tempered", 9000, "SUV", 2);
        w5.show();
    }
}