public class Tester {
    public static void main(String[] args) {

        // 🔹 Upcasting (Child → Parent)
        Vehicle v1 = new Car(150, "Audi");   // upcasting
        Vehicle v2 = new Bike(90, "Sports"); // upcasting

        v1.displaySpeed();
        v2.displaySpeed();

        System.out.println("-----");

        // 🔹 Downcasting (Parent → Child)
        Car c1 = (Car) v1;   // downcasting
        c1.showCar();

        Bike b1 = (Bike) v2; // downcasting
        b1.showBike();
    }
}