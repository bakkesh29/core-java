public class MainRunner7 {
    public static void main(String[] args) {
        KitchenKnife k1 = new KitchenKnife(10, "Steel", "Cutting");
        KitchenKnife k2 = new KitchenKnife(12, "Iron", "Chopping");

        System.out.println("---- Knife Details ----");

        k1.display();
        System.out.println();

        k2.display();
    }
}
