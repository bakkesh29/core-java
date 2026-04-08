 class Charger {

    String type;
    String color;
    int voltage;

    Charger(String type, String color,int voltage){
        this.type = type;
        this.color = color;
        this.voltage = voltage;
    }
    void display(){
        System.out.println("type of the charger is : "+this.type);
        System.out.println("color of the charger is : "+this.color);
        System.out.println("voltage of the charger is : "+this.voltage);
    }

    
}
