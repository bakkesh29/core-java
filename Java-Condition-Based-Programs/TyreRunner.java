class TyreRunner {
    public static void main(String[] args) {

        int ref;

        ref = Tyre.getPriceByBrandAndSize("MRF", 15);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("MRF", 16);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("MRF", 17);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("CEAT", 15);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("CEAT", 16);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("CEAT", 17);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("APOLLO", 15);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("APOLLO", 16);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("APOLLO", 17);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("JK", 15);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("JK", 16);
        System.out.println("price :" + ref);

        ref = Tyre.getPriceByBrandAndSize("JK", 17);
        System.out.println("price :" + ref);
    }
}