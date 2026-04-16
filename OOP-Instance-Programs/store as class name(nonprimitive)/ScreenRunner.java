class ScreenRunner {
    public static void main(String... args) {

        ScreenStore store = new ScreenStore();

        Screen screenA = new Screen("Samsung", 24, "1080p", "LED", true, 60, 12000, "Black", "HDMI", false);
        Screen screenB = new Screen("LG", 27, "4K", "IPS", false, 144, 25000, "Black", "DisplayPort", true);
        Screen screenC = new Screen("Dell", 22, "1080p", "LCD", false, 75, 10000, "Grey", "VGA", false);
        Screen screenD = new Screen("Sony", 32, "4K", "OLED", true, 120, 40000, "Black", "HDMI", true);
        Screen screenE = new Screen("Acer", 21, "720p", "LED", false, 60, 8000, "White", "HDMI", false);

        Screen screenF = new Screen("HP", 23, "1080p", "IPS", false, 75, 11000, "Black", "HDMI", false);
        Screen screenG = new Screen("Lenovo", 27, "2K", "IPS", false, 144, 20000, "Grey", "DisplayPort", true);
        Screen screenH = new Screen("Asus", 24, "1080p", "LED", true, 165, 18000, "Black", "HDMI", false);
        Screen screenI = new Screen("BenQ", 25, "2K", "IPS", false, 144, 22000, "Black", "HDMI", false);
        Screen screenJ = new Screen("MSI", 27, "4K", "OLED", false, 240, 45000, "Black", "DisplayPort", true);

        Screen screenK = new Screen("ViewSonic", 24, "1080p", "LED", false, 75, 9000, "White", "VGA", false);
        Screen screenL = new Screen("Philips", 22, "1080p", "LCD", false, 60, 8500, "Black", "HDMI", false);
        Screen screenM = new Screen("TCL", 32, "4K", "LED", true, 120, 30000, "Black", "HDMI", true);
        Screen screenN = new Screen("Mi", 27, "2K", "IPS", false, 165, 21000, "Black", "DisplayPort", false);
        Screen screenO = new Screen("Realme", 24, "1080p", "LED", false, 75, 10000, "Grey", "HDMI", false);

        Screen screenP = new Screen("OnePlus", 27, "4K", "OLED", true, 120, 35000, "Black", "HDMI", true);
        Screen screenQ = new Screen("Boat", 21, "720p", "LED", false, 60, 7000, "White", "HDMI", false);
        Screen screenR = new Screen("Zebronics", 24, "1080p", "LED", false, 75, 9500, "Black", "HDMI", false);
        Screen screenS = new Screen("Gigabyte", 27, "2K", "IPS", false, 165, 23000, "Black", "DisplayPort", true);
        Screen screenT = new Screen("Alienware", 34, "4K", "OLED", true, 240, 80000, "Black", "HDMI", true);

        // storing
        store.store(screenA);
        store.store(screenB);
        store.store(screenC);
        store.store(screenD);
        store.store(screenE);
        store.store(screenF);
        store.store(screenG);
        store.store(screenH);
        store.store(screenI);
        store.store(screenJ);
        store.store(screenK);
        store.store(screenL);
        store.store(screenM);
        store.store(screenN);
        store.store(screenO);
        store.store(screenP);
        store.store(screenQ);
        store.store(screenR);
        store.store(screenS);
        store.store(screenT);

        // updating
        store.update(screenA, new Screen("UpdatedBrand", 30, "4K", "OLED", true, 144, 50000, "Black", "HDMI", true));
        store.update(screenJ, new Screen("UltraBrand", 32, "8K", "OLED", true, 240, 90000, "Black", "HDMI", true));

        // display
        store.display();
    }
}