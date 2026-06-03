class GymDumbBell extends DumbBells {
    String brand;

    GymDumbBell(int weight, String type, String brand) {
        super(weight, type); // constructor chaining
        this.brand = brand;
        System.out.println("GymDumbBell constructor");
    }

    void display() {
        System.out.println("Weight: " + weight);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }
}