class SewingThread extends Thread {
    String type;

    SewingThread(int count, String color, String type) {
        super(count, color); // constructor chaining
        this.type = type;
        System.out.println("SewingThread constructor");
    }

    void display() {
        System.out.println("Count: " + count);
        System.out.println("Color: " + color);
        System.out.println("Type: " + type);
    }
}