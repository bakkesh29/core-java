class Goa {
    public static void main(String[] args) {

        String s;

        // Case 1: Empty string
        s = "";
        checkLength(s);

        // Case 2: Normal string
        s = "GeeksforGeeks";
        checkLength(s);

        // Case 3: Null string
        s = null;
        checkLength(s);
    }

    // Method to check length safely
    public static void checkLength(String s) {
        try {
            System.out.println(getLength(s));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Main logic
    public static int getLength(String s) {
        if (s == null)
            throw new IllegalArgumentException("String cannot be null");

        return s.length();
    }
}