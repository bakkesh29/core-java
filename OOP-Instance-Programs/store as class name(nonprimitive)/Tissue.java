class Tissue {

    String brand;
    int plyCount;
    String type;
    boolean scented;
    int sheetCount;
    double price;
    String color;
    String material;
    boolean biodegradable;
    String packagingType;

    Tissue(String brand, int plyCount, String type, boolean scented,
           int sheetCount, double price, String color,
           String material, boolean biodegradable, String packagingType) {

        this.brand = brand;
        this.plyCount = plyCount;
        this.type = type;
        this.scented = scented;
        this.sheetCount = sheetCount;
        this.price = price;
        this.color = color;
        this.material = material;
        this.biodegradable = biodegradable;
        this.packagingType = packagingType;
    }

    void show() {
        System.out.println("-------- Tissue Details --------");
        System.out.println("Brand: " + this.brand);
        System.out.println("Ply Count: " + this.plyCount);
        System.out.println("Type: " + this.type);
        System.out.println("Scented: " + this.scented);
        System.out.println("Sheet Count: " + this.sheetCount);
        System.out.println("Price: " + this.price);
        System.out.println("Color: " + this.color);
        System.out.println("Material: " + this.material);
        System.out.println("Biodegradable: " + this.biodegradable);
        System.out.println("Packaging: " + this.packagingType);
        System.out.println("-------------------------------");
    }
}