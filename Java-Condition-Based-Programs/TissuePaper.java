class TissuePaper {

    static int getPriceByThickness(int thickness){
        System.out.println("Executing tissue paper thickness " + thickness);

        if (thickness == 1){
            return 10;
        }
        if (thickness == 2){
            return 20;
        }
        if (thickness == 3){
            return 30;
        }
        if (thickness == 4){
            return 40;
        }
        if (thickness == 5){
            return 50;
        }
        if (thickness == 6){
            return 60;
        }
        if (thickness == 7){
            return 70;
        }
        if (thickness == 8){
            return 80;
        }
        if (thickness == 9){
            return 90;
        }
        if (thickness == 10){
            return 100;
        }

        else{
            System.out.println("Invalid thickness: " + thickness);
        }

        return 0;
    }
}