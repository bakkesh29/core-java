class Monitor {
    //instance var 2
    String brand;
    int size;

    //no org-constructor
    Monitor() {
        System.out.println("Default Constructor of Monitor");
    }
    //const with para
    Monitor(String brand, int size) {
        this.brand = brand;
        this.size = size;
    }
    //display method
    void display() {
        System.out.println("Monitor Brand: " + this.brand);
        System.out.println("Monitor Size: " + this.size);
    }
}