public class CoffeeRunner {

    public static void main(String[] args) {

        Coffee.details(2,50,80,true,'M');

        int quantity = 3;
        int price = 60;
        int temp = 75;
        boolean hot = true;
        char size = 'L';

        Coffee.details(quantity,price,temp,hot,size);

        if(quantity > 0 && price > 0){
            System.out.println("Valid Coffee Details");
        }
        else{
            System.out.println("Invalid Coffee Details");
        }

    }

}