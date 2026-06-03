import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows, cols;

        // Input size
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        // Declare matrices
        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];
        int[][] sum = new int[rows][cols];

        // Input first matrix
        System.out.println("\nEnter elements of Matrix A:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("\nEnter elements of Matrix B:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        // Display Matrix A
        System.out.println("\nMatrix A:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        // Display Matrix B
        System.out.println("\nMatrix B:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

        // Add matrices
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        // Display Sum
        System.out.println("\nSum of Matrix A and B:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}