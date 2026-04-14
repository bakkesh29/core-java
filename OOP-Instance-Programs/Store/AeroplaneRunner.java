class AeroplaneRunner {
    public static void main(String[] args) {

        Aeroplane aeroplane = new Aeroplane();

        aeroplane.saveFlight("Indigo");
        aeroplane.saveFlight("Air India");
        aeroplane.saveFlight("SpiceJet");
        aeroplane.saveFlight("Vistara");
        aeroplane.saveFlight("Emirates");

        aeroplane.search("Vistara");
        aeroplane.search("Qatar");
    }
}