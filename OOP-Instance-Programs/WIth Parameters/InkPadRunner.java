class InkPadRunner {
    public static void main(String[] args) {

        InkPad i1 = new InkPad();
        i1.show();

        InkPad i2 = new InkPad("Camlin", "Blue");
        i2.show();

        InkPad i3 = new InkPad("Faber", "Black", 120);
        i3.show();

        InkPad i4 = new InkPad("Doms", "Red", 150, "Stamp Pad");
        i4.show();

        InkPad i5 = new InkPad("Classmate", "Green", 200, "Office Use", 10);
        i5.show();
    }
}