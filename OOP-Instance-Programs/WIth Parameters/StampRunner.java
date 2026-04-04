class StampRunner {
    public static void main(String[] args) {

        Stamp s1 = new Stamp();
        s1.show();

        Stamp s2 = new Stamp("Camlin", "Blue");
        s2.show();

        Stamp s3 = new Stamp("Doms", "Red", 150);
        s3.show();

        Stamp s4 = new Stamp("Faber", "Black", 200, "Rubber");
        s4.show();

        Stamp s5 = new Stamp(s4);
        s5.show();
    }
}