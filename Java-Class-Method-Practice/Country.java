class Country {
    void run() { System.out.println("Country is running..."); }
}

class State extends Country {
    void run() { System.out.println("State is running within the Country..."); }
}

class District extends State {
    void run() { 
        System.out.println("District is running within the State..."); 
    }

    void taxing() 
    { System.out.println("Processing taxes"); }
    void measure()
     { System.out.println("Measuring demographics"); }
    void collect()
     { System.out.println("Collecting revenue"); }
    void revenue()
     { System.out.println("Calculating total revenue"); }
    void budget()
     { System.out.println("Allocating budget"); }

    // Static method 
    static void displayTask1() {
        District d = new District();
        d.run();
        d.taxing();
        d.budget();
    }
}