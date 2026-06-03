class JoyStickRunner {
    public static void main(String[] args) {

        JoyStick sony = new JoyStick();
        JoyStick xbox = new JoyStick();
        JoyStick redgear = new JoyStick();
        JoyStick logitech = new JoyStick();
        JoyStick cosmic = new JoyStick();

        System.out.println("\n--- Default Values ---\n");

        System.out.println(sony.brand + " " + sony.type + " " + sony.price + " " + sony.wireless + " " + sony.color);
        System.out.println(xbox.brand + " " + xbox.type + " " + xbox.price + " " + xbox.wireless + " " + xbox.color);
        System.out.println(redgear.brand + " " + redgear.type + " " + redgear.price + " " + redgear.wireless + " "
                + redgear.color);
        System.out.println(logitech.brand + " " + logitech.type + " " + logitech.price + " " + logitech.wireless + " "
                + logitech.color);
        System.out.println(
                cosmic.brand + " " + cosmic.type + " " + cosmic.price + " " + cosmic.wireless + " " + cosmic.color);

        // Assign values
        sony.brand = "Sony";
        sony.type = "PS5";
        sony.price = 5000;
        sony.wireless = true;
        sony.color = "White";

        xbox.brand = "Xbox";
        xbox.type = "Series X";
        xbox.price = 4500;
        xbox.wireless = true;
        xbox.color = "Black";

        redgear.brand = "Redgear";
        redgear.type = "Pro";
        redgear.price = 2000;
        redgear.wireless = false;
        redgear.color = "Black";


        logitech.brand = "Logitech";
        logitech.type = "F310";
        logitech.price = 2500;
        logitech.wireless = false;
        logitech.color = "Blue";
        
        cosmic.brand = "CosmicByte";
        cosmic.type = "Nebula";
        cosmic.price = 1800;
        cosmic.wireless = true;
        cosmic.color = "Red";

        System.out.println("\n--- Updated Values ---\n");

        System.out.println(sony.brand + " " + sony.type + " " + sony.price + " " + sony.wireless + " " + sony.color);
        System.out.println(xbox.brand + " " + xbox.type + " " + xbox.price + " " + xbox.wireless + " " + xbox.color);
        System.out.println(redgear.brand + " " + redgear.type + " " + redgear.price + " " + redgear.wireless + " "
                + redgear.color);
        System.out.println(logitech.brand + " " + logitech.type + " " + logitech.price + " " + logitech.wireless + " "
                + logitech.color);
        System.out.println(
                cosmic.brand + " " + cosmic.type + " " + cosmic.price + " " + cosmic.wireless + " " + cosmic.color);
    }
}