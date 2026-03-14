public class Extension {
    public static void main(String[] args) {
        int sockets = 4;
        int cableLengthMeters = 2;
        boolean hasSurgeProtection = true;
        String plugType = "Type G";

        System.out.println("Sockets: " + sockets);
        System.out.println("Cable Length: " + cableLengthMeters + "m");
        System.out.println("Surge Protection: " + hasSurgeProtection);
        System.out.println("Plug Type: " + plugType);

        sockets = 8;
        cableLengthMeters = 5;
        hasSurgeProtection = false;
        plugType = "Type C";

        System.out.println("----updated-----");

        System.out.println("Sockets: " + sockets);
        System.out.println("Cable Length: " + cableLengthMeters + "m");
        System.out.println("Surge Protection: " + hasSurgeProtection);
        System.out.println("Plug Type: " + plugType);
    }
}