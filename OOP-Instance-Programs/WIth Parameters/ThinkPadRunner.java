class ThinkPadRunner {
    public static void main(String[] args) {

        ThinkPad t1 = new ThinkPad();
        t1.show();

        ThinkPad t2 = new ThinkPad("Lenovo", "E14");
        t2.show();

        ThinkPad t3 = new ThinkPad("Lenovo", "T14", 75000);
        t3.show();

        ThinkPad t4 = new ThinkPad("Lenovo", "X1 Carbon", 120000, "i7");
        t4.show();

        ThinkPad t5 = new ThinkPad(t4);
        t5.show();
    }
}