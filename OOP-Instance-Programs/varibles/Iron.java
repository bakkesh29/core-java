class Iron {

    String type;
    int power;
    String brand;
    String color;
    double price;
    String material;
    boolean isSteam;
    boolean isPortable;
    String temperatureControl;
    String soleplateType;
    String cordType;
    int weight;
    String voltage;
    String warranty;
    String modelNumber;
    String manufacturingDate;
    String country;
    String usage;
    String waterTankCapacity;
    String heatUpTime;
    String safetyFeature;
    String design;
    String packaging;
    String supplier;
    boolean autoShutOff;
    String indicatorType;

    Iron() {
        type = "Steam";
        power = 1000;
        brand = "Philips";
        color = "Blue";
        price = 2500.75;
        material = "Plastic";
        isSteam = true;
        isPortable = true;
        temperatureControl = "Adjustable";
        soleplateType = "Ceramic";
        cordType = "360 Swivel";
        weight = 2;
        voltage = "220V";
        warranty = "2 Years";
        modelNumber = "PH1234";
        manufacturingDate = "2025";
        country = "India";
        usage = "Home";
        waterTankCapacity = "300ml";
        heatUpTime = "30 sec";
        safetyFeature = "Overheat Protection";
        design = "Modern";
        packaging = "Box";
        supplier = "Philips Store";
        autoShutOff = true;
        indicatorType = "LED";

        System.out.println("Iron constructor");
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Power: " + power);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Material: " + material);
        System.out.println("Steam: " + isSteam);
        System.out.println("Portable: " + isPortable);
        System.out.println("Temperature Control: " + temperatureControl);
        System.out.println("Soleplate Type: " + soleplateType);
        System.out.println("Cord Type: " + cordType);
        System.out.println("Weight: " + weight);
        System.out.println("Voltage: " + voltage);
        System.out.println("Warranty: " + warranty);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Usage: " + usage);
        System.out.println("Water Tank Capacity: " + waterTankCapacity);
        System.out.println("Heat Up Time: " + heatUpTime);
        System.out.println("Safety Feature: " + safetyFeature);
        System.out.println("Design: " + design);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Auto Shut Off: " + autoShutOff);
        System.out.println("Indicator Type: " + indicatorType);
        System.out.println("----------------------");
    }
}