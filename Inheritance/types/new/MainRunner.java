public class MainRunner {
    public static void main(String[] args) {
        
        Car car = new Car(120, "BMW");
        car.displaySpeed();
        car.showCar();

        System.out.println("-----");

        Bike bike = new Bike(80, "Sports");
        bike.displaySpeed();
        bike.showBike();
    }
}