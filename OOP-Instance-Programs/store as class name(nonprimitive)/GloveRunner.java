class GloveRunner {
    public static void main(String... args) {

        GloveStore store = new GloveStore();

        Glove gloveA = new Glove("Leather", "Black", "M", true, 2, 500, "Puma", "Sports", 0.3, true);
        Glove gloveB = new Glove("Cotton", "White", "L", false, 5, 200, "Nike", "Medical", 0.2, false);
        Glove gloveC = new Glove("Rubber", "Blue", "S", true, 10, 150, "3M", "Cleaning", 0.1, false);
        Glove gloveD = new Glove("Wool", "Grey", "M", false, 3, 300, "Adidas", "Winter", 0.25, true);
        Glove gloveE = new Glove("Latex", "White", "S", true, 20, 100, "SafeTouch", "Medical", 0.1, false);

        Glove gloveF = new Glove("Leather", "Brown", "L", true, 2, 600, "Puma", "Bike", 0.35, true);
        Glove gloveG = new Glove("Cotton", "Blue", "M", false, 6, 220, "Nike", "Casual", 0.2, true);
        Glove gloveH = new Glove("Rubber", "Green", "S", true, 8, 140, "3M", "Cleaning", 0.12, false);
        Glove gloveI = new Glove("Wool", "Black", "L", false, 4, 320, "Adidas", "Winter", 0.3, true);
        Glove gloveJ = new Glove("Latex", "White", "M", true, 25, 110, "SafeTouch", "Medical", 0.1, false);

        Glove gloveK = new Glove("Leather", "Black", "S", true, 1, 450, "Puma", "Sports", 0.28, true);
        Glove gloveL = new Glove("Cotton", "White", "M", false, 5, 210, "Nike", "Medical", 0.22, false);
        Glove gloveM = new Glove("Rubber", "Yellow", "L", true, 9, 160, "3M", "Cleaning", 0.13, false);
        Glove gloveN = new Glove("Wool", "Grey", "S", false, 2, 290, "Adidas", "Winter", 0.27, true);
        Glove gloveO = new Glove("Latex", "White", "L", true, 30, 120, "SafeTouch", "Medical", 0.1, false);

        Glove gloveP = new Glove("Leather", "Brown", "M", true, 2, 550, "Puma", "Bike", 0.33, true);
        Glove gloveQ = new Glove("Cotton", "Blue", "S", false, 6, 230, "Nike", "Casual", 0.21, true);
        Glove gloveR = new Glove("Rubber", "Green", "M", true, 10, 150, "3M", "Cleaning", 0.14, false);
        Glove gloveS = new Glove("Wool", "Black", "L", false, 3, 310, "Adidas", "Winter", 0.29, true);
        Glove gloveT = new Glove("Latex", "White", "M", true, 28, 115, "SafeTouch", "Medical", 0.1, false);

        // storing
        store.store(gloveA);
        store.store(gloveB);
        store.store(gloveC);
        store.store(gloveD);
        store.store(gloveE);
        store.store(gloveF);
        store.store(gloveG);
        store.store(gloveH);
        store.store(gloveI);
        store.store(gloveJ);
        store.store(gloveK);
        store.store(gloveL);
        store.store(gloveM);
        store.store(gloveN);
        store.store(gloveO);
        store.store(gloveP);
        store.store(gloveQ);
        store.store(gloveR);
        store.store(gloveS);
        store.store(gloveT);

        // updating
        store.update(gloveA, new Glove("Kevlar", "Black", "M", true, 2, 1000, "Defense", "Military", 0.4, true));
        store.update(gloveJ, new Glove("Silicone", "Transparent", "M", true, 20, 300, "LabPro", "Medical", 0.12, true));

        // display
        store.display();
    }
}