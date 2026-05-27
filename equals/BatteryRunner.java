public class BatteryRunner {

    public static void main(String[] args) {

        Battery b1 = new Battery(1, "Exide", "Lithium", 5000, 12.0);

        Battery b2 = new Battery(2, "Amaron", "Lead Acid", 4500, 10.0);

        Battery b3 = new Battery(1, "Exide", "Lithium", 5000, 12.0);

        boolean nullCheck = b1.equals(null);

        boolean check1 = b1.equals(b2);

        boolean check2 = b1.equals(b3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("b1 equals b2 : " + check1);

        System.out.println("b1 equals b3 : " + check2);
    }
}