class PlayStationRunner {
    public static void main(String[] args) {

        // 5 instances
        PlayStation ps5 = new PlayStation();
        PlayStation ps4 = new PlayStation();
        PlayStation ps3 = new PlayStation();
        PlayStation psSlim = new PlayStation();
        PlayStation psPro = new PlayStation();

        System.out.println("\n--- Before Assigning Values ---\n");

        // Default values
        System.out.println(ps5.model + " " + ps5.brand + " " + ps5.price + " " + ps5.storage + " " + ps5.isWireless);
        System.out.println(ps4.model + " " + ps4.brand + " " + ps4.price + " " + ps4.storage + " " + ps4.isWireless);
        System.out.println(ps3.model + " " + ps3.brand + " " + ps3.price + " " + ps3.storage + " " + ps3.isWireless);
        System.out.println(psSlim.model + " " + psSlim.brand + " " + psSlim.price + " " + psSlim.storage + " " + psSlim.isWireless);
        System.out.println(psPro.model + " " + psPro.brand + " " + psPro.price + " " + psPro.storage + " " + psPro.isWireless);

        // Assign values
        ps5.model="PS5"; ps5.brand="Sony"; ps5.price=50000; ps5.storage=825; ps5.isWireless=true;
        ps4.model="PS4"; ps4.brand="Sony"; ps4.price=30000; ps4.storage=500; ps4.isWireless=true;
        ps3.model="PS3"; ps3.brand="Sony"; ps3.price=20000; ps3.storage=320; ps3.isWireless=false;
        psSlim.model="PS4 Slim"; psSlim.brand="Sony"; psSlim.price=28000; psSlim.storage=500; psSlim.isWireless=true;
        psPro.model="PS4 Pro"; psPro.brand="Sony"; psPro.price=35000; psPro.storage=1000; psPro.isWireless=true;

        System.out.println("\n--- After Assigning Values ---\n");

        // Updated values
        System.out.println(ps5.model + " " + ps5.brand + " " + ps5.price + " " + ps5.storage + " " + ps5.isWireless);
        System.out.println(ps4.model + " " + ps4.brand + " " + ps4.price + " " + ps4.storage + " " + ps4.isWireless);
        System.out.println(ps3.model + " " + ps3.brand + " " + ps3.price + " " + ps3.storage + " " + ps3.isWireless);
        System.out.println(psSlim.model + " " + psSlim.brand + " " + psSlim.price + " " + psSlim.storage + " " + psSlim.isWireless);
        System.out.println(psPro.model + " " + psPro.brand + " " + psPro.price + " " + psPro.storage + " " + psPro.isWireless);
    }
}