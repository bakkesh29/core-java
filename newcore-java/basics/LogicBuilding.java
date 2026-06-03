public class LogicBuilding {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0 ; i < n ; i++){
//1 s image
            for (int j = 0 ; j < n ; j++){

                if (i==j || j+i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print( " ");
                }   
            }
            System.out.print("      ");

            //second
            for (int j = 0 ; j < n ; j++){

                if (i==j || j+i==n-1||i==0||j==0||j==n-1||i==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print( " ");
                }   
            }
            System.out.println("  ");

//third
            for (int j = 0 ; j < n ; j++){

                if (i+j==n-1||j-i==n-1||i==(n-1)/2){
                    System.out.print("*");
                }
                else{
                    System.out.print( " ");
                }   
            }
            System.out.print("  ");













            
             System.out.println();
        }
    }
}
