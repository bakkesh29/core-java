class Clock {

    String brand;
    String type;
    String color;
    double price;
    String displayType;
    String material;
    String shape;
    String powerSource;
    boolean isDigital;
    boolean hasAlarm;
    String timeFormat;
    String modelNumber;
    String manufacturingDate;
    String country;
    String usage;
    String warranty;
    String weight;
    String dimensions;
    String batteryType;
    String design;
    String packaging;
    String supplier;
    String soundType;
    String glassType;
    boolean isWaterResistant;
    String mountType;

    Clock() {
        brand = "Titan";
        type = "Wall Clock";
        color = "Black";
        price = 1500.50;
        displayType = "Analog";
        material = "Plastic";
        shape = "Round";
        powerSource = "Battery";
        isDigital = false;
        hasAlarm = false;
        timeFormat = "12 Hour";
        modelNumber = "CLK123";
        manufacturingDate = "2025";
        country = "India";
        usage = "Home";
        warranty = "1 Year";
        weight = "500g";
        dimensions = "30cm";
        batteryType = "AA";
        design = "Classic";
        packaging = "Box";
        supplier = "Titan Store";
        soundType = "Tick";
        glassType = "Normal";
        isWaterResistant = false;
        mountType = "Wall";

        System.out.println("Clock constructor");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Display Type: " + displayType);
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Power Source: " + powerSource);
        System.out.println("Digital: " + isDigital);
        System.out.println("Alarm: " + hasAlarm);
        System.out.println("Time Format: " + timeFormat);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Usage: " + usage);
        System.out.println("Warranty: " + warranty);
        System.out.println("Weight: " + weight);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Battery Type: " + batteryType);
        System.out.println("Design: " + design);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Sound Type: " + soundType);
        System.out.println("Glass Type: " + glassType);
        System.out.println("Water Resistant: " + isWaterResistant);
        System.out.println("Mount Type: " + mountType);
        System.out.println("----------------------");
    }
}