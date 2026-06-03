class EthernetRunner {
    public static void main(String[] args) {

        // Main object
        Ethernet mainEthernet = new Ethernet();

        System.out.println("\n--- Before Reassigning ---\n");

        System.out.println("Type   : " + mainEthernet.type);
        System.out.println("Cable  : " + mainEthernet.cableType);
        System.out.println("Speed  : " + mainEthernet.speed);
        System.out.println("Wired  : " + mainEthernet.isWired);
        System.out.println("Price  : " + mainEthernet.price);

        // Reassign
        mainEthernet.type = "WAN";
        mainEthernet.cableType = "Cat7";
        mainEthernet.speed = 10000;
        mainEthernet.isWired = true;
        mainEthernet.price = 1200;

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Type   : " + mainEthernet.type);
        System.out.println("Cable  : " + mainEthernet.cableType);
        System.out.println("Speed  : " + mainEthernet.speed);
        System.out.println("Wired  : " + mainEthernet.isWired);
        System.out.println("Price  : " + mainEthernet.price);

        // 10 objects
        Ethernet officeEthernet = new Ethernet();
        Ethernet gamingEthernet = new Ethernet();
        Ethernet homeEthernet = new Ethernet();
        Ethernet serverEthernet = new Ethernet();
        Ethernet longRangeEthernet = new Ethernet();
        Ethernet fiberEthernet = new Ethernet();
        Ethernet routerEthernet = new Ethernet();
        Ethernet switchEthernet = new Ethernet();
        Ethernet industrialEthernet = new Ethernet();
        Ethernet smartHomeEthernet = new Ethernet();

        System.out.println("\n--- Default Values ---\n");

        // Example (repeat same pattern)
        System.out.println("Office Ethernet:");
        System.out.println("Brand        : " + officeEthernet.brand);
        System.out.println("Length       : " + officeEthernet.length);
        System.out.println("Connector    : " + officeEthernet.connectorType);
        System.out.println("Usage        : " + officeEthernet.usage);
        System.out.println("Warranty     : " + officeEthernet.warranty);
        System.out.println("Color        : " + officeEthernet.color);
        System.out.println("Shielded     : " + officeEthernet.isShielded);
        System.out.println("Compatibility: " + officeEthernet.compatibility);
        System.out.println("Material     : " + officeEthernet.material);
        System.out.println("Version      : " + officeEthernet.version);
        System.out.println("-----------------------------");

        // 👉 SAME pattern for all 9 (short form below)
        System.out.println("Gaming Ethernet Brand: " + gamingEthernet.brand);
        System.out.println("Home Ethernet Brand  : " + homeEthernet.brand);
        System.out.println("Server Ethernet Brand: " + serverEthernet.brand);
        System.out.println("LongRange Ethernet Brand: " + longRangeEthernet.brand);
        System.out.println("Fiber Ethernet Brand: " + fiberEthernet.brand);
        System.out.println("Router Ethernet Brand: " + routerEthernet.brand);
        System.out.println("Switch Ethernet Brand: " + switchEthernet.brand);
        System.out.println("Industrial Ethernet Brand: " + industrialEthernet.brand);
        System.out.println("SmartHome Ethernet Brand: " + smartHomeEthernet.brand);

        // Assign values (ALL 10 objects)

        officeEthernet.brand = "D-Link";
        officeEthernet.length = "10m";
        officeEthernet.connectorType = "RJ45";
        officeEthernet.usage = "Office";
        officeEthernet.warranty = 2;
        officeEthernet.color = "Blue";
        officeEthernet.isShielded = true;
        officeEthernet.compatibility = "PC";
        officeEthernet.material = "Copper";
        officeEthernet.version = "Cat6";

        gamingEthernet.brand = "TP-Link";
        gamingEthernet.length = "5m";
        gamingEthernet.connectorType = "RJ45";
        gamingEthernet.usage = "Gaming";
        gamingEthernet.warranty = 3;
        gamingEthernet.color = "Black";
        gamingEthernet.isShielded = true;
        gamingEthernet.compatibility = "Console";
        gamingEthernet.material = "Copper";
        gamingEthernet.version = "Cat7";

        homeEthernet.brand = "Belkin";
        homeEthernet.length = "8m";
        homeEthernet.connectorType = "RJ45";
        homeEthernet.usage = "Home";
        homeEthernet.warranty = 1;
        homeEthernet.color = "White";
        homeEthernet.isShielded = false;
        homeEthernet.compatibility = "Router";
        homeEthernet.material = "Copper";
        homeEthernet.version = "Cat5";

        serverEthernet.brand = "Cisco";
        serverEthernet.length = "20m";
        serverEthernet.connectorType = "RJ45";
        serverEthernet.usage = "Server";
        serverEthernet.warranty = 5;
        serverEthernet.color = "Gray";
        serverEthernet.isShielded = true;
        serverEthernet.compatibility = "Server";
        serverEthernet.material = "Fiber";
        serverEthernet.version = "Cat8";

        longRangeEthernet.brand = "Netgear";
        longRangeEthernet.length = "50m";
        longRangeEthernet.connectorType = "RJ45";
        longRangeEthernet.usage = "Long Distance";
        longRangeEthernet.warranty = 3;
        longRangeEthernet.color = "Yellow";
        longRangeEthernet.isShielded = true;
        longRangeEthernet.compatibility = "Outdoor";
        longRangeEthernet.material = "Fiber";
        longRangeEthernet.version = "Cat7";

        fiberEthernet.brand = "Finolex";
        fiberEthernet.length = "100m";
        fiberEthernet.connectorType = "Fiber";
        fiberEthernet.usage = "High Speed";
        fiberEthernet.warranty = 4;
        fiberEthernet.color = "Orange";
        fiberEthernet.isShielded = true;
        fiberEthernet.compatibility = "Server";
        fiberEthernet.material = "Fiber";
        fiberEthernet.version = "FiberOptic";

        routerEthernet.brand = "Asus";
        routerEthernet.length = "3m";
        routerEthernet.connectorType = "RJ45";
        routerEthernet.usage = "Router";
        routerEthernet.warranty = 2;
        routerEthernet.color = "Black";
        routerEthernet.isShielded = false;
        routerEthernet.compatibility = "Router";
        routerEthernet.material = "Copper";
        routerEthernet.version = "Cat6";

        switchEthernet.brand = "HP";
        switchEthernet.length = "6m";
        switchEthernet.connectorType = "RJ45";
        switchEthernet.usage = "Switch";
        switchEthernet.warranty = 2;
        switchEthernet.color = "Gray";
        switchEthernet.isShielded = true;
        switchEthernet.compatibility = "Switch";
        switchEthernet.material = "Copper";
        switchEthernet.version = "Cat6";

        industrialEthernet.brand = "Siemens";
        industrialEthernet.length = "30m";
        industrialEthernet.connectorType = "RJ45";
        industrialEthernet.usage = "Industrial";
        industrialEthernet.warranty = 5;
        industrialEthernet.color = "Green";
        industrialEthernet.isShielded = true;
        industrialEthernet.compatibility = "Machines";
        industrialEthernet.material = "Fiber";
        industrialEthernet.version = "Cat7";

        smartHomeEthernet.brand = "Mi";
        smartHomeEthernet.length = "4m";
        smartHomeEthernet.connectorType = "RJ45";
        smartHomeEthernet.usage = "Smart Home";
        smartHomeEthernet.warranty = 2;
        smartHomeEthernet.color = "White";
        smartHomeEthernet.isShielded = false;
        smartHomeEthernet.compatibility = "IoT";
        smartHomeEthernet.material = "Copper";
        smartHomeEthernet.version = "Cat6";

        System.out.println("\n--- After Assigning Values ---\n");

        // FULL PRINT (ALL 10)

        // Office
        System.out.println("Office Ethernet:");
        System.out.println("Brand         : " + officeEthernet.brand);
        System.out.println("Length        : " + officeEthernet.length);
        System.out.println("Connector     : " + officeEthernet.connectorType);
        System.out.println("Usage         : " + officeEthernet.usage);
        System.out.println("Warranty      : " + officeEthernet.warranty);
        System.out.println("Color         : " + officeEthernet.color);
        System.out.println("Shielded      : " + officeEthernet.isShielded);
        System.out.println("Compatibility : " + officeEthernet.compatibility);
        System.out.println("Material      : " + officeEthernet.material);
        System.out.println("Version       : " + officeEthernet.version);
        System.out.println("-----------------------------");

        // Gaming Ethernet
        System.out.println("Gaming Ethernet:");
        System.out.println("Brand         : " + gamingEthernet.brand);
        System.out.println("Length        : " + gamingEthernet.length);
        System.out.println("Connector     : " + gamingEthernet.connectorType);
        System.out.println("Usage         : " + gamingEthernet.usage);
        System.out.println("Warranty      : " + gamingEthernet.warranty);
        System.out.println("Color         : " + gamingEthernet.color);
        System.out.println("Shielded      : " + gamingEthernet.isShielded);
        System.out.println("Compatibility : " + gamingEthernet.compatibility);
        System.out.println("Material      : " + gamingEthernet.material);
        System.out.println("Version       : " + gamingEthernet.version);
        System.out.println("-----------------------------");

        // Home Ethernet
        System.out.println("Home Ethernet:");
        System.out.println("Brand         : " + homeEthernet.brand);
        System.out.println("Length        : " + homeEthernet.length);
        System.out.println("Connector     : " + homeEthernet.connectorType);
        System.out.println("Usage         : " + homeEthernet.usage);
        System.out.println("Warranty      : " + homeEthernet.warranty);
        System.out.println("Color         : " + homeEthernet.color);
        System.out.println("Shielded      : " + homeEthernet.isShielded);
        System.out.println("Compatibility : " + homeEthernet.compatibility);
        System.out.println("Material      : " + homeEthernet.material);
        System.out.println("Version       : " + homeEthernet.version);
        System.out.println("-----------------------------");

        // Server Ethernet
        System.out.println("Server Ethernet:");
        System.out.println("Brand         : " + serverEthernet.brand);
        System.out.println("Length        : " + serverEthernet.length);
        System.out.println("Connector     : " + serverEthernet.connectorType);
        System.out.println("Usage         : " + serverEthernet.usage);
        System.out.println("Warranty      : " + serverEthernet.warranty);
        System.out.println("Color         : " + serverEthernet.color);
        System.out.println("Shielded      : " + serverEthernet.isShielded);
        System.out.println("Compatibility : " + serverEthernet.compatibility);
        System.out.println("Material      : " + serverEthernet.material);
        System.out.println("Version       : " + serverEthernet.version);
        System.out.println("-----------------------------");

        // Long Range Ethernet
        System.out.println("Long Range Ethernet:");
        System.out.println("Brand         : " + longRangeEthernet.brand);
        System.out.println("Length        : " + longRangeEthernet.length);
        System.out.println("Connector     : " + longRangeEthernet.connectorType);
        System.out.println("Usage         : " + longRangeEthernet.usage);
        System.out.println("Warranty      : " + longRangeEthernet.warranty);
        System.out.println("Color         : " + longRangeEthernet.color);
        System.out.println("Shielded      : " + longRangeEthernet.isShielded);
        System.out.println("Compatibility : " + longRangeEthernet.compatibility);
        System.out.println("Material      : " + longRangeEthernet.material);
        System.out.println("Version       : " + longRangeEthernet.version);
        System.out.println("-----------------------------");

        // Fiber Ethernet
        System.out.println("Fiber Ethernet:");
        System.out.println("Brand         : " + fiberEthernet.brand);
        System.out.println("Length        : " + fiberEthernet.length);
        System.out.println("Connector     : " + fiberEthernet.connectorType);
        System.out.println("Usage         : " + fiberEthernet.usage);
        System.out.println("Warranty      : " + fiberEthernet.warranty);
        System.out.println("Color         : " + fiberEthernet.color);
        System.out.println("Shielded      : " + fiberEthernet.isShielded);
        System.out.println("Compatibility : " + fiberEthernet.compatibility);
        System.out.println("Material      : " + fiberEthernet.material);
        System.out.println("Version       : " + fiberEthernet.version);
        System.out.println("-----------------------------");

        // Router Ethernet
        System.out.println("Router Ethernet:");
        System.out.println("Brand         : " + routerEthernet.brand);
        System.out.println("Length        : " + routerEthernet.length);
        System.out.println("Connector     : " + routerEthernet.connectorType);
        System.out.println("Usage         : " + routerEthernet.usage);
        System.out.println("Warranty      : " + routerEthernet.warranty);
        System.out.println("Color         : " + routerEthernet.color);
        System.out.println("Shielded      : " + routerEthernet.isShielded);
        System.out.println("Compatibility : " + routerEthernet.compatibility);
        System.out.println("Material      : " + routerEthernet.material);
        System.out.println("Version       : " + routerEthernet.version);
        System.out.println("-----------------------------");

        // Switch Ethernet
        System.out.println("Switch Ethernet:");
        System.out.println("Brand         : " + switchEthernet.brand);
        System.out.println("Length        : " + switchEthernet.length);
        System.out.println("Connector     : " + switchEthernet.connectorType);
        System.out.println("Usage         : " + switchEthernet.usage);
        System.out.println("Warranty      : " + switchEthernet.warranty);
        System.out.println("Color         : " + switchEthernet.color);
        System.out.println("Shielded      : " + switchEthernet.isShielded);
        System.out.println("Compatibility : " + switchEthernet.compatibility);
        System.out.println("Material      : " + switchEthernet.material);
        System.out.println("Version       : " + switchEthernet.version);
        System.out.println("-----------------------------");

        // Industrial Ethernet
        System.out.println("Industrial Ethernet:");
        System.out.println("Brand         : " + industrialEthernet.brand);
        System.out.println("Length        : " + industrialEthernet.length);
        System.out.println("Connector     : " + industrialEthernet.connectorType);
        System.out.println("Usage         : " + industrialEthernet.usage);
        System.out.println("Warranty      : " + industrialEthernet.warranty);
        System.out.println("Color         : " + industrialEthernet.color);
        System.out.println("Shielded      : " + industrialEthernet.isShielded);
        System.out.println("Compatibility : " + industrialEthernet.compatibility);
        System.out.println("Material      : " + industrialEthernet.material);
        System.out.println("Version       : " + industrialEthernet.version);
        System.out.println("-----------------------------");

        // Smart Home Ethernet
        System.out.println("Smart Home Ethernet:");
        System.out.println("Brand         : " + smartHomeEthernet.brand);
        System.out.println("Length        : " + smartHomeEthernet.length);
        System.out.println("Connector     : " + smartHomeEthernet.connectorType);
        System.out.println("Usage         : " + smartHomeEthernet.usage);
        System.out.println("Warranty      : " + smartHomeEthernet.warranty);
        System.out.println("Color         : " + smartHomeEthernet.color);
        System.out.println("Shielded      : " + smartHomeEthernet.isShielded);
        System.out.println("Compatibility : " + smartHomeEthernet.compatibility);
        System.out.println("Material      : " + smartHomeEthernet.material);
        System.out.println("Version       : " + smartHomeEthernet.version);
        System.out.println("-----------------------------");
    }
}