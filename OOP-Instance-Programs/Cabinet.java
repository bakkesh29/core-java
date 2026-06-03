//question
//Declare below classes, then declare 15 instance variable. Make sure five are init as literal, ten variable's are init using ref. Declare explicit no-param const. 
// Then create 10 instances for each class type. Totally 120 instances. 
// Init all the instance variables(i.e 10 ) 
// ,print it on console Cabinet,Lamp,Mouse,Fire,GraphicCard,Projector,Controller,Xbox,Satellite,Eternet,Router,Zip

//solution:

//creating a class, datatype
class Cabinet {

    // 5 instance variables initialized with literals
    String material = "Wood";
    String color = "Brown";
    int shelves = 4;
    boolean hasLock = true;
    double weight = 25.5;

    // 10 instance variables (to be initialized using reference)
    String brand;
    double price;
    String type;
    String size;
    String location;
    boolean isPortable;
    int doors;
    String shape;
    String finish;
    int warranty;

    // Explicit no-arg constructor
    Cabinet() {
        System.out.println("Cabinet  created");
    }
}