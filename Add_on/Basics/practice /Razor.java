public class Razor {
    int sizeOfBlade;
    String color;
    double thickNess;
    boolean rustness;

    Razor(int sizeOfBlade ,String color , double thickNess,boolean rustness){
        this.sizeOfBlade =sizeOfBlade;
        this.color=color;
        this.thickNess=thickNess;
        this.rustness=rustness;
    }

    void trim(){
        System.out.println("this razor is used for trimming ");
    }


}
