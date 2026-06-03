package transport;
import vehicle.Vehicle;

public class Mechanic {
    public void repair() {
        Vehicle v = new Vehicle();
        // (v.brand);
        System.out.println(
        "Cannot access protected variable here" + v);
    }
}