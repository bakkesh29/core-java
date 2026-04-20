class DSLR extends Camera {
    String type;

    DSLR(int megapixel, String brand, String type) {
        super(megapixel, brand); //chaining
        this.type = type;
        System.out.println("DSLR constructor");
    }

    void display() {
        System.out.println("Megapixel: " + megapixel);
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
    }
}