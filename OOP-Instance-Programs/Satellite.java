class Satellite {

    // 5 instance variables (literals)
    String name = "INSAT";
    String purpose = "Communication";
    int orbitHeight = 36000;
    boolean isActive = true;
    double weight = 2000.5;

    // 10 instance variables (reference)
    String agency;
    String launchVehicle;
    String orbitType;
    String country;
    int lifespan;
    String frequencyBand;
    boolean hasSolarPanels;
    String launchDate;
    String controlStation;
    String missionType;

    Satellite() {
        System.out.println("Satellite created");
    }
}