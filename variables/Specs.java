public class Specs {
    public static void main(String[] args) {
        String frameType = "Full-rim";
        double power = -1.5;
        String shape = "Rectangular";
        boolean isBlueLightFilter = true;

        System.out.println("Frame: " + frameType);
        System.out.println("Power: " + power);
        System.out.println("Shape: " + shape);
        System.out.println("Blue Light Filter: " + isBlueLightFilter);

        frameType = "Aviator";
        power = 0.0;
        shape = "Teardrop";
        isBlueLightFilter = false;

        System.out.println("----updated-----");

        System.out.println("Frame: " + frameType);
        System.out.println("Power: " + power);
        System.out.println("Shape: " + shape);
        System.out.println("Blue Light Filter: " + isBlueLightFilter);
    }
}