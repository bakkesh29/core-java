class LaptopPad extends TouchPad {
    String brand;

    LaptopPad(int size, String type, String brand) {
        super(size, type); // constructor chaining
        this.brand = brand;
        System.out.println("LaptopPad constructor");
    }

    void display() {
        System.out.println("Size: " + size);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
    }
}