class ChainRunner {
    public static void main(String[] args) {

        Chain c1 = new Chain();
        c1.show();

        Chain c2 = new Chain("Tanishq", "Gold");
        c2.show();

        Chain c3 = new Chain("Malabar", "Silver", 15000);
        c3.show();

        Chain c4 = new Chain("Kalyan", "Platinum", 25000, 18);
        c4.show();

        Chain c5 = new Chain("PC Jeweller", "Gold", 30000, 20, 2);
        c5.show();
    }
}