class WaterMelon {
    String outerColor;
    double totalWeight;
    String bodyShape;
    boolean seedlessFlag;
    int seedQuantity;
    double costPerUnit;
    String flavorType;
    String placeOfOrigin;
    double sizeDiameter;
    boolean ripeStatus;

    WaterMelon(String outerColor, double totalWeight, String bodyShape, boolean seedlessFlag,
               int seedQuantity, double costPerUnit, String flavorType,
               String placeOfOrigin, double sizeDiameter, boolean ripeStatus) {

        this.outerColor = outerColor;
        this.totalWeight = totalWeight;
        this.bodyShape = bodyShape;
        this.seedlessFlag = seedlessFlag;
        this.seedQuantity = seedQuantity;
        this.costPerUnit = costPerUnit;
        this.flavorType = flavorType;
        this.placeOfOrigin = placeOfOrigin;
        this.sizeDiameter = sizeDiameter;
        this.ripeStatus = ripeStatus;
    }

    void show() {

        System.out.println("--------show method starts--------");
        System.out.println("Outer Color: " + this.outerColor);
        System.out.println("Total Weight: " + this.totalWeight);
        System.out.println("Body Shape: " + this.bodyShape);
        System.out.println("Seedless: " + this.seedlessFlag);
        System.out.println("Seed Quantity: " + this.seedQuantity);
        System.out.println("Cost: " + this.costPerUnit);
        System.out.println("Flavor: " + this.flavorType);
        System.out.println("Origin: " + this.placeOfOrigin);
        System.out.println("Diameter: " + this.sizeDiameter);
        System.out.println("Ripe: " + this.ripeStatus);
        System.out.println("------------show method ends ---------------");
    }
}