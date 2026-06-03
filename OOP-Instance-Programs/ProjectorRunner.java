class ProjectorRunner {
    public static void main(String[] args) {

        // Meaningful reference variable
        Projector homeProjector = new Projector();

        System.out.println("\n--- Before Reassigning ---\n");

        System.out.println("Type        : " + homeProjector.type);
        System.out.println("Price       : " + homeProjector.price);
        System.out.println("Portable    : " + homeProjector.isPortable);
        System.out.println("Color       : " + homeProjector.color);
        System.out.println("Brightness  : " + homeProjector.brightness);

        // Reassigning
        homeProjector.type = "Smart LED";
        homeProjector.price = 30000;
        homeProjector.isPortable = false;
        homeProjector.color = "Black";
        homeProjector.brightness = 3500;

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Type        : " + homeProjector.type);
        System.out.println("Price       : " + homeProjector.price);
        System.out.println("Portable    : " + homeProjector.isPortable);
        System.out.println("Color       : " + homeProjector.color);
        System.out.println("Brightness  : " + homeProjector.brightness);

        // Creating 10 objects
        Projector officeProjector = new Projector();
        Projector miniProjector = new Projector();
        Projector ledProjector = new Projector();
        Projector laserProjector = new Projector();
        Projector cinemaProjector = new Projector();
        Projector gamingProjector = new Projector();
        Projector portableProjector = new Projector();
        Projector smartProjector = new Projector();
        Projector budgetProjector = new Projector();
        Projector outdoorProjector = new Projector();

        System.out.println("\n--- Default Values ---\n");

        System.out.println("Office Projector Brand: " + officeProjector.brand);
        System.out.println("Mini Projector Brand: " + miniProjector.brand);
        System.out.println("LED Projector Brand: " + ledProjector.brand);
        System.out.println("Laser Projector Brand: " + laserProjector.brand);
        System.out.println("Cinema Projector Brand: " + cinemaProjector.brand);
        System.out.println("Gaming Projector Brand: " + gamingProjector.brand);
        System.out.println("Portable Projector Brand: " + portableProjector.brand);
        System.out.println("Smart Projector Brand: " + smartProjector.brand);
        System.out.println("Budget Projector Brand: " + budgetProjector.brand);
        System.out.println("Outdoor Projector Brand: " + outdoorProjector.brand);

        // Assigning values

        officeProjector.brand = "Epson";
        officeProjector.resolution = "1080p";
        officeProjector.contrastRatio = 15000;
        officeProjector.connectivity = "HDMI";
        officeProjector.warranty = 2;
        officeProjector.weight = "3kg";
        officeProjector.usage = "Office";
        officeProjector.displayTechnology = "LCD";
        officeProjector.lampLife = 5000;
        officeProjector.aspectRatio = "16:9";

        miniProjector.brand = "Anker";
        miniProjector.resolution = "720p";
        miniProjector.contrastRatio = 1000;
        miniProjector.connectivity = "USB";
        miniProjector.warranty = 1;
        miniProjector.weight = "1kg";
        miniProjector.usage = "Travel";
        miniProjector.displayTechnology = "LED";
        miniProjector.lampLife = 3000;
        miniProjector.aspectRatio = "16:9";

        ledProjector.brand = "BenQ";
        ledProjector.resolution = "1080p";
        ledProjector.contrastRatio = 12000;
        ledProjector.connectivity = "HDMI";
        ledProjector.warranty = 2;
        ledProjector.weight = "2.5kg";
        ledProjector.usage = "Home";
        ledProjector.displayTechnology = "LED";
        ledProjector.lampLife = 6000;
        ledProjector.aspectRatio = "16:9";

        laserProjector.brand = "Sony";
        laserProjector.resolution = "4K";
        laserProjector.contrastRatio = 20000;
        laserProjector.connectivity = "HDMI";
        laserProjector.warranty = 3;
        laserProjector.weight = "6kg";
        laserProjector.usage = "Cinema";
        laserProjector.displayTechnology = "Laser";
        laserProjector.lampLife = 20000;
        laserProjector.aspectRatio = "16:9";

        cinemaProjector.brand = "Panasonic";
        cinemaProjector.resolution = "4K";
        cinemaProjector.contrastRatio = 25000;
        cinemaProjector.connectivity = "HDMI";
        cinemaProjector.warranty = 3;
        cinemaProjector.weight = "7kg";
        cinemaProjector.usage = "Cinema";
        cinemaProjector.displayTechnology = "Laser";
        cinemaProjector.lampLife = 25000;
        cinemaProjector.aspectRatio = "21:9";

        gamingProjector.brand = "Acer";
        gamingProjector.resolution = "1080p";
        gamingProjector.contrastRatio = 15000;
        gamingProjector.connectivity = "HDMI";
        gamingProjector.warranty = 2;
        gamingProjector.weight = "3kg";
        gamingProjector.usage = "Gaming";
        gamingProjector.displayTechnology = "LED";
        gamingProjector.lampLife = 8000;
        gamingProjector.aspectRatio = "16:9";

        portableProjector.brand = "ViewSonic";
        portableProjector.resolution = "1080p";
        portableProjector.contrastRatio = 10000;
        portableProjector.connectivity = "USB";
        portableProjector.warranty = 2;
        portableProjector.weight = "1.5kg";
        portableProjector.usage = "Portable";
        portableProjector.displayTechnology = "LED";
        portableProjector.lampLife = 7000;
        portableProjector.aspectRatio = "16:9";

        smartProjector.brand = "Mi";
        smartProjector.resolution = "1080p";
        smartProjector.contrastRatio = 12000;
        smartProjector.connectivity = "WiFi";
        smartProjector.warranty = 2;
        smartProjector.weight = "2kg";
        smartProjector.usage = "Smart";
        smartProjector.displayTechnology = "LED";
        smartProjector.lampLife = 9000;
        smartProjector.aspectRatio = "16:9";

        budgetProjector.brand = "Zebronics";
        budgetProjector.resolution = "720p";
        budgetProjector.contrastRatio = 8000;
        budgetProjector.connectivity = "USB";
        budgetProjector.warranty = 1;
        budgetProjector.weight = "1.2kg";
        budgetProjector.usage = "Budget";
        budgetProjector.displayTechnology = "LED";
        budgetProjector.lampLife = 4000;
        budgetProjector.aspectRatio = "16:9";

        outdoorProjector.brand = "LG";
        outdoorProjector.resolution = "1080p";
        outdoorProjector.contrastRatio = 14000;
        outdoorProjector.connectivity = "HDMI";
        outdoorProjector.warranty = 2;
        outdoorProjector.weight = "3.5kg";
        outdoorProjector.usage = "Outdoor";
        outdoorProjector.displayTechnology = "LED";
        outdoorProjector.lampLife = 10000;
        outdoorProjector.aspectRatio = "16:9";

        System.out.println("\n--- After Assigning Values ---\n");

        // Example (Office Projector)
        System.out.println("Office Projector:");
        System.out.println("Brand          : " + officeProjector.brand);
        System.out.println("Resolution     : " + officeProjector.resolution);
        System.out.println("Contrast Ratio : " + officeProjector.contrastRatio);
        System.out.println("Connectivity   : " + officeProjector.connectivity);
        System.out.println("Warranty       : " + officeProjector.warranty);
        System.out.println("Weight         : " + officeProjector.weight);
        System.out.println("Usage          : " + officeProjector.usage);
        System.out.println("Technology     : " + officeProjector.displayTechnology);
        System.out.println("Lamp Life      : " + officeProjector.lampLife);
        System.out.println("Aspect Ratio   : " + officeProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Mini Projector
        System.out.println("Mini Projector:");
        System.out.println("Brand          : " + miniProjector.brand);
        System.out.println("Resolution     : " + miniProjector.resolution);
        System.out.println("Contrast Ratio : " + miniProjector.contrastRatio);
        System.out.println("Connectivity   : " + miniProjector.connectivity);
        System.out.println("Warranty       : " + miniProjector.warranty);
        System.out.println("Weight         : " + miniProjector.weight);
        System.out.println("Usage          : " + miniProjector.usage);
        System.out.println("Technology     : " + miniProjector.displayTechnology);
        System.out.println("Lamp Life      : " + miniProjector.lampLife);
        System.out.println("Aspect Ratio   : " + miniProjector.aspectRatio);
        System.out.println("-----------------------------");

        // LED Projector
        System.out.println("LED Projector:");
        System.out.println("Brand          : " + ledProjector.brand);
        System.out.println("Resolution     : " + ledProjector.resolution);
        System.out.println("Contrast Ratio : " + ledProjector.contrastRatio);
        System.out.println("Connectivity   : " + ledProjector.connectivity);
        System.out.println("Warranty       : " + ledProjector.warranty);
        System.out.println("Weight         : " + ledProjector.weight);
        System.out.println("Usage          : " + ledProjector.usage);
        System.out.println("Technology     : " + ledProjector.displayTechnology);
        System.out.println("Lamp Life      : " + ledProjector.lampLife);
        System.out.println("Aspect Ratio   : " + ledProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Laser Projector
        System.out.println("Laser Projector:");
        System.out.println("Brand          : " + laserProjector.brand);
        System.out.println("Resolution     : " + laserProjector.resolution);
        System.out.println("Contrast Ratio : " + laserProjector.contrastRatio);
        System.out.println("Connectivity   : " + laserProjector.connectivity);
        System.out.println("Warranty       : " + laserProjector.warranty);
        System.out.println("Weight         : " + laserProjector.weight);
        System.out.println("Usage          : " + laserProjector.usage);
        System.out.println("Technology     : " + laserProjector.displayTechnology);
        System.out.println("Lamp Life      : " + laserProjector.lampLife);
        System.out.println("Aspect Ratio   : " + laserProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Cinema Projector
        System.out.println("Cinema Projector:");
        System.out.println("Brand          : " + cinemaProjector.brand);
        System.out.println("Resolution     : " + cinemaProjector.resolution);
        System.out.println("Contrast Ratio : " + cinemaProjector.contrastRatio);
        System.out.println("Connectivity   : " + cinemaProjector.connectivity);
        System.out.println("Warranty       : " + cinemaProjector.warranty);
        System.out.println("Weight         : " + cinemaProjector.weight);
        System.out.println("Usage          : " + cinemaProjector.usage);
        System.out.println("Technology     : " + cinemaProjector.displayTechnology);
        System.out.println("Lamp Life      : " + cinemaProjector.lampLife);
        System.out.println("Aspect Ratio   : " + cinemaProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Gaming Projector
        System.out.println("Gaming Projector:");
        System.out.println("Brand          : " + gamingProjector.brand);
        System.out.println("Resolution     : " + gamingProjector.resolution);
        System.out.println("Contrast Ratio : " + gamingProjector.contrastRatio);
        System.out.println("Connectivity   : " + gamingProjector.connectivity);
        System.out.println("Warranty       : " + gamingProjector.warranty);
        System.out.println("Weight         : " + gamingProjector.weight);
        System.out.println("Usage          : " + gamingProjector.usage);
        System.out.println("Technology     : " + gamingProjector.displayTechnology);
        System.out.println("Lamp Life      : " + gamingProjector.lampLife);
        System.out.println("Aspect Ratio   : " + gamingProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Portable Projector
        System.out.println("Portable Projector:");
        System.out.println("Brand          : " + portableProjector.brand);
        System.out.println("Resolution     : " + portableProjector.resolution);
        System.out.println("Contrast Ratio : " + portableProjector.contrastRatio);
        System.out.println("Connectivity   : " + portableProjector.connectivity);
        System.out.println("Warranty       : " + portableProjector.warranty);
        System.out.println("Weight         : " + portableProjector.weight);
        System.out.println("Usage          : " + portableProjector.usage);
        System.out.println("Technology     : " + portableProjector.displayTechnology);
        System.out.println("Lamp Life      : " + portableProjector.lampLife);
        System.out.println("Aspect Ratio   : " + portableProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Smart Projector
        System.out.println("Smart Projector:");
        System.out.println("Brand          : " + smartProjector.brand);
        System.out.println("Resolution     : " + smartProjector.resolution);
        System.out.println("Contrast Ratio : " + smartProjector.contrastRatio);
        System.out.println("Connectivity   : " + smartProjector.connectivity);
        System.out.println("Warranty       : " + smartProjector.warranty);
        System.out.println("Weight         : " + smartProjector.weight);
        System.out.println("Usage          : " + smartProjector.usage);
        System.out.println("Technology     : " + smartProjector.displayTechnology);
        System.out.println("Lamp Life      : " + smartProjector.lampLife);
        System.out.println("Aspect Ratio   : " + smartProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Budget Projector
        System.out.println("Budget Projector:");
        System.out.println("Brand          : " + budgetProjector.brand);
        System.out.println("Resolution     : " + budgetProjector.resolution);
        System.out.println("Contrast Ratio : " + budgetProjector.contrastRatio);
        System.out.println("Connectivity   : " + budgetProjector.connectivity);
        System.out.println("Warranty       : " + budgetProjector.warranty);
        System.out.println("Weight         : " + budgetProjector.weight);
        System.out.println("Usage          : " + budgetProjector.usage);
        System.out.println("Technology     : " + budgetProjector.displayTechnology);
        System.out.println("Lamp Life      : " + budgetProjector.lampLife);
        System.out.println("Aspect Ratio   : " + budgetProjector.aspectRatio);
        System.out.println("-----------------------------");

        // Outdoor Projector
        System.out.println("Outdoor Projector:");
        System.out.println("Brand          : " + outdoorProjector.brand);
        System.out.println("Resolution     : " + outdoorProjector.resolution);
        System.out.println("Contrast Ratio : " + outdoorProjector.contrastRatio);
        System.out.println("Connectivity   : " + outdoorProjector.connectivity);
        System.out.println("Warranty       : " + outdoorProjector.warranty);
        System.out.println("Weight         : " + outdoorProjector.weight);
        System.out.println("Usage          : " + outdoorProjector.usage);
        System.out.println("Technology     : " + outdoorProjector.displayTechnology);
        System.out.println("Lamp Life      : " + outdoorProjector.lampLife);
        System.out.println("Aspect Ratio   : " + outdoorProjector.aspectRatio);
        System.out.println("-----------------------------");
    }
}