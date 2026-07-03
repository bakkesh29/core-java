import java.util.Scanner;

public class SquareCalculator {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        // Read user input
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            int square = number * number;

            // Display the result
            System.out.println("The square of " + number + " is: " + square);
        } else {
            System.out.println("Error: Please enter a valid integer.");
        }

        // Close the scanner resource
        scanner.close();
    }
}