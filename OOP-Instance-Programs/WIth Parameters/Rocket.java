class Rocket {

    String name;
    String country;
    double cost;
    String type;
    int stages;

    Rocket() {
        System.out.println("Default Constructor");
    }

    Rocket(String name, String country) {
        this.name = name;
        this.country = country;
    }

    Rocket(String name, String country, double cost) {
        this.name = name;
        this.country = country;
        this.cost = cost;
    }

    Rocket(String name, String country, double cost, String type) {
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.type = type;
    }

    Rocket(String name, String country, double cost, String type, int stages) {
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.type = type;
        this.stages = stages;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Country: " + country);
        System.out.println("Cost: " + cost);
        System.out.println("Type: " + type);
        System.out.println("Stages: " + stages);
        System.out.println("------------------");
    }
}