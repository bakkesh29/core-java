class Laser {

    String type;
    double wavelength;
    String color;
    boolean isVisible;
    double power;
    String usage;
    String brand;
    String origin;
    double price;
    boolean portable;

    Laser(String type, double wavelength, String color, boolean isVisible,
          double power, String usage, String brand,
          String origin, double price, boolean portable) {

        this.type = type;
        this.wavelength = wavelength;
        this.color = color;
        this.isVisible = isVisible;
        this.power = power;
        this.usage = usage;
        this.brand = brand;
        this.origin = origin;
        this.price = price;
        this.portable = portable;
    }

    void show() {

        System.out.println("--------show method starts--------");
        System.out.println("Type: " + this.type);
        System.out.println("Wavelength: " + this.wavelength);
        System.out.println("Color: " + this.color);
        System.out.println("Visible: " + this.isVisible);
        System.out.println("Power: " + this.power);
        System.out.println("Usage: " + this.usage);
        System.out.println("Brand: " + this.brand);
        System.out.println("Origin: " + this.origin);
        System.out.println("Price: " + this.price);
        System.out.println("Portable: " + this.portable);
        System.out.println("------------show method ends---------------");
    }
}