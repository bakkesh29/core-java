public class TransportModeRunner {

    public static void main(String[] args) {

        TransportMode t1 = new TransportMode(1, "Bus", "Diesel", 50, 25.0);

        TransportMode t2 = new TransportMode(2, "Metro", "Electric", 300, 40.0);

        TransportMode t3 = new TransportMode(1, "Bus", "Diesel", 50, 25.0);

        boolean nullCheck = t1.equals(null);

        boolean check1 = t1.equals(t2);

        boolean check2 = t1.equals(t3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("t1 equals t2 : " + check1);

        System.out.println("t1 equals t3 : " + check2);
    }
}