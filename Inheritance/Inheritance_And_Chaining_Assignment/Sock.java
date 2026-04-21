//classes show this chaining
class Sock {
    String color;
    int size;

    Sock() {
        this("Black", 0);
        System.out.println("Default Sock Constructor");
    }

    Sock(String color, int size) {
        this.color = color;
        this.size = size;
        System.out.println("Parameterized Sock Constructor");
    }
}