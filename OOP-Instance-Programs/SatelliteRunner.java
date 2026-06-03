class SatelliteRunner {
    public static void main(String[] args) {

        Satellite mainSatellite = new Satellite();

        System.out.println("\n--- Before Reassigning ---\n");
        System.out.println("Name      : " + mainSatellite.name);
        System.out.println("Purpose   : " + mainSatellite.purpose);
        System.out.println("Orbit     : " + mainSatellite.orbitHeight);
        System.out.println("Active    : " + mainSatellite.isActive);
        System.out.println("Weight    : " + mainSatellite.weight);

        // Reassign
        mainSatellite.name = "GSAT";
        mainSatellite.purpose = "Navigation";
        mainSatellite.orbitHeight = 20000;
        mainSatellite.isActive = true;
        mainSatellite.weight = 1500;

        System.out.println("\n--- After Reassigning ---\n");
        System.out.println("Name      : " + mainSatellite.name);
        System.out.println("Purpose   : " + mainSatellite.purpose);

        // 10 objects
        Satellite isroSat = new Satellite();
        Satellite nasaSat = new Satellite();
        Satellite spacexSat = new Satellite();
        Satellite weatherSat = new Satellite();
        Satellite militarySat = new Satellite();
        Satellite gpsSat = new Satellite();
        Satellite researchSat = new Satellite();
        Satellite communicationSat = new Satellite();
        Satellite earthObsSat = new Satellite();
        Satellite deepSpaceSat = new Satellite();

        System.out.println("\n--- Default Values ---\n");
        System.out.println("ISRO Sat Agency: " + isroSat.agency);
        System.out.println("NASA Sat Agency: " + nasaSat.agency);

        // Assign values (example few)
        isroSat.agency = "ISRO";
        isroSat.country = "India";
        isroSat.missionType = "Communication";
        nasaSat.agency = "NASA";
        nasaSat.country = "USA";
        nasaSat.missionType = "Research";

        System.out.println("\n--- After Assigning ---\n");

        // Example print
        System.out.println("ISRO Satellite:");
        System.out.println("Agency   : " + isroSat.agency);
        System.out.println("Country  : " + isroSat.country);
        System.out.println("Mission  : " + isroSat.missionType);
        System.out.println("-----------------------");

        // NASA Satellite
        System.out.println("NASA Satellite:");
        System.out.println("Agency        : " + nasaSat.agency);
        System.out.println("Launch Vehicle: " + nasaSat.launchVehicle);
        System.out.println("Orbit Type    : " + nasaSat.orbitType);
        System.out.println("Country       : " + nasaSat.country);
        System.out.println("Lifespan      : " + nasaSat.lifespan);
        System.out.println("Frequency     : " + nasaSat.frequencyBand);
        System.out.println("Solar Panels  : " + nasaSat.hasSolarPanels);
        System.out.println("Launch Date   : " + nasaSat.launchDate);
        System.out.println("Control       : " + nasaSat.controlStation);
        System.out.println("Mission       : " + nasaSat.missionType);
        System.out.println("-----------------------------");

        // SpaceX Satellite
        System.out.println("SpaceX Satellite:");
        System.out.println("Agency        : " + spacexSat.agency);
        System.out.println("Launch Vehicle: " + spacexSat.launchVehicle);
        System.out.println("Orbit Type    : " + spacexSat.orbitType);
        System.out.println("Country       : " + spacexSat.country);
        System.out.println("Lifespan      : " + spacexSat.lifespan);
        System.out.println("Frequency     : " + spacexSat.frequencyBand);
        System.out.println("Solar Panels  : " + spacexSat.hasSolarPanels);
        System.out.println("Launch Date   : " + spacexSat.launchDate);
        System.out.println("Control       : " + spacexSat.controlStation);
        System.out.println("Mission       : " + spacexSat.missionType);
        System.out.println("-----------------------------");

        // Weather Satellite
        System.out.println("Weather Satellite:");
        System.out.println("Agency        : " + weatherSat.agency);
        System.out.println("Launch Vehicle: " + weatherSat.launchVehicle);
        System.out.println("Orbit Type    : " + weatherSat.orbitType);
        System.out.println("Country       : " + weatherSat.country);
        System.out.println("Lifespan      : " + weatherSat.lifespan);
        System.out.println("Frequency     : " + weatherSat.frequencyBand);
        System.out.println("Solar Panels  : " + weatherSat.hasSolarPanels);
        System.out.println("Launch Date   : " + weatherSat.launchDate);
        System.out.println("Control       : " + weatherSat.controlStation);
        System.out.println("Mission       : " + weatherSat.missionType);
        System.out.println("-----------------------------");

        // Military Satellite
        System.out.println("Military Satellite:");
        System.out.println("Agency        : " + militarySat.agency);
        System.out.println("Launch Vehicle: " + militarySat.launchVehicle);
        System.out.println("Orbit Type    : " + militarySat.orbitType);
        System.out.println("Country       : " + militarySat.country);
        System.out.println("Lifespan      : " + militarySat.lifespan);
        System.out.println("Frequency     : " + militarySat.frequencyBand);
        System.out.println("Solar Panels  : " + militarySat.hasSolarPanels);
        System.out.println("Launch Date   : " + militarySat.launchDate);
        System.out.println("Control       : " + militarySat.controlStation);
        System.out.println("Mission       : " + militarySat.missionType);
        System.out.println("-----------------------------");

        // GPS Satellite
        System.out.println("GPS Satellite:");
        System.out.println("Agency        : " + gpsSat.agency);
        System.out.println("Launch Vehicle: " + gpsSat.launchVehicle);
        System.out.println("Orbit Type    : " + gpsSat.orbitType);
        System.out.println("Country       : " + gpsSat.country);
        System.out.println("Lifespan      : " + gpsSat.lifespan);
        System.out.println("Frequency     : " + gpsSat.frequencyBand);
        System.out.println("Solar Panels  : " + gpsSat.hasSolarPanels);
        System.out.println("Launch Date   : " + gpsSat.launchDate);
        System.out.println("Control       : " + gpsSat.controlStation);
        System.out.println("Mission       : " + gpsSat.missionType);
        System.out.println("-----------------------------");

        // Research Satellite
        System.out.println("Research Satellite:");
        System.out.println("Agency        : " + researchSat.agency);
        System.out.println("Launch Vehicle: " + researchSat.launchVehicle);
        System.out.println("Orbit Type    : " + researchSat.orbitType);
        System.out.println("Country       : " + researchSat.country);
        System.out.println("Lifespan      : " + researchSat.lifespan);
        System.out.println("Frequency     : " + researchSat.frequencyBand);
        System.out.println("Solar Panels  : " + researchSat.hasSolarPanels);
        System.out.println("Launch Date   : " + researchSat.launchDate);
        System.out.println("Control       : " + researchSat.controlStation);
        System.out.println("Mission       : " + researchSat.missionType);
        System.out.println("-----------------------------");

        // Communication Satellite
        System.out.println("Communication Satellite:");
        System.out.println("Agency        : " + communicationSat.agency);
        System.out.println("Launch Vehicle: " + communicationSat.launchVehicle);
        System.out.println("Orbit Type    : " + communicationSat.orbitType);
        System.out.println("Country       : " + communicationSat.country);
        System.out.println("Lifespan      : " + communicationSat.lifespan);
        System.out.println("Frequency     : " + communicationSat.frequencyBand);
        System.out.println("Solar Panels  : " + communicationSat.hasSolarPanels);
        System.out.println("Launch Date   : " + communicationSat.launchDate);
        System.out.println("Control       : " + communicationSat.controlStation);
        System.out.println("Mission       : " + communicationSat.missionType);
        System.out.println("-----------------------------");

        // Earth Observation Satellite
        System.out.println("Earth Observation Satellite:");
        System.out.println("Agency        : " + earthObsSat.agency);
        System.out.println("Launch Vehicle: " + earthObsSat.launchVehicle);
        System.out.println("Orbit Type    : " + earthObsSat.orbitType);
        System.out.println("Country       : " + earthObsSat.country);
        System.out.println("Lifespan      : " + earthObsSat.lifespan);
        System.out.println("Frequency     : " + earthObsSat.frequencyBand);
        System.out.println("Solar Panels  : " + earthObsSat.hasSolarPanels);
        System.out.println("Launch Date   : " + earthObsSat.launchDate);
        System.out.println("Control       : " + earthObsSat.controlStation);
        System.out.println("Mission       : " + earthObsSat.missionType);
        System.out.println("-----------------------------");

        // Deep Space Satellite
        System.out.println("Deep Space Satellite:");
        System.out.println("Agency        : " + deepSpaceSat.agency);
        System.out.println("Launch Vehicle: " + deepSpaceSat.launchVehicle);
        System.out.println("Orbit Type    : " + deepSpaceSat.orbitType);
        System.out.println("Country       : " + deepSpaceSat.country);
        System.out.println("Lifespan      : " + deepSpaceSat.lifespan);
        System.out.println("Frequency     : " + deepSpaceSat.frequencyBand);
        System.out.println("Solar Panels  : " + deepSpaceSat.hasSolarPanels);
        System.out.println("Launch Date   : " + deepSpaceSat.launchDate);
        System.out.println("Control       : " + deepSpaceSat.controlStation);
        System.out.println("Mission       : " + deepSpaceSat.missionType);
        System.out.println("-----------------------------");
    }
}