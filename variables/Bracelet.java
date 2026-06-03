public class Bracelet {
    public static void main(String[] args) {
        String material = "Gold";
        double diameterCm = 6.5;
        int beadCount = 0;
        boolean isElastic = false;

        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameterCm + "cm");
        System.out.println("Beads: " + beadCount);
        System.out.println("Elastic: " + isElastic);

        material = "Rubber";
        diameterCm = 5.0;
        beadCount = 12;
        isElastic = true;

        System.out.println("----updated-----");

        System.out.println("Material: " + material);
        System.out.println("Diameter: " + diameterCm + "cm");
        System.out.println("Beads: " + beadCount);
        System.out.println("Elastic: " + isElastic);
    }
}