public class MainRunner10 {
    public static void main(String[] args) {
        FurnitureWood w1 = new FurnitureWood("Teak", 10, "Table");
        FurnitureWood w2 = new FurnitureWood("Oak", 15, "Chair");

        System.out.println("---- Wood Details ----");

        w1.display();
        System.out.println();

        w2.display();
    }
}
