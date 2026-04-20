public class MainRunner {
    public static void main(String[] args) {

        Power p1 = new Power(220, "AC", "Home");
        Power p2 = new Power(110, "DC", "Office");

        System.out.println("---- Power Details ----");

        p1.display();
        System.out.println();

        p2.display();
    }
}