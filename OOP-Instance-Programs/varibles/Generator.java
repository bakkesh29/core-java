class Generator {

    String fuelType;
    int capacity;
    String brand;
    double price;
    String modelNumber;
    String color;
    String phase;
    String coolingType;
    String startType;
    String voltage;
    String frequency;
    String engineType;
    int powerOutput;
    String noiseLevel;
    String fuelTankCapacity;
    String runtime;
    String material;
    String usage;
    String warranty;
    String manufacturingDate;
    String country;
    String controlPanelType;
    boolean isPortable;
    boolean hasElectricStart;
    String packaging;
    String supplier;

    Generator() {
        fuelType = "Petrol";
        capacity = 5000;
        brand = "Honda";
        price = 45000.75;
        modelNumber = "GEN5000";
        color = "Red";
        phase = "Single Phase";
        coolingType = "Air Cooled";
        startType = "Manual";
        voltage = "230V";
        frequency = "50Hz";
        engineType = "4 Stroke";
        powerOutput = 4500;
        noiseLevel = "70dB";
        fuelTankCapacity = "15L";
        runtime = "8 hours";
        material = "Metal";
        usage = "Home Backup";
        warranty = "2 Years";
        manufacturingDate = "2025";
        country = "India";
        controlPanelType = "Digital";
        isPortable = true;
        hasElectricStart = false;
        packaging = "Box";
        supplier = "Honda Store";

        System.out.println("Generator constructor");
    }

    void display() {
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Capacity: " + capacity);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Color: " + color);
        System.out.println("Phase: " + phase);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Start Type: " + startType);
        System.out.println("Voltage: " + voltage);
        System.out.println("Frequency: " + frequency);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Power Output: " + powerOutput);
        System.out.println("Noise Level: " + noiseLevel);
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity);
        System.out.println("Runtime: " + runtime);
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Warranty: " + warranty);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Control Panel: " + controlPanelType);
        System.out.println("Portable: " + isPortable);
        System.out.println("Electric Start: " + hasElectricStart);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("----------------------");
    }
}