class ChainRunner {
    public static void main(String[] args) {

        Chain c1 = new Chain();
        c1.show();

        Chain c2 = new Chain("Malabar", "Gold");
        c2.show();

        Chain c3 = new Chain("Tanishq", "Silver", 8000);
        c3.show();

        Chain c4 = new Chain("Kalyan", "Platinum", 15000, 20);
        c4.show();
    }
}