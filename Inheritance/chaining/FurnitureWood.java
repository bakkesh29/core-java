class FurnitureWood extends Wood {
    String use;

    FurnitureWood(String type, int age, String use) {
        super(type, age); // constructor chaining
        this.use = use;
        System.out.println("FurnitureWood constructor");
    }

    void display() {
        System.out.println("Type: " + type);
        System.out.println("Age: " + age);
        System.out.println("Use: " + use);
    }
}