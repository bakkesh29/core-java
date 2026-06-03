package vehicle;

public class Driver {
    public void drive() {

        Vehicle v = new Vehicle();
        System.out.println("Driver accesses Brand: "
                           + v.brand);
    }
}