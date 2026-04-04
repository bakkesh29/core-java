class UmbrellaRunner {
    public static void main(String[] args) {

        Umbrella u1 = new Umbrella();
        u1.show();

        Umbrella u2 = new Umbrella("Puma", "Black");
        u2.show();

        Umbrella u3 = new Umbrella("Nike", "Blue", 800);
        u3.show();

        Umbrella u4 = new Umbrella("Adidas", "Red", 1200, "Large");
        u4.show();

        Umbrella u5 = new Umbrella(u4);
        u5.show();
    }
}