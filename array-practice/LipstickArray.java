class LipstickArray {

    public static void main(String[] args) {

        String[] lipsticks = {
                "Lakme", "Maybelline", "MAC", "Nykaa", "Sugar",
                "Colorbar", "Revlon", "Faces Canada", "Elle 18", "Huda Beauty"
        };

        // Print all
        for (int index = 0; index < lipsticks.length; index++) {
            System.out.println(lipsticks[index]);
        }

        // Update
        lipsticks[2] = "Kylie Cosmetics";

        System.out.println("\nAfter Update:");
        for (int count = 0; count < lipsticks.length; count++) {
            System.out.println(lipsticks[count]);
        }

        // Reverse
        System.out.println("\nReverse:");
        for (int rev = lipsticks.length - 1; rev >= 0; rev--) {
            System.out.println(lipsticks[rev]);
        }

        // Exception demo
        System.out.println("\nException:");
        System.out.println(lipsticks[10]); // ❌ error
    }
}