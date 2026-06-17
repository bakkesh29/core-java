class Car{
    private String color;
    private int mileage;
     
    public Car(String color , int mileage) {

        this.color=color;
        this.mileage=mileage;
    }
    public void drive(){
        System.out.println( " Driving the color " + color + "with th car milage " + mileage );
    }


}