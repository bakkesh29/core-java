public class Parent extends GrandParent {

    void Acres(){
        System.out.println("Acres have been give from Grand parent to  parent");
    }

    @Override
    void start(){
        System.out.println("Running start from Parent class");
    }
    
}
