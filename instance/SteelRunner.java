class SteelRunner {
    public static void main(String[] args) {

        // Steel → class (data type)
        // tataSteel → reference variable
        // new Steel() → (calls constructor)

        // Declaration and initialization
        Steel tataSteel = new Steel();
        Steel jswSteel = new Steel();
        Steel sailSteel = new Steel();
        Steel essarSteel = new Steel();
        Steel jindalSteel = new Steel();

        System.out.println("\n--- Before Assigning Values (Default Values) ---\n");

        // Default values
        System.out.println(tataSteel.type + " " + tataSteel.weight + " " + tataSteel.price + " " + tataSteel.brand + " " + tataSteel.available);
        System.out.println(jswSteel.type + " " + jswSteel.weight + " " + jswSteel.price + " " + jswSteel.brand + " " + jswSteel.available);
        System.out.println(sailSteel.type + " " + sailSteel.weight + " " + sailSteel.price + " " + sailSteel.brand + " " + sailSteel.available);
        System.out.println(essarSteel.type + " " + essarSteel.weight + " " + essarSteel.price + " " + essarSteel.brand + " " + essarSteel.available);
        System.out.println(jindalSteel.type + " " + jindalSteel.weight + " " + jindalSteel.price + " " + jindalSteel.brand + " " + jindalSteel.available);

        // Assigning values

        tataSteel.type = "Rod";
        tataSteel.weight = 50;
        tataSteel.price = 5000;
        tataSteel.brand = "TATA";
        tataSteel.available = true;

        jswSteel.type = "Sheet";
        jswSteel.weight = 30;
        jswSteel.price = 3000;
        jswSteel.brand = "JSW";
        jswSteel.available = true;

        sailSteel.type = "Pipe";
        sailSteel.weight = 40;
        sailSteel.price = 4000;
        sailSteel.brand = "SAIL";
        sailSteel.available = true;

        essarSteel.type = "Coil";
        essarSteel.weight = 35;
        essarSteel.price = 3500;
        essarSteel.brand = "Essar";
        essarSteel.available = false;

        jindalSteel.type = "Bar";
        jindalSteel.weight = 45;
        jindalSteel.price = 4500;
        jindalSteel.brand = "Jindal";
        jindalSteel.available = true;

        System.out.println("\n--- After Assigning Values ---\n");

        // Printing updated values
        System.out.println(tataSteel.type + " " + tataSteel.weight + " " + tataSteel.price + " " + tataSteel.brand + " " + tataSteel.available);
        System.out.println(jswSteel.type + " " + jswSteel.weight + " " + jswSteel.price + " " + jswSteel.brand + " " + jswSteel.available);
        System.out.println(sailSteel.type + " " + sailSteel.weight + " " + sailSteel.price + " " + sailSteel.brand + " " + sailSteel.available);
        System.out.println(essarSteel.type + " " + essarSteel.weight + " " + essarSteel.price + " " + essarSteel.brand + " " + essarSteel.available);
        System.out.println(jindalSteel.type + " " + jindalSteel.weight + " " + jindalSteel.price + " " + jindalSteel.brand + " " + jindalSteel.available);
    }
}