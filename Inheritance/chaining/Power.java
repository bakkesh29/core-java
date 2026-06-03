class Power extends Electricity {
    String location;

    Power(int voltage, String type, String location) {
        super(voltage, type); // Chaining
        this.location = location;
        System.out.println("Power constructor");
    }

    void display() {
        System.out.println("Voltage: " + voltage);
        System.out.println("Type: " + type);
        System.out.println("Location: " + location);
    }
}