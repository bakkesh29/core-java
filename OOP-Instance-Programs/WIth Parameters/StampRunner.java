class StampRunner {
    public static void main(String[] args) {

        Stamp s1 = new Stamp();
        s1.show();

        Stamp s2 = new Stamp("Camlin", "Office");
        s2.show();

        Stamp s3 = new Stamp("Doms", "Rubber", 120);
        s3.show();

        Stamp s4 = new Stamp("Faber", "Self Ink", 250, "Blue");
        s4.show();

        Stamp s5 = new Stamp("Classmate", "Office", 300, "Black", 5);
        s5.show();
    }
}