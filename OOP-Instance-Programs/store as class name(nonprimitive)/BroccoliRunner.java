class BroccoliRunner {
    public static void main(String... args) {

        BroccoliStore store = new BroccoliStore();

        Broccoli broccoliA = new Broccoli("Green", 1.2, "Fresh", true, 10, 80, "Mild", "India", 5.5, true);
        Broccoli broccoliB = new Broccoli("Dark Green", 1.5, "Organic", true, 12, 100, "Sweet", "India", 6.0, true);
        Broccoli broccoliC = new Broccoli("Light Green", 1.0, "Frozen", false, 8, 60, "Normal", "USA", 4.5, false);
        Broccoli broccoliD = new Broccoli("Green", 2.0, "Fresh", true, 15, 120, "Mild", "UK", 7.0, true);
        Broccoli broccoliE = new Broccoli("Dark Green", 1.8, "Organic", true, 14, 110, "Sweet", "India", 6.5, true);

        Broccoli broccoliF = new Broccoli("Green", 1.3, "Fresh", false, 9, 70, "Normal", "India", 5.2, true);
        Broccoli broccoliG = new Broccoli("Light Green", 1.1, "Frozen", false, 7, 55, "Bland", "USA", 4.8, false);
        Broccoli broccoliH = new Broccoli("Dark Green", 2.1, "Organic", true, 16, 130, "Sweet", "UK", 7.2, true);
        Broccoli broccoliI = new Broccoli("Green", 1.4, "Fresh", true, 11, 85, "Mild", "India", 5.8, true);
        Broccoli broccoliJ = new Broccoli("Dark Green", 1.9, "Organic", true, 13, 115, "Sweet", "India", 6.7, true);

        Broccoli broccoliK = new Broccoli("Green", 1.0, "Fresh", false, 8, 65, "Normal", "India", 4.9, true);
        Broccoli broccoliL = new Broccoli("Light Green", 1.2, "Frozen", false, 9, 60, "Bland", "USA", 5.0, false);
        Broccoli broccoliM = new Broccoli("Dark Green", 2.2, "Organic", true, 17, 135, "Sweet", "UK", 7.5, true);
        Broccoli broccoliN = new Broccoli("Green", 1.6, "Fresh", true, 12, 90, "Mild", "India", 6.2, true);
        Broccoli broccoliO = new Broccoli("Dark Green", 2.0, "Organic", true, 15, 125, "Sweet", "India", 7.0, true);

        Broccoli broccoliP = new Broccoli("Green", 1.3, "Fresh", false, 10, 75, "Normal", "India", 5.3, true);
        Broccoli broccoliQ = new Broccoli("Light Green", 1.1, "Frozen", false, 8, 58, "Bland", "USA", 4.7, false);
        Broccoli broccoliR = new Broccoli("Dark Green", 2.3, "Organic", true, 18, 140, "Sweet", "UK", 7.8, true);
        Broccoli broccoliS = new Broccoli("Green", 1.5, "Fresh", true, 11, 88, "Mild", "India", 5.9, true);
        Broccoli broccoliT = new Broccoli("Dark Green", 2.1, "Organic", true, 16, 130, "Sweet", "India", 7.3, true);

        // storing
        store.store(broccoliA);
        store.store(broccoliB);
        store.store(broccoliC);
        store.store(broccoliD);
        store.store(broccoliE);
        store.store(broccoliF);
        store.store(broccoliG);
        store.store(broccoliH);
        store.store(broccoliI);
        store.store(broccoliJ);
        store.store(broccoliK);
        store.store(broccoliL);
        store.store(broccoliM);
        store.store(broccoliN);
        store.store(broccoliO);
        store.store(broccoliP);
        store.store(broccoliQ);
        store.store(broccoliR);
        store.store(broccoliS);
        store.store(broccoliT);

        // updating
        store.update(broccoliA, new Broccoli("Purple", 1.5, "Exotic", true, 12, 150, "Sweet", "Italy", 6.5, true));
        store.update(broccoliJ, new Broccoli("Yellow", 1.4, "Rare", true, 10, 140, "Mild", "France", 6.0, true));

        // display
        store.display();
    }
}