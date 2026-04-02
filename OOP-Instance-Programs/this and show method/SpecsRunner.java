class SpecsRunner {
    public static void main(String[] args) {

        Specs s1 = new Specs("RayBan", "Sunglasses", "Black", 5000, 0.2,
                "Full Frame", "UV Protection", true, 2, "USA");

        Specs s2 = new Specs("Fastrack", "Reading", "Brown", 1500, 0.15,
                "Half Frame", "Anti Glare", false, 1, "India");

        Specs s3 = new Specs("Oakley", "Sports", "Blue", 7000, 0.25,
                "Rimless", "Polarized", true, 3, "USA");

        s1.show();
        s2.show();
        s3.show();
    }
}