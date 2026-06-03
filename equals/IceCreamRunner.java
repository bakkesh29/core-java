public class IceCreamRunner {

    public static void main(String[] args) {

        IceCream i1 = new IceCream(1, "Chocolate", "Arun", 2, 120.0);

        IceCream i2 = new IceCream(2, "Vanilla", "Amul", 1, 80.0);

        IceCream i3 = new IceCream(1, "Chocolate", "Arun", 2, 120.0);

        boolean nullCheck = i1.equals(null);

        boolean check1 = i1.equals(i2);

        boolean check2 = i1.equals(i3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("i1 equals i2 : " + check1);

        System.out.println("i1 equals i3 : " + check2);
    }
}