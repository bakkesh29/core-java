class SpaceShipRunner {
    public static void main(String... args) {

        SpaceShipStore store = new SpaceShipStore();

        SpaceShip shipA = new SpaceShip("Apollo", "Lunar", 25000, 3, false, "NASA", 5000, "Moon", 1000000, true);
        SpaceShip shipB = new SpaceShip("Falcon 9", "Rocket", 30000, 7, true, "SpaceX", 8000, "Orbit", 2000000, true);
        SpaceShip shipC = new SpaceShip("Gaganyaan", "Crew", 28000, 3, false, "ISRO", 6000, "Orbit", 1500000, true);
        SpaceShip shipD = new SpaceShip("Starship", "Heavy", 35000, 10, true, "SpaceX", 10000, "Mars", 5000000, true);
        SpaceShip shipE = new SpaceShip("Soyuz", "Crew", 27000, 3, false, "Roscosmos", 5500, "ISS", 1200000, true);

        SpaceShip shipF = new SpaceShip("Shenzhou", "Crew", 26000, 3, false, "CNSA", 5300, "ISS", 1100000, true);
        SpaceShip shipG = new SpaceShip("New Shepard", "Suborbital", 20000, 6, true, "BlueOrigin", 4000, "Space",
                900000, true);
        SpaceShip shipH = new SpaceShip("Dragon", "Cargo", 29000, 0, true, "SpaceX", 7000, "ISS", 1800000, false);
        SpaceShip shipI = new SpaceShip("Orion", "Crew", 31000, 4, false, "NASA", 7500, "Moon", 2200000, true);
        SpaceShip shipJ = new SpaceShip("Vostok", "Crew", 24000, 1, false, "USSR", 4800, "Orbit", 800000, true);

        SpaceShip shipK = new SpaceShip("Skylon", "Spaceplane", 33000, 5, true, "UK", 8500, "Orbit", 3000000, true);
        SpaceShip shipL = new SpaceShip("Dream Chaser", "Cargo", 28000, 2, true, "Sierra", 6200, "ISS", 1700000, false);
        SpaceShip shipM = new SpaceShip("H-II Transfer", "Cargo", 27000, 0, false, "JAXA", 6000, "ISS", 1400000, false);
        SpaceShip shipN = new SpaceShip("Tianzhou", "Cargo", 26000, 0, false, "China", 5900, "Station", 1300000, false);
        SpaceShip shipO = new SpaceShip("Progress", "Cargo", 25000, 0, false, "Russia", 5800, "ISS", 1200000, false);

        SpaceShip shipP = new SpaceShip("X-37B", "Spaceplane", 32000, 0, true, "USAF", 8000, "Orbit", 2500000, false);
        SpaceShip shipQ = new SpaceShip("Buran", "Shuttle", 30000, 6, true, "USSR", 9000, "Orbit", 4000000, true);
        SpaceShip shipR = new SpaceShip("Columbia", "Shuttle", 29000, 7, false, "NASA", 8500, "Orbit", 3500000, true);
        SpaceShip shipS = new SpaceShip("Challenger", "Shuttle", 29000, 7, false, "NASA", 8500, "Orbit", 3500000, true);
        SpaceShip shipT = new SpaceShip("Endeavour", "Shuttle", 29000, 7, false, "NASA", 8500, "Orbit", 3500000, true);

        // storing
        store.store(shipA);
        store.store(shipB);
        store.store(shipC);
        store.store(shipD);
        store.store(shipE);
        store.store(shipF);
        store.store(shipG);
        store.store(shipH);
        store.store(shipI);
        store.store(shipJ);
        store.store(shipK);
        store.store(shipL);
        store.store(shipM);
        store.store(shipN);
        store.store(shipO);
        store.store(shipP);
        store.store(shipQ);
        store.store(shipR);
        store.store(shipS);
        store.store(shipT);

        // updating
        store.update(shipA,
                new SpaceShip("Advanced Ship", "Explorer", 40000, 8, true, "ISRO", 12000, "Mars", 6000000, true));
        store.update(shipJ,
                new SpaceShip("Ultra Ship", "Deep Space", 45000, 5, true, "NASA", 15000, "Jupiter", 8000000, true));

        // display
        store.display();
    }
}