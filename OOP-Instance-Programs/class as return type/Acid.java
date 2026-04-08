class Acid {

    String name;
    String strength;
    int quantity;

    Acid(String name, String strength, int quantity) {
        this.name = name;
        this.strength = strength;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Strength : " + this.strength);
        System.out.println("Quantity : " + this.quantity);
    }
}