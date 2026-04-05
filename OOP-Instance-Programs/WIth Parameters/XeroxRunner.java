class XeroxRunner {
    public static void main(String[] args) {

        Xerox x1 = new Xerox();
        x1.show();

        Xerox x2 = new Xerox("Canon", "Printer");
        x2.show();

        Xerox x3 = new Xerox("HP", "Scanner", 15000);
        x3.show();

        Xerox x4 = new Xerox("Epson", "All-in-One", 20000, "White");
        x4.show();

        Xerox x5 = new Xerox("Brother", "Laser Printer", 25000, "Black", 2);
        x5.show();
    }
}