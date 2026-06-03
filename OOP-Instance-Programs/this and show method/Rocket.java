class Rocket {

    String name;
    String fuel;
    String color;
    String type;
    String agency;
    String origin;
    double price;
    double weight;
    boolean reusable;
    int stages;

    Rocket(String name, String fuel, String color, double price, double weight,
           String type, String agency, boolean reusable, int stages, String origin) {

        this.name = name;
        this.fuel = fuel;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.type = type;
        this.agency = agency;
        this.reusable = reusable;
        this.stages = stages;
        this.origin = origin;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Fuel: " + fuel);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Type: " + type);
        System.out.println("Agency: " + agency);
        System.out.println("Reusable: " + reusable);
        System.out.println("Stages: " + stages);
        System.out.println("Origin: " + origin);
        System.out.println("--------------------------");
    }
}