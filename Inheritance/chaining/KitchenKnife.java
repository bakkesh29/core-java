class KitchenKnife extends Knife {
    String use;

    KitchenKnife(int length, String material, String use) {
        super(length, material); // constructor chaining
        this.use = use;
        System.out.println("KitchenKnife constructor");
    }

    void display() {
        System.out.println("Length: " + length);
        System.out.println("Material: " + material);
        System.out.println("Use: " + use);
    }
}