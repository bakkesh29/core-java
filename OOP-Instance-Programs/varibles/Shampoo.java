class Shampoo {

    String brand;
    String type;
    String fragrance;
    double price;
    String quantity;
    String color;
    String hairType;
    String ingredients;
    String usage;
    String packaging;
    String supplier;
    String manufacturingDate;
    String expiryDate;
    String country;
    String warranty;
    String modelNumber;
    boolean isHerbal;
    boolean isChemicalFree;
    String texture;
    String latherType;
    String bottleType;
    String design;
    String benefits;
    String pHLevel;
    String certification;
    String targetGender;

    Shampoo() {
        brand = "Clinic Plus";
        type = "Anti-dandruff";
        fragrance = "Mild";
        price = 250.75;
        quantity = "200ml";
        color = "White";
        hairType = "All";
        ingredients = "Herbal";
        usage = "Hair Wash";
        packaging = "Bottle";
        supplier = "Store";
        manufacturingDate = "2025";
        expiryDate = "2027";
        country = "India";
        warranty = "N/A";
        modelNumber = "SHP123";
        isHerbal = true;
        isChemicalFree = false;
        texture = "Smooth";
        latherType = "Foamy";
        bottleType = "Plastic";
        design = "Modern";
        benefits = "Anti Hair Fall";
        pHLevel = "Balanced";
        certification = "ISO";
        targetGender = "Unisex";

        System.out.println("Shampoo constructor");
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Fragrance: " + fragrance);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Color: " + color);
        System.out.println("Hair Type: " + hairType);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Usage: " + usage);
        System.out.println("Packaging: " + packaging);
        System.out.println("Supplier: " + supplier);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Country: " + country);
        System.out.println("Warranty: " + warranty);
        System.out.println("Model Number: " + modelNumber);
        System.out.println("Herbal: " + isHerbal);
        System.out.println("Chemical Free: " + isChemicalFree);
        System.out.println("Texture: " + texture);
        System.out.println("Lather Type: " + latherType);
        System.out.println("Bottle Type: " + bottleType);
        System.out.println("Design: " + design);
        System.out.println("Benefits: " + benefits);
        System.out.println("pH Level: " + pHLevel);
        System.out.println("Certification: " + certification);
        System.out.println("Target Gender: " + targetGender);
        System.out.println("----------------------");
    }
}