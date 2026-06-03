import java.util.Scanner; 
// Import Scanner class to take input from the user

public class OddEven {
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in); 
        // Create a Scanner object to read input from keyboard

        System.out.println("plz enter a number:"); 
        // Prompt the user to enter a number

        int num = reader.nextInt(); 
        // Read the integer entered by the user and store it in variable 'num'

        // Check if the number is divisible by 2
        if(num % 2 == 0){
            // If remainder is 0, the number is even
            System.out.println(num + " is even");
        }
        else{
            // Otherwise, the number is odd
            System.out.println(num + " is odd");
        }
    }
}
