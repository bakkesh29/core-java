class XboxRunner {
    public static void main(String[] args) {

        // Meaningful reference variable
        Xbox mainXbox = new Xbox();

        System.out.println("\n--- Before Reassigning ---\n");

        System.out.println("Model      : " + mainXbox.model);
        System.out.println("Brand      : " + mainXbox.brand);
        System.out.println("Storage    : " + mainXbox.storage);
        System.out.println("Next Gen   : " + mainXbox.isNextGen);
        System.out.println("Price      : " + mainXbox.price);

        // Reassigning
        mainXbox.model = "Xbox Series S";
        mainXbox.brand = "Microsoft";
        mainXbox.storage = 512;
        mainXbox.isNextGen = true;
        mainXbox.price = 34999;

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Model      : " + mainXbox.model);
        System.out.println("Brand      : " + mainXbox.brand);
        System.out.println("Storage    : " + mainXbox.storage);
        System.out.println("Next Gen   : " + mainXbox.isNextGen);
        System.out.println("Price      : " + mainXbox.price);

        // Creating 10 UNIQUE objects
        Xbox philSpencerXbox = new Xbox();
        Xbox lindaSpencerXbox = new Xbox();
        Xbox spencerFamilyXbox = new Xbox();
        Xbox xboxLegacyConsole = new Xbox();
        Xbox greenTeamXbox = new Xbox();
        Xbox haloEditionXbox = new Xbox();
        Xbox forzaEditionXbox = new Xbox();
        Xbox eliteSeriesXbox = new Xbox();
        Xbox nextGenFutureXbox = new Xbox();
        Xbox xboxStudioEdition = new Xbox();

        System.out.println("\n--- Default Values ---\n");

        System.out.println("Phil Spencer Xbox Creator: " + philSpencerXbox.creatorName);
        System.out.println("Linda Spencer Xbox Creator: " + lindaSpencerXbox.creatorName);
        System.out.println("Family Xbox Creator: " + spencerFamilyXbox.creatorName);
        System.out.println("Legacy Xbox Creator: " + xboxLegacyConsole.creatorName);
        System.out.println("Green Team Xbox Creator: " + greenTeamXbox.creatorName);
        System.out.println("Halo Xbox Creator: " + haloEditionXbox.creatorName);
        System.out.println("Forza Xbox Creator: " + forzaEditionXbox.creatorName);
        System.out.println("Elite Xbox Creator: " + eliteSeriesXbox.creatorName);
        System.out.println("Future Xbox Creator: " + nextGenFutureXbox.creatorName);
        System.out.println("Studio Xbox Creator: " + xboxStudioEdition.creatorName);

        // Assigning values

        philSpencerXbox.creatorName = "Phil Spencer";
        philSpencerXbox.familyName = "Spencer";
        philSpencerXbox.edition = "Pro";
        philSpencerXbox.color = "Black";
        philSpencerXbox.controllerType = "Wireless";
        philSpencerXbox.warranty = 2;
        philSpencerXbox.hasGamePass = true;
        philSpencerXbox.resolution = "4K";
        philSpencerXbox.powerConsumption = 200;
        philSpencerXbox.coolingSystem = "Advanced Cooling";

        lindaSpencerXbox.creatorName = "Linda Spencer";
        lindaSpencerXbox.familyName = "Spencer";
        lindaSpencerXbox.edition = "Family";
        lindaSpencerXbox.color = "White";
        lindaSpencerXbox.controllerType = "Wireless";
        lindaSpencerXbox.warranty = 2;
        lindaSpencerXbox.hasGamePass = true;
        lindaSpencerXbox.resolution = "1080p";
        lindaSpencerXbox.powerConsumption = 150;
        lindaSpencerXbox.coolingSystem = "Standard Cooling";

        spencerFamilyXbox.creatorName = "Spencer Family";
        spencerFamilyXbox.familyName = "Family Pack";
        spencerFamilyXbox.edition = "Home";
        spencerFamilyXbox.color = "Gray";
        spencerFamilyXbox.controllerType = "Multi";
        spencerFamilyXbox.warranty = 3;
        spencerFamilyXbox.hasGamePass = true;
        spencerFamilyXbox.resolution = "4K";
        spencerFamilyXbox.powerConsumption = 220;
        spencerFamilyXbox.coolingSystem = "Cooling Pro";

        xboxLegacyConsole.creatorName = "Microsoft Team";
        xboxLegacyConsole.familyName = "Legacy";
        xboxLegacyConsole.edition = "Classic";
        xboxLegacyConsole.color = "Black";
        xboxLegacyConsole.controllerType = "Wired";
        xboxLegacyConsole.warranty = 1;
        xboxLegacyConsole.hasGamePass = false;
        xboxLegacyConsole.resolution = "720p";
        xboxLegacyConsole.powerConsumption = 180;
        xboxLegacyConsole.coolingSystem = "Fan Cooling";

        greenTeamXbox.creatorName = "Green Team";
        greenTeamXbox.familyName = "Xbox";
        greenTeamXbox.edition = "Special";
        greenTeamXbox.color = "Green";
        greenTeamXbox.controllerType = "Wireless";
        greenTeamXbox.warranty = 2;
        greenTeamXbox.hasGamePass = true;
        greenTeamXbox.resolution = "4K";
        greenTeamXbox.powerConsumption = 210;
        greenTeamXbox.coolingSystem = "Liquid Cooling";

        haloEditionXbox.creatorName = "Halo Studio";
        haloEditionXbox.familyName = "343 Industries";
        haloEditionXbox.edition = "Halo Edition";
        haloEditionXbox.color = "Green";
        haloEditionXbox.controllerType = "Wireless";
        haloEditionXbox.warranty = 2;
        haloEditionXbox.hasGamePass = true;
        haloEditionXbox.resolution = "4K";
        haloEditionXbox.powerConsumption = 230;
        haloEditionXbox.coolingSystem = "Advanced Cooling";

        forzaEditionXbox.creatorName = "Forza Team";
        forzaEditionXbox.familyName = "Racing";
        forzaEditionXbox.edition = "Forza Edition";
        forzaEditionXbox.color = "Red";
        forzaEditionXbox.controllerType = "Wireless";
        forzaEditionXbox.warranty = 2;
        forzaEditionXbox.hasGamePass = true;
        forzaEditionXbox.resolution = "4K";
        forzaEditionXbox.powerConsumption = 240;
        forzaEditionXbox.coolingSystem = "Turbo Cooling";

        eliteSeriesXbox.creatorName = "Elite Team";
        eliteSeriesXbox.familyName = "Premium";
        eliteSeriesXbox.edition = "Elite";
        eliteSeriesXbox.color = "Black";
        eliteSeriesXbox.controllerType = "Elite";
        eliteSeriesXbox.warranty = 3;
        eliteSeriesXbox.hasGamePass = true;
        eliteSeriesXbox.resolution = "4K";
        eliteSeriesXbox.powerConsumption = 250;
        eliteSeriesXbox.coolingSystem = "Pro Cooling";

        nextGenFutureXbox.creatorName = "Future Lab";
        nextGenFutureXbox.familyName = "NextGen";
        nextGenFutureXbox.edition = "Future";
        nextGenFutureXbox.color = "Silver";
        nextGenFutureXbox.controllerType = "Wireless";
        nextGenFutureXbox.warranty = 3;
        nextGenFutureXbox.hasGamePass = true;
        nextGenFutureXbox.resolution = "8K";
        nextGenFutureXbox.powerConsumption = 300;
        nextGenFutureXbox.coolingSystem = "AI Cooling";

        xboxStudioEdition.creatorName = "Xbox Studios";
        xboxStudioEdition.familyName = "Studio";
        xboxStudioEdition.edition = "Studio Edition";
        xboxStudioEdition.color = "Black";
        xboxStudioEdition.controllerType = "Wireless";
        xboxStudioEdition.warranty = 2;
        xboxStudioEdition.hasGamePass = true;
        xboxStudioEdition.resolution = "4K";
        xboxStudioEdition.powerConsumption = 220;
        xboxStudioEdition.coolingSystem = "Studio Cooling";

        System.out.println("\n--- After Assigning Values ---\n");

        // Example (Phil Spencer Xbox)
        System.out.println("Phil Spencer Xbox:");
        System.out.println("Creator      : " + philSpencerXbox.creatorName);
        System.out.println("Family       : " + philSpencerXbox.familyName);
        System.out.println("Edition      : " + philSpencerXbox.edition);
        System.out.println("Color        : " + philSpencerXbox.color);
        System.out.println("Controller   : " + philSpencerXbox.controllerType);
        System.out.println("Warranty     : " + philSpencerXbox.warranty);
        System.out.println("GamePass     : " + philSpencerXbox.hasGamePass);
        System.out.println("Resolution   : " + philSpencerXbox.resolution);
        System.out.println("Power        : " + philSpencerXbox.powerConsumption);
        System.out.println("Cooling      : " + philSpencerXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Linda Spencer Xbox
        System.out.println("Linda Spencer Xbox:");
        System.out.println("Creator      : " + lindaSpencerXbox.creatorName);
        System.out.println("Family       : " + lindaSpencerXbox.familyName);
        System.out.println("Edition      : " + lindaSpencerXbox.edition);
        System.out.println("Color        : " + lindaSpencerXbox.color);
        System.out.println("Controller   : " + lindaSpencerXbox.controllerType);
        System.out.println("Warranty     : " + lindaSpencerXbox.warranty);
        System.out.println("GamePass     : " + lindaSpencerXbox.hasGamePass);
        System.out.println("Resolution   : " + lindaSpencerXbox.resolution);
        System.out.println("Power        : " + lindaSpencerXbox.powerConsumption);
        System.out.println("Cooling      : " + lindaSpencerXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Spencer Family Xbox
        System.out.println("Spencer Family Xbox:");
        System.out.println("Creator      : " + spencerFamilyXbox.creatorName);
        System.out.println("Family       : " + spencerFamilyXbox.familyName);
        System.out.println("Edition      : " + spencerFamilyXbox.edition);
        System.out.println("Color        : " + spencerFamilyXbox.color);
        System.out.println("Controller   : " + spencerFamilyXbox.controllerType);
        System.out.println("Warranty     : " + spencerFamilyXbox.warranty);
        System.out.println("GamePass     : " + spencerFamilyXbox.hasGamePass);
        System.out.println("Resolution   : " + spencerFamilyXbox.resolution);
        System.out.println("Power        : " + spencerFamilyXbox.powerConsumption);
        System.out.println("Cooling      : " + spencerFamilyXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Legacy Xbox
        System.out.println("Legacy Xbox:");
        System.out.println("Creator      : " + xboxLegacyConsole.creatorName);
        System.out.println("Family       : " + xboxLegacyConsole.familyName);
        System.out.println("Edition      : " + xboxLegacyConsole.edition);
        System.out.println("Color        : " + xboxLegacyConsole.color);
        System.out.println("Controller   : " + xboxLegacyConsole.controllerType);
        System.out.println("Warranty     : " + xboxLegacyConsole.warranty);
        System.out.println("GamePass     : " + xboxLegacyConsole.hasGamePass);
        System.out.println("Resolution   : " + xboxLegacyConsole.resolution);
        System.out.println("Power        : " + xboxLegacyConsole.powerConsumption);
        System.out.println("Cooling      : " + xboxLegacyConsole.coolingSystem);
        System.out.println("-----------------------------");

        // Green Team Xbox
        System.out.println("Green Team Xbox:");
        System.out.println("Creator      : " + greenTeamXbox.creatorName);
        System.out.println("Family       : " + greenTeamXbox.familyName);
        System.out.println("Edition      : " + greenTeamXbox.edition);
        System.out.println("Color        : " + greenTeamXbox.color);
        System.out.println("Controller   : " + greenTeamXbox.controllerType);
        System.out.println("Warranty     : " + greenTeamXbox.warranty);
        System.out.println("GamePass     : " + greenTeamXbox.hasGamePass);
        System.out.println("Resolution   : " + greenTeamXbox.resolution);
        System.out.println("Power        : " + greenTeamXbox.powerConsumption);
        System.out.println("Cooling      : " + greenTeamXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Halo Edition Xbox
        System.out.println("Halo Edition Xbox:");
        System.out.println("Creator      : " + haloEditionXbox.creatorName);
        System.out.println("Family       : " + haloEditionXbox.familyName);
        System.out.println("Edition      : " + haloEditionXbox.edition);
        System.out.println("Color        : " + haloEditionXbox.color);
        System.out.println("Controller   : " + haloEditionXbox.controllerType);
        System.out.println("Warranty     : " + haloEditionXbox.warranty);
        System.out.println("GamePass     : " + haloEditionXbox.hasGamePass);
        System.out.println("Resolution   : " + haloEditionXbox.resolution);
        System.out.println("Power        : " + haloEditionXbox.powerConsumption);
        System.out.println("Cooling      : " + haloEditionXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Forza Edition Xbox
        System.out.println("Forza Edition Xbox:");
        System.out.println("Creator      : " + forzaEditionXbox.creatorName);
        System.out.println("Family       : " + forzaEditionXbox.familyName);
        System.out.println("Edition      : " + forzaEditionXbox.edition);
        System.out.println("Color        : " + forzaEditionXbox.color);
        System.out.println("Controller   : " + forzaEditionXbox.controllerType);
        System.out.println("Warranty     : " + forzaEditionXbox.warranty);
        System.out.println("GamePass     : " + forzaEditionXbox.hasGamePass);
        System.out.println("Resolution   : " + forzaEditionXbox.resolution);
        System.out.println("Power        : " + forzaEditionXbox.powerConsumption);
        System.out.println("Cooling      : " + forzaEditionXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Elite Series Xbox
        System.out.println("Elite Series Xbox:");
        System.out.println("Creator      : " + eliteSeriesXbox.creatorName);
        System.out.println("Family       : " + eliteSeriesXbox.familyName);
        System.out.println("Edition      : " + eliteSeriesXbox.edition);
        System.out.println("Color        : " + eliteSeriesXbox.color);
        System.out.println("Controller   : " + eliteSeriesXbox.controllerType);
        System.out.println("Warranty     : " + eliteSeriesXbox.warranty);
        System.out.println("GamePass     : " + eliteSeriesXbox.hasGamePass);
        System.out.println("Resolution   : " + eliteSeriesXbox.resolution);
        System.out.println("Power        : " + eliteSeriesXbox.powerConsumption);
        System.out.println("Cooling      : " + eliteSeriesXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Next Gen Future Xbox
        System.out.println("Next Gen Future Xbox:");
        System.out.println("Creator      : " + nextGenFutureXbox.creatorName);
        System.out.println("Family       : " + nextGenFutureXbox.familyName);
        System.out.println("Edition      : " + nextGenFutureXbox.edition);
        System.out.println("Color        : " + nextGenFutureXbox.color);
        System.out.println("Controller   : " + nextGenFutureXbox.controllerType);
        System.out.println("Warranty     : " + nextGenFutureXbox.warranty);
        System.out.println("GamePass     : " + nextGenFutureXbox.hasGamePass);
        System.out.println("Resolution   : " + nextGenFutureXbox.resolution);
        System.out.println("Power        : " + nextGenFutureXbox.powerConsumption);
        System.out.println("Cooling      : " + nextGenFutureXbox.coolingSystem);
        System.out.println("-----------------------------");

        // Xbox Studio Edition
        System.out.println("Xbox Studio Edition:");
        System.out.println("Creator      : " + xboxStudioEdition.creatorName);
        System.out.println("Family       : " + xboxStudioEdition.familyName);
        System.out.println("Edition      : " + xboxStudioEdition.edition);
        System.out.println("Color        : " + xboxStudioEdition.color);
        System.out.println("Controller   : " + xboxStudioEdition.controllerType);
        System.out.println("Warranty     : " + xboxStudioEdition.warranty);
        System.out.println("GamePass     : " + xboxStudioEdition.hasGamePass);
        System.out.println("Resolution   : " + xboxStudioEdition.resolution);
        System.out.println("Power        : " + xboxStudioEdition.powerConsumption);
        System.out.println("Cooling      : " + xboxStudioEdition.coolingSystem);
        System.out.println("-----------------------------");
    }
}