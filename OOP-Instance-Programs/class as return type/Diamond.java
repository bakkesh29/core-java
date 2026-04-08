class Diamond {

    String color;
    int carat;
    String shape;

    Diamond(String color, int carat, String shape) {
        this.color = color;
        this.carat = carat;
        this.shape = shape;
    }

    void display() {
        System.out.println("Color : " + this.color);
        System.out.println("Carat : " + this.carat);
        System.out.println("Shape : " + this.shape);
    }
}