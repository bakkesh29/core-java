import java.util.Scanner;

// defined class as printinteger
public class PrintInteger {

    // main method
    public static void main(String[] args) {
        // scanner object named as reader 
        Scanner reader = new Scanner(System.in);
        //message on console
        System.out.println("please Enter the input a Number");

        //Reads an integer input from the user and stores it in the variable num
        int num = reader.nextInt();
        // message
        System.out.println("you entered this number message : "+num);
    }
    
}
