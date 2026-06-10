package Family_example;

public class Child extends Parent{
    void nothing(){
        System.out.println("son has lost everything running in SOn class");
    }
    @Override
    void start(){
        System.out.println("Running start from Chlid class");
    }
}

