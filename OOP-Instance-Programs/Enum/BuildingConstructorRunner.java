class BuildingConstructorRunner {

    public static void main(String... values) {

        // Creating first Monitor 
        Monitor monitor1 = new Monitor("Dell", 27);

        // Creating first BuildingConstructor 
        BuildingConstructor building1 = new BuildingConstructor(
                "Shreya",
                "Vijetha",
                50,
                monitor1,
                Type.INDUSTRIAL
        );

        // Invoking show method
        building1.show();

        System.out.println("----------------------");

        // Creating second Monitor 
        Monitor monitor2 = new Monitor("HP", 24);

        // Creating second BuildingConstructor
        BuildingConstructor building2 = new BuildingConstructor(
                "Jai",
                "Bakkesh",
                80,
                monitor2,
                Type.COMMERCIAL
        );

        //Invoking
        building2.show();
    }
}