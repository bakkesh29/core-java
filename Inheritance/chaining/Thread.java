class Thread {
    int count;
    String color;

    Thread(int count, String color) {
        this.count = count;
        this.color = color;
        System.out.println("Thread constructor");
    }
}