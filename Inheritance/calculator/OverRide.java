class A{
    void show(){
        System.out.println("print in A");
    }
    void config(){
        System.out.println("in A config");
    }

}
class B extends A{
    @Override
    void show(){
        System.out.println("in the show B");

    }

}

public class OverRide {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.config();
    }
    
}
