public class ApplicationRunner {

    public static void main(String[] args) {

        Application a1 = new Application(1, "Instagram", "Meta", 5000000, 4.5);

        Application a2 = new Application(2, "WhatsApp", "Meta", 8000000, 4.7);

        Application a3 = new Application(1, "Instagram", "Meta", 5000000, 4.5);

        boolean nullCheck = a1.equals(null);

        boolean check1 = a1.equals(a2);

        boolean check2 = a1.equals(a3);

        System.out.println("Null Check : " + nullCheck);

        System.out.println("a1 equals a2 : " + check1);

        System.out.println("a1 equals a3 : " + check2);
    }
}