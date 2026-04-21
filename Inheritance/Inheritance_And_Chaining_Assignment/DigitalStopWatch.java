class DigitalStopWatch extends StopWatch {

    @Override
    void start() {
        System.out.println("DigitalStopWatch start");
    }
    
    @Override
    void display() {
        System.out.println("DigitalStopWatch display");
    }

    @Override
    void lap() {
        System.out.println("DigitalStopWatch lap");
    }
}