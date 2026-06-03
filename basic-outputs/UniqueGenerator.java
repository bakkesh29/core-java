import java.util.UUID;

public class UniqueGenerator {

    public static void main(String[] args) {

        // Generates a random 36-character string
        String uniqueID = UUID.randomUUID().toString();

        System.out.println("Generated Unique ID: " + uniqueID);
    }
}