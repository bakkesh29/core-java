class WindShieldRunner {
    public static void main(String[] args) {

        WindShield w1 = new WindShield("Bosch", "Front", "Transparent", 3000, 5,
                "Car", "Glass", true, 2, "Germany");

        WindShield w2 = new WindShield("Valeo", "Rear", "Light Green", 2500, 4,
                "Bike", "Fiber", true, 1, "France");

        WindShield w3 = new WindShield("Asahi", "Front", "Clear", 3500, 6,
                "Truck", "Tempered Glass", true, 3, "Japan");

        w1.show();
        w2.show();
        w3.show();
    }
}