//class -keyword,data type
//class name Arduino as (blueprint)
class Arduino {
    //Instance Variables-26
    String model;
    int pins;
    String microcontroller;
    String voltage;
    String clockSpeed;
    String memory;
    String connectivity;
    String brand;
    double price;
    String usage;
    String programmingLanguage;
    String usbType;
    String powerSource;
    String compatibility;
    String dimensions;
    String weight;
    String warranty;
    String manufacturingDate;
    String country;
    String packaging;
    String supplier;
    boolean isWiFiEnabled;
    boolean isBluetoothEnabled;
    String version;
    String design;
    String support;


    //Constructor
    //no-argument constructor
    Arduino() {
        //init
        model = "UNO";
        pins = 14;
        microcontroller = "ATmega328P";
        voltage = "5V";
        clockSpeed = "16MHz";
        memory = "32KB";
        connectivity = "USB";
        brand = "Arduino";
        price = 1200.50;
        usage = "Projects";
        programmingLanguage = "C++";
        usbType = "USB-B";
        powerSource = "External";
        compatibility = "Windows/Linux";
        dimensions = "Small";
        weight = "50g";
        warranty = "1 Year";
        manufacturingDate = "2025";
        country = "Italy";
        packaging = "Box";
        supplier = "Arduino Store";
        //Boolean
        isWiFiEnabled = false;
        isBluetoothEnabled = false;
        version = "R3";
        design = "Compact";
        support = "Online";
        //Constructor print
        System.out.println("Arduino constructor");
    }


    //void no return value
    //display() userdef method name
    void display() {
        System.out.println("Model: " + model);
        System.out.println("Pins: " + pins);
        System.out.println("Microcontroller: " + microcontroller);
        System.out.println("Voltage: " + voltage);
        System.out.println("Clock Speed: " + clockSpeed);
        System.out.println("Memory: " + memory);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Usage: " + usage);
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("USB Type: " + usbType);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Weight: " + weight);
        System.out.println("Warranty: " + warranty);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("WiFi Enabled: " + isWiFiEnabled);
        System.out.println("Bluetooth Enabled: " + isBluetoothEnabled);
        System.out.println("Version: " + version);
        System.out.println("Design: " + design);
        System.out.println("Support: " + support);
        System.out.println("----------------------");
        System.out.println("----------------------");
    }
}