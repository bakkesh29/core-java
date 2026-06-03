class Sword {

    String type;
    String material;
    int length;

    Sword(String type, String material, int length) {
        this.type = type;
        this.material = material;
        this.length = length;
    }

    void display() {
        System.out.println("Type : " + this.type);
        System.out.println("Material : " + this.material);
        System.out.println("Length : " + this.length);
    }
}