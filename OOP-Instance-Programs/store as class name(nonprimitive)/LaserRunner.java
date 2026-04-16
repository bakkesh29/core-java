class LaserRunner {
    public static void main(String... args) {

        LaserStore store = new LaserStore();

        Laser laserA = new Laser("Diode", 650, "Red", true, 5, "Pointer", "Sony", "Japan", 500, true);
        Laser laserB = new Laser("Fiber", 1550, "Infrared", false, 10, "Cutting", "Bosch", "Germany", 20000, false);
        Laser laserC = new Laser("Gas", 10600, "Invisible", false, 15, "Medical", "Philips", "USA", 30000, false);
        Laser laserD = new Laser("Solid", 532, "Green", true, 8, "Research", "LG", "Korea", 8000, true);
        Laser laserE = new Laser("Diode", 450, "Blue", true, 6, "Display", "Samsung", "India", 7000, true);

        Laser laserF = new Laser("Fiber", 1550, "Infrared", false, 12, "Industrial", "Siemens", "Germany", 25000,
                false);
        Laser laserG = new Laser("Gas", 9800, "Invisible", false, 14, "Surgery", "MedTech", "USA", 35000, false);
        Laser laserH = new Laser("Solid", 520, "Green", true, 7, "Lab", "Panasonic", "Japan", 9000, true);
        Laser laserI = new Laser("Diode", 405, "Violet", true, 4, "Blu-ray", "Sony", "Japan", 6000, true);
        Laser laserJ = new Laser("Fiber", 1600, "Infrared", false, 11, "Cutting", "Bosch", "Germany", 21000, false);

        Laser laserK = new Laser("Gas", 10800, "Invisible", false, 16, "Medical", "GE", "USA", 32000, false);
        Laser laserL = new Laser("Solid", 540, "Green", true, 9, "Research", "Hitachi", "Japan", 8500, true);
        Laser laserM = new Laser("Diode", 660, "Red", true, 5, "Pointer", "Mi", "India", 550, true);
        Laser laserN = new Laser("Fiber", 1500, "Infrared", false, 13, "Industrial", "ABB", "Sweden", 27000, false);
        Laser laserO = new Laser("Gas", 10000, "Invisible", false, 17, "Surgery", "MedPlus", "UK", 36000, false);

        Laser laserP = new Laser("Solid", 510, "Green", true, 8, "Lab", "Sharp", "Japan", 8700, true);
        Laser laserQ = new Laser("Diode", 470, "Blue", true, 6, "Display", "Realme", "India", 7200, true);
        Laser laserR = new Laser("Fiber", 1580, "Infrared", false, 12, "Cutting", "Siemens", "Germany", 26000, false);
        Laser laserS = new Laser("Gas", 10200, "Invisible", false, 18, "Medical", "Philips", "USA", 37000, false);
        Laser laserT = new Laser("Solid", 550, "Green", true, 10, "Research", "LG", "Korea", 9500, true);

        // storing
        store.store(laserA);
        store.store(laserB);
        store.store(laserC);
        store.store(laserD);
        store.store(laserE);
        store.store(laserF);
        store.store(laserG);
        store.store(laserH);
        store.store(laserI);
        store.store(laserJ);
        store.store(laserK);
        store.store(laserL);
        store.store(laserM);
        store.store(laserN);
        store.store(laserO);
        store.store(laserP);
        store.store(laserQ);
        store.store(laserR);
        store.store(laserS);
        store.store(laserT);

        // updating
        store.update(laserA, new Laser("Advanced", 700, "Red", true, 20, "Defense", "DRDO", "India", 50000, false));
        store.update(laserJ,
                new Laser("Ultra", 1700, "Infrared", false, 25, "Military", "ISRO", "India", 60000, false));

        // display
        store.display();
    }
}