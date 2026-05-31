import javax.xml.stream.events.StartDocument;

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
        Student s =new Student();
        s.Studying();
        s.Running();
        
    }
}
