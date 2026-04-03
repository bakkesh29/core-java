class SpecsRunner {
    public static void main(String[] args) {

        Specs s1 = new Specs();
        s1.show();

        Specs s2 = new Specs("RayBan", "Metal");
        s2.show();

        Specs s3 = new Specs("Oakley", "Plastic", 3000);
        s3.show();

        Specs s4 = new Specs("Fastrack", "Fiber", 1500, "Black");
        s4.show();


    }
}