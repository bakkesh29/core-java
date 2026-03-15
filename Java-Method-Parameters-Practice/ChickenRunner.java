public class ChickenRunner {

    public static void main(String[] args) {

        Chicken.details(2,400,6,true,'A');

        int weight = 3;
        int price = 450;
        int pieces = 8;
        boolean fresh = true;
        char grade = 'B';

        Chicken.details(weight,price,pieces,fresh,grade);

        if(weight > 0 && price > 0){
            System.out.println("Valid Chicken Details");
        }
        else{
            System.out.println("Invalid Chicken Details");
        }

    }

}