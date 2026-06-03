class Flower {

    String name;
    String color;
    int price;

    Flower(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Color : " + this.color);
        System.out.println("Price : " + this.price);
    }
}