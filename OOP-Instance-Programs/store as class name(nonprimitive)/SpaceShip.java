class SpaceShip {

    String name;
    String type;
    double speed;
    int crewCapacity;
    boolean reusable;
    String agency;
    double fuelCapacity;
    String destination;
    double cost;
    boolean manned;

    SpaceShip(String name, String type, double speed, int crewCapacity,
              boolean reusable, String agency, double fuelCapacity,
              String destination, double cost, boolean manned) {

        this.name = name;
        this.type = type;
        this.speed = speed;
        this.crewCapacity = crewCapacity;
        this.reusable = reusable;
        this.agency = agency;
        this.fuelCapacity = fuelCapacity;
        this.destination = destination;
        this.cost = cost;
        this.manned = manned;
    }

    void show() {

        System.out.println("--------show method starts--------");
        System.out.println("Name: " + this.name);
        System.out.println("Type: " + this.type);
        System.out.println("Speed: " + this.speed);
        System.out.println("Crew Capacity: " + this.crewCapacity);
        System.out.println("Reusable: " + this.reusable);
        System.out.println("Agency: " + this.agency);
        System.out.println("Fuel Capacity: " + this.fuelCapacity);
        System.out.println("Destination: " + this.destination);
        System.out.println("Cost: " + this.cost);
        System.out.println("Manned: " + this.manned);
        System.out.println("------------show method ends---------------");
    }
}