

public class BloodTester {
    
    void testblood(GrandParent grandParent){
        System.out.println("++++++++++++++++++++++");
        grandParent.start();
        if (grandParent instanceof Child){
            System.out.println("JVM refers to CHild");
        }
        else if(grandParent instanceof Parent){
            System.out.println("JVM refers to Parent");
        }
        else{
            System.out.println("JVM refer to Grand Parent");
        }
    }
}
