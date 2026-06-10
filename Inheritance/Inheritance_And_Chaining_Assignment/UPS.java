class UPS {
    int capacity;

    UPS(int capacity) {
        this.capacity = capacity;
    }

    void start() {
        System.out.println("UPS start");
    }

    void stop() {
        System.out.println("UPS stop");
    }

    void charge() {
        System.out.println("UPS charging");
    }

    void backup() {
        System.out.println("UPS backup");
    }

    void shutdown() {
        System.out.println("UPS shutdown");
    }
}