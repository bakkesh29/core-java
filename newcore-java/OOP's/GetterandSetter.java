class Student {
    
    private int age;
    private String name;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

public class GetterandSetter {
    public static void main(String[] args) {

        Student s = new Student();
        s.setAge(23);
        s.setName("Bakkesh Yajaman");
        System.out.println("Age: " + s.getAge());
        System.out.println("Name: " + s.getName());
    }
}