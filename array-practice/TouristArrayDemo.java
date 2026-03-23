public class TouristArrayDemo {

    public static void main(String[] args) {

        String[] places = {
            "Taj Mahal", "Mysore Palace", "Hampi", "Goa Beaches", "Kerala Backwaters",
            "Jaipur", "Udaipur", "Manali", "Shimla", "Leh Ladakh",
            "Varanasi", "Rishikesh", "Amritsar", "Darjeeling", "Ooty",
            "Coorg", "Andaman Islands", "Ellora Caves", "Ajanta Caves", "Khajuraho",
            "Golden Temple", "Red Fort", "Qutub Minar", "Gateway of India", "Charminar",
            "Meenakshi Temple", "Brihadeeswara Temple", "Sundarbans", "Kaziranga National Park", "Jim Corbett National Park"
        };

        // Print all
        System.out.println("Tourist Places:");
        for (int index = 0; index < places.length; index++) {
            System.out.println(places[index]);
        }

        // Update
        places[5] = "Jaipur City";

        // Print after update
        System.out.println("\nAfter Update:");
        for (int count = 0; count < places.length; count++) {
            System.out.println(places[count]);
        }

        // Reverse
        System.out.println("\nReverse:");
        for (int rev = places.length - 1; rev >= 0; rev--) {
            System.out.println(places[rev]);
        }

        // Exception demo
        System.out.println("\nException:");
        System.out.println(places[30]); // ❌ error
    }
}