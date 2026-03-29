class RouterRunner {
    public static void main(String[] args) {

        Router mainRouter = new Router();

        System.out.println("\n--- Before Reassigning ---\n");
        System.out.println("Type   : " + mainRouter.type);
        System.out.println("Speed  : " + mainRouter.speed);
        System.out.println("Dual   : " + mainRouter.isDualBand);
        System.out.println("Price  : " + mainRouter.price);
        System.out.println("Brand  : " + mainRouter.brand);

        // Reassign
        mainRouter.type = "Gaming";
        mainRouter.speed = 1200;
        mainRouter.isDualBand = true;
        mainRouter.price = 4500;
        mainRouter.brand = "Asus";

        System.out.println("\n--- After Reassigning ---\n");
        System.out.println("Type   : " + mainRouter.type);
        System.out.println("Speed  : " + mainRouter.speed);
        System.out.println("Dual   : " + mainRouter.isDualBand);
        System.out.println("Price  : " + mainRouter.price);
        System.out.println("Brand  : " + mainRouter.brand);

        // 10 objects
        Router homeRouter = new Router();
        Router officeRouter = new Router();
        Router gamingRouter = new Router();
        Router portableRouter = new Router();
        Router smartRouter = new Router();
        Router fiberRouter = new Router();
        Router budgetRouter = new Router();
        Router highEndRouter = new Router();
        Router enterpriseRouter = new Router();
        Router travelRouter = new Router();

        System.out.println("\n--- Default Values ---\n");

        System.out.println("Home Router Model       : " + homeRouter.model);
        System.out.println("Office Router Model     : " + officeRouter.model);
        System.out.println("Gaming Router Model     : " + gamingRouter.model);
        System.out.println("Portable Router Model   : " + portableRouter.model);
        System.out.println("Smart Router Model      : " + smartRouter.model);
        System.out.println("Fiber Router Model      : " + fiberRouter.model);
        System.out.println("Budget Router Model     : " + budgetRouter.model);
        System.out.println("High-End Router Model   : " + highEndRouter.model);
        System.out.println("Enterprise Router Model : " + enterpriseRouter.model);
        System.out.println("Travel Router Model     : " + travelRouter.model);

        // -------- Assign Values --------

        homeRouter.model = "AX1500";
        homeRouter.ports = 4;
        homeRouter.frequency = "2.4GHz";
        homeRouter.warranty = 2;
        homeRouter.color = "White";
        homeRouter.hasAntenna = true;
        homeRouter.coverage = "Medium";
        homeRouter.usage = "Home";
        homeRouter.securityType = "WPA2";
        homeRouter.firmware = "v1";

        officeRouter.model = "AC1200";
        officeRouter.ports = 6;
        officeRouter.frequency = "5GHz";
        officeRouter.warranty = 3;
        officeRouter.color = "Black";
        officeRouter.hasAntenna = true;
        officeRouter.coverage = "Large";
        officeRouter.usage = "Office";
        officeRouter.securityType = "WPA3";
        officeRouter.firmware = "v2";

        gamingRouter.model = "GT-AX11000";
        gamingRouter.ports = 8;
        gamingRouter.frequency = "5GHz";
        gamingRouter.warranty = 3;
        gamingRouter.color = "Black";
        gamingRouter.hasAntenna = true;
        gamingRouter.coverage = "Large";
        gamingRouter.usage = "Gaming";
        gamingRouter.securityType = "WPA3";
        gamingRouter.firmware = "v3";

        portableRouter.model = "MR100";
        portableRouter.ports = 2;
        portableRouter.frequency = "2.4GHz";
        portableRouter.warranty = 1;
        portableRouter.color = "White";
        portableRouter.hasAntenna = false;
        portableRouter.coverage = "Small";
        portableRouter.usage = "Travel";
        portableRouter.securityType = "WPA2";
        portableRouter.firmware = "v1";

        smartRouter.model = "SmartAX3000";
        smartRouter.ports = 4;
        smartRouter.frequency = "Dual";
        smartRouter.warranty = 2;
        smartRouter.color = "Gray";
        smartRouter.hasAntenna = true;
        smartRouter.coverage = "Medium";
        smartRouter.usage = "Smart Home";
        smartRouter.securityType = "WPA3";
        smartRouter.firmware = "v2";

        fiberRouter.model = "FiberPro";
        fiberRouter.ports = 4;
        fiberRouter.frequency = "5GHz";
        fiberRouter.warranty = 3;
        fiberRouter.color = "Black";
        fiberRouter.hasAntenna = true;
        fiberRouter.coverage = "Large";
        fiberRouter.usage = "Fiber";
        fiberRouter.securityType = "WPA3";
        fiberRouter.firmware = "v4";

        budgetRouter.model = "Basic300";
        budgetRouter.ports = 2;
        budgetRouter.frequency = "2.4GHz";
        budgetRouter.warranty = 1;
        budgetRouter.color = "White";
        budgetRouter.hasAntenna = false;
        budgetRouter.coverage = "Small";
        budgetRouter.usage = "Budget";
        budgetRouter.securityType = "WPA2";
        budgetRouter.firmware = "v1";

        highEndRouter.model = "AX6000";
        highEndRouter.ports = 8;
        highEndRouter.frequency = "Dual";
        highEndRouter.warranty = 5;
        highEndRouter.color = "Black";
        highEndRouter.hasAntenna = true;
        highEndRouter.coverage = "Very Large";
        highEndRouter.usage = "High-End";
        highEndRouter.securityType = "WPA3";
        highEndRouter.firmware = "v5";

        enterpriseRouter.model = "EnterpriseX";
        enterpriseRouter.ports = 16;
        enterpriseRouter.frequency = "Dual";
        enterpriseRouter.warranty = 5;
        enterpriseRouter.color = "Gray";
        enterpriseRouter.hasAntenna = true;
        enterpriseRouter.coverage = "Very Large";
        enterpriseRouter.usage = "Enterprise";
        enterpriseRouter.securityType = "WPA3";
        enterpriseRouter.firmware = "v6";

        travelRouter.model = "TravelMini";
        travelRouter.ports = 2;
        travelRouter.frequency = "2.4GHz";
        travelRouter.warranty = 1;
        travelRouter.color = "White";
        travelRouter.hasAntenna = false;
        travelRouter.coverage = "Small";
        travelRouter.usage = "Travel";
        travelRouter.securityType = "WPA2";
        travelRouter.firmware = "v1";

        System.out.println("\n--- After Assigning Values ---\n");

        // -------- FULL PRINT --------

        System.out.println("Home Router:");
        System.out.println("Model        : " + homeRouter.model);
        System.out.println("Ports        : " + homeRouter.ports);
        System.out.println("Frequency    : " + homeRouter.frequency);
        System.out.println("Warranty     : " + homeRouter.warranty);
        System.out.println("Color        : " + homeRouter.color);
        System.out.println("Antenna      : " + homeRouter.hasAntenna);
        System.out.println("Coverage     : " + homeRouter.coverage);
        System.out.println("Usage        : " + homeRouter.usage);
        System.out.println("Security     : " + homeRouter.securityType);
        System.out.println("Firmware     : " + homeRouter.firmware);
        System.out.println("-----------------------------");

        System.out.println("Office Router:");
        System.out.println("Model        : " + officeRouter.model);
        System.out.println("Ports        : " + officeRouter.ports);
        System.out.println("Frequency    : " + officeRouter.frequency);
        System.out.println("Warranty     : " + officeRouter.warranty);
        System.out.println("Color        : " + officeRouter.color);
        System.out.println("Antenna      : " + officeRouter.hasAntenna);
        System.out.println("Coverage     : " + officeRouter.coverage);
        System.out.println("Usage        : " + officeRouter.usage);
        System.out.println("Security     : " + officeRouter.securityType);
        System.out.println("Firmware     : " + officeRouter.firmware);
        System.out.println("-----------------------------");

        /// Gaming Router
        System.out.println("Gaming Router:");
        System.out.println("Model        : " + gamingRouter.model);
        System.out.println("Ports        : " + gamingRouter.ports);
        System.out.println("Frequency    : " + gamingRouter.frequency);
        System.out.println("Warranty     : " + gamingRouter.warranty);
        System.out.println("Color        : " + gamingRouter.color);
        System.out.println("Antenna      : " + gamingRouter.hasAntenna);
        System.out.println("Coverage     : " + gamingRouter.coverage);
        System.out.println("Usage        : " + gamingRouter.usage);
        System.out.println("Security     : " + gamingRouter.securityType);
        System.out.println("Firmware     : " + gamingRouter.firmware);
        System.out.println("-----------------------------");

        // Portable Router
        System.out.println("Portable Router:");
        System.out.println("Model        : " + portableRouter.model);
        System.out.println("Ports        : " + portableRouter.ports);
        System.out.println("Frequency    : " + portableRouter.frequency);
        System.out.println("Warranty     : " + portableRouter.warranty);
        System.out.println("Color        : " + portableRouter.color);
        System.out.println("Antenna      : " + portableRouter.hasAntenna);
        System.out.println("Coverage     : " + portableRouter.coverage);
        System.out.println("Usage        : " + portableRouter.usage);
        System.out.println("Security     : " + portableRouter.securityType);
        System.out.println("Firmware     : " + portableRouter.firmware);
        System.out.println("-----------------------------");

        // Smart Router
        System.out.println("Smart Router:");
        System.out.println("Model        : " + smartRouter.model);
        System.out.println("Ports        : " + smartRouter.ports);
        System.out.println("Frequency    : " + smartRouter.frequency);
        System.out.println("Warranty     : " + smartRouter.warranty);
        System.out.println("Color        : " + smartRouter.color);
        System.out.println("Antenna      : " + smartRouter.hasAntenna);
        System.out.println("Coverage     : " + smartRouter.coverage);
        System.out.println("Usage        : " + smartRouter.usage);
        System.out.println("Security     : " + smartRouter.securityType);
        System.out.println("Firmware     : " + smartRouter.firmware);
        System.out.println("-----------------------------");

        // Fiber Router
        System.out.println("Fiber Router:");
        System.out.println("Model        : " + fiberRouter.model);
        System.out.println("Ports        : " + fiberRouter.ports);
        System.out.println("Frequency    : " + fiberRouter.frequency);
        System.out.println("Warranty     : " + fiberRouter.warranty);
        System.out.println("Color        : " + fiberRouter.color);
        System.out.println("Antenna      : " + fiberRouter.hasAntenna);
        System.out.println("Coverage     : " + fiberRouter.coverage);
        System.out.println("Usage        : " + fiberRouter.usage);
        System.out.println("Security     : " + fiberRouter.securityType);
        System.out.println("Firmware     : " + fiberRouter.firmware);
        System.out.println("-----------------------------");

        // Budget Router
        System.out.println("Budget Router:");
        System.out.println("Model        : " + budgetRouter.model);
        System.out.println("Ports        : " + budgetRouter.ports);
        System.out.println("Frequency    : " + budgetRouter.frequency);
        System.out.println("Warranty     : " + budgetRouter.warranty);
        System.out.println("Color        : " + budgetRouter.color);
        System.out.println("Antenna      : " + budgetRouter.hasAntenna);
        System.out.println("Coverage     : " + budgetRouter.coverage);
        System.out.println("Usage        : " + budgetRouter.usage);
        System.out.println("Security     : " + budgetRouter.securityType);
        System.out.println("Firmware     : " + budgetRouter.firmware);
        System.out.println("-----------------------------");

        // High-End Router
        System.out.println("High-End Router:");
        System.out.println("Model        : " + highEndRouter.model);
        System.out.println("Ports        : " + highEndRouter.ports);
        System.out.println("Frequency    : " + highEndRouter.frequency);
        System.out.println("Warranty     : " + highEndRouter.warranty);
        System.out.println("Color        : " + highEndRouter.color);
        System.out.println("Antenna      : " + highEndRouter.hasAntenna);
        System.out.println("Coverage     : " + highEndRouter.coverage);
        System.out.println("Usage        : " + highEndRouter.usage);
        System.out.println("Security     : " + highEndRouter.securityType);
        System.out.println("Firmware     : " + highEndRouter.firmware);
        System.out.println("-----------------------------");

        // Enterprise Router
        System.out.println("Enterprise Router:");
        System.out.println("Model        : " + enterpriseRouter.model);
        System.out.println("Ports        : " + enterpriseRouter.ports);
        System.out.println("Frequency    : " + enterpriseRouter.frequency);
        System.out.println("Warranty     : " + enterpriseRouter.warranty);
        System.out.println("Color        : " + enterpriseRouter.color);
        System.out.println("Antenna      : " + enterpriseRouter.hasAntenna);
        System.out.println("Coverage     : " + enterpriseRouter.coverage);
        System.out.println("Usage        : " + enterpriseRouter.usage);
        System.out.println("Security     : " + enterpriseRouter.securityType);
        System.out.println("Firmware     : " + enterpriseRouter.firmware);
        System.out.println("-----------------------------");

        // Travel Router
        System.out.println("Travel Router:");
        System.out.println("Model        : " + travelRouter.model);
        System.out.println("Ports        : " + travelRouter.ports);
        System.out.println("Frequency    : " + travelRouter.frequency);
        System.out.println("Warranty     : " + travelRouter.warranty);
        System.out.println("Color        : " + travelRouter.color);
        System.out.println("Antenna      : " + travelRouter.hasAntenna);
        System.out.println("Coverage     : " + travelRouter.coverage);
        System.out.println("Usage        : " + travelRouter.usage);
        System.out.println("Security     : " + travelRouter.securityType);
        System.out.println("Firmware     : " + travelRouter.firmware);
        System.out.println("-----------------------------");

    }
}