class ControllerRunner {
    public static void main(String[] args) {

        // Meaningful reference variable
        Controller gamingController = new Controller();

        System.out.println("\n--- Before Reassigning ---\n");

        System.out.println("Type       : " + gamingController.type);
        System.out.println("Brand      : " + gamingController.brand);
        System.out.println("Buttons    : " + gamingController.buttons);
        System.out.println("Wireless   : " + gamingController.isWireless);
        System.out.println("Price      : " + gamingController.price);

        // Reassigning
        gamingController.type = "Pro Gamepad";
        gamingController.brand = "Xbox";
        gamingController.buttons = 16;
        gamingController.isWireless = true;
        gamingController.price = 6999;

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Type       : " + gamingController.type);
        System.out.println("Brand      : " + gamingController.brand);
        System.out.println("Buttons    : " + gamingController.buttons);
        System.out.println("Wireless   : " + gamingController.isWireless);
        System.out.println("Price      : " + gamingController.price);

        // Creating 10 objects
        Controller playStationController = new Controller();
        Controller xboxController = new Controller();
        Controller pcController = new Controller();
        Controller mobileController = new Controller();
        Controller vrController = new Controller();
        Controller arcadeController = new Controller();
        Controller racingController = new Controller();
        Controller proController = new Controller();
        Controller budgetController = new Controller();
        Controller wirelessController = new Controller();

        System.out.println("\n--- Default Values ---\n");

        System.out.println("PlayStation Controller Brand: " + playStationController.connectivity);
        System.out.println("Xbox Controller Brand: " + xboxController.connectivity);
        System.out.println("PC Controller Brand: " + pcController.connectivity);
        System.out.println("Mobile Controller Brand: " + mobileController.connectivity);
        System.out.println("VR Controller Brand: " + vrController.connectivity);
        System.out.println("Arcade Controller Brand: " + arcadeController.connectivity);
        System.out.println("Racing Controller Brand: " + racingController.connectivity);
        System.out.println("Pro Controller Brand: " + proController.connectivity);
        System.out.println("Budget Controller Brand: " + budgetController.connectivity);
        System.out.println("Wireless Controller Brand: " + wirelessController.connectivity);

        // Assigning values

        playStationController.connectivity = "Bluetooth";
        playStationController.compatibility = "PS5";
        playStationController.color = "White";
        playStationController.batteryLife = 12;
        playStationController.hasVibration = true;
        playStationController.material = "Plastic";
        playStationController.layout = "DualShock";
        playStationController.warranty = 2;
        playStationController.weight = 300;
        playStationController.finish = "Matte";

        xboxController.connectivity = "Wireless";
        xboxController.compatibility = "Xbox";
        xboxController.color = "Black";
        xboxController.batteryLife = 15;
        xboxController.hasVibration = true;
        xboxController.material = "Plastic";
        xboxController.layout = "Xbox Layout";
        xboxController.warranty = 2;
        xboxController.weight = 320;
        xboxController.finish = "Matte";

        pcController.connectivity = "USB";
        pcController.compatibility = "Windows";
        pcController.color = "Black";
        pcController.batteryLife = 0;
        pcController.hasVibration = true;
        pcController.material = "Plastic";
        pcController.layout = "Standard";
        pcController.warranty = 1;
        pcController.weight = 280;
        pcController.finish = "Glossy";

        mobileController.connectivity = "Bluetooth";
        mobileController.compatibility = "Android";
        mobileController.color = "Blue";
        mobileController.batteryLife = 10;
        mobileController.hasVibration = false;
        mobileController.material = "Plastic";
        mobileController.layout = "Compact";
        mobileController.warranty = 1;
        mobileController.weight = 200;
        mobileController.finish = "Matte";

        vrController.connectivity = "Wireless";
        vrController.compatibility = "VR";
        vrController.color = "White";
        vrController.batteryLife = 8;
        vrController.hasVibration = true;
        vrController.material = "Plastic";
        vrController.layout = "Motion";
        vrController.warranty = 2;
        vrController.weight = 250;
        vrController.finish = "Glossy";

        arcadeController.connectivity = "USB";
        arcadeController.compatibility = "Arcade";
        arcadeController.color = "Red";
        arcadeController.batteryLife = 0;
        arcadeController.hasVibration = false;
        arcadeController.material = "Metal";
        arcadeController.layout = "Arcade";
        arcadeController.warranty = 3;
        arcadeController.weight = 1000;
        arcadeController.finish = "Matte";

        racingController.connectivity = "USB";
        racingController.compatibility = "PC";
        racingController.color = "Black";
        racingController.batteryLife = 0;
        racingController.hasVibration = true;
        racingController.material = "Metal";
        racingController.layout = "Wheel";
        racingController.warranty = 2;
        racingController.weight = 2000;
        racingController.finish = "Glossy";

        proController.connectivity = "Wireless";
        proController.compatibility = "Switch";
        proController.color = "Black";
        proController.batteryLife = 20;
        proController.hasVibration = true;
        proController.material = "Plastic";
        proController.layout = "Pro";
        proController.warranty = 2;
        proController.weight = 300;
        proController.finish = "Matte";

        budgetController.connectivity = "USB";
        budgetController.compatibility = "PC";
        budgetController.color = "Gray";
        budgetController.batteryLife = 0;
        budgetController.hasVibration = false;
        budgetController.material = "Plastic";
        budgetController.layout = "Basic";
        budgetController.warranty = 1;
        budgetController.weight = 250;
        budgetController.finish = "Matte";

        wirelessController.connectivity = "Bluetooth";
        wirelessController.compatibility = "Multi";
        wirelessController.color = "Black";
        wirelessController.batteryLife = 18;
        wirelessController.hasVibration = true;
        wirelessController.material = "Plastic";
        wirelessController.layout = "Standard";
        wirelessController.warranty = 2;
        wirelessController.weight = 280;
        wirelessController.finish = "Glossy";

        System.out.println("\n--- After Assigning Values ---\n");

        // Example (PlayStation Controller)
        System.out.println("PlayStation Controller:");
        System.out.println("Connectivity : " + playStationController.connectivity);
        System.out.println("Compatibility: " + playStationController.compatibility);
        System.out.println("Color        : " + playStationController.color);
        System.out.println("Battery Life : " + playStationController.batteryLife);
        System.out.println("Vibration    : " + playStationController.hasVibration);
        System.out.println("Material     : " + playStationController.material);
        System.out.println("Layout       : " + playStationController.layout);
        System.out.println("Warranty     : " + playStationController.warranty);
        System.out.println("Weight       : " + playStationController.weight);
        System.out.println("Finish       : " + playStationController.finish);
        System.out.println("-----------------------------");

        // Xbox Controller
        System.out.println("Xbox Controller:");
        System.out.println("Connectivity : " + xboxController.connectivity);
        System.out.println("Compatibility: " + xboxController.compatibility);
        System.out.println("Color        : " + xboxController.color);
        System.out.println("Battery Life : " + xboxController.batteryLife);
        System.out.println("Vibration    : " + xboxController.hasVibration);
        System.out.println("Material     : " + xboxController.material);
        System.out.println("Layout       : " + xboxController.layout);
        System.out.println("Warranty     : " + xboxController.warranty);
        System.out.println("Weight       : " + xboxController.weight);
        System.out.println("Finish       : " + xboxController.finish);
        System.out.println("-----------------------------");

        // PC Controller
        System.out.println("PC Controller:");
        System.out.println("Connectivity : " + pcController.connectivity);
        System.out.println("Compatibility: " + pcController.compatibility);
        System.out.println("Color        : " + pcController.color);
        System.out.println("Battery Life : " + pcController.batteryLife);
        System.out.println("Vibration    : " + pcController.hasVibration);
        System.out.println("Material     : " + pcController.material);
        System.out.println("Layout       : " + pcController.layout);
        System.out.println("Warranty     : " + pcController.warranty);
        System.out.println("Weight       : " + pcController.weight);
        System.out.println("Finish       : " + pcController.finish);
        System.out.println("-----------------------------");

        // Mobile Controller
        System.out.println("Mobile Controller:");
        System.out.println("Connectivity : " + mobileController.connectivity);
        System.out.println("Compatibility: " + mobileController.compatibility);
        System.out.println("Color        : " + mobileController.color);
        System.out.println("Battery Life : " + mobileController.batteryLife);
        System.out.println("Vibration    : " + mobileController.hasVibration);
        System.out.println("Material     : " + mobileController.material);
        System.out.println("Layout       : " + mobileController.layout);
        System.out.println("Warranty     : " + mobileController.warranty);
        System.out.println("Weight       : " + mobileController.weight);
        System.out.println("Finish       : " + mobileController.finish);
        System.out.println("-----------------------------");

        // VR Controller
        System.out.println("VR Controller:");
        System.out.println("Connectivity : " + vrController.connectivity);
        System.out.println("Compatibility: " + vrController.compatibility);
        System.out.println("Color        : " + vrController.color);
        System.out.println("Battery Life : " + vrController.batteryLife);
        System.out.println("Vibration    : " + vrController.hasVibration);
        System.out.println("Material     : " + vrController.material);
        System.out.println("Layout       : " + vrController.layout);
        System.out.println("Warranty     : " + vrController.warranty);
        System.out.println("Weight       : " + vrController.weight);
        System.out.println("Finish       : " + vrController.finish);
        System.out.println("-----------------------------");

        // Arcade Controller
        System.out.println("Arcade Controller:");
        System.out.println("Connectivity : " + arcadeController.connectivity);
        System.out.println("Compatibility: " + arcadeController.compatibility);
        System.out.println("Color        : " + arcadeController.color);
        System.out.println("Battery Life : " + arcadeController.batteryLife);
        System.out.println("Vibration    : " + arcadeController.hasVibration);
        System.out.println("Material     : " + arcadeController.material);
        System.out.println("Layout       : " + arcadeController.layout);
        System.out.println("Warranty     : " + arcadeController.warranty);
        System.out.println("Weight       : " + arcadeController.weight);
        System.out.println("Finish       : " + arcadeController.finish);
        System.out.println("-----------------------------");

        // Racing Controller
        System.out.println("Racing Controller:");
        System.out.println("Connectivity : " + racingController.connectivity);
        System.out.println("Compatibility: " + racingController.compatibility);
        System.out.println("Color        : " + racingController.color);
        System.out.println("Battery Life : " + racingController.batteryLife);
        System.out.println("Vibration    : " + racingController.hasVibration);
        System.out.println("Material     : " + racingController.material);
        System.out.println("Layout       : " + racingController.layout);
        System.out.println("Warranty     : " + racingController.warranty);
        System.out.println("Weight       : " + racingController.weight);
        System.out.println("Finish       : " + racingController.finish);
        System.out.println("-----------------------------");

        // Pro Controller
        System.out.println("Pro Controller:");
        System.out.println("Connectivity : " + proController.connectivity);
        System.out.println("Compatibility: " + proController.compatibility);
        System.out.println("Color        : " + proController.color);
        System.out.println("Battery Life : " + proController.batteryLife);
        System.out.println("Vibration    : " + proController.hasVibration);
        System.out.println("Material     : " + proController.material);
        System.out.println("Layout       : " + proController.layout);
        System.out.println("Warranty     : " + proController.warranty);
        System.out.println("Weight       : " + proController.weight);
        System.out.println("Finish       : " + proController.finish);
        System.out.println("-----------------------------");

        // Budget Controller
        System.out.println("Budget Controller:");
        System.out.println("Connectivity : " + budgetController.connectivity);
        System.out.println("Compatibility: " + budgetController.compatibility);
        System.out.println("Color        : " + budgetController.color);
        System.out.println("Battery Life : " + budgetController.batteryLife);
        System.out.println("Vibration    : " + budgetController.hasVibration);
        System.out.println("Material     : " + budgetController.material);
        System.out.println("Layout       : " + budgetController.layout);
        System.out.println("Warranty     : " + budgetController.warranty);
        System.out.println("Weight       : " + budgetController.weight);
        System.out.println("Finish       : " + budgetController.finish);
        System.out.println("-----------------------------");

        // Wireless Controller
        System.out.println("Wireless Controller:");
        System.out.println("Connectivity : " + wirelessController.connectivity);
        System.out.println("Compatibility: " + wirelessController.compatibility);
        System.out.println("Color        : " + wirelessController.color);
        System.out.println("Battery Life : " + wirelessController.batteryLife);
        System.out.println("Vibration    : " + wirelessController.hasVibration);
        System.out.println("Material     : " + wirelessController.material);
        System.out.println("Layout       : " + wirelessController.layout);
        System.out.println("Warranty     : " + wirelessController.warranty);
        System.out.println("Weight       : " + wirelessController.weight);
        System.out.println("Finish       : " + wirelessController.finish);
        System.out.println("-----------------------------");
    }
}