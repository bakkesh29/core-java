public class MainRunner4 {
    public static void main(String[] args) {
        Label t1 = new Label(1, "Tag1", "Office");
        Label t2 = new Label(2, "Tag2", "School");

        System.out.println("---- Tag Details ----");

        t1.display();
        System.out.println();

        t2.display();
    }
}
