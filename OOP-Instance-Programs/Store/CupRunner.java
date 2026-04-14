class CupRunner {
    public static void main(String[] args) {

        Cup cup = new Cup();

        cup.saveCup("Milton");
        cup.saveCup("Cello");
        cup.saveCup("Prestige");
        cup.saveCup("Pigeon");
        cup.saveCup("Tupperware");

        cup.search("Cello");
        cup.search("Nike");
    }
}