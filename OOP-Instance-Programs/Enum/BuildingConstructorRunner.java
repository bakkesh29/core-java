class BuildingConstructorRunner {

    public static void main(String... values) {

        // Creating 1 Monitor 
        Monitor monitor1 = new Monitor("Dell", 27);

        // Creating 1 Building
        BuildingConstructor building1 = new BuildingConstructor("Shreya","Vijetha",50,monitor1,Type.INDUSTRIAL);

        // Invoking show method
        building1.show();

        System.out.println("---");

        // Creating 2 Monitor 
        Monitor monitor2 = new Monitor("HP", 24);

        // Creating 2 Building
        BuildingConstructor building2 = new BuildingConstructor("Jai","Bakkesh",80,monitor2,Type.COMMERCIAL);

        //Invoking
        building2.show();
    }
}