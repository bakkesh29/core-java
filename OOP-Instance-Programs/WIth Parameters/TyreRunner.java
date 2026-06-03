class TyreRunner {
    public static void main(String[] args) {

        Tyre t1 = new Tyre();
        t1.show();

        Tyre t2 = new Tyre("MRF", "Tubeless");
        t2.show();

        Tyre t3 = new Tyre("Apollo", "Radial", 4500);
        t3.show();

        Tyre t4 = new Tyre("CEAT", "All Terrain", 6000, 17);
        t4.show();

        Tyre t5 = new Tyre("Bridgestone", "Performance", 8000, 18, 4);
        t5.show();
    }
}