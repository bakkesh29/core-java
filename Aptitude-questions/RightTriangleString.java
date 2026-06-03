public class RightTriangleString {
    public static void main(String[] args) {
        int n = 5;
        String row = "*";

        for (int i = 1; i <= n; i++) {
            System.out.println(row);
            row += "*"; // Add one more star for next row
        }
    }
}