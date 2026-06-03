class ThinkPadRunner {
    public static void main(String[] args) {

        ThinkPad t1 = new ThinkPad();
        t1.show();

        ThinkPad t2 = new ThinkPad("X1 Carbon", "Intel i5");
        t2.show();

        ThinkPad t3 = new ThinkPad("T14", "Intel i7", 120000);
        t3.show();

        ThinkPad t4 = new ThinkPad("E14", "Ryzen 5", 80000, "Black");
        t4.show();

        ThinkPad t5 = new ThinkPad("P15", "Intel i9", 180000, "Black", 3);
        t5.show();
    }
}