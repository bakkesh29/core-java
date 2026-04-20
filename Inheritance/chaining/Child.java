class Child extends Parent {

    String name;

    // Constructor
    Child(int age, String name) {
        super(age); // calling Parent constructor
        this.name = name;
        System.out.println("Child constructor called");
    }

    void showChild() {
        System.out.println("Child name: " + name);
    }
}