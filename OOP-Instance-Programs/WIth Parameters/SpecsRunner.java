class SpecsRunner {
    public static void main(String[] args) {

        Specs s1 = new Specs();
        s1.show();

        Specs s2 = new Specs("RayBan", "Full Rim");
        s2.show();

        Specs s3 = new Specs("Fastrack", "Half Rim", 2500);
        s3.show();

        Specs s4 = new Specs("Titan", "Rimless", 3500, "Black");
        s4.show();

        Specs s5 = new Specs("Oakley", "Sports", 5000, "Blue", 2);
        s5.show();
    }
}