public class PalindromeCheck {
    public static void main(String[] args) {
        String original = "radar";
        String reverse = "";
        
        int length = original.length();
        
        // Loop backwards through the string to reverse it
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        
        // Check if the original string matches the reversed string
        if (original.equals(reverse)) {
            System.out.println('"' + original + '"' + " is a palindrome.");
        } else {
            System.out.println('"' + original + '"' + " is not a palindrome.");
        }
    }
}
