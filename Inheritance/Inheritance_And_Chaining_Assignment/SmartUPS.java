class SmartUPS extends UPS {

    SmartUPS(int capacity) {
        super(capacity); // calling parent constructor
    }

    @Override
    void start() {
        System.out.println("SmartUPS starting with capacity: " + capacity);
    }

    @Override
    void backup() {
        System.out.println("SmartUPS backup for " + capacity + " units");
    }

    @Override
    void shutdown() {
        System.out.println("SmartUPS shutting down safely");
    }
}