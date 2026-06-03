class WaterMelon {

    static int getPriceByQuantity(int quantity){
        System.out.println("Executing watermelon quantity " + quantity);

        if (quantity == 1){
            System.out.println("Price for 1 watermelon is 50");
            return 50;
        }
        if (quantity == 2){
            System.out.println("Price for 2 watermelons is 100");
            return 100;
        }
        if (quantity == 3){
            System.out.println("Price for 3 watermelons is 150");
            return 150;
        }
        if (quantity == 4){
            System.out.println("Price for 4 watermelons is 200");
            return 200;
        }
        if (quantity == 5){
            System.out.println("Price for 5 watermelons is 250");
            return 250;
        }
        if (quantity == 6){
            System.out.println("Price for 6 watermelons is 300");
            return 300;
        }
        if (quantity == 7){
            System.out.println("Price for 7 watermelons is 350");
            return 350;
        }
        if (quantity == 8){
            System.out.println("Price for 8 watermelons is 400");
            return 400;
        }
        if (quantity == 9){
            System.out.println("Price for 9 watermelons is 450");
            return 450;
        }
        if (quantity == 10){
            System.out.println("Price for 10 watermelons is 500");
            return 500;
        }

        else{
            System.out.println("Invalid quantity: " + quantity);
        }

        return 0;
    }
}