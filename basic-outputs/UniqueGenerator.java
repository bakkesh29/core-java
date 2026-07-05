import java.util.UUID;

public class UniqueGenerator {

    public static void main(String[] args) {
        String uniqueID = UUID.randomUUID().toString();

        System.out.println("Generated Unique ID: " + uniqueID);
    }
}