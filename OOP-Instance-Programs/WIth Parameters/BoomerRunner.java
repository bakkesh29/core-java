class BoomerRunner {
    public static void main(String[] args) {

        Boomer b1 = new Boomer();
        b1.show();

        Boomer b2 = new Boomer("Wrigley", "Chewing Gum");
        b2.show();

        Boomer b3 = new Boomer("Center Fresh", "Bubble Gum", 10);
        b3.show();

        Boomer b4 = new Boomer("Boomer", "Bubble Gum", 20, "Strawberry");
        b4.show();

        Boomer b5 = new Boomer("Happydent", "Chewing Gum", 30, "Mint", 5);
        b5.show();
    }
}