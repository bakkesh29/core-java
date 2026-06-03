class FoodItems {

    static double getPriceByItem(String item){
        System.out.println("Executing food items " + item);

        if (item == "dosa"){
            return 80;
        }
        if (item == "idli"){
            return 40;
        }
        if (item == "burger"){
            return 90;
        }
        if (item == "pongal"){
            return 50;
        }
        if (item == "pizza"){
            return 100;
        }
        if (item == "chapathi"){
            return 60;
        }
        if (item == "rice"){
            return 70;
        }
        if (item == "biryani"){
            return 150;
        }
        if (item == "noodles"){
            return 120;
        }
        if (item == "friedrice"){
            return 130;
        }
        if (item == "sandwich"){
            return 80;
        }
        if (item == "paratha"){
            return 70;
        }
        if (item == "vada"){
            return 30;
        }
        if (item == "upma"){
            return 45;
        }
        if (item == "puri"){
            return 50;
        }
        if (item == "meal"){
            return 120;
        }
        if (item == "icecream"){
            return 60;
        }
        if (item == "cake"){
            return 90;
        }
        if (item == "juice"){
            return 50;
        }
        if (item == "coffee"){
            return 30;
        }

        else{
            System.out.println("Item not found: " + item);
        }

        return 0;
    }
}