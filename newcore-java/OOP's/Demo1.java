class Student{
    int age;
    String name;
    double height;

    void Studying(){
        System.out.println("Student is Studying");
    }

    void Running(){
        System.out.println("student is Running");

    }
}


public class Demo1 {
    public static void main(String[] values) {
        //instation of a class
        //student object or student instance both are same
        Student s =new Student();
        s.Studying();
        s.Running();
        
    }
}
