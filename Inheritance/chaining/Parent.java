class Parent {

    int age;

    // Constructor
    Parent(int age) {
        this.age = age;
        System.out.println("Parent constructor called");
    }

    void showParent() {
        System.out.println("Parent age: " + age);
    }
}