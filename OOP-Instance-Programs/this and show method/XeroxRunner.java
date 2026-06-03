class XeroxRunner {
    public static void main(String[] args) {

        Xerox x1 = new Xerox("Canon", "Printer", "White", 12000, 10,
                "A4", "Color", true, 2, "Japan");

        Xerox x2 = new Xerox("HP", "All-in-One", "Black", 15000, 12,
                "A4", "Black & White", true, 3, "USA");

        Xerox x3 = new Xerox("Epson", "Scanner", "Grey", 10000, 9,
                "A3", "Color", false, 2, "China");

        x1.show();
        x2.show();
        x3.show();
    }
}