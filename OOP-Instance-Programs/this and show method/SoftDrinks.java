class SoftDrink {

    String brand; 
    String flavor;
    String color;
    String type;
    String size;
    String origin; 
    double price;
    double volume;
    boolean cold;
    int expiry;

    SoftDrink(String brand, String flavor, String color, double price, double volume,
              String type, String size, boolean cold, int expiry, String origin) {

        this.brand = brand;
        this.flavor = flavor;
        this.color = color;
        this.price = price;
        this.volume = volume;
        this.type = type;
        this.size = size;
        this.cold = cold;
        this.expiry = expiry;
        this.origin = origin;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Volume: " + volume);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Cold: " + cold);
        System.out.println("Expiry: " + expiry);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}