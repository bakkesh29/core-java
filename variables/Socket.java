public class Socket {
  public static void main(String[] args) {

    //declaring variables intialxing variable
    String type="three pins";
    int numberofpins=3;
    int voltage=230;
    boolean isSwitchedOn= true;
    String material = "Plastic";

    //print
    System.out.println("Tupe of Socket: "+type);
    System.out.println("Number of Pins: "+numberofpins);
    System.out.println("Voltage : "+voltage);
    System.out.println("Switch is on/off: "+isSwitchedOn); 
    System.out.println("Material: "+material);

    //Re-init
    type="two pins";
    numberofpins=2;
    voltage=120;
    isSwitchedOn= false;
    material="iron";
    //print
    System.out.println("____Updated_______");
    System.out.println("Tupe of Socket: "+type);
    System.out.println("Number of Pins: "+numberofpins);
    System.out.println("Voltage : "+voltage);
    System.out.println("Switch is on/off: "+isSwitchedOn); 
    System.out.println("Material: "+material);
   
  }
}
