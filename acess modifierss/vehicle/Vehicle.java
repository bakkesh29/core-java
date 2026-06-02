package vehicle;

public class Vehicle {
    protected String brand;

    public Vehicle() {
        brand = "Toyota";
    }

    public void display() {
        System.out.println("Brand: " + brand);
    }
}