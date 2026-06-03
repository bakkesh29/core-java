class Monitor {

    String brand;
    int size;
    String resolution;
    String panelType;
    int refreshRate;
    String color;
    double price;
    String connectivity;
    boolean isCurved;
    boolean hasSpeakers;
    String screenType;
    String aspectRatio;
    String responseTime;
    String brightness;
    String contrastRatio;
    String mountType;
    String usage;
    String powerConsumption;
    String warranty;
    String modelNumber;
    String manufacturingDate;
    String country;
    String standType;
    boolean isTouchScreen;
    String packaging;
    String supplier;

    Monitor() {
        brand = "Dell";
        size = 24;
        resolution = "1920x1080";
        panelType = "IPS";
        refreshRate = 75;
        color = "Black";
        price = 15000.50;
        connectivity = "HDMI, VGA";
        isCurved = false;
        hasSpeakers = true;
        screenType = "LED";
        aspectRatio = "16:9";
        responseTime = "5ms";
        brightness = "250 nits";
        contrastRatio = "1000:1";
        mountType = "Wall Mount";
        usage = "Office";
        powerConsumption = "30W";
        warranty = "3 Years";
        modelNumber = "DELL1234";
        manufacturingDate = "2025";
        country = "India";
        standType = "Adjustable";
        isTouchScreen = false;
        packaging = "Box";
        supplier = "Dell Store";

        System.out.println("Monitor constructor");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Size: " + size);
        System.out.println("Resolution: " + resolution);
        System.out.println("Panel Type: " + panelType);
        System.out.println("Refresh Rate: " + refreshRate);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Curved: " + isCurved);
        System.out.println("Speakers: " + hasSpeakers);
        System.out.println("Screen Type: " + screenType);
        System.out.println("Aspect Ratio: " + aspectRatio);
        System.out.println("Response Time: " + responseTime);
        System.out.println("Brightness: " + brightness);
        System.out.println("Contrast Ratio: " + contrastRatio);
        System.out.println("Mount Type: " + mountType);
        System.out.println("Usage: " + usage);
        System.out.println("Power Consumption: " + powerConsumption);
        System.out.println("Warranty: " + warranty);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Stand Type: " + standType);
        System.out.println("Touch Screen: " + isTouchScreen);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("----------------------");
    }
}