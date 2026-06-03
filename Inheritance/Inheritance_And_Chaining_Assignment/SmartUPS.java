class SmartUPS extends UPS {

    @Override
    void start() {
        System.out.println("SmartUPS starting with auto-detection");
    }

    @Override
    void charge() {
        System.out.println("SmartUPS fast charging");
    }

    @Override
    void backup() {
        System.out.println("SmartUPS providing intelligent backup");
    }
}