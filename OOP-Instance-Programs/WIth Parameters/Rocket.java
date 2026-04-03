class Rocket {

    String name;
    String fuelType;
    double price;
    String country;

    // Constructor 1
    Rocket() {
        System.out.println("Default Constructor");
    }

    // Constructor 2
    Rocket(String name, String fuelType) {
        this.name = name;
        this.fuelType = fuelType;
    }

    // Constructor 3
    Rocket(String name, String fuelType, double price) {
        this.name = name;
        this.fuelType = fuelType;
        this.price = price;
    }

    // Constructor 4
    Rocket(String name, String fuelType, double price, String country) {
        this.name = name;
        this.fuelType = fuelType;
        this.price = price;
        this.country = country;
    }

    // Constructor 5 (Copy)
    Rocket(Rocket ref) {
        this.name = ref.name;
        this.fuelType = ref.fuelType;
        this.price = ref.price;
        this.country = ref.country;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Price: " + price);
        System.out.println("Country: " + country);
        System.out.println("------------------");
    }
}