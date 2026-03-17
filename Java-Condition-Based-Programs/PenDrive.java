class PenDrive {

    static int getSizeByBrand(String brand){
        System.out.println("Executing pen drive brand " + brand);

        if (brand == "SanDisk"){
            System.out.println("SanDisk size is 32GB");
            return 32;
        }
        if (brand == "HP"){
            System.out.println("HP size is 16GB");
            return 16;
        }
        if (brand == "Sony"){
            System.out.println("Sony size is 64GB");
            return 64;
        }
        if (brand == "Kingston"){
            System.out.println("Kingston size is 128GB");
            return 128;
        }
        if (brand == "Samsung"){
            System.out.println("Samsung size is 256GB");
            return 256;
        }

        else{
            System.out.println("Invalid brand: " + brand);
        }

        return 0;
    }
}