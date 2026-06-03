import com.sun.tools.javac.Main;

class Bat {

    static void info() {

        String type = "cricket bat";
        double length = 34;
        String color = "wood";
        int price = 3500;
        double weight = 1200;
        String material = "willow";
        String brand = "SS";
        int quantity = 1;

        System.out.println("");
        System.out.println("type:" + type);
        System.out.println("length:" + length);
        System.out.println("color:" + color);
        System.out.println("price:" + price);
        System.out.println("weight: "+weight);
        System.out.println("material:" + material);
        System.out.println("brand:" + brand);
        System.out.println("quantity:" + quantity);

        static void param (String x,String y,String z,String e,String r){
            
            System.out.println(x);
            System.out.println(y);
            System.out.println(z);
            System.out.println(e);
  
            System.out.println(r);
   
        }

        
    }
}