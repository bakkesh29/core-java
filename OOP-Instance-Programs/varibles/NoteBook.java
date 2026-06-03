class NoteBook {

    String size;
    int noOfPages;
    String brand;
    String type;
    String color;
    double price;
    String paperQuality;
    String bindingType;
    boolean isRuled;
    boolean isHardCover;
    String manufacturer;
    String country;
    double weight;
    String shape;
    String coverMaterial;
    String pageColor;
    int thickness;
    String design;
    boolean isEcoFriendly;
    String usage;
    String inkType;
    String packaging;
    String edition;
    String language;
    String barcode;
    String supplier;

    NoteBook() {
        size = "25cm";
        noOfPages = 100;
        brand = "Classmate";
        type = "Spiral";
        color = "Blue";
        price = 120.50;
        paperQuality = "Premium";
        bindingType = "Spiral Binding";
        isRuled = true;
        isHardCover = false;
        manufacturer = "ITC";
        country = "India";
        weight = 0.5;
        shape = "Rectangle";
        coverMaterial = "Cardboard";
        pageColor = "White";
        thickness = 2;
        design = "Plain";
        isEcoFriendly = true;
        usage = "School";
        inkType = "Ball Pen";
        packaging = "Single";
        edition = "2024";
        language = "English";
        barcode = "NB123456";
        supplier = "Local Store";

        System.out.println("no arg constructor");
    }

    void display() {
        System.out.println("Size: " + size);
        System.out.println("Pages: " + noOfPages);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Paper Quality: " + paperQuality);
        System.out.println("Binding: " + bindingType);
        System.out.println("Ruled: " + isRuled);
        System.out.println("Hard Cover: " + isHardCover);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country: " + country);
        System.out.println("Weight: " + weight);
        System.out.println("Shape: " + shape);
        System.out.println("Cover: " + coverMaterial);
        System.out.println("Page Color: " + pageColor);
        System.out.println("Thickness: " + thickness);
        System.out.println("Design: " + design);
        System.out.println("Eco Friendly: " + isEcoFriendly);
        System.out.println("Usage: " + usage);
        System.out.println("Ink Type: " + inkType);
        System.out.println("Packaging: " + packaging);
        System.out.println("Edition: " + edition);
        System.out.println("Language: " + language);
        System.out.println("Barcode: " + barcode);
        System.out.println("Supplier: " + supplier);
    }
}