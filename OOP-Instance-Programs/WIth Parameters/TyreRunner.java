class TyreRunner {
    public static void main(String[] args) {

        Tyre t1 = new Tyre();
        t1.show();

        Tyre t2 = new Tyre("MRF", "Tubeless");
        t2.show();

        Tyre t3 = new Tyre("CEAT", "Radial", 4000);
        t3.show();

        Tyre t4 = new Tyre("Apollo", "AllTerrain", 6000, 18);
        t4.show();

        Tyre t5 = new Tyre(t4);
        t5.show();
    }
}