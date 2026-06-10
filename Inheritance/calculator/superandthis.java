class A{

     A(){
        System.out.println("in A");
    }
     A(int n){

        System.out.println("int A");
    }

}
class B extends A{
     B(){
        super();
        System.out.println("in B");
    }
     B(int n){
        this();

        System.out.println("int B");
    }

}


public class Superandthis {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
