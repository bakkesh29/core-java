public class BellRunner {

    public static void main(String[] args) {

        Bell.details(20,100,15,true,'A');

        int weight = 25;
        int price = 120;
        int height = 18;
        boolean electric = false;
        char type = 'B';

        Bell.details(weight,price,height,electric,type);

        if(weight > 0 && price > 0 && height > 0){
            System.out.println("Valid Bell Details");
        }
        else{
            System.out.println("Invalid Bell Details");
        }

    }

}