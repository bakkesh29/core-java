class DigitalStopWatch extends StopWatch {

    DigitalStopWatch(String brand) {
        super(brand); // calling parent constructor
    }

    @Override
    void start() {
        System.out.println(brand + " DigitalStopWatch started");
    }

    @Override
    void display() {
        System.out.println("Displaying time on " + brand + " screen");
    }

    @Override
    void lap() {
        System.out.println(brand + " lap recorded");
    }
}