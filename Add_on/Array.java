class Array {
    public static void main(String[] args) {

        // 1. Declaration
        int[] a;

        // 2. Allocation
        a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        // 3. Initialization
        int[] b = {1, 2, 3, 4};

        // 4. Separate initialization
        int[] c;
        c = new int[]{5, 6, 7};

        // Printing arrays
        System.out.println("Array a:");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nArray b:");
        for(int i : b) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray c:");
        for(int i : c) {
            System.out.print(i + " ");
        }
    }
}