class A {
    void showA() {
        System.out.println("A");
    }
}

class B extends A {
    void showB() {
        System.out.println("B");
    }
}

class C extends B {
    void showC() {
        System.out.println("C");
    }
}

class D extends A {
    void showD() {
        System.out.println("D");
    }
}