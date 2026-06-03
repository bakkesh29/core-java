class Car { }

class Demo1 {
    Car createCar() {
        Car c = new Car();   // object1
        return c;
    }

    public static void main(String[] args) {
        Demo1 d = new Demo1();
        Car c1 = d.createCar();  // c1 → object1

        c1 = new Car();          // object2
        System.out.println("Done");
    }
}