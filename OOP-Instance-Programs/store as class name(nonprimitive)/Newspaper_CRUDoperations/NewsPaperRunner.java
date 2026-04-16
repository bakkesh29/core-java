class NewsPaperRunner {

    public static void main(String[] args) {

        NewsPaperStore store = new NewsPaperStore();

        NewsPaper newsPaper1 = new NewsPaper(Lang.ENGLISH, "High", 5.0, 20, "Times", 30.5, 200, "Header1", "Footer1",
                12, 5, "Bakkesh", "Bangalore", InkColor.BLACK, 10);
        NewsPaper newsPaper2 = new NewsPaper(Lang.KANNADA, "Medium", 4.0, 18, "Vijaya Karnataka", 28.5, 180, "Header2",
                "Footer2", 11, 4, "Vijetha", "Mysore", InkColor.BLUE, 8);
        NewsPaper newsPaper3 = new NewsPaper(Lang.KANNADA, "High", 5.5, 22, "Prajavani", 30.0, 190, "Header3",
                "Footer3", 12, 6, "Lakshmi", "Bangalore", InkColor.BLACK, 11);
        NewsPaper newsPaper4 = new NewsPaper(Lang.ENGLISH, "High", 6.0, 25, "Herald", 31.0, 210, "Header4", "Footer4",
                13, 6, "Dhruva", "Mumbai", InkColor.BLACK, 12);
        NewsPaper newsPaper5 = new NewsPaper(Lang.KANNADA, "Medium", 4.5, 19, "Udayavani", 29.0, 170, "Header5",
                "Footer5", 11, 5, "Gagan", "Manipal", InkColor.BLUE, 9);
        NewsPaper newsPaper6 = new NewsPaper(Lang.KANNADA, "Low", 3.5, 16, "Kannada Prabha", 28.0, 160, "Header6",
                "Footer6", 10, 4, "Adinan", "Bangalore", InkColor.RED, 8);
        NewsPaper newsPaper7 = new NewsPaper(Lang.KANNADA, "High", 5.8, 23, "Samyukta Karnataka", 30.2, 195, "Header7",
                "Footer7", 12, 6, "Veersh", "Hubli", InkColor.BLACK, 12);
        NewsPaper newsPaper8 = new NewsPaper(Lang.ENGLISH, "Medium", 4.2, 17, "Deccan Herald", 27.5, 155, "Header8",
                "Footer8", 11, 4, "Mohith", "Bangalore", InkColor.BLUE, 7);
        NewsPaper newsPaper9 = new NewsPaper(Lang.KANNADA, "Low", 3.8, 14, "Vartha Bharati", 26.5, 140, "Header9",
                "Footer9", 10, 3, "Saniya", "Mangalore", InkColor.RED, 6);
        NewsPaper newsPaper10 = new NewsPaper(Lang.ENGLISH, "High", 6.2, 26, "Indian Express", 32.0, 220, "Header10",
                "Footer10", 14, 7, "Riya", "Delhi", InkColor.BLACK, 13);

        // saving
        System.out.println("\n--- SAVE OPERATION ---");

        store.save(newsPaper1);
        store.save(newsPaper2);
        store.save(newsPaper3);
        store.save(newsPaper4);
        store.save(newsPaper5);
        store.save(newsPaper6);
        store.save(newsPaper7);
        store.save(newsPaper8);
        store.save(newsPaper9);
        store.save(newsPaper10);

        store.displayAll();

        // finding
        System.out.println("\n--- FIND OPERATION ---");

        String run1 = store.findPaperQualityByName("Times");
        System.out.println("Paper Quality: " + run1);
        int run2 = store.findNoOfPagesByNameAndHeadEditor("Vijaya Karnataka", "Vijetha");
        System.out.println("Pages: " + run2);

        store.displayAll();

        // updating
        System.out.println("\n--- UPDATE OPERATION ---");
        store.updateLangByName("Times", Lang.KANNADA);
        store.updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(
                InkColor.GREEN, 10, 15, "Times", 30.5, 200);

        store.displayAll();

        // replacing it
        System.out.println("\n--- REPLACE OPERATION ---");
        NewsPaper replaceNewsPaper = new NewsPaper(Lang.KANNADA, "High", 6.0, 25, "Special Kannada", 31.0, 210,
                "HeaderX", "FooterX", 14, 6, "Shashikala", "Karnataka", InkColor.BLACK, 12);
        store.replaceByPrintHouseAddress("Delhi", replaceNewsPaper);
        store.displayAll();
    }
}