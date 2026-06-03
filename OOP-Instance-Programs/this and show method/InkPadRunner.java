class InkPadRunner {
    public static void main(String[] args) {

        InkPad i1 = new InkPad("Camlin", "Blue", "Office", 150, 0.2,
                "Square", "Stamping", true, 1, "India");

        InkPad i2 = new InkPad("Faber", "Black", "School", 120, 0.15,
                "Rectangle", "Drawing", false, 1, "Germany");

        InkPad i3 = new InkPad("Doms", "Red", "Art", 180, 0.25,
                "Round", "Craft", true, 2, "India");

        i1.show();
        i2.show();
        i3.show();
    }
}