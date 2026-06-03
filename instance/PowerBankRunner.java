class PowerBankRunner {
    public static void main(String[] args) {

        // 5 instances
        PowerBank miPB = new PowerBank();
        PowerBank realmePB = new PowerBank();
        PowerBank ambranePB = new PowerBank();
        PowerBank boatPB = new PowerBank();
        PowerBank samsungPB = new PowerBank();

        System.out.println("\n--- Default Values ---\n");

        System.out.println(
                miPB.brand + " " + miPB.capacity + " " + miPB.price + " " + miPB.color + " " + miPB.fastCharging);
        System.out.println(realmePB.brand + " " + realmePB.capacity + " " + realmePB.price + " " + realmePB.color + " "
                + realmePB.fastCharging);
        System.out.println(ambranePB.brand + " " + ambranePB.capacity + " " + ambranePB.price + " " + ambranePB.color
                + " " + ambranePB.fastCharging);
        System.out.println(boatPB.brand + " " + boatPB.capacity + " " + boatPB.price + " " + boatPB.color + " "
                + boatPB.fastCharging);
        System.out.println(samsungPB.brand + " " + samsungPB.capacity + " " + samsungPB.price + " " + samsungPB.color
                + " " + samsungPB.fastCharging);

        // Assign values
        miPB.brand = "Mi";
        miPB.capacity = 20000;
        miPB.price = 1500;
        miPB.color = "White";
        miPB.fastCharging = true;


        realmePB.brand = "Realme";
        realmePB.capacity = 10000;
        realmePB.price = 1200;
        realmePB.color = "Black";
        realmePB.fastCharging = true;


        ambranePB.brand = "Ambrane";
        ambranePB.capacity = 15000;
        ambranePB.price = 1300;
        ambranePB.color = "Blue";
        ambranePB.fastCharging = false;


        boatPB.brand = "Boat";
        boatPB.capacity = 10000;
        boatPB.price = 1100;
        boatPB.color = "Red";
        boatPB.fastCharging = true;

        
        samsungPB.brand = "Samsung";
        samsungPB.capacity = 20000;
        samsungPB.price = 2000;
        samsungPB.color = "Grey";
        samsungPB.fastCharging = true;

        System.out.println("\n--- Updated Values ---\n");

        System.out.println(
                miPB.brand + " " + miPB.capacity + " " + miPB.price + " " + miPB.color + " " + miPB.fastCharging);
        System.out.println(realmePB.brand + " " + realmePB.capacity + " " + realmePB.price + " " + realmePB.color + " "
                + realmePB.fastCharging);
        System.out.println(ambranePB.brand + " " + ambranePB.capacity + " " + ambranePB.price + " " + ambranePB.color
                + " " + ambranePB.fastCharging);
        System.out.println(boatPB.brand + " " + boatPB.capacity + " " + boatPB.price + " " + boatPB.color + " "
                + boatPB.fastCharging);
        System.out.println(samsungPB.brand + " " + samsungPB.capacity + " " + samsungPB.price + " " + samsungPB.color
                + " " + samsungPB.fastCharging);
    }
}