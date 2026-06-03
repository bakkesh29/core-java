public class SensorRunner {

    public static void main(String[] args) {

        Sensor s1 = new Sensor(1, "Temperature", "Bosch", 200, 1500.0);

        Sensor s2 = new Sensor(2, "Motion", "Sony", 150, 1200.0);

        Sensor s3 = new Sensor(1, "Temperature", "Bosch", 200, 1500.0);

        boolean nullCheck = s1.equals(null);

        boolean check1 = s1.equals(s2);

        boolean check2 = s1.equals(s3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("s1 equals s2 : " + check1);

        System.out.println("s1 equals s3 : " + check2);
    }
}