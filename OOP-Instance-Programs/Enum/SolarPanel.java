class SolarPanel {

    String brand;
    double capacity; // in watts

    SolarPanel() {
        System.out.println("Default Constructor of SolarPanel");
    }

    SolarPanel(String brand, double capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("SolarPanel Brand: " + this.brand);
        System.out.println("SolarPanel Capacity: " + this.capacity + "W");
    }
}