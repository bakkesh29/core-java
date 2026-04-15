class WaterMelonRunner {
    public static void main(String... args) {

        WaterMelonStore store = new WaterMelonStore();

        WaterMelon waterMelonA = new WaterMelon("Green", 5.5, "Round", true, 0, 120.0, "Sweet", "India", 30.5, true);
        WaterMelon waterMelonB = new WaterMelon("Dark Green", 6.2, "Oval", false, 120, 150.0, "Very Sweet", "India",
                32.0, true);
        WaterMelon waterMelonC = new WaterMelon("Light Green", 4.8, "Round", true, 0, 100.0, "Sweet", "Brazil", 28.5,
                true);
        WaterMelon waterMelonD = new WaterMelon("Green Striped", 7.0, "Oval", false, 200, 180.0, "Juicy", "USA", 35.0,
                true);
        WaterMelon waterMelonE = new WaterMelon("Yellow Green", 5.0, "Round", true, 0, 110.0, "Mild Sweet", "India",
                29.0, false);

        WaterMelon waterMelonF = new WaterMelon("Dark Green", 6.8, "Oval", false, 150, 170.0, "Sweet", "Mexico", 34.0,
                true);
        WaterMelon waterMelonG = new WaterMelon("Light Green", 3.9, "Round", true, 0, 90.0, "Less Sweet", "India", 25.0,
                false);
        WaterMelon waterMelonH = new WaterMelon("Green", 5.7, "Oval", false, 180, 140.0, "Juicy", "Spain", 31.0, true);
        WaterMelon waterMelonI = new WaterMelon("Striped Green", 6.5, "Round", true, 0, 160.0, "Very Sweet",
                "Australia", 33.0, true);
        WaterMelon waterMelonJ = new WaterMelon("Dark Green", 7.2, "Oval", false, 220, 200.0, "Sweet", "USA", 36.0,
                true);

        WaterMelon waterMelonK = new WaterMelon("Light Green", 4.5, "Round", true, 0, 95.0, "Sweet", "India", 27.5,
                false);
        WaterMelon waterMelonL = new WaterMelon("Green", 5.9, "Oval", false, 140, 130.0, "Juicy", "Brazil", 30.0, true);
        WaterMelon waterMelonM = new WaterMelon("Striped Green", 6.1, "Round", true, 0, 155.0, "Very Sweet", "Mexico",
                32.5, true);
        WaterMelon waterMelonN = new WaterMelon("Dark Green", 7.5, "Oval", false, 250, 210.0, "Sweet", "Spain", 37.0,
                true);
        WaterMelon waterMelonO = new WaterMelon("Light Green", 3.5, "Round", true, 0, 85.0, "Less Sweet", "India", 24.0,
                false);

        WaterMelon waterMelonP = new WaterMelon("Green", 5.2, "Oval", false, 160, 125.0, "Juicy", "Australia", 29.5,
                true);
        WaterMelon waterMelonQ = new WaterMelon("Striped Green", 6.7, "Round", true, 0, 165.0, "Very Sweet", "USA",
                34.0, true);
        WaterMelon waterMelonR = new WaterMelon("Dark Green", 7.8, "Oval", false, 300, 220.0, "Sweet", "Mexico", 38.0,
                true);
        WaterMelon waterMelonS = new WaterMelon("Light Green", 4.2, "Round", true, 0, 92.0, "Sweet", "India", 26.5,
                false);
        WaterMelon waterMelonT = new WaterMelon("Green", 5.8, "Oval", false, 170, 135.0, "Juicy", "Brazil", 31.5, true);

        //storing
        store.store(waterMelonA);
        store.store(waterMelonB);
        store.store(waterMelonC);
        store.store(waterMelonD);
        store.store(waterMelonE);
        store.store(waterMelonF);
        store.store(waterMelonG);
        store.store(waterMelonH);
        store.store(waterMelonI);
        store.store(waterMelonJ);
        store.store(waterMelonK);
        store.store(waterMelonL);
        store.store(waterMelonM);
        store.store(waterMelonN);
        store.store(waterMelonO);
        store.store(waterMelonP);
        store.store(waterMelonQ);
        store.store(waterMelonR);
        store.store(waterMelonS);
        store.store(waterMelonT);

        //upadting
        store.update(waterMelonA, new WaterMelon("Black", 6.0, "Square", true, 0, 200.0, "Sweet", "India", 31.0, true));
        store.update(waterMelonJ,new WaterMelon("Purple", 6.0, "Square", true, 0, 204.0, "Sweet", "India", 31.0, true));

        //display
        store.display();
    }
}