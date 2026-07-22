import java.util.Scanner;

class SelectionSort {

    public static void selection(int[] a, int n) {

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }

            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];

        System.out.println("Enter the elements:");

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        selection(a, n);

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        scanner.close();
    }
}