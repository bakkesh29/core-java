class IpadRunner {
    public static void main(String[] args) {

        // Ipad = class (data type)
        // ipadAir = reference variable
        // new Ipad() = (calls constructor)

        // Declaration and initialization 
        Ipad ipadAir = new Ipad();
        Ipad ipadPro = new Ipad();
        Ipad ipadMini = new Ipad();
        Ipad ipadGen10 = new Ipad();
        Ipad ipadGen9 = new Ipad();

        System.out.println("\n--- Before Assigning Values (Default Values) ---\n");

        // Default values:
        System.out.println(ipadAir.model + " " + ipadAir.brand + " " + ipadAir.price + " " + ipadAir.storage + " " + ipadAir.available);
        System.out.println(ipadPro.model + " " + ipadPro.brand + " " + ipadPro.price + " " + ipadPro.storage + " " + ipadPro.available);
        System.out.println(ipadMini.model + " " + ipadMini.brand + " " + ipadMini.price + " " + ipadMini.storage + " " + ipadMini.available);
        System.out.println(ipadGen10.model + " " + ipadGen10.brand + " " + ipadGen10.price + " " + ipadGen10.storage + " " + ipadGen10.available);
        System.out.println(ipadGen9.model + " " + ipadGen9.brand + " " + ipadGen9.price + " " + ipadGen9.storage + " " + ipadGen9.available);

        // Assigning values

        ipadAir.model = "iPad Air";
        ipadAir.brand = "Apple";
        ipadAir.price = 60000;
        ipadAir.storage = 128;
        ipadAir.available = true;

        ipadPro.model = "iPad Pro";
        ipadPro.brand = "Apple";
        ipadPro.price = 90000;
        ipadPro.storage = 256;
        ipadPro.available = true;

        ipadMini.model = "iPad Mini";
        ipadMini.brand = "Apple";
        ipadMini.price = 50000;
        ipadMini.storage = 64;
        ipadMini.available = true;

        ipadGen10.model = "iPad Gen 10";
        ipadGen10.brand = "Apple";
        ipadGen10.price = 45000;
        ipadGen10.storage = 128;
        ipadGen10.available = true;

        ipadGen9.model = "iPad Gen 9";
        ipadGen9.brand = "Apple";
        ipadGen9.price = 35000;
        ipadGen9.storage = 64;
        ipadGen9.available = false;

        System.out.println("\n--- After Assigning Values ---\n");

        // Printing updated values
        System.out.println(ipadAir.model + " " + ipadAir.brand + " " + ipadAir.price + " " + ipadAir.storage + " " + ipadAir.available);
        System.out.println(ipadPro.model + " " + ipadPro.brand + " " + ipadPro.price + " " + ipadPro.storage + " " + ipadPro.available);
        System.out.println(ipadMini.model + " " + ipadMini.brand + " " + ipadMini.price + " " + ipadMini.storage + " " + ipadMini.available);
        System.out.println(ipadGen10.model + " " + ipadGen10.brand + " " + ipadGen10.price + " " + ipadGen10.storage + " " + ipadGen10.available);
        System.out.println(ipadGen9.model + " " + ipadGen9.brand + " " + ipadGen9.price + " " + ipadGen9.storage + " " + ipadGen9.available);
    }
}