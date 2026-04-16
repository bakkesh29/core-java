class NewsPaperRunner {

    public static void main(String... values) {

        NewsPaperStore store = new NewsPaperStore();

        NewsPaper newsPaper1 = new NewsPaper(Lang.KANNADA,"Prajavani",10,24,"Shanth Kumar",30.0,200,"Bangalore","Daily",5,12,"Editor Address","Press House",InkColor.BLACK,100);
        NewsPaper newsPaper2 = new NewsPaper(Lang.KANNADA,"Vijaya Karnataka",8,20,"Sudarshan",29.5,190,"Bangalore","Daily",4,11,"Editor Address","Press House",InkColor.BLUE,90);
        NewsPaper newsPaper3 = new NewsPaper(Lang.KANNADA,"Udayavani",7,22,"Ravishankar",28.0,180,"Manipal","Daily",3,11,"Editor Address","Press House",InkColor.BLACK,85);
        NewsPaper newsPaper4 = new NewsPaper(Lang.KANNADA,"Kannada Prabha",9,26,"Ravi Hegde",30.2,210,"Bangalore","Daily",6,13,"Editor Address","Press House",InkColor.RED,110);

        // SAVE
        store.save(newsPaper1);
        store.displayAll();

        store.save(newsPaper2);
        store.displayAll();

        store.save(newsPaper3);
        store.displayAll();

        store.save(newsPaper4);
        store.displayAll();

        // FIND
        System.out.println("\nFind Operation:");
        store.findByName("Prajavani");
        store.displayAll();

        // UPDATE
        System.out.println("\nUpdate Operation:");
        store.updateLangByName("Prajavani", Lang.ENGLISH);
        store.displayAll();

        // REPLACE
        System.out.println("\nReplace Operation:");
        NewsPaper replacePaper = new NewsPaper(Lang.KANNADA,"Special Edition",12,30,"Editor X",31.0,220,"Bangalore","Weekly",7,14,"Editor Address","Press House",InkColor.GREEN,120);
        store.replaceByPrintHouseAddress("Manipal", replacePaper);
        store.displayAll();
    }
}