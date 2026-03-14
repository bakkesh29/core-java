public class Adapter {
    public static void main(String[] args) {
        String brand="apple";
        int wattage =20;
        int inputvoltage= 22;
        String OuputPortType="C--Type";
        String color="white";

        System.out.println("Brand : "+brand);
        System.out.println("wattage : "+wattage);
        System.out.println("inputvoltage : "+inputvoltage);
        System.out.println("outporttype : "+OuputPortType);
        System.out.println("color : "+color);
         
        brand="samsung";
        wattage=120;
        inputvoltage=200;
        OuputPortType="Usb B type";
        color="black";
        System.out.println("----updated-----");

        System.out.println("Brand : "+brand);
        System.out.println("wattage : "+wattage);
        System.out.println("inputvoltage : "+inputvoltage);
        System.out.println("outporttype : "+OuputPortType);
        System.out.println("color : "+color);



    }
}
