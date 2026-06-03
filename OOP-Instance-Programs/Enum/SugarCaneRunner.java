class SugarCaneRunner {

    public static void main(String[] args) {

        // Creating SugarCane 
        SugarCane sc = new SugarCane("Co-86032", 12.5);

        // Creating Farm 
        Farm farm = new Farm("Ramesh","Suresh",25,sc,SoilType.RED);

        //invoking
        farm.show();
    }
}