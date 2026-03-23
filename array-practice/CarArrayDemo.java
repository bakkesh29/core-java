public class CarArrayDemo {

    public static void main(String[] args) {

        String[] cars = {
            "Swift", "i20", "Baleno", "Creta", "Venue",
            "City", "Civic", "Amaze", "Innova", "Fortuner",
            "Scorpio", "Thar", "XUV700", "Nexon", "Harrier",
            "Safari", "Punch", "Altroz", "Kushaq", "Slavia",
            "Verna", "Seltos", "Sonet", "Compass", "Wrangler"
        };

        // Print all
        System.out.println("Car Models:");
        for (int index = 0; index < cars.length; index++) {
            System.out.println(cars[index]);
        }

        // Update
        cars[3] = "Creta Facelift";

        // Print after update
        System.out.println("\nAfter Update:");
        for (int count = 0; count < cars.length; count++) {
            System.out.println(cars[count]);
        }

        // Reverse
        System.out.println("\nReverse:");
        for (int rev = cars.length - 1; rev >= 0; rev--) {
            System.out.println(cars[rev]);
        }

        // Exception demo
        System.out.println("\nException:");
        System.out.println(cars[25]); // ❌ error
    }
}