class MainRunner3 {

    public static void main(String[] args) {

        DSLR c1 = new DSLR(24, "Canon", "Professional");
        DSLR c2 = new DSLR(48, "Nikon", "Advanced");

        System.out.println("---- Camera Details ----");

        c1.display();
        System.out.println("______________");

        c2.display();
    }
}