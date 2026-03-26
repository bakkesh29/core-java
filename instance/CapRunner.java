class CapRunner {
    public static void main(String[] args) {

        // Cap → class (data type)
        // nikeCap → reference variable
        // new Cap() → (calls constructor)

        // Declaration and initialization
        Cap nikeCap = new Cap();
        Cap pumaCap = new Cap();
        Cap adidasCap = new Cap();
        Cap reebokCap = new Cap();
        Cap underArmourCap = new Cap();

        System.out.println("\n--- Before Assigning Values (Default Values) ---\n");

        // Default values
        System.out.println(nikeCap.color + " " + nikeCap.brand + " " + nikeCap.price + " " + nikeCap.size + " " + nikeCap.available);
        System.out.println(pumaCap.color + " " + pumaCap.brand + " " + pumaCap.price + " " + pumaCap.size + " " + pumaCap.available);
        System.out.println(adidasCap.color + " " + adidasCap.brand + " " + adidasCap.price + " " + adidasCap.size + " " + adidasCap.available);
        System.out.println(reebokCap.color + " " + reebokCap.brand + " " + reebokCap.price + " " + reebokCap.size + " " + reebokCap.available);
        System.out.println(underArmourCap.color + " " + underArmourCap.brand + " " + underArmourCap.price + " " + underArmourCap.size + " " + underArmourCap.available);

        // Assigning values

        nikeCap.color = "Black";
        nikeCap.brand = "Nike";
        nikeCap.price = 999;
        nikeCap.size = "M";
        nikeCap.available = true;

        pumaCap.color = "Blue";
        pumaCap.brand = "Puma";
        pumaCap.price = 799;
        pumaCap.size = "L";
        pumaCap.available = true;

        adidasCap.color = "White";
        adidasCap.brand = "Adidas";
        adidasCap.price = 899;
        adidasCap.size = "M";
        adidasCap.available = true;

        reebokCap.color = "Red";
        reebokCap.brand = "Reebok";
        reebokCap.price = 699;
        reebokCap.size = "S";
        reebokCap.available = false;

        underArmourCap.color = "Grey";
        underArmourCap.brand = "Under Armour";
        underArmourCap.price = 1099;
        underArmourCap.size = "L";
        underArmourCap.available = true;

        System.out.println("\n--- After Assigning Values ---\n");

        // Printing updated values
        System.out.println(nikeCap.color + " " + nikeCap.brand + " " + nikeCap.price + " " + nikeCap.size + " " + nikeCap.available);
        System.out.println(pumaCap.color + " " + pumaCap.brand + " " + pumaCap.price + " " + pumaCap.size + " " + pumaCap.available);
        System.out.println(adidasCap.color + " " + adidasCap.brand + " " + adidasCap.price + " " + adidasCap.size + " " + adidasCap.available);
        System.out.println(reebokCap.color + " " + reebokCap.brand + " " + reebokCap.price + " " + reebokCap.size + " " + reebokCap.available);
        System.out.println(underArmourCap.color + " " + underArmourCap.brand + " " + underArmourCap.price + " " + underArmourCap.size + " " + underArmourCap.available);
    }
}