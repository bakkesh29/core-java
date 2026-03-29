class MouseRunner {
    public static void main(String[] args) {

        // Meaningful reference variable
        Mouse gamingMouse = new Mouse();

        System.out.println("\n--- Before Reassigning ---\n");

        System.out.println("Type      : " + gamingMouse.type);
        System.out.println("Color     : " + gamingMouse.color);
        System.out.println("DPI       : " + gamingMouse.dpi);
        System.out.println("Gaming    : " + gamingMouse.isGaming);
        System.out.println("Price     : " + gamingMouse.price);

        // Reassigning values
        gamingMouse.type = "Wired";
        gamingMouse.color = "White";
        gamingMouse.dpi = 2400;
        gamingMouse.isGaming = false;
        gamingMouse.price = 499;

        System.out.println("\n--- After Reassigning ---\n");

        System.out.println("Type      : " + gamingMouse.type);
        System.out.println("Color     : " + gamingMouse.color);
        System.out.println("DPI       : " + gamingMouse.dpi);
        System.out.println("Gaming    : " + gamingMouse.isGaming);
        System.out.println("Price     : " + gamingMouse.price);

        // Creating 10 instances
        Mouse officeMouse = new Mouse();
        Mouse gamingMouse2 = new Mouse();
        Mouse wirelessMouse = new Mouse();
        Mouse bluetoothMouse = new Mouse();
        Mouse travelMouse = new Mouse();
        Mouse compactMouse = new Mouse();
        Mouse rgbMouse = new Mouse();
        Mouse silentMouse = new Mouse();
        Mouse ergonomicMouse = new Mouse();
        Mouse budgetMouse = new Mouse();

        System.out.println("\n--- Default Values ---\n");

        // Printing default values (all will be null/0/false)
        System.out.println("Office Mouse Brand: " + officeMouse.brand);
        System.out.println("Gaming Mouse Brand: " + gamingMouse2.brand);
        System.out.println("Wireless Mouse Brand: " + wirelessMouse.brand);
        System.out.println("Bluetooth Mouse Brand: " + bluetoothMouse.brand);
        System.out.println("Travel Mouse Brand: " + travelMouse.brand);
        System.out.println("Compact Mouse Brand: " + compactMouse.brand);
        System.out.println("RGB Mouse Brand: " + rgbMouse.brand);
        System.out.println("Silent Mouse Brand: " + silentMouse.brand);
        System.out.println("Ergonomic Mouse Brand: " + ergonomicMouse.brand);
        System.out.println("Budget Mouse Brand: " + budgetMouse.brand);

        // Assigning values to ALL objects

        // Office Mouse
        officeMouse.brand = "Logitech";
        officeMouse.connectivity = "USB";
        officeMouse.buttons = 3;
        officeMouse.sensorType = "Optical";
        officeMouse.hasRGB = false;
        officeMouse.warranty = 2;
        officeMouse.weight = "100g";
        officeMouse.compatibility = "Windows";
        officeMouse.shape = "Ergonomic";
        officeMouse.finish = "Matte";

        // Gaming Mouse
        gamingMouse2.brand = "Razer";
        gamingMouse2.connectivity = "USB";
        gamingMouse2.buttons = 7;
        gamingMouse2.sensorType = "Laser";
        gamingMouse2.hasRGB = true;
        gamingMouse2.warranty = 2;
        gamingMouse2.weight = "120g";
        gamingMouse2.compatibility = "Windows";
        gamingMouse2.shape = "Gaming";
        gamingMouse2.finish = "Glossy";

        // Wireless Mouse
        wirelessMouse.brand = "HP";
        wirelessMouse.connectivity = "Wireless";
        wirelessMouse.buttons = 3;
        wirelessMouse.sensorType = "Optical";
        wirelessMouse.hasRGB = false;
        wirelessMouse.warranty = 1;
        wirelessMouse.weight = "90g";
        wirelessMouse.compatibility = "All";
        wirelessMouse.shape = "Compact";
        wirelessMouse.finish = "Matte";

        // Bluetooth Mouse
        bluetoothMouse.brand = "Dell";
        bluetoothMouse.connectivity = "Bluetooth";
        bluetoothMouse.buttons = 4;
        bluetoothMouse.sensorType = "Optical";
        bluetoothMouse.hasRGB = false;
        bluetoothMouse.warranty = 2;
        bluetoothMouse.weight = "95g";
        bluetoothMouse.compatibility = "All";
        bluetoothMouse.shape = "Slim";
        bluetoothMouse.finish = "Matte";

        // Travel Mouse
        travelMouse.brand = "Lenovo";
        travelMouse.connectivity = "Wireless";
        travelMouse.buttons = 3;
        travelMouse.sensorType = "Optical";
        travelMouse.hasRGB = false;
        travelMouse.warranty = 1;
        travelMouse.weight = "80g";
        travelMouse.compatibility = "All";
        travelMouse.shape = "Mini";
        travelMouse.finish = "Matte";

        // Compact Mouse
        compactMouse.brand = "Asus";
        compactMouse.connectivity = "USB";
        compactMouse.buttons = 3;
        compactMouse.sensorType = "Optical";
        compactMouse.hasRGB = false;
        compactMouse.warranty = 1;
        compactMouse.weight = "85g";
        compactMouse.compatibility = "Windows";
        compactMouse.shape = "Small";
        compactMouse.finish = "Matte";

        // RGB Mouse
        rgbMouse.brand = "Corsair";
        rgbMouse.connectivity = "USB";
        rgbMouse.buttons = 6;
        rgbMouse.sensorType = "Laser";
        rgbMouse.hasRGB = true;
        rgbMouse.warranty = 2;
        rgbMouse.weight = "110g";
        rgbMouse.compatibility = "Windows";
        rgbMouse.shape = "Gaming";
        rgbMouse.finish = "Glossy";

        // Silent Mouse
        silentMouse.brand = "Logitech Silent";
        silentMouse.connectivity = "Wireless";
        silentMouse.buttons = 3;
        silentMouse.sensorType = "Optical";
        silentMouse.hasRGB = false;
        silentMouse.warranty = 2;
        silentMouse.weight = "95g";
        silentMouse.compatibility = "All";
        silentMouse.shape = "Ergonomic";
        silentMouse.finish = "Matte";

        // Ergonomic Mouse
        ergonomicMouse.brand = "Microsoft";
        ergonomicMouse.connectivity = "Wireless";
        ergonomicMouse.buttons = 5;
        ergonomicMouse.sensorType = "Optical";
        ergonomicMouse.hasRGB = false;
        ergonomicMouse.warranty = 3;
        ergonomicMouse.weight = "130g";
        ergonomicMouse.compatibility = "Windows";
        ergonomicMouse.shape = "Ergonomic";
        ergonomicMouse.finish = "Matte";

        // Budget Mouse
        budgetMouse.brand = "Local";
        budgetMouse.connectivity = "USB";
        budgetMouse.buttons = 2;
        budgetMouse.sensorType = "Optical";
        budgetMouse.hasRGB = false;
        budgetMouse.warranty = 1;
        budgetMouse.weight = "70g";
        budgetMouse.compatibility = "All";
        budgetMouse.shape = "Basic";
        budgetMouse.finish = "Matte";

        System.out.println("\n--- After Assigning Values ---\n");

        // Example printing (repeat same pattern for all)

        System.out.println("Office Mouse:");
        System.out.println("Brand: " + officeMouse.brand);
        System.out.println("Connectivity: " + officeMouse.connectivity);
        System.out.println("Buttons: " + officeMouse.buttons);
        System.out.println("Sensor: " + officeMouse.sensorType);
        System.out.println("RGB: " + officeMouse.hasRGB);
        System.out.println("Warranty: " + officeMouse.warranty);
        System.out.println("Weight: " + officeMouse.weight);
        System.out.println("Compatibility: " + officeMouse.compatibility);
        System.out.println("Shape: " + officeMouse.shape);
        System.out.println("Finish: " + officeMouse.finish);
        System.out.println("----------------------------");

        // Gaming Mouse
        System.out.println("Gaming Mouse:");
        System.out.println("Brand: " + gamingMouse2.brand);
        System.out.println("Connectivity: " + gamingMouse2.connectivity);
        System.out.println("Buttons: " + gamingMouse2.buttons);
        System.out.println("Sensor: " + gamingMouse2.sensorType);
        System.out.println("RGB: " + gamingMouse2.hasRGB);
        System.out.println("Warranty: " + gamingMouse2.warranty);
        System.out.println("Weight: " + gamingMouse2.weight);
        System.out.println("Compatibility: " + gamingMouse2.compatibility);
        System.out.println("Shape: " + gamingMouse2.shape);
        System.out.println("Finish: " + gamingMouse2.finish);
        System.out.println("----------------------------");

        // Wireless Mouse
        System.out.println("Wireless Mouse:");
        System.out.println("Brand: " + wirelessMouse.brand);
        System.out.println("Connectivity: " + wirelessMouse.connectivity);
        System.out.println("Buttons: " + wirelessMouse.buttons);
        System.out.println("Sensor: " + wirelessMouse.sensorType);
        System.out.println("RGB: " + wirelessMouse.hasRGB);
        System.out.println("Warranty: " + wirelessMouse.warranty);
        System.out.println("Weight: " + wirelessMouse.weight);
        System.out.println("Compatibility: " + wirelessMouse.compatibility);
        System.out.println("Shape: " + wirelessMouse.shape);
        System.out.println("Finish: " + wirelessMouse.finish);
        System.out.println("----------------------------");

        // Bluetooth Mouse
        System.out.println("Bluetooth Mouse:");
        System.out.println("Brand: " + bluetoothMouse.brand);
        System.out.println("Connectivity: " + bluetoothMouse.connectivity);
        System.out.println("Buttons: " + bluetoothMouse.buttons);
        System.out.println("Sensor: " + bluetoothMouse.sensorType);
        System.out.println("RGB: " + bluetoothMouse.hasRGB);
        System.out.println("Warranty: " + bluetoothMouse.warranty);
        System.out.println("Weight: " + bluetoothMouse.weight);
        System.out.println("Compatibility: " + bluetoothMouse.compatibility);
        System.out.println("Shape: " + bluetoothMouse.shape);
        System.out.println("Finish: " + bluetoothMouse.finish);
        System.out.println("----------------------------");

        // Travel Mouse
        System.out.println("Travel Mouse:");
        System.out.println("Brand: " + travelMouse.brand);
        System.out.println("Connectivity: " + travelMouse.connectivity);
        System.out.println("Buttons: " + travelMouse.buttons);
        System.out.println("Sensor: " + travelMouse.sensorType);
        System.out.println("RGB: " + travelMouse.hasRGB);
        System.out.println("Warranty: " + travelMouse.warranty);
        System.out.println("Weight: " + travelMouse.weight);
        System.out.println("Compatibility: " + travelMouse.compatibility);
        System.out.println("Shape: " + travelMouse.shape);
        System.out.println("Finish: " + travelMouse.finish);
        System.out.println("----------------------------");

        // Compact Mouse
        System.out.println("Compact Mouse:");
        System.out.println("Brand: " + compactMouse.brand);
        System.out.println("Connectivity: " + compactMouse.connectivity);
        System.out.println("Buttons: " + compactMouse.buttons);
        System.out.println("Sensor: " + compactMouse.sensorType);
        System.out.println("RGB: " + compactMouse.hasRGB);
        System.out.println("Warranty: " + compactMouse.warranty);
        System.out.println("Weight: " + compactMouse.weight);
        System.out.println("Compatibility: " + compactMouse.compatibility);
        System.out.println("Shape: " + compactMouse.shape);
        System.out.println("Finish: " + compactMouse.finish);
        System.out.println("----------------------------");

        // RGB Mouse
        System.out.println("RGB Mouse:");
        System.out.println("Brand: " + rgbMouse.brand);
        System.out.println("Connectivity: " + rgbMouse.connectivity);
        System.out.println("Buttons: " + rgbMouse.buttons);
        System.out.println("Sensor: " + rgbMouse.sensorType);
        System.out.println("RGB: " + rgbMouse.hasRGB);
        System.out.println("Warranty: " + rgbMouse.warranty);
        System.out.println("Weight: " + rgbMouse.weight);
        System.out.println("Compatibility: " + rgbMouse.compatibility);
        System.out.println("Shape: " + rgbMouse.shape);
        System.out.println("Finish: " + rgbMouse.finish);
        System.out.println("----------------------------");

        // Silent Mouse
        System.out.println("Silent Mouse:");
        System.out.println("Brand: " + silentMouse.brand);
        System.out.println("Connectivity: " + silentMouse.connectivity);
        System.out.println("Buttons: " + silentMouse.buttons);
        System.out.println("Sensor: " + silentMouse.sensorType);
        System.out.println("RGB: " + silentMouse.hasRGB);
        System.out.println("Warranty: " + silentMouse.warranty);
        System.out.println("Weight: " + silentMouse.weight);
        System.out.println("Compatibility: " + silentMouse.compatibility);
        System.out.println("Shape: " + silentMouse.shape);
        System.out.println("Finish: " + silentMouse.finish);
        System.out.println("----------------------------");

        // Ergonomic Mouse
        System.out.println("Ergonomic Mouse:");
        System.out.println("Brand: " + ergonomicMouse.brand);
        System.out.println("Connectivity: " + ergonomicMouse.connectivity);
        System.out.println("Buttons: " + ergonomicMouse.buttons);
        System.out.println("Sensor: " + ergonomicMouse.sensorType);
        System.out.println("RGB: " + ergonomicMouse.hasRGB);
        System.out.println("Warranty: " + ergonomicMouse.warranty);
        System.out.println("Weight: " + ergonomicMouse.weight);
        System.out.println("Compatibility: " + ergonomicMouse.compatibility);
        System.out.println("Shape: " + ergonomicMouse.shape);
        System.out.println("Finish: " + ergonomicMouse.finish);
        System.out.println("----------------------------");

        // Budget Mouse
        System.out.println("Budget Mouse:");
        System.out.println("Brand: " + budgetMouse.brand);
        System.out.println("Connectivity: " + budgetMouse.connectivity);
        System.out.println("Buttons: " + budgetMouse.buttons);
        System.out.println("Sensor: " + budgetMouse.sensorType);
        System.out.println("RGB: " + budgetMouse.hasRGB);
        System.out.println("Warranty: " + budgetMouse.warranty);
        System.out.println("Weight: " + budgetMouse.weight);
        System.out.println("Compatibility: " + budgetMouse.compatibility);
        System.out.println("Shape: " + budgetMouse.shape);
        System.out.println("Finish: " + budgetMouse.finish);
        System.out.println("----------------------------");
    }
}