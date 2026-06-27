public class Student {

    //classes have state and behavior 
    //state means attribute,has some thing 
    //behavior means it does something
    //classes and object 
    //decleared instance variable and that will be intialized in the anther class
    public String name;
    public int age;
    public int rollNo;
    public int classname;
    //default constructor if we want to call the instance of the another class we need a constructor
    // Student(){
    //     System.out.println("classes  defalut constructor is  called ");
    // }


    //parameterzied constructor
    Student(String name, int rollNo,int age,int classname){
        this.name = name;
        this.rollNo=rollNo;
        this.age=age;
        this.classname=classname;

    }

    //copy constructor 
      //parameterzied constructor
    Student(Student srcobj){//srcobj->A object
        this.name = srcobj.name;
        this.rollNo=srcobj.rollNo;
        this.age= srcobj.age;
        this.classname= srcobj.classname;

    }

    

    void studing(){
        System.out.println("Student is studing");
    }
    void sleeping(){
        System.out.println("student is sleeping");
    }
    void eating(){
        System.out.println("student is eating food ");
    }
    void writing(){
        System.out.println("student are writing the exams ");
    }

    


}
