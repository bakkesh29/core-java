class Engine {

    String type;
    int horsepower;
    String fuelType;
    String coolingType;
    String brand;
    double price;
    String modelNumber;
    String manufacturingDate;
    String country;
    String usage;
    String material;
    String cylinder;
    String torque;
    String displacement;
    String ignitionType;
    String lubrication;
    String warranty;
    String weight;
    String dimensions;
    String efficiency;
    String emissionStandard;
    String packaging;
    String supplier;
    boolean isTurbo;
    boolean isElectric;
    String design;

    Engine() {
        type = "Diesel";
        horsepower = 150;
        fuelType = "Diesel";
        coolingType = "Water Cooled";
        brand = "Bosch";
        price = 75000.50;
        modelNumber = "ENG123";
        manufacturingDate = "2025";
        country = "India";
        usage = "Automobile";
        material = "Steel";
        cylinder = "4 Cylinder";
        torque = "300Nm";
        displacement = "2000cc";
        ignitionType = "Compression";
        lubrication = "Oil";
        warranty = "3 Years";
        weight = "150kg";
        dimensions = "Large";
        efficiency = "High";
        emissionStandard = "BS6";
        packaging = "Box";
        supplier = "Bosch Store";
        isTurbo = true;
        isElectric = false;
        design = "Modern";

        System.out.println("Engine constructor");
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Horsepower: " + horsepower);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Cooling Type: " + coolingType);
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Usage: " + usage);
        System.out.println("Material: " + material);
        System.out.println("Cylinder: " + cylinder);
        System.out.println("Torque: " + torque);
        System.out.println("Displacement: " + displacement);
        System.out.println("Ignition Type: " + ignitionType);
        System.out.println("Lubrication: " + lubrication);
        System.out.println("Warranty: " + warranty);
        System.out.println("Weight: " + weight);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Efficiency: " + efficiency);
        System.out.println("Emission Standard: " + emissionStandard);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Turbo: " + isTurbo);
        System.out.println("Electric: " + isElectric);
        System.out.println("Design: " + design);
        System.out.println("----------------------");
    }
}