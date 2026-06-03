class UmbrellaRunner {
    public static void main(String[] args) {

        Umbrella u1 = new Umbrella();
        u1.show();

        Umbrella u2 = new Umbrella("Puma", "Foldable");
        u2.show();

        Umbrella u3 = new Umbrella("Adidas", "Automatic", 800);
        u3.show();

        Umbrella u4 = new Umbrella("Nike", "Manual", 1000, "Black");
        u4.show();

        Umbrella u5 = new Umbrella("Wildcraft", "Travel", 1200, "Blue", 3);
        u5.show();
    }
}