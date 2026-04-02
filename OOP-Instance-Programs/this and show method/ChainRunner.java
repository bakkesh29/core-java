class ChainRunner {
    public static void main(String[] args) {

        Chain c1 = new Chain("Titan", "Gold", "Yellow", 10000, 25,
                "Neck Chain", "Simple", true, 2, "India");

        Chain c2 = new Chain("Malabar", "Silver", "White", 5000, 20,
                "Hand Chain", "Designer", false, 1, "India");

        Chain c3 = new Chain("Tanishq", "Platinum", "Grey", 15000, 30,
                "Heavy Chain", "Premium", true, 3, "Dubai");

        c1.show();
        c2.show();
        c3.show();
    }
}