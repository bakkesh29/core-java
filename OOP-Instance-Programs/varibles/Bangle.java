class Bangle {

    String material;
    String color;
    double price;
    String size;
    String design;
    String brand;
    String type;
    String weight;
    String shape;
    String finish;
    String pattern;
    String occasion;
    String gender;
    String warranty;
    String modelNumber;
    String manufacturingDate;
    String country;
    String usage;
    String packaging;
    String supplier;
    boolean isAdjustable;
    boolean isHandmade;
    String polishType;
    String durability;
    String setType;
    String style;

    Bangle() {
        material = "Gold";
        color = "Red";
        price = 5000.75;
        size = "Medium";
        design = "Traditional";
        brand = "Tanishq";
        type = "Jewelry";
        weight = "20g";
        shape = "Round";
        finish = "Glossy";
        pattern = "Floral";
        occasion = "Wedding";
        gender = "Female";
        warranty = "1 Year";
        modelNumber = "BNG123";
        manufacturingDate = "2025";
        country = "India";
        usage = "Occasion Wear";
        packaging = "Box";
        supplier = "Jewelry Store";
        isAdjustable = false;
        isHandmade = true;
        polishType = "Gold Polish";
        durability = "High";
        setType = "Pair";
        style = "Ethnic";

        System.out.println("Bangle constructor");
    }

    void display() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Size: " + size);
        System.out.println("Design: " + design);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Finish: " + finish);
        System.out.println("Pattern: " + pattern);
        System.out.println("Occasion: " + occasion);
        System.out.println("Gender: " + gender);
        System.out.println("Warranty: " + warranty);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Country: " + country);
        System.out.println("Usage: " + usage);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Adjustable: " + isAdjustable);
        System.out.println("Handmade: " + isHandmade);
        System.out.println("Polish Type: " + polishType);
        System.out.println("Durability: " + durability);
        System.out.println("Set Type: " + setType);
        System.out.println("Style: " + style);
        System.out.println("----------------------");
    }
}