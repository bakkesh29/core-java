public class MainRunner8 {
    public static void main(String[] args) {
        SewingThread th1 = new SewingThread(10, "Red", "Cotton");
        SewingThread th2 = new SewingThread(20, "Blue", "Silk");

        System.out.println("---- Thread Details ----");

        th1.display();
        System.out.println();

        th2.display();
    }
}
