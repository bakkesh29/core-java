import java.util.Scanner;

public class MathExample {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Prompt the user for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform mathematical operations
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;

        // Display the results
        System.out.println("\n--- Results ---");
        System.out.println("Addition (" + num1 + " + " + num2 + ") = " + sum);
        System.out.println("Subtraction (" + num1 + " - " + num2 + ") = " + difference);
        System.out.println("Multiplication (" + num1 + " * " + num2 + ") = " + product);

        // Close the scanner to avoid memory leaks
        scanner.close();
    }
}
