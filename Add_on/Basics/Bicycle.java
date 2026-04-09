//class exapmple

//created a class-blueprint 
//it is a n instance of an object class

class Bicycle {

    //declaring instance variable
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    //creating a method with paramter 
    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}