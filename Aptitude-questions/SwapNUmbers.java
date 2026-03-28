public class SwapNUmbers {
    public static void main(String[] args) {
        
        // Declare and initialize two integer variables
        int a = 10;
        int b = 20;

        int c = 30;
        int d = 40;

        // Print values before swapping (using temp variable)
        System.out.println("before swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Print message before performing swap
        System.out.println("after swapping");

        // Temporary variable to help with swapping
        int temp;

        // Swap logic using temp:
        temp = a;   // store value of 'a' in temp
        a = b;      // assign value of 'b' to 'a'
        b = temp;   // assign value of temp (original 'a') to 'b'

        // Print values after swapping
        System.out.println("a: " + a); // now a = 20
        System.out.println("b: " + b); // now b = 10



        // Swap without using temp variable (using arithmetic)
        // Print values before swapping
        System.out.println("before swapping");
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        System.out.println("after swapping");

        // Correct arithmetic swap:
        c = c + d;  // c = 30 + 40 = 70
        d = c - d;  // d = 70 - 40 = 30 (original c)
        c = c - d;  // c = 70 - 30 = 40 (original d)

        // Print values after swapping
        System.out.println("c: " + c); // now c = 40
        System.out.println("d: " + d); // now d = 30
    }
}
