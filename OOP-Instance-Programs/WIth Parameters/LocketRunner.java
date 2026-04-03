class LocketRunner {
    public static void main(String[] args) {

        
        Locket l1 = new Locket();
        l1.show();
        
        Locket l2 = new Locket("Tanishq", "Gold");
        l2.show();
     
        Locket l3 = new Locket("Malabar", "Silver", 5000);
        l3.show();
       
        Locket l4 = new Locket("Kalyan", "Platinum", 20000, "Grey");
        l4.show();

    }
}