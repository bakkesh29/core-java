class Tyre {

    static int getPriceByBrandAndSize(String brand, int size){
        System.out.println("Executing tyre " + brand + " " + size);

        if (brand == "MRF" && size == 15){
            return 3000;
        }
        if (brand == "MRF" && size == 16){
            return 3500;
        }
        if (brand == "MRF" && size == 17){
            return 4000;
        }

        if (brand == "CEAT" && size == 15){
            return 2800;
        }
        if (brand == "CEAT" && size == 16){
            return 3300;
        }
        if (brand == "CEAT" && size == 17){
            return 3800;
        }

        if (brand == "APOLLO" && size == 15){
            return 2900;
        }
        if (brand == "APOLLO" && size == 16){
            return 3400;
        }
        if (brand == "APOLLO" && size == 17){
            return 3900;
        }

        if (brand == "JK" && size == 15){
            return 2700;
        }
        if (brand == "JK" && size == 16){
            return 3200;
        }
        if (brand == "JK" && size == 17){
            return 3700;
        }

        else{
            System.out.println("Invalid tyre details: " + brand + " " + size);
        }

        return 0;
    }
}