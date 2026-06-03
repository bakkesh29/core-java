class UmbrellaRunner {
    public static void main(String[] args) {

        Umbrella u1 = new Umbrella("Popy", "Black", "Foldable", 500, 0.5,
                "Nylon", "Plastic", true, 1, "India");

        Umbrella u2 = new Umbrella("Johns", "Blue", "Straight", 700, 0.7,
                "Polyester", "Wood", true, 2, "UK");

        Umbrella u3 = new Umbrella("RainSafe", "Red", "Automatic", 900, 0.6,
                "Fiber", "Steel", true, 3, "USA");

        u1.show();
        u2.show();
        u3.show();
    }
}