public class PatternProgramming {
    public static void main(String[] args) {
        // pattern programming
        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // square if (i==0 || j==0 || i == n-1 || j== n-1 )
                // E if( i == 0 ||j==0 || i== (n-1)/2 || i==n-1)
                // O if( i == 0 || j == n-1 || j ==0 || i == n-1)
                // T if(i == 0 || j == (n-1)/2)
                // parctice curved c if(i == 0 && j!=0 || i == 0 && j>0 || i== (n-1) && j>0 ||
                // j== 0 && i > 0&& i<n-1 )
                // proper curve if (i==0 && j>0 || i==n-1&& j>0 || j ==0 && i<n-1 && i>0 )
                // . A. if (i==(n-1)/2 || j==0&& i>0|| i==0&&j>0&&j<(n-1)|| j==n-1&&i>0 )
                // a pracctice if( i==(n-1)/2 ||i == 0 && j > 0 && j< n-1 || j==0 && i>0 ||
                // j==n-1&& i>0) {
                // if(i==(n-1)/2 || i ==0 && j>0 && j<n-1 || j == 0 && i>0 || j==n-1&&i>0 ) {

                // if(j==0|| i==(n-1)/2&& j<n-1 || i==0 && j<n-1 || j==n-1&&i>0&&j>0 || i==n-1
                // &&j<n-1)
                if (j == 0 || i == 0 && j < n - 1 || i == (n - 1) / 2 && j < n - 1 || i == n - 1 && j < n - 1
                        || j == n - 1 && i != (n - 1) / 2 && i != 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
