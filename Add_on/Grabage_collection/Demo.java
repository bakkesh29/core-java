class A {
    void s(B b) {
        System.out.println("Method s() called");
    }
}

class B {
}

public class Demo {

    void start() {  
        A a = new A(); 
        B b = new B(); 
        a.s(b);  
        b = null; 
        a = null;  
        System.out.println("start completed"); 
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        d.start();
    }
}