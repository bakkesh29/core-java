class ThinkPadRunner {
    public static void main(String[] args) {

        ThinkPad t1 = new ThinkPad("Lenovo", "T480", "i5", 60000, 1.8,
                "Black", "Windows", false, 2, "China");

        ThinkPad t2 = new ThinkPad("Lenovo", "X1 Carbon", "i7", 120000, 1.2,
                "Black", "Windows", true, 3, "USA");

        ThinkPad t3 = new ThinkPad("Lenovo", "E14", "Ryzen 5", 55000, 1.6,
                "Grey", "Linux", false, 2, "India");

        t1.show();
        t2.show();
        t3.show();
    }
}