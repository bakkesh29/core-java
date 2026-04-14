class SolarSystemRunner {
    public static void main(String[] args) {

        SolarSystem solarsystem = new SolarSystem();

        solarsystem.savePlanet("Earth");
        solarsystem.savePlanet("Mars");
        solarsystem.savePlanet("Jupiter");
        solarsystem.savePlanet("Venus");
        solarsystem.savePlanet("Saturn");

        solarsystem.search("Mars");
        solarsystem.search("Pluto");
    }
}