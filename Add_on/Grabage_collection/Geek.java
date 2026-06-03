import java.io.*;

class Geek {
    public static void main(String[] args) {

        // String is null
        String s = null;

        try {
            if (s.equals("gfg"))
                System.out.println("Same");
            else
                System.out.println("Not Same");
        } 
        catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
        }
    }
}