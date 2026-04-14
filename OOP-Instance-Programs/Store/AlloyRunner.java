class AlloyRunner {
    public static void main(String[] args) {

        Alloy alloy = new Alloy();

        alloy.saveAlloy("Steel");
        alloy.saveAlloy("Bronze");
        alloy.saveAlloy("Brass");
        alloy.saveAlloy("Stainless Steel");
        alloy.saveAlloy("Titanium");

        alloy.search("Steel");
        alloy.search("Plastic");
    }
}