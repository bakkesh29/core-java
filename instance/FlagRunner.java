


class FlagRunner {
    public static void main(String[] args) {

        // Flag=class (data type)
        // india =reference variable 
        // new Flag() (constructor)
        // Declaration and initialization of instance

        // Create two different 
        // Flag constructors
        Flag india = new Flag();
        Flag usa = new Flag();
        Flag japan = new Flag();
        Flag germany = new Flag();
        Flag france = new Flag();

        System.out.println("\n--- Before Default Values ---\n");

        // Printing befor default values
        System.out.println(
                india.country + " " + india.color1 + " " + india.color2 + " " + india.color3 + " " + india.Anthem);
        System.out.println(usa.country + " " + usa.color1 + " " + usa.color2 + " " + usa.color3 + " " + usa.Anthem);
        System.out.println(
                japan.country + " " + japan.color1 + " " + japan.color2 + " " + japan.color3 + " " + japan.Anthem);
        System.out.println(germany.country + " " + germany.color1 + " " + germany.color2 + " " + germany.color3 + " "
                + germany.Anthem);
        System.out.println(
                france.country + " " + france.color1 + " " + france.color2 + " " + france.color3 + " " + france.Anthem);

        // Updating values
        // Invoke methods 
        india.country = "India";
        india.color1 = "Saffron";
        india.color2 = "White";
        india.color3 = "Green";
        india.Anthem = "Jana Gana Mana";

        usa.country = "USA";
        usa.color1 = "Red";
        usa.color2 = "White";
        usa.color3 = "Blue";
        usa.Anthem = "Star-Spangled Banner";

        japan.country = "Japan";
        japan.color1 = "White";
        japan.color2 = "Red";
        japan.color3 = "None";
        japan.Anthem = "Kimigayo";

        germany.country = "Germany";
        germany.color1 = "Black";
        germany.color2 = "Red";
        germany.color3 = "Yellow";
        germany.Anthem = "Deutschlandlied";

        france.country = "France";
        france.color1 = "Blue";
        france.color2 = "White";
        france.color3 = "Red";
        france.Anthem = "La Marseillaise";

        System.out.println("\n--- After Updating Values ---\n");

        // Printing updated values
        System.out.println(
                india.country + " " + india.color1 + " " + india.color2 + " " + india.color3 + " " + india.Anthem);
        System.out.println(usa.country + " " + usa.color1 + " " + usa.color2 + " " + usa.color3 + " " + usa.Anthem);
        System.out.println(
                japan.country + " " + japan.color1 + " " + japan.color2 + " " + japan.color3 + " " + japan.Anthem);
        System.out.println(germany.country + " " + germany.color1 + " " + germany.color2 + " " + germany.color3 + " "
                + germany.Anthem);
        System.out.println(
                france.country + " " + france.color1 + " " + france.color2 + " " + france.color3 + " " + france.Anthem);
    }
}