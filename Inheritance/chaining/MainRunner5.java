public class MainRunner5 {
    public static void main(String[] args) {
        LaptopPad tp1 = new LaptopPad(5, "Capacitive", "Dell");
        LaptopPad tp2 = new LaptopPad(6, "Resistive", "HP");

        System.out.println("---- TouchPad Details ----");

        tp1.display();
        System.out.println();

        tp2.display();
    }
}
