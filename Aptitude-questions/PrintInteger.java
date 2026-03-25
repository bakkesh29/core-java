import java.util.Scanner;

public class PrintInteger {

    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("please Enter the input a Number");

        int num = reader.nextInt();
        System.out.println("you entered this number message : "+num);
    }
    
}
