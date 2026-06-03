class Stand {

    String material;
    String usage;
    String color;
    double price;
    String brand;
    String type;
    String size;
    String weight;
    String design;
    String shape;
    String durability;
    String compatibility;
    String height;
    String width;
    String length;
    String warranty;
    String modelNumber;
    String manufacturingDate;
    String country;
    String packaging;
    String supplier;
    boolean isAdjustable;
    boolean isPortable;
    String finish;
    String stability;
    String support;

    Stand() {
        material = "Steel";
        usage = "Laptop";
        color = "Black";
        price = 1200.50;
        brand = "Generic";
        type = "Foldable";
        size = "Medium";
        weight = "1kg";
        design = "Modern";
        shape = "Rectangle";
        durability = "High";
        compatibility = "Universal";
        height = "10cm";
        width = "25cm";
        length = "30cm";
        warranty = "1 Year";
        modelNumber = "STD123";
        manufacturingDate = "2025";
        country = "India";
        packaging = "Box";
        supplier = "Local Store";
        isAdjustable = true;
        isPortable = true;
        finish = "Matte";
        stability = "Strong";
        support = "Good";

        System.out.println("Stand constructor");
    }

    void display() {
        System.out.println("Material: " + material);
        System.out.println("Usage: " + usage);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Design: " + design);
        System.out.println("Shape: " + shape);
        System.out.println("Durability: " + durability);
        System.out.println("Compatibility: " + compatibility);
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Length: " + length);
        System.out.println("Warranty: " + warranty);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Portable: " + isPortable);
        System.out.println("Finish: " + finish);
        System.out.println("Stability: " + stability);
        System.out.println("Support: " + support);
        System.out.println("----------------------");
    }
}