public class SwapNUmbers {
    public static void main(String[] args) {
        
        // Declare and initialize two integer variables
        int a = 10;
        int b = 20;

        // Print values before swapping
        System.out.println("before swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Print message before performing swap
        System.out.println("after swapping");

        // Temporary variable to help with swapping
        int temp;

        // Swap logic:
        temp = a;   // store value of 'a' in temp
        a = b;      // assign value of 'b' to 'a'
        b = temp;   // assign value of temp (original 'a') to 'b'

        // Print values after swapping
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
}
