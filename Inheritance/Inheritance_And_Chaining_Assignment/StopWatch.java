class StopWatch {
    String brand;

    StopWatch(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("StopWatch start");
    }

    void stop() {
        System.out.println("StopWatch stop");
    }

    void reset() {
        System.out.println("StopWatch reset");
    }

    void display() {
        System.out.println("StopWatch display");
    }

    void lap() {
        System.out.println("StopWatch lap");
    }
}