class TissueRunner {
    public static void main(String... args) {

        TissueStore store = new TissueStore();

        Tissue tissueA = new Tissue("Origami", 2, "Facial", false, 100, 150, "White", "Paper", true, "Box");
        Tissue tissueB = new Tissue("Premier", 3, "Toilet", true, 200, 250, "White", "Recycled", true, "Roll");
        Tissue tissueC = new Tissue("Softy", 2, "Facial", true, 120, 180, "White", "Premium", true, "Box");
        Tissue tissueD = new Tissue("Bella", 3, "Napkin", false, 150, 200, "White", "Paper", true, "Pack");
        Tissue tissueE = new Tissue("CleanX", 4, "Facial", true, 180, 300, "White", "Premium", true, "Box");

        Tissue tissueF = new Tissue("EcoSoft", 2, "Toilet", false, 100, 140, "White", "Recycled", true, "Roll");
        Tissue tissueG = new Tissue("GreenLeaf", 3, "Facial", true, 130, 210, "White", "Eco", true, "Box");
        Tissue tissueH = new Tissue("UltraSoft", 4, "Napkin", true, 200, 350, "White", "Premium", true, "Pack");
        Tissue tissueI = new Tissue("Fresh", 2, "Facial", false, 110, 160, "White", "Paper", true, "Box");
        Tissue tissueJ = new Tissue("Royal", 3, "Toilet", true, 220, 270, "White", "Premium", true, "Roll");

        Tissue tissueK = new Tissue("SoftCare", 2, "Facial", false, 100, 150, "White", "Paper", true, "Box");
        Tissue tissueL = new Tissue("Pure", 3, "Napkin", true, 140, 190, "White", "Eco", true, "Pack");
        Tissue tissueM = new Tissue("MaxSoft", 4, "Facial", true, 200, 320, "White", "Premium", true, "Box");
        Tissue tissueN = new Tissue("EcoPlus", 2, "Toilet", false, 120, 170, "White", "Recycled", true, "Roll");
        Tissue tissueO = new Tissue("Velvet", 3, "Facial", true, 150, 230, "White", "Premium", true, "Box");

        Tissue tissueP = new Tissue("Comfort", 2, "Napkin", false, 100, 140, "White", "Paper", true, "Pack");
        Tissue tissueQ = new Tissue("Elite", 4, "Facial", true, 210, 360, "White", "Premium", true, "Box");
        Tissue tissueR = new Tissue("NatureSoft", 3, "Toilet", false, 180, 260, "White", "Eco", true, "Roll");
        Tissue tissueS = new Tissue("Silky", 2, "Facial", true, 130, 200, "White", "Premium", true, "Box");
        Tissue tissueT = new Tissue("UltraCare", 4, "Napkin", true, 220, 380, "White", "Premium", true, "Pack");

        // storing
        store.store(tissueA);
        store.store(tissueB);
        store.store(tissueC);
        store.store(tissueD);
        store.store(tissueE);
        store.store(tissueF);
        store.store(tissueG);
        store.store(tissueH);
        store.store(tissueI);
        store.store(tissueJ);
        store.store(tissueK);
        store.store(tissueL);
        store.store(tissueM);
        store.store(tissueN);
        store.store(tissueO);
        store.store(tissueP);
        store.store(tissueQ);
        store.store(tissueR);
        store.store(tissueS);
        store.store(tissueT);

        // updating
        store.update(tissueA, new Tissue("Updated", 3, "Facial", true, 150, 250, "White", "Premium", true, "Box"));
        store.update(tissueJ, new Tissue("Ultra", 4, "Toilet", true, 300, 400, "White", "Premium", true, "Roll"));

        // display
        store.display();
    }
}