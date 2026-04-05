class LocketRunner {
    public static void main(String[] args) {

        Locket l1 = new Locket();
        l1.show();

        Locket l2 = new Locket("Tanishq", "Gold");
        l2.show();

        Locket l3 = new Locket("Kalyan", "Silver", 5000);
        l3.show();

        Locket l4 = new Locket("Malabar", "Platinum", 15000, "Heart");
        l4.show();

        Locket l5 = new Locket("PC Jeweller", "Gold", 20000, "Floral", 3);
        l5.show();
    }
}