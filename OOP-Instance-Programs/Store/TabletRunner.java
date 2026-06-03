class TabletRunner {
    public static void main(String[] args) {

        Tablet tablet = new Tablet();

        tablet.saveTablet("Paracetamol");
        tablet.saveTablet("Dolo");
        tablet.saveTablet("Aspirin");
        tablet.saveTablet("Crocin");
        tablet.saveTablet("Ibuprofen");

        tablet.search("Dolo");
        tablet.search("VitaminC");
    }
}