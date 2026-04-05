class StampRunner {
    public static void main(String[] args) {

        Stamp s1 = new Stamp("Office", "Round", "Blue", 200, 0.2,
                "Official", "Rubber", true, 1, "India");

        Stamp s2 = new Stamp("School", "Square", "Red", 150, 0.15,
                "Marking", "Plastic", false, 1, "India");

        Stamp s3 = new Stamp("Custom", "Oval", "Black", 300, 0.25,
                "Design", "Wood", true, 2, "USA");

        s1.show();
        s2.show();
        s3.show();
    }
}