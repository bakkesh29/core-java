public class MainRunner9 {
    public static void main(String[] args) {
        GymDumbBell d1 = new GymDumbBell(10, "Rubber", "Nike");
        GymDumbBell d2 = new GymDumbBell(20, "Iron", "Adidas");

        System.out.println("---- DumbBell Details ----");

        d1.display();
        System.out.println();

        d2.display();
    }
}
