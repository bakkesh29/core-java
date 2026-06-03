class GunArrayDemo {

    public static void main(String[] args) {

        String[] guns = {
            "AK-47", "M16", "Glock 17", "Desert Eagle", "MP5",
            "Uzi", "Famas", "SCAR-L", "SCAR-H", "M4 Carbine",
            "Remington 870", "Barrett M82", "AWM", "P90", "Galil",
            "SIG Sauer P226", "Beretta M9", "Colt 1911", "Steyr AUG", "Tavor X95",
            "FN Five-seveN", "CZ 75", "HK416", "Saiga-12", "Dragunov",
            "Winchester Model 70", "Lee-Enfield", "Thompson SMG", "RPK", "PP-19 Bizon"
        };

        // Print all

         // int size =guns.length;
        // System.out.println("cars are : "+size);
        
        for (int index = 0; index < guns.length; index++) {
            System.out.println(guns[index]);
        }

        // Update
        guns[5] = "Mini Uzi";

        System.out.println("\nAfter Update:");
        for (int count = 0; count < guns.length; count++) {
            System.out.println(guns[count]);
        }

        // Reverse
        System.out.println("\nReverse:");
        for (int rev = guns.length - 1; rev >= 0; rev--) {
            System.out.println(guns[rev]);
        }

        // Exception demo
        System.out.println("\nException:");
        System.out.println(guns[30]); //  error
    }
}