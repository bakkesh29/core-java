public class Wire {
    public static void main(String[] args) {
        String material = "Copper";
        int lengthInMeters = 5;
        double thicknessMm = 2.5;
        boolean isInsulated = true;

        System.out.println("Material: " + material);
        System.out.println("Length: " + lengthInMeters + "m");
        System.out.println("Thickness: " + thicknessMm + "mm");
        System.out.println("Insulated: " + isInsulated);

        material = "Aluminum";
        lengthInMeters = 50;
        thicknessMm = 10.0;
        isInsulated = false;

        System.out.println("----updated-----");

        System.out.println("Material: " + material);
        System.out.println("Length: " + lengthInMeters + "m");
        System.out.println("Thickness: " + thicknessMm + "mm");
        System.out.println("Insulated: " + isInsulated);
    }
}