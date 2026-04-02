class LocketRunner {
    public static void main(String... values) {

        Locket l1 = new Locket("Titan", "Gold", "Yellow", 5000, 20,
                "Neck", "Heart", true, 2, "India");

        Locket l2 = new Locket("Tanishq", "Silver", "White", 3000, 15,
                "Pendant", "Round", false, 1, "India");

        Locket l3 = new Locket("Malabar", "Platinum", "Grey", 8000, 25,
                "Chain", "Oval", true, 3, "Dubai");

        l1.show();
        l2.show();
        l3.show();
    }
}