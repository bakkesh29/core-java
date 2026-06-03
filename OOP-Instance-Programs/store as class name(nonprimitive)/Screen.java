class Screen {

    String brand;
    double sizeInInches;
    String resolution;
    String panelType;
    boolean isTouchScreen;
    int refreshRate;
    double price;
    String color;
    String connectivityType;
    boolean curved;

    Screen(String brand, double sizeInInches, String resolution, String panelType,
           boolean isTouchScreen, int refreshRate, double price,
           String color, String connectivityType, boolean curved) {

        this.brand = brand;
        this.sizeInInches = sizeInInches;
        this.resolution = resolution;
        this.panelType = panelType;
        this.isTouchScreen = isTouchScreen;
        this.refreshRate = refreshRate;
        this.price = price;
        this.color = color;
        this.connectivityType = connectivityType;
        this.curved = curved;
    }

    void show() {
        System.out.println("-------- Screen Details --------");
        System.out.println("Brand: " + this.brand);
        System.out.println("Size: " + this.sizeInInches);
        System.out.println("Resolution: " + this.resolution);
        System.out.println("Panel Type: " + this.panelType);
        System.out.println("Touch Screen: " + this.isTouchScreen);
        System.out.println("Refresh Rate: " + this.refreshRate);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Connectivity: " + this.connectivityType);
        System.out.println("Curved: " + this.curved);
        System.out.println("-------------------------------");
    }
}