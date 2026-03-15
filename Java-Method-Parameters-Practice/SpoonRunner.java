public class SpoonRunner {

    public static void main(String[] args) {
        // Explicit
        Spoon.details(20, 50, 15);
        // Implicit
        int weight = 30;
        int price = 60;
        int length = 18;
        Spoon.details(weight, price, length);
        if (weight >= 10 && price >= 20 && length >= 10) {
            System.out.println("Valid spoon details");
        } 
        else {
            System.out.println("Invalid spoon details");
        }
    }
}