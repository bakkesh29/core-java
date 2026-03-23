public class PlantArrayDemo {

    public static void main(String[] args) {

        String[] plants = {
            "Rose", "Tulip", "Sunflower", "Lily", "Jasmine",
            "Lotus", "Hibiscus", "Daisy", "Orchid", "Marigold",
            "Aloe Vera", "Bamboo", "Neem", "Peepal", "Cactus",
            "Mint", "Basil", "Coriander", "Spinach", "Fern",
            "Pine", "Mango Tree", "Banana Plant", "Coconut Tree", "Teak Tree"
        };

        // Print all
        System.out.println("Plant Names:");
        for (int index = 0; index < plants.length; index++) {
            System.out.println(plants[index]);
        }

        // Update
        plants[2] = "Big Sunflower";

        // Print after update
        System.out.println("\nAfter Update:");
        for (int count = 0; count < plants.length; count++) {
            System.out.println(plants[count]);
        }

        // Reverse
        System.out.println("\nReverse:");
        for (int rev = plants.length - 1; rev >= 0; rev--) {
            System.out.println(plants[rev]);
        }

        // Exception demo
        System.out.println("\nException:");
        System.out.println(plants[25]); 
        // ❌ error
    }
}