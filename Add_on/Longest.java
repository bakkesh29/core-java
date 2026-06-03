import java.util.*;
//largest name
class Longest {
    public static void main(String[] args) {

        String arr[] = {
            "X-workz",
            "Omkar-sir",
            "Bakkesh",
            "MyCodeSchool"
        };

        // Find maximum length
        int max = 0;

        for (String s : arr) {
            if (s.length() > max) {
                max = s.length();
            }
        }

        // Print longest strings
        System.out.println("Longest String(s):");

        for (String s : arr) {
            if (s.length() == max) {
                System.out.println(s);
            }
        }
    }
}