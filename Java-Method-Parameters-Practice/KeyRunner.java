public class KeyRunner {

    public static void main(String[] args) {
        // Explicit
        Key.details(10,50,5,true,'A');
        // Implicit
        int weight = 8;
        int price = 40;
        int length = 4;
        boolean isMetal = true;
        char grade = 'B';
        Key.details(weight,price,length,isMetal,grade);
        if(weight > 0 && price > 0 && length > 0){
            System.out.println("Valid Key Details");
        }
        else{
            System.out.println("Invalid Key Details");
        }
    }
}