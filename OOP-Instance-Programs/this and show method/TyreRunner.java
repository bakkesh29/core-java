class TyreRunner {
    public static void main(String[] args) {

        Tyre t1 = new Tyre("MRF", "Tubeless", "17inch", 4000, 8,
                "Car", "High Grip", true, 3, "India");

        Tyre t2 = new Tyre("CEAT", "Tube", "18inch", 3500, 7,
                "Bike", "Medium Grip", false, 2, "India");

        Tyre t3 = new Tyre("Apollo", "Tubeless", "19inch", 5000, 9,
                "SUV", "Strong Grip", true, 4, "India");

        t1.show();
        t2.show();
        t3.show();
    }
}